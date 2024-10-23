
public class SomaVetor {

   
    public static void main(String[] args) {
        
     int vetor [ ]= {1,2,3,4,5,6,0};
     int resultado = calcularSoma(vetor, vetor.length -1);
     System.out.println("A soma dos vetores é " + resultado);

    }
 public static int  calcularSoma(int[] vetor, int indice ){

if(indice<0){
return 0;
}else{

return vetor[indice]+ calcularSoma(vetor, indice -1);

}

}
   
}