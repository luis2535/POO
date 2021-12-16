package apresentacao;
import dados.*;
import negocio.*;
import exceptions.*;
import java.util.Scanner;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static Zoologico sistema = new Zoologico();
	public static void main(String[] args) {
		int opcao;
		
		opcao = mostrarMenu();
		while(opcao!=0) {
			switch(opcao) {
			case 1:
				cadastrarViveiro();
				break;
			case 2:
				if(sistema.getQuantViveiros()==0) {
					System.out.println("Não há viveiros registrado para cadastrar os animais");
				}else {
					cadastrarAnimal();
				}				
				break;
			case 3:
				if(sistema.getQuantViveiros() == 0) {
					System.out.println("Não há viveiros cadastrados");
				}else {
					mostrarViveiros();
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
		System.out.println("1 - Cadastrar Viveiro");
		System.out.println("2 - Cadastrar Animal");
		System.out.println("3 - Mostrar Viveiros");	
		System.out.println("0 - Sair do sistema");
		opcao = Integer.parseInt(scan.nextLine());
		return opcao;
	}
	public static void cadastrarViveiro() {
		System.out.println("Deseja adicionar um aquario ou um viveiro?");
		System.out.println("1 - Viveiro");
		System.out.println("2 - Aquario");
		int opcao;
		opcao = Integer.parseInt(scan.nextLine());
		if(opcao == 1) {
			Viveiro viveiro = new Viveiro(10);
			System.out.println("Digite o nome do viveiro");
			viveiro.setNome(scan.nextLine());
			System.out.println("Digite o comprimento do viveiro");
			viveiro.setComprimento(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a largura do viveiro");
			viveiro.setLargura(Float.parseFloat(scan.nextLine()));
			sistema.cadastrarViveiro(viveiro);	
		}else if(opcao == 2) {
			Aquario aquario = new Aquario(10);
			System.out.println("Digite o nome do aquario");
			aquario.setNome(scan.nextLine());
			System.out.println("Digite o comprimento do aquario");
			aquario.setComprimento(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a largura do aquario");
			aquario.setLargura(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a altura do aquario");
			aquario.setAltura(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a temperatura do aquario");
			aquario.setTemperatura(Float.parseFloat(scan.nextLine()));
			sistema.cadastrarViveiro(aquario);
		}else {
			System.out.println("Opção invalida");
		}
	}
	public static void cadastrarAnimal() {
		System.out.println("Deseja adicionar um peixe ou outro animal?");
		System.out.println("1 - Peixe");
		System.out.println("2 - Outro");
		int opcao;
		opcao = Integer.parseInt(scan.nextLine());
		if(opcao == 1) {
			Peixe peixe = new Peixe();
			System.out.println("Digite o nome");
			peixe.setNome(scan.nextLine());
			System.out.println("Digite a cor");
			peixe.setCor(scan.nextLine());
			System.out.println("Digite a especie");
			peixe.setEspecie(scan.nextLine());
			System.out.println("Digite a idade");
			peixe.setIdade(Integer.parseInt(scan.nextLine()));
			System.out.println("Digite a largura");
			peixe.setLargura(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite o comprimento");
			peixe.setComprimento(Float.parseFloat(scan.nextLine()));			
			System.out.println("Digite a altura");
			peixe.setAltura(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a temperatura ideal");
			peixe.setTemperaturaIdeal(Float.parseFloat(scan.nextLine()));
			sistema.cadastrarAnimal(peixe);
			alocarAnimal(peixe);
		}else if(opcao == 2) {
			Animal animal = new Animal();
			System.out.println("Digite o nome");
			animal.setNome(scan.nextLine());
			System.out.println("Digite a cor");
			animal.setCor(scan.nextLine());
			System.out.println("Digite a especie");
			animal.setEspecie(scan.nextLine());
			System.out.println("Digite a idade");
			animal.setIdade(Integer.parseInt(scan.nextLine()));
			System.out.println("Digite a largura");
			animal.setLargura(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite o comprimento");
			animal.setComprimento(Float.parseFloat(scan.nextLine()));			
			System.out.println("Digite a altura");
			animal.setAltura(Float.parseFloat(scan.nextLine()));
			sistema.cadastrarAnimal(animal);
			alocarAnimal(animal);
		}else {
			System.out.println("Opção Invalida");
		}
	}
	public static void alocarAnimal(Animal animal) {
			System.out.println("Digite a que viveiro deseja associar esse animal");
			listaViveiros();
			int escolhaViveiro;
			escolhaViveiro = Integer.parseInt(scan.nextLine());
			if(escolhaViveiro > sistema.getQuantViveiros()) {
				System.out.println("Viveiro não registrado");
			}else {
				Viveiro listaViveiros[] = sistema.mostrarViveiros();
				Viveiro viveiro = listaViveiros[escolhaViveiro];
				try {
					sistema.alocarAnimal(animal, viveiro);
				}
				catch(EspacoInsuficienteException e) {
					System.err.println(e.getMessage());
				}
				catch(TemperaturaInadequadaException e) {
					System.err.println(e.getMessage());
				}
				catch(EhPeixeException e) {
					System.err.println(e.getMessage());
				}
				catch(NaoEhPeixeException e) {
					System.err.println(e.getMessage());
				}
				}
		}
	public static void listaAnimais() {
		Animal listaAnimal[] = sistema.mostrarAnimais();
		for(int i = 0; i <sistema.getQuantAnimais();i++) {
			Animal a = listaAnimal[i];
			System.out.println("Animal "+i+":\n\t"+a);
		}
	}
	public static void listaViveiros() {
		Viveiro listaViveiros[] = sistema.mostrarViveiros();
		for(int i = 0; i < sistema.getQuantViveiros();i++) {
			Viveiro v = listaViveiros[i];
			System.out.println("Viveiro "+i+":\n\t"+v.getNome());
		}
	}
	public static void mostrarViveiros() {
		System.out.println("Deseja ver os viveiros ou os aquarios?");
		System.out.println("1 - Viveiros");
		System.out.println("2 - Aquarios");
		int escolha;
		escolha = Integer.parseInt(scan.nextLine());
		if(escolha == 1) {
			Viveiro listaViveiros[] = sistema.getSoViveiros();
			if(listaViveiros.length == 0) {
				System.out.println("Não há viveiros cadastrados");
			}else {
				for(int i = 0; i < listaViveiros.length;i++) {
					Viveiro v = listaViveiros[i];
					System.out.println("Viveiro "+i+":\n"+v);
				}	
			}
			
		}else if(escolha == 2) {
			Aquario listaAquarios[] = sistema.getSoAquarios();
			if(listaAquarios.length == 0) {
				System.out.println("Não há aquarios cadastrados");
			}else {
				for(int i = 0; i < listaAquarios.length;i++) {
					Aquario v = listaAquarios[i];
					System.out.println("Aquario "+i+":\n"+v);
			}
		}	
		}else {
			System.out.println("Opção não cadastrada");
		}
	}	
}
