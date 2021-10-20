package dados;

public class Dono{
	private String nome;
	private Endereco endereco;
	private int cpf;
	
	public Dono(){
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "Nome: "+nome+" CPF: "+cpf+"\nEndereco:\n\t "+endereco;
	}
	
	
}