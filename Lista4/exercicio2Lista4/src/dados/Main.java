package dados;

public class Main {
	public static void main(String[] args) {
		FormaGeometrica formato;
		int valor;
		
		formato = new Trapezio();
		valor = 4;
		((Trapezio) formato).setAltura(valor);
		valor = 10;
		((Trapezio) formato).setBaseMaior(valor);
		valor = 5;
		((Trapezio) formato).setBaseMenor(valor);
		System.out.println("Trapezio: "+formato);
		System.out.println();
		
		formato = new Trapezio();
		valor = 10;
		((Trapezio) formato).setAltura(valor);
		valor = 20;
		((Trapezio) formato).setBaseMaior(valor);
		valor = 8;
		((Trapezio) formato).setBaseMenor(valor);
		System.out.println("Trapezio: "+formato);
		System.out.println();
		
		
		formato = new Losango();
		valor = 10;
		((Losango) formato).setD(valor);
		valor = 4;
		((Losango) formato).setd(valor);
		System.out.println("Losango: "+formato);
		System.out.println();
		
		formato = new Losango();
		valor = 20;
		((Losango) formato).setD(valor);
		valor = 10;
		((Losango) formato).setd(valor);
		System.out.println("Losango: "+formato);
		System.out.println();
		
		formato = new Circulo();
		valor = 5;
		((Circulo) formato).setRaio(valor);
		System.out.println("Circulo: "+formato);
		System.out.println();
		
		formato = new Circulo();
		valor = 10;
		((Circulo) formato).setRaio(valor);
		System.out.println("Circulo: "+formato);
	}
	
}
