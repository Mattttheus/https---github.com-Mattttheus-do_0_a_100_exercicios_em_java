/**
 *
 * @author theus
 */

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Scanner;
 public class outra_forma {
 
     @Override
    public String toString() {
        return "outra_forma []";
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.println(" Digite o tamanho da lista ");
          int tamanho = input.nextInt();
      
 
 ArrayList<Integer>vetor = new ArrayList<Integer>();
 
         System.out.println("Digite Os Elementos Do Vetor");
      for (int i= 0; i < tamanho; i++ ){
 vetor.add(input.nextInt());
 
 }
   
 Collections.reverse(vetor);
 
         System.out.println("Elementos do vetor em ordem inversa ");
 for(int elementos : vetor){
 
     System.out.println(elementos + "");
 }    
 input.close();
 }
     
 }
