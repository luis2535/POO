package apresentacao;
import dados.Contato;
import exceptions.*;
import negocio.ListaTelefonica;

import java.sql.*;
import java.util.*;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static ListaTelefonica listaTelefonica;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, SelectException {
		int opcao;
		listaTelefonica = new ListaTelefonica();
		opcao = mostrarMenu();
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				adicionarContato();
				break;
			case 2:
				removerContato();			
				break;
			case 3:
				exibirContatos();
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
		System.out.println("1 - Adicionar Contato");
		System.out.println("2 - Remover Contato");
		System.out.println("3 - Exibir Todos os Contatos");
		System.out.println("0 - Fechar Programa");
		opcao = Integer.parseInt(scan.nextLine());
		return opcao;
	}
	public static Contato novoContato() {
		Contato contato = new Contato();
		System.out.println("Digite o nome do Contato:");
		contato.setNome(scan.nextLine());
		System.out.println("Digite o telefone do Contato:");
		contato.setTelefone(Integer.parseInt(scan.nextLine()));
		return contato;
	}
	public static void adicionarContato() {
		Contato contato = new Contato();
		contato = novoContato();
		try {
			listaTelefonica.adicionarContato(contato);
			
		} catch (ContatoJaCadastradoException e) {
			
			System.err.println(e.getMessage());
		} catch (InsertException e) {
			System.err.println(e.getMessage());
		} catch (SelectException e) {
			System.err.println(e.getMessage());
		}
	}
	public static void removerContato() {
		char letra;
		System.out.println("Digite uma letra para verificar os contatos:");
		letra = scan.nextLine().charAt(0);
		exibirContatos(letra);
	}
	public static void exibirContatos(char letra) {
		List<Contato> contatos = new LinkedList<Contato>();
		
			try {
				contatos = listaTelefonica.buscarContatos(letra);
			} catch (SelectException e) {
				System.err.println(e.getMessage());
			}
		
		if(contatos.isEmpty()) {
			System.out.println("Não há contatos salvos que iniciem com a letra "+letra);
		}else {
			System.out.println("Digite o numero do contato que deseja remover:");
			int cont = 0;
			for(Contato c : contatos) {
				System.out.println(cont+"-"+c);
				cont++;			
			}
			int escolha;
			escolha = Integer.parseInt(scan.nextLine());
			if(escolha > contatos.size() - 1) {
				System.out.println("Contato não encontrado");
			}else {
				try {
					listaTelefonica.removerContato(contatos.get(escolha));
				} catch (ContatoNaoCadastradoException e) {
					System.err.println(e.getMessage());
				
				} catch (DeleteException e) {
					System.err.println(e.getMessage());
				}
			}
			
		}		
	}
	public static void exibirContatos() {
		Map<Character, List<Contato>> contatos = new HashMap<Character, List<Contato>>();
		try {
			contatos = listaTelefonica.buscarContatos();
		} catch (SelectException e) {
			System.err.println(e.getMessage());
		}
		for(Map.Entry<Character, List<Contato>> pair : contatos.entrySet()) {
			Character key = pair.getKey();
			List<Contato> value = pair.getValue();
			System.out.println(key+":");
			for(Contato c : value) {
				System.out.println("-"+c);
			}			
		}
	}
}
