package negocio;
import dados.*;
import exceptions.*;
import java.util.*;

public class SistemaArquivos {
	private Arquivo arquivos;
	private Map<String,List<Arquivo>> diretorios = new HashMap<String,List<Arquivo>>();
	public SistemaArquivos() {
		
	}
	public void criarDocumento(String nome, String diretorio, String texto) throws NomeInvalidoException {
		Documento documento = new Documento(nome);
		documento.setTexto(texto);
		if(diretorios.containsKey(diretorio)) {
			List<Arquivo>temp = diretorios.get(diretorio);
			temp.add(documento);
		}else {
			List<Arquivo>nova = new LinkedList<Arquivo>();
			nova.add(documento);
			diretorios.put(diretorio, nova);
		}
		
	}
	public void criarMusica(String nome, String diretorio,int duracao) throws NomeInvalidoException{
		Musica musica = new Musica(nome);
		musica.setDuracao(duracao);
		if(diretorios.containsKey(diretorio)) {
			List<Arquivo>temp = diretorios.get(diretorio);
			temp.add(musica);
		}else {
			List<Arquivo>nova = new LinkedList<Arquivo>();
			nova.add(musica);
			diretorios.put(diretorio, nova);
		}
	}
	public void criarVideo(String nome, String diretorio,Qualidade qualidade) throws NomeInvalidoException{
		Video video = new Video(nome);
		video.setQualidade(qualidade);
		if(diretorios.containsKey(diretorio)) {
			List<Arquivo>temp = diretorios.get(diretorio);
			temp.add(video);
		}else {
			List<Arquivo>nova = new LinkedList<Arquivo>();
			nova.add(video);
			diretorios.put(diretorio, nova);
		}
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		for (Map.Entry<String, List<Arquivo>> entry : diretorios.entrySet()) {
			String key = entry.getKey();
			List<Arquivo> value = entry.getValue();
			string.append(key+":\n\n");
			for(Arquivo a : value) {
				string.append("\t"+a+"\n");
			}
		}
		return string.toString();
	}

}
