package dados;

public class Aluno {
	private String nome;
	private int idade;
	private double[] notas = new double[5];
	public Aluno() {
		
	}
	public Aluno(String nome, int idade, double[]notas) {
		this.nome = nome;
		this.idade = idade;
		this.notas = notas;		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double[] getNotas() {
		return notas;
	}	
	public double calcularMedia() {
		double media = 0;
		for(int i = 0;i < 5;i++) {
			media += notas[i];
		}
		media = media/5;
		return media;
	}
	public String toString() {
		return "Nome: "+nome+" Idade: "+ idade+" Media: "+calcularMedia()+"\n";
	}
}
