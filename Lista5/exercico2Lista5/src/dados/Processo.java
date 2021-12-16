package dados;

public class Processo {
	private int id;
	private String nome;
	public Processo() {
		
	}
	public Processo(int id, String nome) {
		this.id = id;
		this.nome = nome;
		
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String toString() {
		return "ID: "+id+" Nome: "+nome;
	}
}
