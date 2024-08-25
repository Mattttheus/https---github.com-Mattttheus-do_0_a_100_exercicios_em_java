import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int n = input.nextInt();

        int[] vetor = new int[n];

        System.out.println("Digite os elementos do  vetor");
        for (int i = 0; i < n; i++) {
            vetor[i] = input.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        System.out.println("A soma dos Elementos é  " + soma);

     
        
        input.close();
    }
}