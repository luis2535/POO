package dados;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		Gerador gerador1;
		Gerador gerador2;
		Gerador gerador3;
		Gerador gerador4;
		Gerador gerador5;
		Gerador gerador6;
		Gerador gerador7;
		
		List<Integer> sequencia;		
		
		gerador1 = new Abundantes();
		gerador1.gerar(10);
		sequencia = gerador1.getSequencia();
		imprimir("Abundantes", sequencia);
		int sortear1 = gerador1.sortear();
		System.out.println("Sorteado: "+sortear1);
		long somatorio1 = gerador1.somatorio();
		System.out.println("Soma: "+somatorio1);
		double mediaAritmetica1 = gerador1.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica1);
		double mediaGeometrica1 = gerador1.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica1);
		double variancia1 = gerador1.variancia();
		System.out.println("Variancia: "+variancia1);
		double desvioPadrao1 = gerador1.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao1);
		long amplitude1 = gerador1.amplitude();
		System.out.println("Amplitude: "+amplitude1);
		int maiorSort = sortear1;
		String sort = "Abundante";
		long maiorSoma = somatorio1;
		String soma = "Abundante";
		double maiorMediaA = mediaAritmetica1;
		String mediaA = "Abundante";
		double maiorMediaG = mediaGeometrica1;
		String mediaG ="Abundante";
		double maiorVar = variancia1;
		String vari = "Abundante";
		double maiorDesvio = desvioPadrao1;
		String desvio = "Abundante";
		long maiorAmpli = amplitude1;
		String amplitude = "Abundante";
		
		gerador2 = new Fatoriais();
		gerador2.gerar(10);
		sequencia = gerador2.getSequencia();
		imprimir("Fatoriais", sequencia);
		int sortear2 = gerador2.sortear();
		System.out.println("Sorteado: "+sortear2);
		long somatorio2 = gerador2.somatorio();
		System.out.println("Soma: "+somatorio2);
		double mediaAritmetica2 = gerador2.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica2);
		double mediaGeometrica2 = gerador2.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica2);
		double variancia2 = gerador2.variancia();
		System.out.println("Variancia: "+variancia2);
		double desvioPadrao2 = gerador2.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao2);
		long amplitude2 = gerador2.amplitude();
		System.out.println("Amplitude: "+amplitude2);
		if(sortear2 > maiorSort) {
			maiorSort = sortear2;
			sort = "Fatoriais";
		}
		if(somatorio2 > maiorSoma) {
			maiorSoma = somatorio2;
			soma = "Fatoriais";
		}
		if(mediaAritmetica2 > maiorMediaA) {
			maiorMediaA = mediaAritmetica2;
			mediaA = "Fatoriais";
		}
		if(mediaGeometrica2 > maiorMediaG) {
			maiorMediaG = mediaGeometrica2;
			mediaG = "Fatoriais";
		}
		if(variancia2 > maiorVar) {
			maiorVar = variancia2;
			vari = "Fatoriais";
		}
		if(desvioPadrao2 > maiorDesvio) {
			maiorDesvio = desvioPadrao2;
			desvio = "Fatoriais";
		}
		if(amplitude2 > maiorAmpli) {
			maiorAmpli = amplitude2;
			amplitude = "Fatoriais";
		}
		
		gerador3 = new Fibonacci();
		gerador3.gerar(10);
		sequencia = gerador3.getSequencia();
		imprimir("Fibonacci", sequencia);
		int sortear3 = gerador3.sortear();
		System.out.println("Sorteado: "+sortear3);
		long somatorio3 = gerador3.somatorio();
		System.out.println("Soma: "+somatorio3);
		double mediaAritmetica3 = gerador3.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica3);
		double mediaGeometrica3 = gerador3.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica3);
		double variancia3 = gerador3.variancia();
		System.out.println("Variancia: "+variancia3);
		double desvioPadrao3 = gerador3.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao3);
		long amplitude3 = gerador3.amplitude();
		System.out.println("Amplitude: "+amplitude3);
		if(sortear3 > maiorSort) {
			maiorSort = sortear3;
			sort = "Fibonacci";
		}
		if(somatorio3 > maiorSoma) {
			maiorSoma = somatorio3;
			soma = "Fibonacci";
		}
		if(mediaAritmetica3 > maiorMediaA) {
			maiorMediaA = mediaAritmetica3;
			mediaA = "Fibonacci";
		}
		if(mediaGeometrica3 > maiorMediaG) {
			maiorMediaG = mediaGeometrica3;
			mediaG = "Fibonacci";
		}
		if(variancia3 > maiorVar) {
			maiorVar = variancia3;
			vari = "Fibonacci";
		}
		if(desvioPadrao3 > maiorDesvio) {
			maiorDesvio = desvioPadrao3;
			desvio = "Fibonacci";
		}
		if(amplitude3 > maiorAmpli) {
			maiorAmpli = amplitude3;
			amplitude = "Fibonacci";
		}
		
		
		gerador4 = new Naturais();
		gerador4.gerar(10);
		sequencia = gerador4.getSequencia();
		imprimir("Naturais", sequencia);
		int sortear4 = gerador4.sortear();
		System.out.println("Sorteado: "+sortear4);
		long somatorio4 = gerador4.somatorio();
		System.out.println("Soma: "+somatorio4);
		double mediaAritmetica4 = gerador4.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica4);
		double mediaGeometrica4 = gerador4.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica4);
		double variancia4 = gerador4.variancia();
		System.out.println("Variancia: "+variancia4);
		double desvioPadrao4 = gerador4.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao4);
		long amplitude4 = gerador4.amplitude();
		System.out.println("Amplitude: "+amplitude4);
		if(sortear4 > maiorSort) {
			maiorSort = sortear4;
			sort = "Fibonacci";
		}
		if(somatorio4 > maiorSoma) {
			maiorSoma = somatorio4;
			soma = "Naturais";
		}
		if(mediaAritmetica4 > maiorMediaA) {
			maiorMediaA = mediaAritmetica4;
			mediaA = "Naturais";
		}
		if(mediaGeometrica4 > maiorMediaG) {
			maiorMediaG = mediaGeometrica4;
			mediaG = "Naturais";
		}
		if(variancia4 > maiorVar) {
			maiorVar = variancia4;
			vari = "Naturais";
		}
		if(desvioPadrao4 > maiorDesvio) {
			maiorDesvio = desvioPadrao4;
			desvio = "Naturais";
		}
		if(amplitude4 > maiorAmpli) {
			maiorAmpli = amplitude4;
			amplitude = "Naturais";
		}
		
		
		gerador5 = new Perfeitos();
		gerador5.gerar(10);
		sequencia = gerador5.getSequencia();
		imprimir("Perfeitos", sequencia);
		int sortear5 = gerador5.sortear();
		System.out.println("Sorteado: "+sortear5);
		long somatorio5 = gerador5.somatorio();
		System.out.println("Soma: "+somatorio5);
		double mediaAritmetica5 = gerador5.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica5);
		double mediaGeometrica5 = gerador5.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica5);
		double variancia5 = gerador5.variancia();
		System.out.println("Variancia: "+variancia5);
		double desvioPadrao5 = gerador5.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao5);
		long amplitude5 = gerador5.amplitude();
		System.out.println("Amplitude: "+amplitude5);
		if(sortear5 > maiorSort) {
			maiorSort = sortear5;
			sort = "Fibonacci";
		}
		if(somatorio5 > maiorSoma) {
			maiorSoma = somatorio5;
			soma = "Perfeitos";
		}
		if(mediaAritmetica5 > maiorMediaA) {
			maiorMediaA = mediaAritmetica5;
			mediaA = "Perfeitos";
		}
		if(mediaGeometrica5 > maiorMediaG) {
			maiorMediaG = mediaGeometrica5;
			mediaG = "Perfeitos";
		}
		if(variancia5 > maiorVar) {
			maiorVar = variancia5;
			vari = "Perfeitos";
		}
		if(desvioPadrao5 > maiorDesvio) {
			maiorDesvio = desvioPadrao5;
			desvio = "Perfeitos";
		}
		if(amplitude5 > maiorAmpli) {
			maiorAmpli = amplitude5;
			amplitude = "Perfeitos";
		}
		
		
		gerador6 = new Primos();
		gerador6.gerar(10);
		sequencia = gerador6.getSequencia();
		imprimir("Primos", sequencia);
		int sortear6 = gerador6.sortear();
		System.out.println("Sorteado: "+sortear6);
		long somatorio6 = gerador6.somatorio();
		System.out.println("Soma: "+somatorio6);
		double mediaAritmetica6 = gerador6.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica6);
		double mediaGeometrica6 = gerador6.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica6);
		double variancia6 = gerador6.variancia();
		System.out.println("Variancia: "+variancia6);
		double desvioPadrao6 = gerador6.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao6);
		long amplitude6 = gerador6.amplitude();
		System.out.println("Amplitude: "+amplitude6);
		if(sortear6 > maiorSort) {
			maiorSort = sortear6;
			sort = "Primos";
		}
		if(somatorio6 > maiorSoma) {
			maiorSoma = somatorio6;
			soma = "Primos";
		}
		if(mediaAritmetica6 > maiorMediaA) {
			maiorMediaA = mediaAritmetica6;
			mediaA = "Primos";
		}
		if(mediaGeometrica6 > maiorMediaG) {
			maiorMediaG = mediaGeometrica6;
			mediaG = "Primos";
		}
		if(variancia6 > maiorVar) {
			maiorVar = variancia6;
			vari = "Primos";
		}
		if(desvioPadrao6 > maiorDesvio) {
			maiorDesvio = desvioPadrao6;
			desvio = "Primos";
		}
		if(amplitude6 > maiorAmpli) {
			maiorAmpli = amplitude6;
			amplitude = "Primos";
		}	
		
		gerador7 = new Quadrados();
		gerador7.gerar(10);
		sequencia = gerador7.getSequencia();
		imprimir("Quadrados", sequencia);
		int sortear7 = gerador7.sortear();
		System.out.println("Sorteado: "+sortear7);
		long somatorio7 = gerador7.somatorio();
		System.out.println("Soma: "+somatorio7);
		double mediaAritmetica7 = gerador7.mediaAritmetica();
		System.out.println("Media Aritmetica: "+mediaAritmetica7);
		double mediaGeometrica7 = gerador7.mediaGeometrica();
		System.out.println("Media Geometrica: "+mediaGeometrica7);
		double variancia7 = gerador7.variancia();
		System.out.println("Variancia: "+variancia7);
		double desvioPadrao7 = gerador7.desvioPadrao();
		System.out.println("Desvio Padrão: "+desvioPadrao7);
		long amplitude7 = gerador7.amplitude();
		System.out.println("Amplitude: "+amplitude7);
		if(sortear7 > maiorSort) {
			maiorSort = sortear7;
			sort = "Quadrados";
		}
		if(somatorio7 > maiorSoma) {
			maiorSoma = somatorio7;
			soma = "Quadrados";
		}
		if(mediaAritmetica7 > maiorMediaA) {
			maiorMediaA = mediaAritmetica7;
			mediaA = "Quadrados";
		}
		if(mediaGeometrica7 > maiorMediaG) {
			maiorMediaG = mediaGeometrica7;
			mediaG = "Quadrados";
		}
		if(variancia7 > maiorVar) {
			maiorVar = variancia7;
			vari = "Quadrados";
		}
		if(desvioPadrao7 > maiorDesvio) {
			maiorDesvio = desvioPadrao7;
			desvio = "Quadrados";
		}
		if(amplitude7 > maiorAmpli) {
			maiorAmpli = amplitude7;
			amplitude = "Quadrados";
		}
		System.out.println("");
		System.out.println("Maior valor sorteado: "+maiorSort+" "+sort);
		System.out.println("Maior somatorio: "+maiorSoma+" "+soma);
		System.out.println("Maior media aritmetica: "+maiorMediaA+" "+mediaA);
		System.out.println("Maior media geometrica: "+maiorMediaG+" "+mediaG);
		System.out.println("Maior variancia: "+maiorVar+" "+vari);
		System.out.println("Maior desvio padrão: "+maiorDesvio+" "+desvio);
		System.out.println("Maior amplitude: "+maiorAmpli+" "+amplitude);
		System.out.println("");
		
	}
	
	
	public static void imprimir(String tipo, List<Integer> sequencia) {
		System.out.print("\n"+tipo+ "[");
		for(int i = 0; i < sequencia.size() - 1; i++) {
			System.out.print(sequencia.get(i)+", ");
		}
		System.out.print(sequencia.get(sequencia.size()-1)+"]\n");
	}
	
}
