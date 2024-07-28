
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanhhp do Vetor");
        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorSoma = new int[tamanho];

        System.out.println("Digite o tamnho do preimeio Vetor ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elementos " + (i + 1) + " ");
            vetor[i] = input.nextInt();
        }
        System.out.println("Digite o tamnho do Segundo Vetor ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elementos " + (i + 1) + " ");
            vetor2[i] = input.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {

            vetorSoma[i] = vetor2[i] + vetor[i];
        }

        System.out.println("A soma dos elementos é ");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(" soma do elemento " + (i + 1) + " ");
            System.out.println(vetorSoma[i] + "  ");
        }
        input.close();
    }
}
