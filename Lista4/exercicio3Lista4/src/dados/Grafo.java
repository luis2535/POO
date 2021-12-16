package dados;

import java.util.List;

public class Grafo extends Digrafo {
	public Grafo() {}
	public void adicionarAresta(int origem, int destino) {
		int ordem = matrizAdjacencia2.size();
		if(origem >= ordem || destino >= ordem) {
			System.out.println("Essa posição não existe!");
		}else {
			List<Integer> linha = matrizAdjacencia2.get(origem);
			linha.set(destino, 1);
			List<Integer> linha2 = matrizAdjacencia2.get(destino);
			linha2.set(origem, 1);
		}
	}
}
