package dados;

public class AnimalFactory {
	private static AnimalFactory instance = null;
	private AnimalFactory() {
		
	}
	public static AnimalFactory getInstance() {
		if(instance == null) {
			instance = new AnimalFactory();
		}
		return instance;
	}
	public Animal createAnimal(TipoAnimal tipo) {
		switch(tipo) {
		case CAO:
			return new Cao();
		case COBRA:
			return new Cobra();
		case GATO:
			return new Gato();
		case RATO:
			return new Rato();
		case SAPO:
			return new Sapo();
		default:
			throw new IllegalArgumentException("Tipo de animal inexistente");
		}
	}

}
