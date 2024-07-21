import java.util.Scanner;



public class App {
  
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Digite a preimera nota:");
     double nota01=scanner.nextDouble();

     System.out.println("Digite a segunda nota:");
     double nota02=scanner.nextDouble();
     
     System.out.println("Digite a terceira nota:");
     double nota03=scanner.nextDouble();

     System.out.println("Digite a quarta nota:");
     double nota04=scanner.nextDouble();

     double media= (nota01+nota02+nota03+nota04) /4;

     System.out.println("A media Do Aluno e :"+media);

     scanner.close();

    }
}
