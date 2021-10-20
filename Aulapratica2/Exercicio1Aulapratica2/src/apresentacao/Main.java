package apresentacao;
import dados.Grupo;
import dados.Pessoa;
import java.util.*;
public class Main{
	static Scanner scan = new Scanner(System.in);    
    public static void main(String[] args){
    	int quant;
        System.out.println("Digite o numero de pessoas:");
        quant = Integer.parseInt(scan.nextLine());
        Grupo grupo = new Grupo(quant);
      
        for(int i = 0 ; i < quant; i++) {
        	grupo.setPessoa(criarPessoa());       	
        }
        
       grupo.ordena();

        for(int i = 0; i < grupo.getNumeroPessoas(); i++){
            Pessoa p = grupo.getPessoas()[i];
            System.out.println(p+"\n");

        }

    }
    public static Pessoa criarPessoa(){
        Pessoa p = new Pessoa();
        System.out.println("Digite o nome da pessoa:");
        p.setNome(scan.nextLine());

        System.out.println("Digite a altura da pessoa:");
        p.setAltura(Float.parseFloat(scan.nextLine()));
        
        System.out.println("Digite a idade da pessoa:");
        p.setIdade(Integer.parseInt(scan.nextLine()));
        
        System.out.println("Digite a massa da pessoa:");
        p.setMassa(Float.parseFloat(scan.nextLine()));

        return p;
    }
}