package dados;

public class ListaIterator<T> implements Iterator<T> {
	private int i = 0;
	private int par = 0;
	private int impar = 0;
	private Lista<T> lista;
	
	public ListaIterator(Lista<T> lista) {
		this.lista = lista;
	}

	@Override
	public boolean hasNext() {
		return i<=lista.size() - 1;
	}

	@Override
	public T next() {
		T valor = null;
		if(i%2 == 0 && impar == 0) {
			par++;
			valor = lista.get(i);
			if(i+2 < lista.size()) {
				i+=2;
			}else {
				i = 1;
			}

		}else if(i%2 != 0) {
			impar++;
			valor = lista.get(i);
			if(i+2 < lista.size()) {
				i+=2;
			}else {
				i+=2;
				return valor;
			}
		}
		return valor;
		
	}

	@Override
	public void reset() {
		i = 0;
		
	}

}
