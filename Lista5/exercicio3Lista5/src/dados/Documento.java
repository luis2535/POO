package dados;

import exceptions.NomeInvalidoException;

public class Documento extends Arquivo {
	private String texto;
	
	public Documento(String nome) throws NomeInvalidoException {
		super(nome);
		super.setExtensao(".txt");
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String toString() {
		return super.getNome()+super.getExtensao()+"\n\tDescrição: "+texto+"\n";
	}
	
	

}
