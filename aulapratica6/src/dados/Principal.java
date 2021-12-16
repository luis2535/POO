package dados;
import java.util.List;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Gerador gerador;
		List<Integer> sequencia;
		
		gerador = new Abundantes();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Abundantes", sequencia);
		
		gerador = new Fatoriais();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Fatoriais", sequencia);
		
		gerador = new Fibonacci();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Fibonacci", sequencia);
		
		gerador = new Naturais();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Naturais", sequencia);
		
		gerador = new Perfeitos();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Perfeitos", sequencia);
	
		gerador = new Primos();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Primos", sequencia);
		
		gerador = new Quadrados();
		gerador.gerar(random(50));
		sequencia = gerador.getSequencia();
		imprimir("Quadrados", sequencia);
	}
	
	public static void imprimir(String tipo, List<Integer> sequencia) {
		System.out.print("\n"+tipo+ "[");
		for(int i = 0; i < sequencia.size() - 1; i++) {
			System.out.print(sequencia.get(i)+", ");
		}
		System.out.print(sequencia.get(sequencia.size()-1)+"]\n");
	}
	public static int random(int n) {
		Random  r = new Random();
		int result = r.nextInt(n);
		while(result == 0) {
			result = r.nextInt(n);
		}
		return result;
	}

}
