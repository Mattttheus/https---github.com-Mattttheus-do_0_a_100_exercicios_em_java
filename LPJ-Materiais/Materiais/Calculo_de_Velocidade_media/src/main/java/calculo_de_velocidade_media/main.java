
package calculo_de_velocidade_media;

import java.util.Scanner;

public class main {

 public static void  calculo_de_velocidade_media(String[] args){
   Scanner imput  = new Scanner(System.in);

  System.out.println("Digite o espaço ");
   double variacaoEspaco = imput.nextDouble();
  System.out.println("Digite o espaço ");
   double variacaoTempo = imput.nextDouble();
 
double VelocidadeMedia = variacaoTempo/variacaoEspaco;

 System.out.println("A velocidade Media e :" + VelocidadeMedia);
    
}
}