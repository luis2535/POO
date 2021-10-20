import java.util.*;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int exponencial, potencia, divisor, dividendo, resultado = 1;
        System.out.println("Digite 2 numero, o primeiro sera elevado pelo segundo");
        exponencial = Integer.parseInt(leitor.nextLine());
        potencia = Integer.parseInt(leitor.nextLine());
        for(int i = 0; i < potencia; i++){
            resultado *= exponencial; 
        }
        System.out.println("O resultado da operacao eh: " + resultado);
        System.out.println("Digite 2 numero, o primeiro sera dividido pelo segundo");
        dividendo = Integer.parseInt(leitor.nextLine());    
        divisor = Integer.parseInt(leitor.nextLine());
        leitor.close();
        while(dividendo >= divisor){
            dividendo = dividendo - divisor;
        }

        System.out.println("O resto da divisao eh: " + dividendo); 
    }
    
}
