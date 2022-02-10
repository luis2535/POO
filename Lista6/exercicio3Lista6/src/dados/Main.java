package dados;

import java.util.LinkedList;
import java.util.List;

public class Main {
	private static List<Servidor> servidores = new LinkedList<Servidor>();
	private static List<Cliente> clientes = new LinkedList<Cliente>();
	public static void main(String[] args) {
		Servidor servidor1 = new Servidor();
		Servidor servidor2 = new Servidor();
		Servidor servidor3 = new Servidor();
		servidores.add(servidor1);
		servidores.add(servidor2);
		servidores.add(servidor3);
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		Cliente cliente3 = new Cliente();
		Cliente cliente4 = new Cliente();
		Cliente cliente5 = new Cliente();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		clientes.add(cliente5);
		
		servidor1.adicionar(cliente1);
		servidor1.adicionar(cliente3);
		servidor1.adicionar(cliente5);
		
		servidor2.adicionar(cliente2);
		servidor2.adicionar(cliente4);
		servidor2.adicionar(cliente5);
		
		servidor3.adicionar(cliente1);
		servidor3.adicionar(cliente2);
		servidor3.adicionar(cliente3);
		servidor3.adicionar(cliente4);
		
		servidor1.enviarMensagem("Bom dia!");
		servidor2.enviarMensagem("Teste1 servidor2");
		servidor3.enviarMensagem("Melão");
		
		servidor1.enviarMensagem("Boa tarde!");
		servidor2.enviarMensagem("Teste2 servidor2");
		servidor3.enviarMensagem("Abacate");
		
		servidor1.enviarMensagem("Boa noite!");
		servidor2.enviarMensagem("Teste3 servidor2");
		servidor3.enviarMensagem("Melância");
		
		int i=0;
		for(Cliente c : clientes) {
			i++;
			System.out.println("Cliente "+i+"\n");
			System.out.println(c);
			System.out.println("\n");
		}
		
	}

}
