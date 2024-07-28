
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");

        int tamanho = input.nextInt();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        System.out.println("Digite os elementos");

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Elementos " + (i + 1) + " ");
            vetor.add(input.nextInt());
        }

        Collections.reverse(vetor);

        System.out.println("Elementos emordem inversa");

        for (int elementos : vetor) {

            System.out.println("Elementos " + (elementos + 1) + " ");

            System.out.println(elementos + " ");

        }

        input.close();
    }
}
