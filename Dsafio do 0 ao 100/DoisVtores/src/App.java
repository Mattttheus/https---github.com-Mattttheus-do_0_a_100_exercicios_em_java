import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner iput = new Scanner(System.in);
    
        System.out.println("Digite o tamanho do vetor");
        int tamanho =  iput.nextInt();

        int [] vetor=  new int[ tamanho];

        System.out.println("Digite os elemento do vetor");
        for(int i =0 ; i < tamanho; i++){
            vetor[i] = iput.nextInt();
        }
        System.out.println("Digite onumero a ser buscado");
        int NumerosBuscar= iput.nextInt();
    int contagem =0;

    for(int i = 0; i < tamanho; i++){
        if(vetor[i]==NumerosBuscar){
           
             contagem++;

        }
     } 
     System.out.println("" + NumerosBuscar+""+ contagem);
     iput.close();
    }
}
