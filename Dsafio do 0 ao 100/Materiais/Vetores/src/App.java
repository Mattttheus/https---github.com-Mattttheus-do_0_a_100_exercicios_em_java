
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o tamanho Do Vetor");
        int tamanho = input.nextInt();

        int [] Vetor1 = new int[tamanho];
        int [] Vetor2 =new int[tamanho]; 
        int [] VetorResultado = new int[tamanho];

        System.out.println("digite os elementos do vetor");
        for( int i = 0;i< tamanho; i++ ){
              Vetor1[i] = input.nextInt();
        
        }

        System.out.println("digite os elementos do segundo vetor");
        for( int i = 0;i< tamanho; i++ ){
              Vetor2[i] = input.nextInt();
        
        }
        for( int i = 0 ; i < tamanho; i++){

            VetorResultado [i] = Vetor1[i] *Vetor2[i];
        
        }
        System.out.println("Vetor Resultado");
         for(int i = 0 ; i< tamanho; i++){

            System.out.println(VetorResultado[i] + " ");
         }
        input.close();
    }
}
