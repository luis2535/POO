package dados;

public class Primos extends Gerador {
	public void gerar(int n) {
		int quant = 0;
		int num = 2;
		do {
			int cont = 0;
			for(int i = 1; i <= num; i++) {
				if(num%i == 0) {
					cont++;
				}
			}
			if(cont == 2) {
				sequencia.add(num);
				quant++;
			}
			num++;
		}while(quant<n);
	}

}
