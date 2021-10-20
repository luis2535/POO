import java.util.Scanner;
public class Exercicio1{
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int valores[] = new int [5];
        float media = 0;
        for(int i = 0; i < valores.length; i++){
            System.out.println("Digite um valor["+(i+1)+"]");
            valores[i] = Integer.parseInt(leitor.nextLine());
            media += valores[i];    
        }
        media = media/5;
        System.out.println("A media eh = " + media);
    }
}
