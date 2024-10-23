
/**
 *
 * @author theus
 */

public class Palidromo01 {

    public static void main(String[] args) {
   String palavra = "radar";
   boolean resultado = varificarPalindromo(palavra);
  System.out.print("A Palavra "  +  palavra +  " e uma palindromo  ?  " + resultado);
}

public static boolean varificarPalindromo(String palavra){

if(palavra.length()<= 1){

return true;

}else{

char primeira = palavra.charAt(0);
char ultima =palavra.charAt(palavra.length()-1);
if(primeira == ultima ){

String subPalavra= palavra.substring(1,palavra.length()-1 );
return varificarPalindromo(subPalavra);

}else{

return false;
}

}


}
    
}
