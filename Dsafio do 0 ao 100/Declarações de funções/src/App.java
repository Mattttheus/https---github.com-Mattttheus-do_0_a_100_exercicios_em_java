
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        int [][]matriz = new int [4][4];

        Random random = new Random();
        for(int i =0; i < 4; i++){
            for(int j =0 ; j< 4; j++){
                matriz[i][j]= random.nextInt(11);
            }
        }
        System.out.println("origunal");
        exibirMatriz(matriz);

        int [] [] MatrizTranport = calcularMatrizTranspote(matriz);
        System.out.println("Matriz Transportada");
        exibirMatriz(MatrizTranport);

        
    }

    public static void exibirMatriz(int[][] matriz){

        for(int i =0; i < matriz.length; i++){
            for(int j =0 ; j< matriz[i].length; j++)

               System.out.println(matriz[i][j]+ "");
             }
             System.out.println();
    }

    public static int[][] calcularMatrizTranspote(int[][] matriz){
        int[][] MatrizTranport = new int [matriz.length][matriz[0].length];

        for(int i =0; i < matriz.length; i++){
            for(int j =0 ; j< matriz[i].length; j++){
                MatrizTranport[j][i]= matriz[i][j];
             
  }
 }
     return MatrizTranport;
 }

}
