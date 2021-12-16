package dados;
import exceptions.PilhaCheiaException;
import exceptions.PilhaVaziaException;

public class Juiz {
	private String nome;
	private Pilha<Processo> processos;

	
	public Juiz(int limite) {

		processos = new Pilha<Processo>(limite);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void cadastrarProcesso(Processo processo) throws PilhaCheiaException {
		processos.inserir(processo);
	}
	public Processo removerProcesso() throws PilhaVaziaException {
		Processo p = processos.remover();
		return p;
	}
	public int getLimite() {
		return processos.getLimite();
	}
	public int getTamanho() {
		return processos.getSize();
	}
	public String toString() {
		return "Nome: "+nome+"\nProcessos:\n"+processos;
	}
	
}
