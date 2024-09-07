import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner input=  new Scanner(System.in);
       
       int[][] matrizes = new int[3][3]; 
       
       
       System.out.println(" Digite os vetores da matrizs");

       for(int i = 0; i < 3;i++ ){

        for(int j = 0; j < 3; i++ ){

            System.out.println("Digite o Vetor para a Posição : ["+ i + " ]["+ j +"]:" );
             matrizes[i][j]= input.nextInt();
        }
       }
       int soma=0;
       for(int i = 0; i < 3;i++ ){
        soma += matrizes[i][i];
       }
    System.out.println("soma diagonae " + soma);

    input.close();
    }
}
