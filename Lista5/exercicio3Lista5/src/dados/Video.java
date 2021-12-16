package dados;

import exceptions.NomeInvalidoException;

public class Video extends Arquivo{
	private Qualidade qualidade;
	public Video(String nome) throws NomeInvalidoException {
		super(nome);
		super.setExtensao(".mp4");
	}
	public Qualidade getQualidade() {
		return qualidade;
	}
	public void setQualidade(Qualidade qualidade) {
		this.qualidade = qualidade;
	}
	public String toString() {
		return super.getNome()+super.getExtensao()+"\n\tQualidade: "+qualidade.getTipo()+"p\n";
	}

}
