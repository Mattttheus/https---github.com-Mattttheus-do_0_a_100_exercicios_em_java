
import java.util.Scanner;
public class Soma_de_Matrizes {
    public static void main(String[] args)throws Exception {
     int[][]matriz2=new int [2][2];
     int[][]matriz =new int [2][2];
     int[][]soma=new int [2][2];

     Scanner input =  new Scanner(System.in);
     System.out.println("Digite a primeira matriz");
     for( int i =0; i<2;i++){
        for( int j=0; j<2;j++){
            matriz[i][j]= input.nextInt();
        } 
     }
      System.out.println("Digite o valor da suegundo Matriz");
      for( int i =0; i<2;i++){
        for( int j=0; j<2;j++){
            matriz2[i][j]= input.nextInt();
        } 
     }
     for( int i =0; i<2;i++){
        for( int j=0; j<2;j++){
         soma[i][j]= matriz2[i][j]+  matriz[i][j];
        } 
     }
     System.out.println("A Soma das Matrizes");
     for( int i =0; i<2;i++){
        for( int j=0; j<2;j++){
        System.out.println(soma[i][j] + " " );
        } 
   System.out.println();
      }
      input.close();
    }
}