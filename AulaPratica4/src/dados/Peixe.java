package dados;

public class Peixe extends Animal{
	private float temperaturaIdeal;
	
	public Peixe() {
		
	}
	
	public void setTemperaturaIdeal(float temperaturaIdeal) {
		this.temperaturaIdeal = temperaturaIdeal;
	}
	public float getTemperaturaIdeal() {
		return temperaturaIdeal;
	}
	public float calculaEspacoOcupado() {
		return (comprimento*altura*largura);
	}
	public String toString() {
		return super.toString() +" Temperatura ideal: "+temperaturaIdeal;
	}
}
