package dados;
import java.util.*;

public class Matriz<T> {
	private int ordem;
	private Object[][] matriz;
	
	public int getOrdem() {
		return ordem;
	}
	public Matriz(int ord) {
		this.ordem = ord;
		@SuppressWarnings("unchecked")
		T[][] array = (T[][])new Object[ord][ord];
		matriz = array;
	}
	public boolean set(T objeto, int i,int j) {
		if(i >= ordem || j >= ordem) {
			return false;
		}else {
			matriz[i][j] = objeto;
			return true;
		}
	}
	@SuppressWarnings("unchecked")
	public T get(int i,int j) {
		if(i>=ordem || j>=ordem) {
			return null;
		}else {
			return (T) matriz[i][j];
		}
	}
	@SuppressWarnings("unchecked")
	public List<T> getLinha(int linha){
		List<T> lista = new LinkedList<T>();
		if(linha >= ordem ) {
			lista = null;
		}else {
			for(int i = 0;i<ordem;i++) {
				lista.add((T) matriz[linha][i]);
			}
		}
		return lista;
	}
	@SuppressWarnings("unchecked")
	public List<T> getColuna(int coluna){
		List<T> lista = new LinkedList<T>();
		if(coluna >= ordem ) {
			lista = null;
		}else {
			for(int i = 0;i<ordem;i++) {
				lista.add((T) matriz[i][coluna]);
			}
		}
		return lista;
	}
	@SuppressWarnings("unchecked")
	public List<T> getElementosQuadrante(Quadrante quadrante){
		List<T>valores = new LinkedList<T>();
		if(quadrante == Quadrante.PRIMEIRO) {
			for(int i = 0;i <= ordem/2; i++) {
				for(int j = 0;j <= ordem/2; j++) {
					valores.add((T) matriz[i][j]);					
				}
			}
		}else if(quadrante == Quadrante.SEGUNDO) {
			for(int i = ordem/2+1;i < ordem; i++) {
				for(int j = 0;j <= ordem/2; j++) {
					valores.add((T) matriz[i][j]);					
				}
			}		
		}else if(quadrante == Quadrante.TERCEIRO) {
			for(int i = 0;i <= ordem/2; i++) {
				for(int j = ordem/2+1;j < ordem; j++) {
					valores.add((T) matriz[i][j]);					
				}
			}
			
		}else if(quadrante == Quadrante.QUARTO) {
			for(int i = ordem/2+1;i < ordem; i++) {
				for(int j = ordem/2+1;j < ordem; j++) {
					valores.add((T) matriz[i][j]);					
				}
			}
		}
		return valores;	
	}
	@SuppressWarnings("unchecked")
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Matriz:\n");
		for(int i = 0; i < ordem; i++) {
			for(int j = 0;j < ordem; j++) {
				string.append((T) matriz[i][j]+"\t");
			}
			string.append("\n");
		}
		return string.toString();
	}
}
