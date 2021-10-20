package negocio;

import dados.*;

public class ReservaPassagem {
	private Cidade[] listaDeCidades = new Cidade[10];
	private Cliente[] listaDeClientes = new Cliente[10];
	private int quantCidades = 0;
	private int quantClientes = 0;
	
	public int getQuantCidades() {
		return quantCidades;
	}
	public int getQuantClientes() {
		return quantClientes;
	}
	public void cadastrarCidade(Cidade cidade) {
		if(quantCidades < listaDeCidades.length) {
			listaDeCidades[quantCidades] = cidade;
			quantCidades++;
		}else {
			System.out.println("Lista de cidades está cheia.");
		}
	}
	public void cadastraCliente(Cliente cliente) {
		if(quantClientes < listaDeClientes.length) {
			if(clienteCadastrado(cliente)) {
				System.out.println("CPF ja cadastrado, falha no cadastro de um novo cliente!");
			}else {
				listaDeClientes[quantClientes] = cliente;
				quantClientes++;			
			}
			}else {
			System.out.println("Lista de clientes está cheia");
		}
	}
	public void reservarIda(Cliente cliente, Reserva reserva) {
		if(clienteCadastrado(cliente)) {
			cliente.reservarIda(reserva);			
		}else {
			System.out.println("Cliente não cadastrado");
		}
		
	}
	public void reservarVolta(Cliente cliente, Reserva ida, Reserva volta) {
		if(clienteCadastrado(cliente)) {
			cliente.reservarVolta(ida, volta);			
		}else {
			System.out.println("Cliente não cadastrado");
		}
		
	}
	
	public Cliente[] mostrarClientes() {
		return listaDeClientes;
	}
	public Cidade[] mostrarCidades() {
		return listaDeCidades;
	}
	
	public Reserva[] mostrarReservas(int cpfCliente) {
		for(int i = 0; i<quantClientes; i++) {
			if(listaDeClientes[i].getCpf() == cpfCliente) {
				return listaDeClientes[i].getReservas();
			}
		}
		return null;
		
	}
	
	private boolean clienteCadastrado(Cliente cliente) {
		for(int i = 0; i < quantClientes ; i++) {
			if(listaDeClientes[i].equals(cliente)) {
				return true;
			}		
		}
		return false;
	}
	

}
