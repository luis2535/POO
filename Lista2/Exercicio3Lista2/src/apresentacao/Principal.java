package apresentacao;
import negocio.Imobiliaria;
import dados.Imovel;
import java.util.Scanner;

public class Principal {
	static Scanner scan = new Scanner(System.in);
	static Imobiliaria sistema = new Imobiliaria(10);
	public static void main(String[] args) {
		int opcao;
		opcao = mostrarMenu();
		while(opcao != 0) {
			switch(opcao) {
			case 1:
				adicionarImovel();
				break;
			case 2:
				if(sistema.getQuantImoveis()==0) {
					System.out.println("Não há imoveis para imprimir");
				}else {
					imprimirArea();
				}				
				break;
			case 3:
				if(sistema.getQuantImoveis()==0) {
					System.out.println("Não há imoveis para imprimir");
				}else {
					System.out.println(sistema);
				}
				break;
			default:
				System.out.println("Opção invalida, digite novamente");
			}
			opcao = mostrarMenu();
			
		}
	}
	public static int mostrarMenu() {
		int opcao = 0;
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Adicionar Imovel");
		System.out.println("2 - Imprimir Imoveis com area maior que x");
		System.out.println("3 - Imprimir Imoveis");	
		System.out.println("0 - Sair do sistema");
		opcao = Integer.parseInt(scan.nextLine());
		return opcao;
	}
	public static void adicionarImovel() {
		Imovel imovel = new Imovel();
		System.out.println("Digite a Largura");
		imovel.setLargura(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite o comprimento");
		imovel.setComprimento(Float.parseFloat(scan.nextLine()));
		System.out.println("Digite o valor");
		imovel.setValor(Float.parseFloat(scan.nextLine()));
		sistema.adicionarImovel(imovel);
	}
	public static void imprimirArea() {
		System.out.println("Digite uma area para checagem dos imoveis");
		float x;
		x = Float.parseFloat(scan.nextLine());
		Imovel imoveis[] = sistema.filtrarPorArea(x);
		if(imoveis.length == 0) {
			System.out.println("Não há imoveis com area maior ou igual a essa!");
		}else {
			for(int i = 0; i <imoveis.length;i++) {
				Imovel im = imoveis[i];
				System.out.println(im);
			}			
		}
		
	}
}
