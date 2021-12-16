package dados;

public class MDC implements IOperacaoInteira{
	public int executar(int valor1, int valor2) {
		int menor;
		if(valor1 > valor2) {
			menor = valor2;
		}else {
			menor = valor1;
		}
		int mdc = 0;
		for(int i = 1; i < menor;i++) {
			int primeiro = valor1;
			int segundo = valor2;
			while(primeiro >= i) {
				primeiro = primeiro - i;				
			}
			while(segundo >= i) {
				segundo = segundo - i;				
			}
			if(segundo == 0 && primeiro ==0) {
				mdc = i;
			}
			
		}
		return mdc;
	}

}
