package dados;

public enum CorLataria {
	BRANCO(new Branco()), PRETO(new Preto()), PRATA(new Prata()), VERMELHO(new Vermelho()), AZUL(new Azul());

	private Cor tipo;
	private CorLataria(Cor tipo) {
		this.tipo = tipo;
	}
	public Cor getCor() {
		return this.tipo;
	}

}
