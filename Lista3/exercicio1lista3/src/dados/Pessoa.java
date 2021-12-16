package dados;

public class Pessoa {
	private String nome;
	private int idade;
	private long cpf;
	private String cidade;
	
	public Pessoa() {}
	public Pessoa(String nome, int idade,long cpf, String cidade) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.cidade = cidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public boolean equals(Object o) {
		if(o instanceof Pessoa) {
			Pessoa p =(Pessoa) o;
			if(this.cpf == p.getCpf()) {
				return true;
			}
		}
			return false;
	}
	public String toString() {
		return nome+", "+idade+", "+cpf+", "+cidade;
	}
}
