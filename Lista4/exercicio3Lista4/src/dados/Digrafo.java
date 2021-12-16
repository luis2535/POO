package dados;
import java.util.*;

public class Digrafo {
	
	protected Map<Integer, List<Integer>> matrizAdjacencia2 = new HashMap<Integer, List<Integer>>();

	
	public Digrafo() {
	}
	public void adicionarVertice() {
		int ordem = matrizAdjacencia2.size();
		if(ordem == 0) {
			List<Integer> primeiraLinha = new LinkedList<>();
			primeiraLinha.add(0);
			matrizAdjacencia2.put(0, primeiraLinha);
		}else {
			for(int i = 0; i<ordem;i++) {
				List<Integer> linha = matrizAdjacencia2.get(i);
				linha.add(0);
			}
			List<Integer> linhanova = new LinkedList<Integer>();
			for(int i = 0; i<=ordem;i++) {
				linhanova.add(0);
			}
			matrizAdjacencia2.put(ordem,linhanova);			
		}
		
	}
	public void adicionarAresta(int origem, int destino) {
		int ordem = matrizAdjacencia2.size();
		if(origem >= ordem || destino >= ordem) {
			System.out.println("Essa posição não existe!");
		}else {
			List<Integer> linha = matrizAdjacencia2.get(origem);
			linha.set(destino, 1);
		}
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(Map.Entry<Integer, List<Integer>> pair : matrizAdjacencia2.entrySet()) {
			List<Integer> value = pair.getValue();
			for(int i : value) {
				string.append("\t"+i);
			}
			string.append("\n\n");
		}
		return string.toString();
	}
	

}
