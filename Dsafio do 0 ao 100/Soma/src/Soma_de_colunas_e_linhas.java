
import java.util.Random;
public class Soma_de_colunas_e_linhas {
    public static void main(String[] args) throws Exception {
        int [][]matriz= new int [4][4]; 
        Random radom = new Random();
        
        for( int i =0; i<4;i++){
            for( int j=0; j<4;j++){
             matriz[i][j]= radom.nextInt(100);
            } 
    } 

         System.out.println("Matriz");

         for( int i =0; i<4;i++){
            for( int j=0; j<4;j++){
        System.out.println(matriz[i][j] + "  " );
            }  
            System.out.println();  
    } 
        
    System.out.println("A Soma da linha :");    
        
    for( int i =0; i<4;i++){

        int somaLinhas = 0;
        for( int j=0; j<4;j++){
           
            somaLinhas += matriz[i][j];

        }       
        System.out.println("Linhas " + (1+1) + "  : " + somaLinhas);
    }      
        
  }
}
