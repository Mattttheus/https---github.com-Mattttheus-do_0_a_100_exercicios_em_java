public class tabuleiro {

    public static void main(char [][] tabuleiro) {
    
for( int i= 0; i<3;i++){
if(tabuleiro [i][0]== tabuleiro[i][1]&& tabuleiro[1][1]== tabuleiro[1][2] && tabuleiro[i][0 ]!= ' '){

    System.out.println("Jogador " + tabuleiro[i][0] + "  venceu ");

}


}
for( int i= 0; i<3;i++){
    if(tabuleiro [0][i]== tabuleiro[1][i]&& tabuleiro[1][i]== tabuleiro[2][1] && tabuleiro[0][i]!= ' '){
    
        System.out.println("Jogador " + tabuleiro[i][0] + "  venceu!");
    
    }

}
for( int i= 0; i<3;i++){
    if(tabuleiro [0][0]== tabuleiro[1][1]&& tabuleiro[1][1]== tabuleiro[2][2] && tabuleiro[0][0]!= ' '
        ||(tabuleiro [0][2]== tabuleiro[1][1]&& tabuleiro[1][1]== tabuleiro[2][0] && tabuleiro[0][2]!= ' ')){

          System.out.println( "Jogador " + tabuleiro[i][0] + "  venceu!");

        }

        boolean HaEspacVazio = false;    
    
        for( i = 0; i<3 ; i++){
            for(int j =0; j<3 ; j++){
                 if(tabuleiro[i][j] == ' '){
                    HaEspacVazio= true;  
                    break;
                }
        }
      }

      if(!HaEspacVazio){
        System.out.println("Espere");
      }
    System.out.println("Espere");
    }

 }
}
