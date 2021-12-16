package dados;

public class Animal {
	private String nome;
	private String cor;
	private String especie;
	private int idade;
	protected float largura;
	protected float comprimento;
	protected float altura;
	
	public Animal() {
	}
	public Animal(String nome, String cor, String especie, int idade, float largura, float comprimento, float altura) {
		this.nome = nome;
		this.cor = cor;
		this.especie = especie;
		this.idade = idade;
		this.largura = largura;
		this.comprimento = comprimento;
		this.altura = altura;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getEspecie() {
		return especie;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getLargura() {
		return largura;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getAltura() {
		return altura;
	}
	public float calculaEspacoOcupado() {
		return(comprimento*largura);
	}
	public String toString() {
		return "Nome:"+nome+" Cor: "+cor+" Especie: "+especie+" Idade: "+idade;
	}
}
