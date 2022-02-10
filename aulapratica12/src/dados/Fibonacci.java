package dados;

public class Fibonacci extends Gerador {
	public void gerar(int n) {
		int f0 = 1;
		int aux;
		int f1 = 1;
		for(int i=0;i<n;i++) {
			if(i==0) {
				sequencia.add(f0);
			}else if(i==1) {
				sequencia.add(f1);
			}else {
				aux = f1;
				f1 = f1+f0;
				f0 = aux;
				sequencia.add(f1);
			}
		}
	}

}
