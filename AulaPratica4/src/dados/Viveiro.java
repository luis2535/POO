package dados;

public class Viveiro {
	protected String nome;
	protected float comprimento;
	protected float largura;
	protected Animal[] animais;
	protected int quantAnimal;
	
	public Viveiro(int maxAnimais) {
		this.animais = new Animal[maxAnimais];
		quantAnimal = 0;
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getLargura() {
		return largura;
	}
	public int getQuantAnimal() {
		return quantAnimal;
	}
	public float calculaEspaco() {
		return (largura*comprimento);
	}
	private float espacoOcupado() {
		float area = 0;
		for(int i=0;i<quantAnimal;i++) {
			area += animais[i].calculaEspacoOcupado();
		}
		return area;
	}
	public float espacoDisponivel() {
		return calculaEspaco() - espacoOcupado();
	}
	public boolean adicionarAnimal(Animal animal) {
		if( espacoDisponivel() > animal.calculaEspacoOcupado()*0.7) {
			animais[quantAnimal] = animal;
			quantAnimal++;
			return true;
		}else {
			return false;
		}
	}
	public Animal[] getAnimais() {
		return animais;
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Nome: "+nome+"\n");
		for(int i = 0; i <quantAnimal;i++) {
			string.append("\t"+ animais[i].toString());
			string.append("\n");
		}
		return string.toString();
	}

}
