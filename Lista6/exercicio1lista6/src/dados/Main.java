package dados;

public class Main {
	public static void main(String[] args) {
		Lista<Character> lista = new Lista<Character>();
		
		lista.set('A');
		lista.set('B');
		lista.set('C');
		lista.set('D');
		lista.set('E');
		lista.set('F');
		lista.set('G');
		lista.set('H');
		
		while(lista.getIteratorLista().hasNext()) {
			System.out.print(lista.getIteratorLista().next()+" ");
		}
	}
}
