package apresentacao;
import dados.*;
import java.util.*;
//nao consegui utilizar o metodo de scan de arquivos
public class Principal {
	static Scanner scan = new Scanner(System.in);
	static Turma sistema = new Turma();
	public static void main(String[] args) {
		int opcao=0;
		while(opcao != -1) {
			adicionarAluno();
			System.out.println("Digite -1 para terminar a inserção de alunos ou qualquer numero para continuar");
			opcao = Integer.parseInt(scan.nextLine());
			}
		if(sistema.numeroAlunos()>5) {
			imprimirEquipes();
		}else {
			System.out.println("Apenas "+sistema.numeroAlunos()+" alunos cadastrados, não é possível formar duas equipes de 3 ou 4 alunos");
			System.out.println("Imprimindo a lista de alunos:");
			imprimirAlunos();
		}
		
		
	}
	public static Aluno criarAluno() {
		Aluno a = new Aluno();
		System.out.println("Digite o nome do Aluno");
		a.setNome(scan.nextLine());
		System.out.println("Digite a idade do Aluno");
		a.setIdade(Integer.parseInt(scan.nextLine()));
		System.out.println("Digite as 5 notas do Aluno");
		double [] notas = new double[5];
		for(int i = 0;i<5;i++) {
			System.out.println("Nota "+(i+1));
			notas[i] = Double.parseDouble(scan.nextLine());
		}
		a.setNotas(notas);
		return a;
	}
	public static void adicionarAluno() {
		Aluno a = new Aluno(); 
		a = criarAluno();
		sistema.adicionarAluno(a);
	}
	public static List<Equipe<Aluno>> formarEquipe() {
		List<Equipe<Aluno>> equipes = new LinkedList<Equipe<Aluno>>();
		equipes = sistema.separarEmEquipes();
		return equipes;
	}
	public static void imprimirAlunos() {
		List<Aluno> alunos = new LinkedList<Aluno>();
		alunos = sistema.listaDeAlunos();
		for(Aluno a : alunos) {
			System.out.println(a);
		}
		
	}
	public static void imprimirEquipes() {
		List<Equipe<Aluno>> equipes = new LinkedList<Equipe<Aluno>>();
		equipes = sistema.separarEmEquipes();
		for(Equipe<Aluno> a: equipes) {
			System.out.println(a);
		}
	}
}
