package apresentacao;
import dados.*;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		Matriz<Integer> matriz = new Matriz<Integer>(5);
		int valor = 0;
		Scanner scan = new Scanner(System.in);
		boolean status = true;
		
		for(int i = 0;i<5;i++) {
			for(int j = 0; j < 5; j++) {
				if(status) {
					System.out.println("Digite um valor para a posicao da matriz["+i+"]["+j+"] ou -1 para parar a inserção:");
					valor = Integer.parseInt(scan.nextLine());	
					if(valor == -1) {
						status = false;
					}
				}
				matriz.set(valor, i, j);
			}
		}
		for(int i = 0;i<5;i++) {
			for(int j = 0; j < 5; j++) {
				if(matriz.get(i, j) != -1) {
					System.out.print(matriz.get(i, j)+"\t");					
				}		
			}
			System.out.print("\n");
		}
		int menor;
		menor = menorValor(matriz);
		System.out.println("O menor valor da Matriz é: "+menor);
		scan.close();
	}
	public static int menorValor(Matriz<Integer> matriz) {
		int menor1Quadrante;
		int menor2Quadrante;
		int menor3Quadrante;
		int menor4Quadrante;
		List<Integer>quadrante1;
		quadrante1 = matriz.getElementosQuadrante(Quadrante.PRIMEIRO);
		menor1Quadrante = quadrante1.get(0);
		for(int valor : quadrante1) {
			if(valor == -1) {
				break;
			}
			if(valor < menor1Quadrante) {
				menor1Quadrante = valor;
			}
		}
		List<Integer>quadrante2;
		quadrante2 = matriz.getElementosQuadrante(Quadrante.SEGUNDO);
		menor2Quadrante = quadrante2.get(0);
		for(int valor : quadrante2) {
			if(valor == -1) {
				break;
			}
			if(valor < menor2Quadrante) {
				menor2Quadrante = valor;
			}
		}
		List<Integer>quadrante3;
		quadrante3 = matriz.getElementosQuadrante(Quadrante.TERCEIRO);
		menor3Quadrante = quadrante3.get(0);
		for(int valor : quadrante3) {
			if(valor == -1) {
				break;
			}
			if(valor < menor3Quadrante) {
				menor3Quadrante = valor;
			}
		}
		List<Integer>quadrante4;
		quadrante4 = matriz.getElementosQuadrante(Quadrante.QUARTO);
		menor4Quadrante = quadrante4.get(0);
		for(int valor : quadrante4) {
			if(valor == -1) {
				break;
			}
			if(valor < menor4Quadrante) {
				menor4Quadrante = valor;
			}
		}
		int menor;
		menor = menor1Quadrante;
		if(menor2Quadrante < menor) {
			if(menor2Quadrante != -1) {
				menor = menor2Quadrante;				
			}
		}
		if(menor3Quadrante < menor) {
			if(menor3Quadrante != -1) {
				menor = menor3Quadrante;				
			}
		}
		if(menor4Quadrante < menor) {
			if(menor4Quadrante != -1) {
				menor = menor4Quadrante;				
			}
		}
		return menor;	
	}

}
