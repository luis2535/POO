package dados;

public class Carrinho {
	private int codigo;
	private Cliente cliente;
	private Produto listaDeProdutos[];
	private int quantProdutos = 0;
	
	public Carrinho(int codigo, Cliente cliente, Produto listaDeProdutos[]) {
		this.codigo = codigo;
		this.cliente = cliente; 
		this.listaDeProdutos = listaDeProdutos;
	}
	public Carrinho(int maxProdutos) {
		this.listaDeProdutos = new Produto[maxProdutos];
		quantProdutos = 0;		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void adicionarProdutos(Produto produto) {
		if(quantProdutos < listaDeProdutos.length) {
			listaDeProdutos[quantProdutos] = produto;
			quantProdutos++;
		}
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public int getQuantProdutos() {
		return quantProdutos;		
	}
	public Produto[] getProdutos() {
		return listaDeProdutos;
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Codigo: "+codigo+" Cliente: "+cliente.getNome()+"\n");
		for(int i = 0;i < quantProdutos;i++) {
			string.append("\t"+listaDeProdutos[i].toString());
			string.append("\n");
		}
		return string.toString();
	}
	
}
