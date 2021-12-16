package dados;

public class Fatoriais extends Gerador{
	public void gerar(int n) {
		int fat = 1;
		for(int i = 1;i <=n; i++) {
			fat = fat * i;
			sequencia.add(fat);
		}
		
	}

}
