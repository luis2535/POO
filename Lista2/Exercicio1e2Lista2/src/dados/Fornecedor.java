package dados;

public class Fornecedor {
	private int codigo;
	private String nome;
	private String endereco;
	private String cep;
	private int telefone;
	
	public Fornecedor() {
		
	}
	public Fornecedor(int codigo, String nome, String endereco, String cep, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "Codigo: "+codigo+" Nome: "+nome+" Endereço: "+endereco+" CEP: "+cep+" Telefone: "+telefone;
	}
	
	
	
}
