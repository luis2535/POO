package dados;

public class Abundantes extends Gerador {
	public void gerar(int n) {
		int quant = 0;
		int num = 1;
		do {
			if(abundante(num)) {
				sequencia.add(num);
				quant++;
			}
			num++;
		}while(quant < n);
	}
	public boolean abundante(int v) {
		int soma = 0;
		
		for(int i=1;i<v;i++) {
			if(v % i == 0) {
				soma+=i;
			}
		}
		if(v<soma) {
			return true;
		}else {
			return false;
		}
	}
}
