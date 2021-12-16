package dados;

import exceptions.NomeInvalidoException;

public class Musica extends Arquivo {

	private int duracao;
	public Musica(String nome) throws NomeInvalidoException {
		super(nome);
		super.setExtensao(".mp3");
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getDuracao() {
		return duracao;
	}
	
	public String toString() {
		return super.getNome()+super.getExtensao()+"\n\tDuracao: "+duracao+"\n";
	}
}
