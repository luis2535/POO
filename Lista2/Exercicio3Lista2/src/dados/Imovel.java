package dados;

public class Imovel {
	private float largura;
	private float comprimento;
	private float valor;
	
	public Imovel() {
		
	}
	public Imovel(float largura, float comprimento, float valor) {
		this.largura = largura;
		this.comprimento = comprimento;
		this.valor = valor;		
	}
	
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float calculaArea() {
		return comprimento*largura;
	}
	public String toString() {
		return "Largura :"+largura+" Comprimento: "+comprimento+ " Valor: "+valor+" Area: "+comprimento*largura;
	}
}
