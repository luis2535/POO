package dados;


import java.util.*;


public abstract class Gerador {
	protected List<Integer> sequencia = new LinkedList<Integer>();
	public List<Integer> getSequencia(){
		return this.sequencia;
	}
	public abstract void gerar(int n);
}
