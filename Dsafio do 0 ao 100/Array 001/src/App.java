

/**
 * @param Matheus
 */

 import java.util.Scanner;
public static void main(String[] args) {
    
     Scanner input = new Scanner(System.in);

        System.out.println("Digite um tamanho");
        int tamanho = input.nextInt();

     int[] vetor = new int[tamanho];
        System.out.println("Digite os elementos");
         for (int i = 0; i<tamanho ; i++){
          vetor[i] = input.nextInt();
  }
boolean EstaEnOrdemCrecente = true;

for (int i =0;i< tamanho -1; i++){
if (vetor [i]> vetor [i+1]){
EstaEnOrdemCrecente = false;
break;
}

}

if (EstaEnOrdemCrecente){
    System.out.println(" Esta em ordem crecente");
}else{
    System.out.println("Não Esta em ordem crecente ");

}

input.close();
 }   

