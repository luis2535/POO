package dados;

public class Losango extends FormaGeometrica {
	public Losango() {}
	public void setD(int valor) {
		this.medida1 = valor;
	}
	public void setd(int valor) {
		this.medida2 = valor;
	}
	public double calcularArea() {
		double area;
		area = (medida1*medida2)/2;
		return area;
	}
	public double calcularPerimetro() {
		double perimetro;
		perimetro = 4*Math.sqrt((medida1*medida1)/4 + (medida2*medida2)/4);
		return perimetro;
	}
	public String toString() {
		return "Diagonal Maior: "+medida1+" Diagonal Menor: "+medida2+" Area: "+calcularArea()+" Perimetro: "+calcularPerimetro();
	}


}
