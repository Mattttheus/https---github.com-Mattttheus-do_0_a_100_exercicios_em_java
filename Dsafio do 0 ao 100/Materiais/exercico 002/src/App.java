
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite Numero 01");
        double numero01 = scanner.nextDouble();

        System.out.println("Digite Numero 02");
        double numero02 = scanner.nextDouble();

        double media = (numero01 + numero02) /2 ;
        System.out.println("A media dos numeros é: " + media);
    
        scanner.close();
    
    }
}
