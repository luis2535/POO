package dados;
import java.util.*;
public class Turma {
	private List<Aluno>alunos = new LinkedList<Aluno>();
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	public Turma() {}
	private void ordenaAlunosPorMedia() {
		for(int i = 0; i <alunos.size();i++) {
			for(int j = i; j < alunos.size();j++) {
				if(alunos.get(i).calcularMedia() < alunos.get(j).calcularMedia()) {
					Aluno temp;
					temp = alunos.get(i);
					alunos.set(i, alunos.get(j));
					alunos.set(j, temp);					
				}	
			}
		}
		
	}
	public int numeroAlunos() {
		return alunos.size();
	}
	public List<Aluno> listaDeAlunos(){
		ordenaAlunosPorMedia();
		return alunos;
	}
	public List<Equipe<Aluno>> separarEmEquipes(){
		List<Equipe<Aluno>> equipes = new LinkedList<Equipe<Aluno>>();
		ordenaAlunosPorMedia();
		int tamanho = alunos.size();
		int inicio = 0;
		int fim = tamanho - 1;
		int numero = 1;
		while(tamanho != 0) {
			String nome = "Equipe "+ numero;
			numero++;
			Equipe<Aluno> equipe = new Equipe<Aluno>();
			equipe.setNome(nome);
			if(tamanho%4 == 0) {
				equipe.adicionarAluno(alunos.get(inicio));
				inicio++;
				equipe.adicionarAluno(alunos.get(inicio));
				inicio++;
				equipe.adicionarAluno(alunos.get(fim-1));
				equipe.adicionarAluno(alunos.get(fim));
				fim = fim - 2;
				tamanho = tamanho - 4;
			}else if(tamanho%3 == 0) {
				equipe.adicionarAluno(alunos.get(inicio));
				inicio++;
				equipe.adicionarAluno(alunos.get(inicio));
				inicio++;
				equipe.adicionarAluno(alunos.get(fim));
				fim--;
				tamanho = tamanho - 3;
			}else {
				equipe.adicionarAluno(alunos.get(inicio));
				inicio++;
				equipe.adicionarAluno(alunos.get(inicio));
				inicio++;
				equipe.adicionarAluno(alunos.get(fim-1));
				equipe.adicionarAluno(alunos.get(fim));
				fim = fim - 2;
				tamanho = tamanho - 4;	
			}
			equipes.add(equipe);
		}
		return equipes;
		
	}
	
}
