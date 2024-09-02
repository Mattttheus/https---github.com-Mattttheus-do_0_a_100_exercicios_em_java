
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        
        System.out.println("Digite o tamnaho do vetor");
         int tamanho = input.nextInt();
         
         int[]vetor = new int[tamanho];
         int[]vetor1 = new int[tamanho];
         int[]resultado = new int[tamanho];

         System.out.println("Digite os elementos do primeiro vetor ");
         for(int i = 0; i < tamanho; i++ ){
            vetor[i]= input.nextInt();
         }
         System.out.println("Digite o segundo vetor");
         for( int i = 0; i < tamanho; i++){
            vetor1[i] = input.nextInt();
         } 
         for(int i = 0; i < tamanho; i++){
            resultado[i] = vetor[i]*vetor1[i];
        }
        System.out.println("O Resultado"); 
         for(int i = 0; i < tamanho; i++){
             System.out.println(resultado[i] + " ");
        }
        input.close();
    }
}
