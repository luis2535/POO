package dados;

public class Veterinario{
	private String nome;
	private float salario;
	private Endereco endereco;
	private Animal[] animais;
	private int quantidadeAnimais;
	
	public int getQuantidadeAnimais() {
		return quantidadeAnimais;
	}
	public Veterinario(int tamAnimais) {
		animais = new Animal[tamAnimais];
	}
	public void addAnimais(Animal animal) {
		if(quantidadeAnimais < animais.length) {
			animais[quantidadeAnimais] = animal;
			quantidadeAnimais++;
		}
		else {
			System.out.println("Não foi possivel inserir o animal - o array está cheio.");
		}
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSalario(float salario) {
		this.salario = salario;		
	}
	public float getSalario() {
		return salario;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Animal[] getAnimais() {
		return animais;
	}
	public String toString() {
		return "Nome: "+nome+" Salario: "+salario+"\nEndereco:\n\t "+endereco;
	}
	
}