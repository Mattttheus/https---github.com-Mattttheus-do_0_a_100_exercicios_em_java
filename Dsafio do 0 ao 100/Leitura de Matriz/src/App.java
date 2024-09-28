import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner  input = new Scanner(System.in);
        int tamanho = 4;
        int [][] matriz = new int[tamanho][tamanho];

        for( int i =0; i<tamanho;i++){
            for( int j=0; j<tamanho;j++){
        System.out.println("Digite a possição [" + i + "][" + j + "]");
        matriz[i][j]= input.nextInt();
            } 
        }
        boolean ehDiagonal=true;

        for( int i =0; i<tamanho;i++){
            for( int j=0; j<tamanho;j++){
                 if(i !=j && matriz[i][j]!=0){
                    ehDiagonal= false;
                    break;
                 }
            } 

            if(ehDiagonal){
                break;
            }
        }
        if(ehDiagonal){
            System.out.println("A Matriz E diagonal");
        }else{
            System.out.println("Amatriz não e Diagonal ");
        }
        
        input.close();
    }
}
