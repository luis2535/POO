import java.util.*;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String palavra;
        System.out.println("Informe uma string para teste de palindromo.");
        palavra = leitor.nextLine();
        leitor.close();
        char[] array = palavra.toCharArray();
        char[] testePalindromo = new char[palavra.length()];
        int contvogais=0, contconsoantes=0;
        for(int i = 0; i < palavra.length(); i++){
            testePalindromo[i] = array[palavra.length()-i-1];
            char c = Character.toLowerCase(array[i]);
            if(c =='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contvogais++;
            }else if (c != ' '){
                contconsoantes++;
            }
        }
        int teste = 0;
        for(int i = 0; i < palavra.length(); i++){
            if(testePalindromo[i] != array[i]){
                teste++;
            }
        }
        String palavrainvertida = new String(testePalindromo);
        if(teste>0){
            System.out.println("A string "+ palavra +" nao eh um palindromo!");
        }else{
            System.out.println("A string "+ palavra +" eh um palindromo!");
        }
        System.out.println("A string possui "+ contvogais  +" vogais e "+ contconsoantes +" consoantes");
        System.out.println("A string invertida eh " + palavrainvertida);

    }
}