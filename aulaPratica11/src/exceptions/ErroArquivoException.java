package exceptions;

public class ErroArquivoException extends Exception {
	private String caminho;
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public ErroArquivoException(String mensagem) {
		super(mensagem);
	}
}
