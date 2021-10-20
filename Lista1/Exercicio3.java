import java.util.*;
public class Exercicio3 {
    public static int buscaMaior(int vetor[], int maiorAtual, int indice){
        if(vetor[indice]>maiorAtual){
            maiorAtual = vetor[indice];
        }
        if (indice == vetor.length - 1){
            return maiorAtual;
        }else{
            return buscaMaior(vetor, maiorAtual, indice+1);
        }


    }
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int [] vetor = new int[5];
        int maiorAtual = -10000;
        int result;
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor do vetor ["+(i+1)+"]");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        leitor.close();
        result = buscaMaior(vetor,maiorAtual,0);
        System.out.println("O maior elemento do vetor eh: "+result);

    }  
}
