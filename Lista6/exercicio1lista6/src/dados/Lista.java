package dados;

import java.util.ArrayList;
import java.util.List;

public class Lista<T> {
	private List<T> lista;
	private int size = 0;
	private Iterator<T> iteratorLista = new ListaIterator<T>(this);
	
	public Lista(){
		this.lista = new ArrayList<T>();	
	}
	public T get(int i) {
		return this.lista.get(i);
	}
	public void set(T elemento) {
		size++;
		this.lista.add(elemento);
	}
	public int size() {
		return this.size;
	}
	public Iterator<T> getIteratorLista(){
		return this.iteratorLista;		
	}
}
