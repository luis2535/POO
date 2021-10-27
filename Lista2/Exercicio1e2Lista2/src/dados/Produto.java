package dados;

public class Produto {
	private int codigo;
	private String nome;
	private float preco;
	private Fornecedor fornecedor;
	
	public Produto() {}

	public Produto(int codigo, String nome, float preco, Fornecedor fornecedor) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.fornecedor = fornecedor;
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
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String toString() {
		return "Codigo:"+codigo+" Nome:"+nome+" Preco:"+preco+ " Codigo Fornecedor: "+fornecedor.getCodigo()+" Nome Fornecedor: "+fornecedor.getNome();
	}
	
}
