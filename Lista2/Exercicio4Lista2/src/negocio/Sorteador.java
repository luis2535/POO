package negocio;
import dados.Pessoa;
import java.util.Random;

public class Sorteador {
	Pessoa[] listaDePessoas = new Pessoa[10];
	int quantPessoas = 0;
	
	public Sorteador() {
		
	}
	public int getQuantPessoas() {
		return quantPessoas;
	}
	public void adicionarPessoa(Pessoa pessoa) {
		if(quantPessoas < listaDePessoas.length) {
			listaDePessoas[quantPessoas] = pessoa;
			quantPessoas++;
		}else {
			System.out.println("Não foi possivel adicionar pessoa");
		}
	}
	public Pessoa sortearProximo() {
		Random rnd = new Random();
		int indice = rnd.nextInt(quantPessoas);
		Pessoa sortear = listaDePessoas[indice];
		
		for(int i = 0; i < quantPessoas - 1 ; i++) {
			if(i >= indice) {
				listaDePessoas[i] = listaDePessoas[i+1];				
			}
		}
		quantPessoas--;
		return sortear;	
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Lista de Pessoas:\n");
		for(int i = 0; i < quantPessoas ; i++) {
			string.append("\t"+listaDePessoas[i]+"\n");
		}
		return string.toString();
	}
}
