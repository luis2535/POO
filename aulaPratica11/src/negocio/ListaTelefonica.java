package negocio;
import dados.Contato;
import exceptions.*;

import java.sql.SQLException;
import java.util.*;
import persistencia.*;

public class ListaTelefonica {
	private Map<Character, List<Contato>> contatos = new HashMap<Character, List<Contato>>();
	private ContatoDAO contatoDAO;
	public ListaTelefonica() throws ClassNotFoundException, SQLException, SelectException {
			contatoDAO = ContatoDAO.getInstance();
		
	}
	public void adicionarContato(Contato contato) throws ContatoJaCadastradoException, InsertException, SelectException{
		contatoDAO.insert(contato);
	}
	
	public void removerContato(Contato contato) throws ContatoNaoCadastradoException, DeleteException{
		contatoDAO.delete(contato);
	}
	public List<Contato> buscarContatos(char letra) throws SelectException{
		contatos = contatoDAO.selectAll();
		char letraUpper = Character.toUpperCase(letra);
		return contatos.get(letraUpper);	
	}
	public Map<Character,List<Contato>> buscarContatos() throws SelectException{
		return contatoDAO.selectAll();
	}
}

