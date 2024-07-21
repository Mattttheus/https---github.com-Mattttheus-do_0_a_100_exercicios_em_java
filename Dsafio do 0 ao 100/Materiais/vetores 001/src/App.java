import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade dos elementos ");
          int quantidade = input.nextInt();

          int [] vetor = new int [quantidade];

          System.out.println("Digite o vetor ");

          for (int i = 0; i < quantidade; i++){

           System.out.println("Elementos " +  (i + 1 ) + " : " );
              vetor[i]= input.nextInt();

            }

          int maior = vetor [ 0 ];
          for (int i = 0; i < quantidade ; i++){

           if (vetor [i] > maior){
            maior = vetor[i];

             }
          }

    System.out.println(" O Maior  Elemento Do Vetor  é " + maior );

    input.close();
    }
}
