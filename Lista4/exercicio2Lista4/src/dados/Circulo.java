package dados;

public class Circulo extends FormaGeometrica {
	public Circulo() {}
	public void setRaio(int valor) {
		this.medida1 = valor;
	}
	public double calcularArea() {
		double area;
		area = Math.PI * Math.pow(medida1,2);
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		perimetro = Math.PI  * 2*medida1;
		return perimetro;
	}
	public String toString() {
		return "Raio: "+medida1+" Area: "+calcularArea()+" Perimetro: "+calcularPerimetro();
	}
	

}
