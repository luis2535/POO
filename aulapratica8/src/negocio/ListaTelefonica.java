package negocio;
import dados.Contato;
import java.util.*;
import persistencia.*;

public class ListaTelefonica {
	private Map<Character, List<Contato>> contatos = new HashMap<Character, List<Contato>>();
	private ContatoDAO contatoDAO = new ContatoDAO();
	public ListaTelefonica() {
		contatos = contatoDAO.getAll();
	}
	public void adicionarContato(Contato contato) {
		contatoDAO.insert(contato);
	}
	
	public void removerContato(Contato contato) {
		contatoDAO.delete(contato);
	}
	public List<Contato> buscarContatos(char letra){
		contatos = contatoDAO.getAll();
		char letraUpper = Character.toUpperCase(letra);
		return contatos.get(letraUpper);	
	}
	public Map<Character,List<Contato>> buscarContatos(){
		return contatoDAO.getAll();
	}
}

