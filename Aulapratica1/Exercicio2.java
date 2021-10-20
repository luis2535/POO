import java.util.*;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int idade[] = new int [3];
        String nome[] = new String[3];
        for(int i = 0; i < nome.length; i++){
            System.out.println("Digite o nome de uma pessoa ["+(i+1)+"]");
            nome[i] = leitor.nextLine();
            System.out.println("Digite a idade dessa pessoa ["+(i+1)+"]");
            idade[i] = Integer.parseInt(leitor.nextLine());
        }
        for(int i = 0; i < nome.length; i++){
            System.out.println("Nome["+(i+1)+"] = " + nome[i]);
            System.out.println("Idade["+(i+1)+"] = " + idade[i]);

        }
    }  
}
