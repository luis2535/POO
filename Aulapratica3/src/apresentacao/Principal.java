package apresentacao;

import negocio.ReservaPassagem;
import dados.*;
import java.util.Scanner;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static private ReservaPassagem reservaPassagem = new ReservaPassagem();
	public static void main(String[] args) {
		int opcao;
		
		opcao = mostrarMenu();
		while(opcao!=0) {
			switch(opcao) {
			case 1:
				if((reservaPassagem.getQuantCidades() == 0) || (reservaPassagem.getQuantClientes() == 0) ||(reservaPassagem.getQuantCidades()==1)) {
					System.out.println("Numero de clientes ou de cidades insuficiente para fazer reserva");
				}else {
					fazerReserva();
				}				
				break;
			case 2:
				cadastrarCliente();
				break;
			case 3:
				cadastrarCidade();
				break;
			case 4:
				if(reservaPassagem.getQuantClientes()==0) {
					System.out.println("Não há clientes cadastrados");
				}else {
					mostrarReservas();
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
		System.out.println("1 - Fazer Reserva");
		System.out.println("2 - Cadastro de Cliente");
		System.out.println("3 - Cadastro de Cidade");
		System.out.println("4 - Mostrar Reservas");	
		System.out.println("0 - Sair do sistema");
		opcao = Integer.parseInt(scan.nextLine());
		return opcao;
		
	}
	public static void fazerReserva() {
		Reserva reserva = new Reserva(); 
		int cliente = 11;
		int cidadeorigem = 11;
		int cidadedestino = 11;
		System.out.println("Selecione a que cliente deseja registrar essa reserva");
		cliente = mostrarClientes1();
		if(cliente == 11) {
			System.out.println("Cliente não cadastrado");
		}else {
			System.out.println("Digite o numero da reserva");
			reserva.setNumReserva(Integer.parseInt(scan.nextLine()));
			System.out.println("Digite a data do voo");
			reserva.setDataVoo(scan.nextLine());
			System.out.println("Digite a hora do voo");
			reserva.setHoraVoo(scan.nextLine());
			System.out.println("Digite o valor do voo");
			reserva.setPreco(Float.parseFloat(scan.nextLine()));
			System.out.println("Digite a Classe do voo");
			reserva.setClasseVoo(scan.nextLine());
			System.out.println("Digite a poltrona");
			reserva.setPoltrona(Integer.parseInt(scan.nextLine()));
			System.out.println("Escolha o numero da cidade origem:");
			Cidade listaCidades1[]=reservaPassagem.mostrarCidades();
			cidadeorigem = mostrarCidades1();
			if(cidadeorigem == 11) {
				System.out.println("Cidade não cadastrada");
			}else {
				Cidade origem = listaCidades1[cidadeorigem];
				System.out.println("Escolha o numero da cidade destino:");
				cidadedestino = mostrarCidades1();
				if(cidadedestino == 11) {
					System.out.println("Cidade não cadastrada");
				}else {
					Cidade destino = listaCidades1[cidadedestino];
					reserva.setOrigem(origem);
					reserva.setDestino(destino);
					Cliente listaClientes[] = reservaPassagem.mostrarClientes();
					Cliente c = listaClientes[cliente];
					reservaPassagem.reservarIda(c,reserva);	
					System.out.println("Digite 1 para agendar uma viagem de volta ou qualquer coisa para prosseguir");
					int opcao;
					opcao=Integer.parseInt(scan.nextLine());
					switch(opcao) {
						case 1:
							Reserva volta = new Reserva();
							System.out.println("Digite o numero da reserva");
							volta.setNumReserva(Integer.parseInt(scan.nextLine()));
							System.out.println("Digite a data do voo");
							volta.setDataVoo(scan.nextLine());
							System.out.println("Digite a hora do voo");
							volta.setHoraVoo(scan.nextLine());
							System.out.println("Digite o valor do voo");
							volta.setPreco(Float.parseFloat(scan.nextLine()));
							System.out.println("Digite a Classe do voo");
							volta.setClasseVoo(scan.nextLine());
							System.out.println("Digite a poltrona");
							volta.setPoltrona(Integer.parseInt(scan.nextLine()));
							volta.setOrigem(reserva.getDestino());
							volta.setDestino(reserva.getOrigem());
							reservaPassagem.reservarVolta(c, reserva, volta);							
							break;
						default: 
							System.out.println("Viagem registrada com sucesso!\n");
					}	
				}
						
			}
		}
			
	}
	public static int mostrarClientes1() {
		Cliente listaClientes[] = reservaPassagem.mostrarClientes();
		for(int i = 0; i <reservaPassagem.getQuantClientes();i++) {
			Cliente c = listaClientes[i];
			System.out.println("\nCliente "+i+":\n"+ c);
		}
		int escolha;
		System.out.println("\nDigite o numero do cliente:");
		escolha = Integer.parseInt(scan.nextLine());
		if(escolha <= reservaPassagem.getQuantClientes()-1) {
			return escolha;
		}else {
			return 11;
		}	
	}
	public static int mostrarClientescpf() {
		Cliente listaClientes[] = reservaPassagem.mostrarClientes();
		for(int i = 0; i <reservaPassagem.getQuantClientes();i++) {
			Cliente c = listaClientes[i];
			System.out.println("\nCliente "+i+":\n"+ c);
		}
		int cpf;
		System.out.println("\nDigite o cpf do cliente:");
		cpf=Integer.parseInt(scan.nextLine());
		return cpf;		
	}
	public static int mostrarCidades1() {
		Cidade listaCidades[] = reservaPassagem.mostrarCidades();
		for(int i = 0; i <reservaPassagem.getQuantCidades();i++) {
			Cidade c = listaCidades[i];
			System.out.println("\nCidade "+i+":\n"+ c);
		}
		int escolha;
		System.out.println("\nDigite o numero da cidade:");
		escolha = Integer.parseInt(scan.nextLine());
		if(escolha <= reservaPassagem.getQuantCidades()-1) {
			return escolha;
		}else {
			return 11;
		}	
	}
	
	public static void cadastrarCliente() {
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente");
		cliente.setNome(scan.nextLine());
		System.out.println("Digite o cpf do cliente");
		cliente.setCpf(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite o endereco do cliente");
		cliente.setEndereco(scan.nextLine());
		System.out.println("Digite o telefone do cliente");
		cliente.setTelefone(Integer.parseInt(scan.nextLine()));
		reservaPassagem.cadastraCliente(cliente);
		
	}
	public static void cadastrarCidade() {
		Cidade cidade = new Cidade();
		System.out.println("Digite o nome da cidade");
		cidade.setNome(scan.nextLine());
		System.out.println("Digite o estado da cidade");
		cidade.setEstado(scan.nextLine());
		reservaPassagem.cadastrarCidade(cidade);
	}
	public static void mostrarReservas() {
		int cpf;
		int cont=0;
		cpf = mostrarClientescpf();
		Cliente listaClientes[] = reservaPassagem.mostrarClientes();
		Cliente c = null;
		for(int i = 0; i < reservaPassagem.getQuantClientes(); i++) {
			if(listaClientes[i].getCpf() == cpf) {
				c = listaClientes[i];
				cont++;
			}
		}
		if(cont == 0) {
			System.out.println("Esse cpf não esta cadastrado");
		}else {
			Reserva reservas[] = c.getReservas();
			if(c.getQuantReservas()==0) {
				System.out.println("Esse cliente não possui reservas marcadas.");
			}else {
				for(int j = 0; j <c.getQuantReservas();j++) {
					Reserva r = reservas[j];
					System.out.println("\nReserva "+j+":\n"+r);
				}
			}		
		}
		}			
	}

