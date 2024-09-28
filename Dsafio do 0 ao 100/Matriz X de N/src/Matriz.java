
import java.util.Scanner;
public class Matriz {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner input =  new Scanner(System.in);

        System.out.println("Digite elementos da linha ");
        int linha=input.nextInt();

        System.out.println("Digite elementos da coluna");
        int coluna= input.nextInt();

        int[][] CampoMindado = new int [linha][coluna];


        System.out.println("Digite os locais da mina ");
        System.out.println("0 para campo neutro e 1 para mina");

        for( int i =0; i<linha;i++){
            for( int j=0; j<coluna;j++){
                CampoMindado[i][j]= input.nextInt();
            } 
        }
        int[][] resultado= new int[linha][coluna];

        for( int i =0; i<linha;i++){
            for( int j=0; j<coluna;j++){
                if(CampoMindado[i][j]==1){
                    incrementarVizinhos(resultado,i,j);
                }
            } 
        }
        System.out.println("matriz Co Contagem nas casas Vizinhas ");
        for( int i =0; i<linha;i++){
            for( int j=0; j<coluna;j++){
              System.out.println(resultado[i][j] + "  ");
            } 
            System.out.println();
        }

        input.close();
    }
public static void incrementarVizinhos(int[][]matriz,int linha, int coluna){

    int linhas = matriz.length;
    int colunas =matriz[0].length;

    for( int i = linha - 1 ; i<= linha + 1 ;i++){
        for( int j= coluna- 1 ; j<coluna +1 ; j++){
      
            if(i >= 0 && i < linhas && j >= 0  && j < colunas && !(i == linha && j == coluna)){

                matriz[i][j]++;
            }
        } 
    }

 }
}