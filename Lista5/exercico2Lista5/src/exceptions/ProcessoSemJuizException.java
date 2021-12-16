package exceptions;

public class ProcessoSemJuizException extends Exception {
	public ProcessoSemJuizException() {
		
	}
	public ProcessoSemJuizException(String mensagem) {
		super(mensagem);
	}

}