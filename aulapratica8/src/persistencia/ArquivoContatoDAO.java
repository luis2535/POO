package persistencia;
import java.util.*;
import dados.Contato;

public class ArquivoContatoDAO {
	private final String caminho = "C:\\Users\\user\\eclipse-workspace\\aulapratica8\\arquivo\\contatos.csv";
	private static EditorTexto arquivo = new EditorTexto();
	private String toCSV(Contato c) {
		String contato ="";
		contato +=c.getNome() + ",";
		contato +=c.getTelefone();
		return contato;
		
	}
	private Contato fromCSV(String s) {
		String [] atributos = s.split(",");
		Contato contato = new Contato();
		contato.setNome(atributos[0]);
		contato.setTelefone(Integer.parseInt(atributos[1]));
		return contato;
		
	}
	public List<Contato> leContatos(){
		List<Contato> contatos = new LinkedList<Contato>();
		for(String linha : arquivo.leTexto(caminho)) {
			contatos.add(fromCSV(linha));
		}
		return contatos;
		
	}
	public void salvaContatos(List<Contato> contatos) {
		List<String> arquivos = new LinkedList<String>();
		for(Contato contato : contatos) {
			arquivos.add(toCSV(contato));
		}
		arquivo.gravaTexto(caminho, arquivos);	
	}
}

