import java.util.*;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[5];
        float media = 0;
        int maior = -1000000, menor = 10000000, soma = 0, somaprimo = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor["+(i+1)+"]");
            vetor[i] = Integer.parseInt(leitor.nextLine());
            soma += vetor[i];    
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }
            if(vetor[i]<2){
                continue;
            }else if(vetor[i] == 2){
                somaprimo += vetor[i];
            }else{
                int cont = 0;
                for(int j = 2; j < vetor[i]; j++){
                    if(vetor[i] % j == 0){
                        cont++;                        
                    }
                }
                if (cont == 0){
                    somaprimo += vetor[i];
                }
            }
        }
        leitor.close();
        media = soma/vetor.length;
        System.out.println("A soma dos elementos eh = " + soma);
        System.out.println("A media dos elementos eh = " + media);
        System.out.println("O menor elemento eh = " + menor);
        System.out.println("O maior elemento eh = " + maior);
        System.out.println("A soma dos elementos primos eh = " + somaprimo);

    }
    
}
