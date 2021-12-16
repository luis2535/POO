package dados;

public class Soma implements IOperacaoInteira{
	public int executar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}

}
