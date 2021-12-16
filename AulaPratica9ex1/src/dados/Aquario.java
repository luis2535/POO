package dados;
import exceptions.*;

public class Aquario extends Viveiro {
	private float altura;
	private float temperatura;
	
	
	public Aquario(int maxPeixes){
		super(maxPeixes);
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getAltura() {
		return altura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public float getTemperatura() {
		return temperatura;
	}
	public float calculaEspaco() {
		return altura*largura*comprimento;
	}
	
	public void adicionaAnimal(Animal animal) throws TemperaturaInadequadaException, EspacoInsuficienteException, EhPeixeException, NaoEhPeixeException{
		if(animal instanceof Peixe) {
			Peixe p = (Peixe) animal;
			if(espacoDisponivel() >= (p.calculaEspacoOcupado()*0.7)) {
				if(((p.getTemperaturaIdeal() < temperatura - 3)||(p.getTemperaturaIdeal() > temperatura +3))) {
					throw new TemperaturaInadequadaException("A temperatura ideal não esta adequada");
				}
				animais[quantAnimal] = p;
				quantAnimal++;
			}
			else {
				throw new EspacoInsuficienteException("O espaço não é suficiente para adicionar o peixe");
			}
			
		}
		else {
			throw new NaoEhPeixeException("O animal não é peixe e não pode ser adicionado ao aquario");
		}
	}
}
