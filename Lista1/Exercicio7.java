import java.util.*;
public class Exercicio7 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int dia, mes, ano;
        System.out.println("Informe a data de nascimento:");
        dia = Integer.parseInt(leitor.nextLine());
        mes = Integer.parseInt(leitor.nextLine());
        ano = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe a data atual:");
        int diaAtual, mesAtual, anoAtual;
        diaAtual = Integer.parseInt(leitor.nextLine());
        mesAtual = Integer.parseInt(leitor.nextLine());
        anoAtual = Integer.parseInt(leitor.nextLine());
        leitor.close();
        int calculoano = 0, calculomes = 0, calculodia = 0;
        if(anoAtual > ano && mesAtual >= mes && diaAtual>=dia){
            calculodia = diaAtual - dia;
            calculomes = mesAtual - mes;
            calculoano = anoAtual - ano;
            
        }else if(anoAtual > ano && mesAtual >= mes && diaAtual<dia){
            calculodia = 30 -(dia - diaAtual);
            calculomes = mesAtual - mes - 1;
            calculoano = anoAtual - ano;
            
        }else if(anoAtual > ano && mesAtual < mes && diaAtual>=dia){
            calculodia = diaAtual - dia;
            calculomes = mesAtual + 12 - mes;
            calculoano = anoAtual - ano - 1;          
        }else if(anoAtual > ano && mesAtual < mes && diaAtual<dia){
            calculodia = 30 - (dia - diaAtual);
            calculomes = mesAtual + 12 - mes - 1;
            calculoano = anoAtual - ano - 1; 
        }
        int idade;
        idade = calculoano*365 + calculomes*30 + calculodia;
        System.out.println("A idade dessa pessoa em dias eh de "+idade+" dias");
        leitor.close();
    }
    
}
