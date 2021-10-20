import java.util.*;
public class Exercicio6{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String palavra1;
        String palavra2;
        System.out.println("Informe a primeira string");
        palavra1 = leitor.nextLine();
        System.out.println("Informe a segunda string");
        palavra2 = leitor.nextLine();
        leitor.close();
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < palavra1.length(); i++){
            char c = palavra1.charAt(i);
            int cont = 0;
            for(int j = i; j < palavra1.length(); j++){
                char d = palavra1.charAt(j);
                if(c == d){
                    cont++;
                }
            }
            if(cont == 1){
                str1 += Character.toString(c);
            }
        }
        for(int i = 0; i < palavra2.length(); i++){
            char c = palavra2.charAt(i);
            int cont = 0;
            for(int j = i; j < palavra2.length(); j++){
                char d = palavra2.charAt(j);
                if(c == d){
                    cont++;
                }
            }
            if(cont == 1){
                str2 += Character.toString(c);
            }
        }
        String strfinal = "";
        for(int i = 0; i < str1.length(); i++){
            char a = str1.charAt(i);
            int cont = 0;
            for(int j = 0; j < str2.length(); j++){
                char b = str2.charAt(j);
                if(a == b){
                    cont++;
                }
            }
            if(cont == 1){
                strfinal += Character.toString(a);
            }
        }
        char[] chars = strfinal.toCharArray();
        Arrays.sort(chars);
        String charsordenados = new String(chars);
        if(charsordenados.length()!=0){
            System.out.println("Os caracteres em comum ordenados das duas strings sao:"+charsordenados);
        }else{
            System.out.println("As strings nao possuem caracteres em comum");
        }
    }
}
