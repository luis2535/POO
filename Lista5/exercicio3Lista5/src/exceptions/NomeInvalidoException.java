package exceptions;

public class NomeInvalidoException extends Exception{
	public NomeInvalidoException() {
		
	}
	public NomeInvalidoException(String mensagem) {
		super(mensagem);
	}

}
