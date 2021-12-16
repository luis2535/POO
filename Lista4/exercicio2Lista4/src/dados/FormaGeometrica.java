package dados;

public abstract class FormaGeometrica {
	protected int medida1;
	protected int medida2;
	public FormaGeometrica() {}
	
	public abstract double calcularArea();
	public abstract double calcularPerimetro();

}
