
import java.util.Scanner;




public class App {
    double peso= 0.0;
    double altura= 0.0;
    double imc=0.0;



    

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Qual e seu peso :");
            double  peso = scanner.nextDouble();
        

        System.out.println("Qual e seu Altura :");
          double altura = scanner.nextDouble();
  
      
      
      double imc = peso /(altura*altura);

      System.out.println("seu Imc e de :"+imc);

scanner.close();
      
        }
    }



}

