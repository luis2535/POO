package negocio;
import dados.Contato;
import java.util.*;

public class ListaTelefonica {
	private Map<Character, List<Contato>> contatos = new HashMap<Character, List<Contato>>();
	
	public ListaTelefonica() {
		List<Contato> lista;
		for(char i = 'A'; i<'Z';i++) {
			lista = new LinkedList<Contato>();
			contatos.put(i, lista);
		}
	}
	public void adicionarContato(Contato contato) {
		char[] primeiraLetra = contato.getNome().toCharArray();
		char primeiraUpper = Character.toUpperCase(primeiraLetra[0]);
		List<Contato> contatosTemp = contatos.get(primeiraUpper);
		contatosTemp.add(contato);
	}
	
	public void removerContato(Contato contato) {
		char[] primeiraLetra = contato.getNome().toCharArray();
		char primeiraUpper = Character.toUpperCase(primeiraLetra[0]);
		contatos.get(primeiraUpper).remove(contato);
	}
	public List<Contato> buscarContatos(char letra){
		char letraUpper = Character.toUpperCase(letra);
		return contatos.get(letraUpper);	
	}
	public Map<Character,List<Contato>> buscarContatos(){
		return (contatos);
	}
}

