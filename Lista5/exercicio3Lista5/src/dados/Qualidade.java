package dados;

public enum Qualidade {
	BAIXA(240), MEDIA(360),HD(720),FULLHD(1080);
	private int tipo;
	private Qualidade(int tipo) {
		this.tipo = tipo;
	}
	public int getTipo() {
		return tipo;
	}

}
