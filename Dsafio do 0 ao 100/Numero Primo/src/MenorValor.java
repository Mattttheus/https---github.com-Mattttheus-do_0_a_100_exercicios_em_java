/**
 *
 * @author Matheus
 */

public class MenorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int [] vetor= {5,2,9,1,7};
    int menorValor = encontrarMenorvalor(vetor);
    System.out.print("O Menor Valor" + menorValor);
}

   public static int encontrarMenorvalor (int[]vetor){

  return encontrarMenorValorRecursivo(vetor,0,vetor.length -1);

}

private static int encontrarMenorValorRecursivo(int[]vetor, int inicio , int fim){

  if(inicio == fim ){

return vetor[inicio];
}else{

int meio =(inicio  + fim)/2;
int menoEsquerda=encontrarMenorValorRecursivo(vetor , inicio , meio);
int menoDireita =encontrarMenorValorRecursivo(vetor ,meio +1  , fim);
return Math.min(menoEsquerda,menoDireita);
   }

 }

}
