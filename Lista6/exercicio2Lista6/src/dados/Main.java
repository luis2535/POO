package dados;

public class Main {
	public static void main(String[] args) {
		AnimalFactory animalFactory = AnimalFactory.getInstance();
		Animal animal1 = animalFactory.createAnimal(TipoAnimal.CAO);
		Animal animal2 = animalFactory.createAnimal(TipoAnimal.COBRA);
		Animal animal3 = animalFactory.createAnimal(TipoAnimal.GATO);
		Animal animal4 = animalFactory.createAnimal(TipoAnimal.RATO);
		Animal animal5 = animalFactory.createAnimal(TipoAnimal.SAPO);
		System.out.println(animal1.emitirSom());
		System.out.println(animal2.emitirSom());
		System.out.println(animal3.emitirSom());
		System.out.println(animal4.emitirSom());
		System.out.println(animal5.emitirSom());
	}
}
