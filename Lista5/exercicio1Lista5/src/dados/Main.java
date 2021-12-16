package dados;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<IOperacaoInteira> lista = new LinkedList<IOperacaoInteira>();
		Soma soma = new Soma();
		Multiplicacao multi = new Multiplicacao();
		MDC mdc = new MDC();
		Mod mod = new Mod();
		lista.add(soma);
		lista.add(multi);
		lista.add(mdc);
		lista.add(mod);
		int  i = 0;
		while(i<4) {
			Random random = new Random();
			int valor1 = random.nextInt(100);
			int valor2 = random.nextInt(100);
			int resultado1 = lista.get(0).executar(valor1, valor2);
			int resultado2 = lista.get(1).executar(valor1, valor2);
			int resultado3 = lista.get(2).executar(valor1, valor2);
			int resultado4 = lista.get(3).executar(valor1, valor2);
			System.out.println("Valor 1: "+valor1+" Valor 2: "+valor2);
			System.out.println("Soma: "+resultado1+" Multiplicacao: "+resultado2+" MDC: "+resultado3+" MOD: "+resultado4);
			System.out.println();
			i++;
		}
		
	}

}
