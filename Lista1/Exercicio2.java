import java.util.*;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int m;
        System.out.println("Digite um inteiro M para as matrizes quadradas m1 e m2 de ordem MxM:");
        m = Integer.parseInt(leitor.nextLine());
        leitor.close();
        int[][] m1 = new int [m][m];
        int[][] m2 = new int [m][m];
        int[][] m3 = new int [m][m];
        int[][] m4 = new int [m][m];
        Random random = new Random();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                m1[i][j] = random.nextInt(100);
                m2[i][j] = random.nextInt(100);
                if(m1[i][j] >= m2[i][j]){
                    m3[i][j] = m1[i][j];
                }else{
                    m3[i][j] = m2[i][j];
                }
                if(j >= i ){
                    m4[i][j] = 0;
                }else{
                    if(m1[i][j] <= m2[i][j]){
                        m4[i][j] = m1[i][j];
                    }else{
                        m4[i][j] = m2[i][j];
                    }
                }
            }
        }
        System.out.println("Matriz M3: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz M4: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(m4[i][j] + " ");
            }
            System.out.println(" ");
        }



    }
    
}
