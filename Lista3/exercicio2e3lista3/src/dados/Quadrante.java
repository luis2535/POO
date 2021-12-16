package dados;

public enum Quadrante {
	PRIMEIRO("primeiro"), SEGUNDO("segundo"), TERCEIRO("terceiro"), QUARTO("quarto");
	private String tipo;
	private Quadrante(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}

}
