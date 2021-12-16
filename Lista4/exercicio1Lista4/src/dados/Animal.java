package dados;

public abstract class Animal {
	String nome;
	public Animal() {}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public abstract String emitirSom();

}
