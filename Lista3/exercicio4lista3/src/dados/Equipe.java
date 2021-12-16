package dados;
import java.util.*;
public class Equipe<T> {
	private String nome;
	private List<T> objetos = new LinkedList<T>();
	
	public Equipe() {
		
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void adicionarAluno(T objeto) {
		if(objetos.size() <= 4) {
			objetos.add(objeto);
		}else {
			System.out.println("Equipe cheia");
		}	
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Nome da Equipe: "+nome+"\nAlunos:\n");
		for(T a : objetos) {
			string.append("\t"+a+"\n");
		}
		return string.toString();
	}
	

}
