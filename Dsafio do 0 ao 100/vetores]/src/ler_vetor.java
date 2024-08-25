import java.util.Scanner;
public class ler_vetor {

    
    public static void main(String[] args) {   
    Scanner input = new Scanner(System.in);

        System.out.println("Digite o tatamnho do vetor");
        int tamanho = input.nextInt();

     int[] vetor= new int [tamanho];

        System.out.println("Digite os elementos do vetor");
        for(int i =0 ; i< tamanho; i++){
          vetor[i]= input.nextInt();

}
int maior =Integer.MIN_VALUE;
int segundoMaior= Integer.MIN_VALUE;

for(int i=0; i< tamanho;i++ ){
  
  if(vetor[i]> maior){
   segundoMaior = maior;
maior= vetor[i];
}else if(vetor [i] > segundoMaior && vetor[i] != maior){

segundoMaior = vetor[i];

}

}
if(segundoMaior != Integer.MIN_VALUE){

    System.out.println("o segundo elemento e maior :" + segundoMaior);
}else{

    System.out.println("não encontrado segundo elemento no vetor");
}

input.close();
    }
    @Override
    public String toString() {
      return "array []";
    
}

}

