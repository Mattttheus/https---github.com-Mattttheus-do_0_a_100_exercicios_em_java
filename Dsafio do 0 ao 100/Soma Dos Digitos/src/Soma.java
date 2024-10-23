/**
 *
 * @author Matheus
 */
public class Soma {


    public static void main(String[] args) {
        
    int numero = 12345;
    int soma = calculadora( numero);

        System.out.println("A doma dos Digitos " +numero + " é " + soma);
    }
    public  static int calculadora( int numero ){
     if( numero < 10 ){

    return numero;
}else{

return numero % 10 + calculadora( numero/10);

}
   }
}
