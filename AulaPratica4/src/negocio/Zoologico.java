package negocio;
import dados.*;

public class Zoologico {
	private Animal[] animais = new Animal[10];
	private Viveiro[] viveiros = new Viveiro[10];
	private int quantViveiros=0;
	private int quantAnimais=0;
	
	public Zoologico(){
		
	}
	public int getQuantViveiros() {
		return quantViveiros;
	}
	public int getQuantAnimais() {
		return quantAnimais;
	}
	public void cadastrarViveiro(Viveiro viveiro) {
		if(quantViveiros < viveiros.length) {
			viveiros[quantViveiros] = viveiro;
			quantViveiros++;
		}else {
			System.out.println("Não foi possivel adicionar viveiro");
		}
	}
	public void cadastrarAnimal(Animal animal) {
		if(quantAnimais < animais.length) {
			animais[quantAnimais] = animal;
			quantAnimais++;
		}else {
			System.out.println("Não foi possível adicionar o animal");
		}
	}
	public boolean alocarAnimal(Animal animal, Viveiro viveiro) {
			if(animal instanceof Peixe) {
				if(viveiro instanceof Aquario) {
					Peixe p = (Peixe) animal;
					Aquario a = (Aquario) viveiro;				
					if((a.getTemperatura()> p.getTemperaturaIdeal()+3) || (a.getTemperatura()<p.getTemperaturaIdeal()-3)){
					return false;
				}
			}else {
				return false;
			}
		}
			if(animal instanceof Peixe == false) {
				if (viveiro instanceof Aquario) {
					return false;
				}
			}
		return viveiro.adicionarAnimal(animal);
	}
	public Aquario[] getSoAquarios() {
		int max = 0;
		for(int i = 0; i < quantViveiros; i++) {
			if(viveiros[i] instanceof Aquario) {
				max++;
			}
		}
		Aquario[] aquarios = new Aquario[max];
		int aux=0;
		for(int i = 0;i<quantViveiros;i++) {
			if(viveiros[i] instanceof Aquario) {
				aquarios[aux] = (Aquario) viveiros[i];
				aux++;
			}
		}
		return aquarios;
	}
	public Viveiro[] getSoViveiros() {
		int max = 0;
		for(int i = 0;i <quantViveiros;i++) {
			if(viveiros[i] instanceof Aquario == false) {
				max++;
			}
		}
		Viveiro[] viveiro = new Viveiro[max];
		int aux = 0;
		for(int i = 0 ; i < quantViveiros ; i++) {
			if(viveiros[i] instanceof Aquario == false) {
				viveiro[aux] = viveiros[i];
				aux++;
			}
		}
		return viveiro;
	}
	public Animal[] mostrarAnimais() {
		return animais;
	}
	public Viveiro[] mostrarViveiros() {
		return viveiros;
	}

}
