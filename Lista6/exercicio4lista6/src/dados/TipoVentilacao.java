package dados;

public enum TipoVentilacao {
	AR_CONDICIONADO(new ArCondicionado()),NATURAL(new Natural());
	
	private Ventilacao tipo;
	
	private TipoVentilacao(Ventilacao ventilacao) {
		this.tipo = ventilacao;
	}
	public Ventilacao getTipo() {
		return this.tipo;
	}

}
