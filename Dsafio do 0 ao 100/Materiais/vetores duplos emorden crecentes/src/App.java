
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite do tmanho do vetor");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elemento " + (i + 1) + " ");
            vetor[i] = input.nextInt();
        }
        System.out.println("em ordem invertida ");
        for (int i = tamanho - 1; i <= 0; i--) {
            System.out.println(vetor[i] + " ");

        }
        input.close();

    }
}
