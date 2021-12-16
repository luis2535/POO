package apresentacao;
import dados.*;
import exceptions.*;
import java.util.*;
public class Main {
	static SistemaProcessos sistema = new SistemaProcessos();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		Juiz juiz1 = new Juiz(5);
		juiz1.setNome("Afonso");
		sistema.cadastrarJuiz(juiz1);
		Juiz juiz2 = new Juiz(5);
		juiz2.setNome("Juca");
		sistema.cadastrarJuiz(juiz2);
		Juiz juiz3 = new Juiz(5);
		juiz3.setNome("Tadeu");
		sistema.cadastrarJuiz(juiz3);
		
		Processo processo1 = new Processo(1,"Processo 1");
		Processo processo2 = new Processo(2,"Processo 2");
		Processo processo3 = new Processo(3,"Processo 3");
		Processo processo4 = new Processo(4,"Processo 4");
		Processo processo5 = new Processo(5,"Processo 5");
		Processo processo6 = new Processo(6,"Processo 6");
		Processo processo7 = new Processo(7,"Processo 7");
		Processo processo8 = new Processo(8,"Processo 8");
		Processo processo9 = new Processo(9,"Processo 9");
		Processo processo10 = new Processo(10,"Processo 10");
		Processo processo11 = new Processo(11,"Processo 11");
		Processo processo12 = new Processo(12,"Processo 12");
		Processo processo13 = new Processo(13,"Processo 13");
		Processo processo14 = new Processo(14,"Processo 14");
		Processo processo15 = new Processo(15,"Processo 15");
		Processo processo16 = new Processo(16,"Processo 16");
		Processo processo17 = new Processo(17,"Processo 17");
		Processo processo18 = new Processo(18,"Processo 18");
		
		sistema.cadastrarProcessos(processo1);
		sistema.cadastrarProcessos(processo2);
		sistema.cadastrarProcessos(processo3);
		sistema.cadastrarProcessos(processo4);
		sistema.cadastrarProcessos(processo5);
		sistema.cadastrarProcessos(processo6);
		sistema.cadastrarProcessos(processo7);
		sistema.cadastrarProcessos(processo8);
		sistema.cadastrarProcessos(processo9);
		sistema.cadastrarProcessos(processo10);
		sistema.cadastrarProcessos(processo11);
		sistema.cadastrarProcessos(processo12);
		sistema.cadastrarProcessos(processo13);
		sistema.cadastrarProcessos(processo14);
		sistema.cadastrarProcessos(processo15);
		sistema.cadastrarProcessos(processo16);
		sistema.cadastrarProcessos(processo17);
		sistema.cadastrarProcessos(processo18);
		
		
		distribuirProcessos();
		
		
		
		imprimirJuizes();
		//teste exceções
		testeExcecao1(processo1);
		testeExcecao2();
		
		
		
		
	}
	
	
	
	public static void distribuirProcessos(){
		try {
			sistema.distribuirProcessos();
		}
		catch(PilhaCheiaException e) {
			System.err.println(e.getMessage());
		}
		catch(ProcessoSemJuizException e) {
			System.err.println(e.getMessage());
		}
		
	}
	public static void testeExcecao1(Processo processo) {
		List<Juiz> testeExcecao = sistema.retornarLista();
		Juiz j = testeExcecao.get(0);
		try {
			j.cadastrarProcesso(processo);
		}
		catch(PilhaCheiaException e){
			System.err.println(e.getMessage());
		}
		
	}
	public static void testeExcecao2() {
		Juiz j = new Juiz(5);
		j.setNome("Claudio");
		try {
			Processo p = j.removerProcesso();
		}
		catch(PilhaVaziaException e) {
			System.err.println(e.getMessage());
		}
	}
	public static void imprimirJuizes() {
		List<Juiz> lista = sistema.retornarLista();
		for(Juiz j : lista) {
			System.out.println(j);
		}
	}

}
