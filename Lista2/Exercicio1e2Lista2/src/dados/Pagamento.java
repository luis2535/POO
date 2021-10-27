package dados;

public class Pagamento {
	private int codigo;
	private String dataVenda;
	private Carrinho carrinhoDeCompras;
	private String formaDePagamento;
	
	public Pagamento() {
		
	}
	public Pagamento(int codigo, String dataVenda, Carrinho carrinhoDeCompras, String formaDePagamento) {
		this.codigo = codigo;
		this.dataVenda = dataVenda;
		this.carrinhoDeCompras = carrinhoDeCompras;
		this.formaDePagamento = formaDePagamento;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	} 
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public Carrinho getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}
	public void setCarrinhoDeCompras(Carrinho carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}
	public String toString() {
		return "Codigo: "+codigo+" Data de Venda: "+dataVenda+" Forma de Pagamento: "+formaDePagamento+" Carrinho de compras:\n"+carrinhoDeCompras;
	}
}
