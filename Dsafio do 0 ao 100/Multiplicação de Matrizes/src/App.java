
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


        System.out.println("numeros da linha a ");
        int linhaA = input.nextInt();

        System.out.println("numeros da coluna a");
        int ColunaA = input.nextInt();

        System.out.println("numeros da linha b ");
        int linhab = input.nextInt();

        System.out.println("numeros da Coluna b ");
        int Colunab = input.nextInt();
    
    if(ColunaA!= linhab){

      System.out.println("Não e possivel multiplicar matrizes ");
      System.exit(0);
    }
    
    int[][]matrizA=new int[linhaA][ColunaA];
    int[][]matrizB=new int[linhab][Colunab];
    int[][]resultado=new int[linhaA][Colunab];


System.out.println("Digite os elementos da primeira Matriz ");
for( int i =0; i<linhaA;i++){
    for( int j=0; j<ColunaA;j++){
     matrizA[i][j]= input.nextInt();
    } 
}

System.out.println("Digite os elementos da segunda  Matriz ");
for( int i =0; i<linhab;i++){
    for( int j=0; j<Colunab;j++){
     matrizB[i][j]= input.nextInt();
    } 
}
for( int i =0; i<linhaA;i++){
    for( int j=0; j<Colunab;j++){
    for( int k=0; k<ColunaA;k++){
     resultado[i][j]+= matrizA[i][k]* matrizB[k][j];
    } 
}
System.out.println("Resultado");
for( int k = 0; k<linhaA;k++){
    for( int j=0; j<Colunab;j++){

        System.out.println(resultado[k][j]+ "  ");

    } 
}


System.out.println();
}
input.close();
    }
}
