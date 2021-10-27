package dados;

public class Aquario extends Viveiro {
	private float altura;
	private float temperatura;
	
	
	public Aquario(int maxPeixes){
		super(maxPeixes);
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getAltura() {
		return altura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public float calculaEspaco() {
		return altura*largura*comprimento;
	}
}
