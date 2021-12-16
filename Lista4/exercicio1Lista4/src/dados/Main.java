package dados;

public class Main {
	public static void main(String[] args) {
		Animal animal;
		String nome;
		
		animal = new Cachorro();
		nome = "Rex";
		animal.setNome(nome);
		imprimir(animal);
		
		animal = new Cachorro();
		nome = "Thor";
		animal.setNome(nome);
		imprimir(animal);
		
		animal = new Gato();
		nome = "Mia";
		animal.setNome(nome);
		imprimir(animal);
		
		animal = new Gato();
		nome = "Jerry";
		animal.setNome(nome);
		imprimir(animal);
		
		animal = new Vaca();
		nome = "Mimosa";
		animal.setNome(nome);
		imprimir(animal);
		
		animal = new Vaca();
		nome = "Estrela";
		animal.setNome(nome);
		imprimir(animal);
		
		
		
	}
	public static void imprimir(Animal animal) {
		System.out.println(animal.getNome()+": "+animal.emitirSom());
	}

}
