
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Quantidade de Elementos");
        int Quantidade = input.nextInt();

        int vetor[] = new int[Quantidade];

        System.out.println("Diigita a quantidade de elementos ");
        for (int i = 0; i < Quantidade; i++) {

            System.out.println("Elementos " + (i + 1) + " : ");
            vetor[i] = input.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < Quantidade; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / Quantidade;

        System.out.println("A Media dos Vetores é " + media);

        input.close();
    }
}
