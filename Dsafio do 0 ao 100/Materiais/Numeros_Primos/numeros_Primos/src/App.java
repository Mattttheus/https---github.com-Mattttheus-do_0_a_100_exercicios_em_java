

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um Numero ");
        int Numero =  input.nextInt();
        System.out.println("Numero Primo menor que " + Numero " : ");
    
        for(int i=2; i < Numero ; i++){
            if(IsPrimo(i)){
                System.out.println(i + " " );
            }
        }
        input.close();
    }

    public static boolean IsPrimo(int num) {
        if(num <= 1 ){
            return = false;

        }
        for(int i=2; i <=Math.sqrt(num); i++){
            return= false;
        }
    }
    return = true;
}
