package dados;
import java.util.*;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Digrafo digrafo = new Digrafo();
		Grafo grafo = new Grafo();
		System.out.println("Digrafo:");
		digrafo.adicionarVertice();
		digrafo.adicionarVertice();
		digrafo.adicionarVertice();
		digrafo.adicionarVertice();
		digrafo.adicionarVertice();
		digrafo.adicionarAresta(1, 2);
		digrafo.adicionarAresta(0, 0);
		digrafo.adicionarAresta(3, 1);
		digrafo.adicionarAresta(4, 4);
		digrafo.adicionarAresta(1, 4);
		digrafo.adicionarAresta(1, 3);
		digrafo.adicionarAresta(2, 0);
	
		System.out.println(digrafo);
		
		System.out.println("Grafo:");
		grafo.adicionarVertice();
		grafo.adicionarVertice();
		grafo.adicionarVertice();
		grafo.adicionarVertice();
		grafo.adicionarAresta(1, 2);
		grafo.adicionarAresta(2, 2);
		grafo.adicionarAresta(1, 3);
		grafo.adicionarAresta(0, 1);
		System.out.println(grafo);
	}

}
