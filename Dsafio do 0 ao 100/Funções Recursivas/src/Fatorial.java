import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) throws Exception {
     Scanner input = new Scanner(System.in);
    
     
     
       System.out.println(" Digite o numero a ser calculdo o fatorial " );
        int numero = input.nextInt();

        long reaultado = caculadorar(numero);

        System.out.println("Fatorial de " + numero + " é " + reaultado);
    
    
       input.close();
    }

    public static long caculadorar(int numero) {
        if(numero==0){
            return 1;
        }else{
            return numero * caculadorar(numero - 1 );
        }

    }

}
