package dados;

public class Perfeitos extends Gerador {
	public void gerar(int n) {
		
		for(int i = 1;i <= n; i++) {
		int soma = 0;
			for(int j = 1; j < i; j++) {
				if(i%j == 0) {
					soma += j;
				}
			}
			if(soma == i) {
				sequencia.add(i);
			}
		}
	}

}
