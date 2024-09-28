
import java.util.Scanner;

public class Coluna_e_Matrizes {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int [][] matriz= new int[3][3];

        System.out.println(" Digite os elementos ");
        for( int i =0; i<3;i++){
            for( int j=0; j<3;j++){
             matriz[i][j]= input.nextInt();
            } 
        }
   
        int Determinate =(matriz[0][0]+ matriz[1][1]+ matriz[2][2])
         + (matriz[0][1]* matriz[1][2]* matriz[2][0])
         + (matriz[0][2]* matriz[1][0]* matriz[2][1])
         - (matriz[0][2]* matriz[1][1]* matriz[2][0])
         - (matriz[0][0]* matriz[1][2]* matriz[2][1])
         - (matriz[0][1]* matriz[1][0]* matriz[2][2]);

         System.out.println("Determinante " + Determinate);

         input.close();
    }
}
