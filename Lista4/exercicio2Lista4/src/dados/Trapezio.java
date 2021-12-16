package dados;

public class Trapezio extends FormaGeometrica {
	private int altura;
	
	public Trapezio() {}
	public void setBaseMenor(int valor) {
		this.medida1 = valor;
	}
	public void setBaseMaior(int valor) {
		this.medida2 = valor;
	}
	public void setAltura(int valor) {
		this.altura = valor;
	}
	public double calcularArea() {
		double area;
		area = ((medida2 + medida1) * altura)/2;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		double lado = Math.sqrt(Math.pow((medida2 - medida1)/2, 2.0));
		perimetro = lado * 2 + medida1 + medida2;
		return perimetro;
	}
	public String toString() {
		return "Altura: "+altura+" Base maior: "+medida2+" Base menor: "+medida1+" Area: "+calcularArea()+" Perimetro: "+calcularPerimetro();
	}
}
