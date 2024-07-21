import java.util.Scanner;




public class App {
 
    public static void main(String[] args) throws Exception {

        Scanner scanner= new Scanner(System.in);

        System.out.println(" Sua primeira nota:");
        double nota01=scanner.nextDouble();

        System.out.println(" Sua segunda nota:");
        double nota02= scanner.nextDouble();

        System.out.println(" Sua terceira nota: ");
        double nota03= scanner.nextDouble();
        
        System.out.println(" Sua quarta nota: ");
        double nota04= scanner.nextDouble();


        double   mediaritimetica = ((nota01*nota02*nota03*nota04) +1.0/3.0);

        
        System.out.println("Amedia Geometrica dos numeros é:"+ mediaritimetica);
        
        scanner.close();
        
    }
}
