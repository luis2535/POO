package negocio;
import dados.Imovel;

public class Imobiliaria {
	private Imovel[] listaImoveis;
	private int quantImoveis = 0;
	
	public Imobiliaria(int maxImoveis) {
		this.listaImoveis = new Imovel[maxImoveis];
		quantImoveis=0;
	}
	public int getQuantImoveis() {
		return quantImoveis;
	}
	public void adicionarImovel(Imovel imovel) {
		if(quantImoveis<listaImoveis.length) {
			listaImoveis[quantImoveis] = imovel;
			quantImoveis++;
		}else {
			System.out.println("Lista de imoveis cheia");
		}
	}
	public Imovel[] filtrarPorArea(float x) {
		int max = 0;
		for(int i = 0; i < quantImoveis; i++) {
			if(listaImoveis[i].calculaArea() >= x) {
				max++;
				
			}
		}
		Imovel[] imoveis = new Imovel[max];
		int aux = 0;
		for(int i = 0; i < quantImoveis; i++) {
			if(listaImoveis[i].calculaArea() >= x) {
				imoveis[aux] = listaImoveis[i];	
				aux++;
			}
		}
		Imovel temp = new Imovel();
		for(int i = 0; i < max;i++) {
			for(int j = i + 1;j < max ;j++) {
				if(imoveis[j].calculaArea() < imoveis[i].calculaArea()) {
					temp = imoveis[i];
					imoveis[i] = imoveis[j];
					imoveis[j] = temp;
				}
			}
		}
		return imoveis;		
	}
	public String toString() {
		StringBuffer string = new StringBuffer();
		string.append("Lista de imoveis:\n");
		for(int i=0; i < quantImoveis; i++) {
			string.append("\t"+listaImoveis[i]+"\n");
		}
		return string.toString();		
	}

}
