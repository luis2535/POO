package exceptions;

public class ErroNaGravacaoException extends ErroArquivoException {
	
	public ErroNaGravacaoException() {
		super("Erro durante a grava��o do arquivo");
	}

}
