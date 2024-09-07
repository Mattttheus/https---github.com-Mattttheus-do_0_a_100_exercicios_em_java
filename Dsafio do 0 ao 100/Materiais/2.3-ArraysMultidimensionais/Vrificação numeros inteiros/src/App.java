
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do Vetor ");
        int tamanho = input.nextInt();

        int vetor [] =  new int [tamanho];

        System.out.println("Digte os elementos do Vetor ");
        for(int i = 0;i < tamanho ;i++){

            vetor[i]= input.nextInt();
        }
        boolean todosPares = true;

        for(int i = 0; i < tamanho;i++){
            if(vetor[i] %  2 !=0){
            todosPares= false;
            break;
            }
        }

        if(todosPares){
           
            System.out.println("todeos os pares são ");
        
        }else{
        
            System.out.println("todos os impares são "); 
       }

       input.close();
    }
}
