package principal;
import dados.*;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Fornecedor fornecedor1 = new Fornecedor();
		System.out.println("Digite o codigo do fornecedor");
		fornecedor1.setCodigo(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o nome do fornecedor");
		fornecedor1.setNome(scan.nextLine());
		System.out.println("Digite o endereço do fornecedor");
		fornecedor1.setEndereco(scan.nextLine());
		System.out.println("Digite o CEP do fornecedor");
		fornecedor1.setCep(scan.nextLine());
		System.out.println("Digite o telefone do fornecedor");
		fornecedor1.setTelefone(Integer.parseInt(scan.nextLine()));
		
		Fornecedor fornecedor2 = new Fornecedor(2, "Carnes", "Rua 9 de março", "89123567",9999999);
		
		System.out.println(fornecedor1);
		System.out.println(fornecedor2);
		
		Cliente cliente1 = new Cliente();
		System.out.println("Digite o nome do Cliente");
		cliente1.setNome(scan.nextLine());
		System.out.println("Digite o CPF do cliente");
		cliente1.setCpf(Long.parseLong(scan.nextLine()));
		System.out.println("Digite o endereço do cliente");
		cliente1.setEndereco(scan.nextLine());
		System.out.println("Digite o telefone do cliente");
		cliente1.setTelefone(Integer.parseInt(scan.nextLine()));
		
		Cliente cliente2 = new Cliente("Luis", 123456789, "Rua Xv", 98888888);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		Produto produto1 = new Produto();
		
		System.out.println("Digite o codigo do produto");
		produto1.setCodigo(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o nome do produto");
		produto1.setNome(scan.nextLine());
		System.out.println("Digite o preco do produto");
		produto1.setPreco(Float.parseFloat(scan.nextLine()));
		System.out.println("Escolha o fornecedor do produto");
		int opcao = 0;
		while(opcao != 1 && opcao !=2) {
			System.out.println("1 - Nome: " +fornecedor1.getNome()+" Codigo: "+fornecedor1.getCodigo());
			System.out.println("2 - Nome: " +fornecedor2.getNome()+" Codigo: "+fornecedor2.getCodigo());
			opcao = Integer.parseInt(scan.nextLine());
		}
		if(opcao == 1) {
			produto1.setFornecedor(fornecedor1);
		}else {
			produto1.setFornecedor(fornecedor2);
		}
		
		Produto produto2 = new Produto(2,"Alcatra",(float) 42.99, fornecedor2);
		
		System.out.println(produto1);
		System.out.println(produto2);
		
		Carrinho carrinho1 = new Carrinho(10);
		System.out.println("Digite o codigo do carrinho");
		carrinho1.setCodigo(Integer.parseInt(scan.nextLine()));
		System.out.println("Escolha o cliente");
		int escolha = 0;
		while(escolha != 1 && escolha !=2) {
			System.out.println("1 - Nome: " +cliente1.getNome());
			System.out.println("2 - Nome: " +cliente2.getNome());
			escolha = Integer.parseInt(scan.nextLine());
		}
		if(escolha == 1) {
			carrinho1.setCliente(cliente1);
		}else {
			carrinho1.setCliente(cliente2);
		}
		System.out.println("Digite quantos produtos deseja adicionar");
		int quantidade;
		quantidade = Integer.parseInt(scan.nextLine());
		for(int i = 0; i <quantidade;i++) {
			int escolhaproduto = 0;
			while(escolhaproduto != 1 && escolhaproduto != 2) {
				System.out.println("Digite o produto que deseja");
				System.out.println("1 - "+produto1.getNome()+" R$:" +produto1.getPreco());
				System.out.println("2 - "+produto2.getNome()+" R$:" +produto2.getPreco());
				escolhaproduto = Integer.parseInt(scan.nextLine());
			}
			if(escolhaproduto == 1) {
				carrinho1.adicionarProdutos(produto1);
			}else {
				carrinho1.adicionarProdutos(produto2);
			}
		}
		Produto [] produto3 = new Produto[2];
		Carrinho carrinho2 = new Carrinho(2, cliente2, produto3);
		carrinho2.adicionarProdutos(produto1);
		carrinho2.adicionarProdutos(produto2);
		
		System.out.println(carrinho1);
		System.out.println(carrinho2);
		
		Pagamento pagamento1 = new Pagamento();
		System.out.println("Digite o codigo do pagamento");
		pagamento1.setCodigo(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite a data");
		pagamento1.setDataVenda(scan.nextLine());
		System.out.println("Digite a forma de pagamento");
		pagamento1.setFormaDePagamento(scan.nextLine());
		pagamento1.setCarrinhoDeCompras(carrinho1);
		
		Pagamento pagamento2 = new Pagamento(2, "10/10/2021",carrinho2 , "Dinheiro");
		
		System.out.println(pagamento1);
		System.out.println(pagamento2);
		
		scan.close();
	}

}
