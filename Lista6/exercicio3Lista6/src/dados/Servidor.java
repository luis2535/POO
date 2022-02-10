package dados;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Servidor implements Sujeito {
	private String ip;
	private String ultimaMensagem;
	private List<Observador> observadores = new LinkedList<Observador>();
	private Random r = new Random();
	
	public Servidor() {
		int num  = r.nextInt(100);
		ip = Integer.toString(num);
	}
	
	public void enviarMensagem(String mensagem) {
		ultimaMensagem = mensagem;
		notificar();
	}

	@Override
	public void adicionar(Observador observador) {
		observadores.add(observador);		
	}

	@Override
	public void remover(Observador observador) {
		observadores.remove(observador);
		
	}

	@Override
	public void notificar() {
		for(Observador o : observadores) {
			o.atualizar(this.ultimaMensagem);			
		}
		
	}
	public String toString() {
		return "IP: "+ip;
	}
	

}
