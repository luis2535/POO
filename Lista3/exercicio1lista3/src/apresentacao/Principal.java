package apresentacao;
import java.util.*;
import dados.Pessoa;
import negocio.CadastroPessoas;

public class Principal {
	//nao consegui fazer o uso de scanner utilizando arquivo
	static Scanner scan = new Scanner(System.in);
	static CadastroPessoas sistema = new CadastroPessoas();
	public static void main(String[] args) {
		int opcao = 0;
		while(opcao != -1) {
			adicionarPessoa();	
			imprimirLista();
			System.out.println("Digite -1 para encerrar leitura ou qualquer outro numero para continuar.");
			opcao = Integer.parseInt(scan.nextLine());
		}
	}
	public static void adicionarPessoa() {
		Pessoa p = new Pessoa();
		p = criarPessoa();
		if(p.getIdade() > 99 || p.getIdade() <= 0) {
			System.out.println("Não é possivel adicioncar pessoa com mais de 100 anos ou com idade negativa");
		}else {
			sistema.adicionarPessoas(p);
		}
	}
	public static void imprimirLista() {
		Map<String, List<Pessoa>> lista = sistema.criarLista();
		for(Map.Entry<String, List<Pessoa>> pair : lista.entrySet()) {
			String key = pair.getKey();
			List<Pessoa> value = pair.getValue();
			System.out.println(key+":");
			for(Pessoa p : value) {
				System.out.println("\t-"+p);
			}
		}
		
	}
	public static Pessoa criarPessoa() {
		Pessoa pessoa = new Pessoa();
		System.out.println("Digite o nome da Pessoa:");
		pessoa.setNome(scan.nextLine());
		System.out.println("Digite a idade da Pessoa:");
		pessoa.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o cpf da Pessoa:");
		pessoa.setCpf(Long.parseLong(scan.nextLine()));
		System.out.println("Digite a cidade da Pessoa:");
		pessoa.setCidade(scan.nextLine());
		return pessoa;
	}
}
