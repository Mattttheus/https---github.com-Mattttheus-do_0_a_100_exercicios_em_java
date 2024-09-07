import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
     Scanner input = new Scanner(System.in);
      
       System.out.println("Digite o  Tamanho");
        int Elementos = input.nextInt();
     
     
       int [][] matriz = new int [Elementos][Elementos];

        Random random = new Random();
        for(int i = 0 ;i<Elementos ;i++){
            for(int j = 0 ;j<Elementos ;j++){
                matriz[i][j] = random.nextInt(10);       
            }
        }
        System.out.println("Matris Original");
        for(int i = 0 ;i<Elementos ;i++){
            for(int j = 0 ;j<Elementos ;j++){

                System.out.println( matriz[i][j] +"");
        }
        System.out.println();
    }

    int [] [] MatrizTransport = new int[4][4];

    for(int i = 0 ;i<Elementos ;i++){
        for(int j = 0 ;j<Elementos ;j++){
            MatrizTransport[i][j] = matriz[4][4];
        }
    }
    System.out.println("Matriz de Transporte");
    for(int i = 0 ;i<Elementos ;i++){
        for(int j = 0 ;j<Elementos ;j++){
           System.out.println(MatrizTransport[i][j]+ " " );
       }
       System.out.println();
    }
  }
}
