package persistencia;
import java.util.*;

import dados.Contato;

public class ContatoDAO {
	private	ArquivoContatoDAO arquivoContatoDAO = new ArquivoContatoDAO();
	
	
	public void insert(Contato contato) {
		List<Contato> lista = arquivoContatoDAO.leContatos();
		lista.add(contato);
		arquivoContatoDAO.salvaContatos(lista);
	}
	public void delete(Contato contato) {
		List<Contato> contatos = arquivoContatoDAO.leContatos();
		contatos.remove(contato);
		arquivoContatoDAO.salvaContatos(contatos);
		
	}
	public Map<Character, List<Contato>> getAll(){
		Map<Character, List<Contato>> listaTelefonica = new HashMap<Character, List<Contato>>();
		List<Contato> lista;
		for(char i = 'A'; i< 'Z'; i++) {
			lista=new LinkedList<Contato>();
			listaTelefonica.put(i,lista);
		}
		List<Contato> contatos = arquivoContatoDAO.leContatos();
		for(Contato c : contatos) {
			char[] primeiraLetra = c.getNome().toCharArray();
			char primeiraUpper = Character.toUpperCase(primeiraLetra[0]);
			List<Contato> contatosTemp = listaTelefonica.get(primeiraUpper);
			contatosTemp.add(c);
		}
		return listaTelefonica;
		
	}

}
