import java.util.*;
public class ExercicioExtra {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String palavra;
        System.out.println("Digite uma palavra:");
        palavra = leitor.nextLine();
        leitor.close();
        for(int i = 0; i < palavra.length(); i++){
            char d = palavra.charAt(i);
            char c = Character.toLowerCase(d);
            if(c == 'a'){
                System.out.println("#2 = 1");
            }else if(c == 'b'){
                System.out.println("#2 = 2");
            }else if(c == 'c'){
                System.out.println("#2 = 3");
            }else if(c == 'd'){
                System.out.println("#3 = 1");
            }else if(c == 'e'){
                System.out.println("#3 = 2");
            }else if(c == 'f'){
                System.out.println("#3 = 3");
            }else if(c == 'g'){
                System.out.println("#4 = 1");
            }else if(c == 'h'){
                System.out.println("#4 = 2");
            }else if(c == 'i'){
                System.out.println("#4 = 3");
            }else if(c == 'j'){
                System.out.println("#5 = 1");
            }else if(c == 'k'){
                System.out.println("#5 = 2");
            }else if(c == 'l'){
                System.out.println("#5 = 3");
            }else if(c == 'm'){
                System.out.println("#6 = 1");
            }else if(c == 'n'){
                System.out.println("#6 = 2");
            }else if(c == 'o'){
                System.out.println("#6 = 3");
            }else if(c == 'p'){
                System.out.println("#7 = 1");
            }else if(c == 'q'){
                System.out.println("#7 = 2");
            }else if(c == 'r'){
                System.out.println("#7 = 3");
            }else if(c == 's'){
                System.out.println("#7 = 4");
            }else if(c == 't'){
                System.out.println("#8 = 1");
            }else if(c == 'u'){
                System.out.println("#8 = 2");
            }else if(c == 'v'){
                System.out.println("#8 = 3");
            }else if(c == 'w'){
                System.out.println("#9 = 1");
            }else if(c == 'x'){
                System.out.println("#9 = 2");
            }else if(c == 'y'){
                System.out.println("#9 = 3");
            }else if(c == 'z'){
                System.out.println("#9 = 4");
            }
            
        }

    }
}
