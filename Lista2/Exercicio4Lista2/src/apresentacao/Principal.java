package apresentacao;
import dados.Pessoa;
import negocio.Sorteador;
import java.util.*;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static Sorteador sistema = new Sorteador();
	public static void main(String[] args) {
		int opcao;
		opcao = mostrarMenu();
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				adicionarPessoa();
				break;
			case 2:
				if(sistema.getQuantPessoas()==0) {
					System.out.println("Não há pessoas cadastradas");
				}else {
					Pessoa pessoa = sistema.sortearProximo();
					System.out.println(pessoa);
				}				
				break;
			case 3:
				if(sistema.getQuantPessoas()==0) {
					System.out.println("Não há pessoas cadastradas");
				}else {
					System.out.println(sistema);
				}
				break;
			default:
				System.out.println("Opção invalida, digite novamente");
			}
			opcao = mostrarMenu();
			
		}
		
	}
	public static int mostrarMenu() {
		int opcao = 0;
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Adicionar Pessoa");
		System.out.println("2 - Sortear Pessoa");
		System.out.println("3 - Imprimir Pessoa");	
		System.out.println("0 - Sair do sistema");
		opcao = Integer.parseInt(scan.nextLine());
		return opcao;
	}
	public static void adicionarPessoa() {
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite o nome da Pessoa");
		pessoa.setNome(scan.nextLine());
		System.out.println("Digite a idade da Pessoa");
		pessoa.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o CPF da Pessoa");
		pessoa.setCpf(Long.parseLong(scan.nextLine()));
		sistema.adicionarPessoa(pessoa);
	}
}
