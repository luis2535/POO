package apresentacao;

import java.util.Scanner;

import dados.*;

public class SistemaPetShop{
	static Scanner scan = new Scanner(System.in);
	static Veterinario[] veterinarios = new Veterinario[10];
	static int quantVeterinarios = 0;

	public static void main(String[] args) {
		int opcao;
		
		opcao = mostrarMenu();
		
		while(opcao!=0) {
			switch(opcao) {
			case 1:
				if (quantVeterinarios == 0) {
					System.out.println("Não há animais cadastrados para fazer o cadastro de donos");
				}else {
					cadastrarDono();
				}
				break;
			case 2:
				cadastrarVeterinario();
				break;
			case 3:
				if(quantVeterinarios == 0) {
					System.out.println("Não há veterinarios cadastrados para fazer o cadastro de animais");
				}else {
					System.out.println("Abaixo segue uma lista de veterinarios disponiveis:");
					cadastrarAnimal();
				}				
				break;
			case 4:
				if(quantVeterinarios == 0) {
					System.out.println("Não há veterinarios cadastrados");
				}else {
					int indice;
					indice = mostrarVeterinarios();
					System.out.println(veterinarios[indice]);					
					}
					
				break;
			case 5:
				if(quantVeterinarios == 0) {
					System.out.println("Não há veterinarios cadastrados para fazer o cadastro de animais");
				}else {
					int vet = mostrarVeterinarios();
					int valor;
					valor = mostrarAnimal(vet);
					System.out.println(veterinarios[vet].getAnimais()[valor]);
								
				}
				break;	
		}
			opcao = mostrarMenu();	
		}		
	}
	public static int mostrarMenu() {
		int opcao = 0;
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Cadastro de Dono");
		System.out.println("2 - Cadastro de Veterinario");
		System.out.println("3 - Cadastro de Animal");
		System.out.println("4 - Mostrar Cadastro de Veterinarios");
		System.out.println("5 - Mostrar Cadastro de Animais");	
		System.out.println("0 - Sair do sistema");
		opcao = Integer.parseInt(scan.nextLine());
		return opcao;

	}
	public static void cadastrarDono() {
		int vet = mostrarVeterinarios();
		if(veterinarios[vet].getQuantidadeAnimais() == 0) {
			System.out.println("Não há animais cadastrados");
		}else {
			int animal = mostrarAnimal(vet);		
			Dono dono = new Dono();
			System.out.println("Digite o nome do dono: ");
			dono.setNome(scan.nextLine());
			System.out.println("Digite o CPF: ");
			dono.setCpf(Integer.parseInt(scan.nextLine()));
			System.out.println("Cadastre o endereço do dono:");
			dono.setEndereco(cadastrarEnderecoDono());
			veterinarios[vet].getAnimais()[animal].setDono(dono);
		}
	}
	public static Endereco cadastrarEnderecoDono() {
		Endereco endereco = new Endereco();
		System.out.println("Digite a rua: ");
		endereco.setRua(scan.nextLine());
		System.out.println("Digite o numero da casa");
		endereco.setNumero(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o bairro: ");
		endereco.setBairro(scan.nextLine());
		System.out.println("Digite a cidade:");
		endereco.setCidade(scan.nextLine());
		System.out.println("Digite o estado: ");
		endereco.setEstado(scan.nextLine());
		System.out.println("Digite o CEP: ");
		endereco.setCep(Integer.parseInt(scan.nextLine()));
		return endereco;	
	}
	public static void cadastrarAnimal() {
		Animal animal = new Animal();
		int vet =  mostrarVeterinarios();
		System.out.println("Digite o nome do animal: ");
		animal.setNome(scan.nextLine());
		System.out.println("Digite a especie: ");
		animal.setEspecie(scan.nextLine());
		System.out.println("Digite a descrição: ");
		animal.setDescricao(scan.nextLine());
		veterinarios[vet].addAnimais(animal);
	}
	public static void cadastrarVeterinario() {
		Veterinario veterinario = new Veterinario(1);
		System.out.println("Digite o nome do veterinario: ");
		veterinario.setNome(scan.nextLine());
		System.out.println("Digite o salario do veterinario: ");
		veterinario.setSalario(Float.parseFloat(scan.nextLine()));
		System.out.println("Cadastre o endereço do veterinario:");
		veterinario.setEndereco(cadastrarEnderecoVeterinario());
		if(quantVeterinarios < veterinarios.length) {
			veterinarios[quantVeterinarios] = veterinario;
			quantVeterinarios++;
		}	
	}
	public static Endereco cadastrarEnderecoVeterinario() {
		Endereco endereco = new Endereco();
		System.out.println("Digite a rua: ");
		endereco.setRua(scan.nextLine());
		System.out.println("Digite o numero da casa");
		endereco.setNumero(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o bairro: ");
		endereco.setBairro(scan.nextLine());
		System.out.println("Digite a cidade:");
		endereco.setCidade(scan.nextLine());
		System.out.println("Digite o estado: ");
		endereco.setEstado(scan.nextLine());
		System.out.println("Digite o CEP: ");
		endereco.setCep(Integer.parseInt(scan.nextLine()));
		return endereco;	
	}
	public static int mostrarVeterinarios() {
		System.out.println("Selecione um veterinario:");
		for(int i = 0; i < quantVeterinarios; i++) {
			System.out.println(i+"-"+veterinarios[i].getNome());
		}
		int valor;
		valor = Integer.parseInt(scan.nextLine());
			return valor;
	}	
	public static int mostrarAnimal(int vet) {
		System.out.println("Lista dos animais a cuidados desse veterinario");
		for(int i = 0; i <veterinarios[vet].getQuantidadeAnimais();i++) {
			System.out.println(i+"-"+veterinarios[vet].getAnimais()[i].getNome());
		}
		if(veterinarios[vet].getQuantidadeAnimais() == 0) {
			System.out.println("Não ha animais a cuidados desse veterinario.");
			System.out.println("Digite qualquer valor para prosseguir");
			int valor;
			valor = Integer.parseInt(scan.nextLine());
			return valor;
		}else {
			System.out.println("Selecione um animal");
			int valor;
			valor = Integer.parseInt(scan.nextLine());
			return valor;			
		}
		
	}
	
}