package persistencia;

import java.sql.*;

import dados.Contato;
import exceptions.*;
import java.util.*;

public class ContatoDAO {
	private static ContatoDAO instance = null;
	
	private PreparedStatement selectNewId;
	private PreparedStatement selectAll;
	private PreparedStatement insert;
	private PreparedStatement delete;
	public static ContatoDAO getInstance() throws ClassNotFoundException, SQLException, SelectException{
		if(instance == null) {
			instance = new ContatoDAO();
		}
		return instance;
	}
	private ContatoDAO() throws ClassNotFoundException, SQLException, SelectException{
		Connection conexao = Conexao.getConexao();
		selectNewId = conexao.prepareStatement("select nextval('id_contato')");
		insert = conexao.prepareStatement("insert into contato values(?,?,?)");
		delete = conexao.prepareStatement("delete from contato where telefone = ?");
		selectAll = conexao.prepareStatement("select * from contato");
	}
	
	private int selectNewId() throws SelectException{
		try {
			ResultSet rs = selectNewId.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		}catch(SQLException e){
			throw new SelectException("Erro ao buscar novo id da tabela contato");
		}
		return 0;
	}
	public void insert(Contato contato) throws InsertException, SelectException{
		try {
			insert.setInt(1, selectNewId());
			insert.setString(2,contato.getNome());
			insert.setInt(3, contato.getTelefone());
			insert.executeUpdate();
		}catch(SQLException e){
			throw new InsertException("Erro ao inserir novo contato");
			
		}
	}
	public void delete(Contato contato) throws DeleteException{
		try {
			delete.setInt(1, contato.getTelefone());
			delete.executeUpdate();
		}catch(SQLException e) {
			throw new DeleteException("Erro ao deletar contato");
		}
	}
	public Map<Character, List<Contato>> selectAll() throws SelectException {
		Map<Character, List<Contato>> listaTelefonica = new HashMap<Character, List<Contato>>();
		List<Contato> lista;
		for(char i = 'A'; i< 'Z'; i++) {
			lista=new LinkedList<Contato>();
			listaTelefonica.put(i,lista);
		}
		try {
			ResultSet rs = selectAll.executeQuery();
			while(rs.next()) {
				String nome = rs.getString(2);
				int telefone = rs.getInt(3);
				
				Contato c = new Contato();
				c.setNome(nome);
				c.setTelefone(telefone);
				char[] primeiraLetra = c.getNome().toCharArray();
				char primeiraUpper = Character.toUpperCase(primeiraLetra[0]);
				List<Contato> contatosTemp = listaTelefonica.get(primeiraUpper);
				contatosTemp.add(c);	
			}
		}catch(SQLException e) {
			throw new SelectException("Erro ao buscar contatos");
		}
		return listaTelefonica;
		
	}
	

}
