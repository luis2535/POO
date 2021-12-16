package dados;


import java.util.*;


public abstract class Gerador implements ISequencia {
	protected List<Integer> sequencia = new LinkedList<Integer>();
	public List<Integer> getSequencia(){
		return this.sequencia;
	}
	public abstract void gerar(int n);
	
	public int sortear() {
		Random random = new Random();
		int result = random.nextInt(sequencia.size());
		return sequencia.get(result);
	}
	public long somatorio() {
		long soma = 0;
		for(int n : sequencia) {
			soma += n; 
		}
		return soma;
	}
	public double mediaAritmetica() {
		long soma = somatorio();
		double media;
		media = soma/sequencia.size();
		return media;
		
	}
	public double mediaGeometrica() {
		long soma = somatorio();
		double media;
		media = Math.pow(soma, 1.0/(sequencia.size()));
		return media;
	}
	
	public double variancia() {
		double media = mediaAritmetica();
		long soma = 0;
		for(int n : sequencia) {
			soma += Math.pow((n - media), 2);
		}
		double variancia = 0;
		if(sequencia.size()!= 1) {
			variancia = soma/(sequencia.size()-1);
		}
		return variancia;
	}
	
	public double desvioPadrao() {
		double desvio;
		desvio = Math.sqrt(variancia());
		return desvio;
	}
	
	public long amplitude() {
		long menor = sequencia.get(0);
		long maior = sequencia.get(0);
		for(int n : sequencia) {
			if(n > maior) {
				maior = n;
			}
			if(n < menor) {
				menor = n;
			}
		}
		long amplitude;
		amplitude = maior - menor;
		return amplitude;
	}
}
