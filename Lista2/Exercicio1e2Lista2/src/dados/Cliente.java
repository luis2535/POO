package dados;

public class Cliente {
	private String nome;
	private long cpf;
	private String endereco;
	private int telefone;
	
	public Cliente() {
		
	}
	public Cliente(String nome, long cpf, String endereco, int telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String toString() {
		return "Nome: "+nome+" CPF: "+cpf+" Endereço: "+endereco+" Telefone: "+telefone;
	}
	

}
