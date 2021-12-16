package apresentacao;
import dados.*;
import negocio.*;
import exceptions.*;

public class Principal {
	static SistemaArquivos sistema = new SistemaArquivos();
	public static void main(String[] args) {
		
		//arquivo1
		String nome = "lista5POOEnviar";
		String diretorio = "Area de Trabalho";
		String texto = "Exercicio1";
		try {
			sistema.criarDocumento(nome, diretorio, texto);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivo2
		nome = "HIMYM S01E01";
		diretorio = "Download";
		Qualidade qualidade = Qualidade.FULLHD;
		try {
			sistema.criarVideo(nome, diretorio, qualidade);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivo3
		nome = "VideoPewdiepie";
		diretorio = "Area de Trabalho";
		qualidade = Qualidade.BAIXA;
		try {
			sistema.criarVideo(nome, diretorio, qualidade);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivo4
		nome = "Heat Waves - Glass Animals";
		diretorio = "Area de Trabalho";
		int duracao = 240;
		try {
			sistema.criarMusica(nome, diretorio, duracao);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivocomexeceçao1
		nome = "textocccccccccccccccccc)cccccccccccc";
		diretorio = "Download";
		texto = "parenteses no meio";
		try {
			sistema.criarDocumento(nome, diretorio, texto);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivo5
		nome = "Imagine Dragons - Radioactive";
		diretorio = "Download";
		duracao = 276;
		try {
			sistema.criarMusica(nome, diretorio, duracao);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivocomexeceçao2
		nome = "musica\n com espaço";
		diretorio = "Area de Trabalho";
		duracao = 100;
		try {
			sistema.criarMusica(nome, diretorio, duracao);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		
		
		//arquivocomexeceçao3
		nome = "pequeno";
		diretorio = "Area de Trabalho";
		qualidade = Qualidade.MEDIA;
		try {
			sistema.criarVideo(nome, diretorio, qualidade);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		//arquivocomexeceçao4
		nome = "textocccccccccccccccccc'cccccccccccc";
		diretorio = "Download";
		texto = "aspassimplesnomeio";
		try {
			sistema.criarDocumento(nome, diretorio, texto);
		}
		catch(NomeInvalidoException e){
			System.err.println(e.getMessage());
		}
		
		//impressão
		System.out.println(sistema);
}

}
