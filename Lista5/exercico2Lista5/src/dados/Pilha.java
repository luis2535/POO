package dados;
import java.util.*;
import exceptions.*;

public class Pilha<T> {
	private int limite;
	private List<T>elementos;
	
	public Pilha(int limite){
		this.limite = limite;
		elementos = new LinkedList<T>();
	}
	public void inserir(T objeto) throws PilhaCheiaException{
		if(elementos.size()< limite) {
			elementos.add(objeto);
		}else {
			throw new PilhaCheiaException("O limite da pilha foi atingido, não é possivel adicionar mais elementos");
		}
	}
	public T remover() throws PilhaVaziaException {
		T elemento = null;
		if(getSize() != 0) {
			int ultimoElemento = elementos.lastIndexOf(elementos);
			elemento = elementos.get(ultimoElemento);
			elementos.remove(elemento);		
		}else {
			throw new PilhaVaziaException("Não há elementos para serem removidos da pilha");
			
		}
		
		return elemento;
	}
	public int getSize() {
		int tamanho = elementos.size();
		return tamanho;
	}
	public int getLimite() {
		return limite;
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(T e : elementos) {
			string.append(e+"\n");
		}
		return string.toString();
	}
}
