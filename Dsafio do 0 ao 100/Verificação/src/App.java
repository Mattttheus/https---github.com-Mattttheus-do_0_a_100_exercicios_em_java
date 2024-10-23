
/**
 *
 * @author Matheus
 */
public class Verificar {

    
    public static void main(String[] args) {

   int numero = 17;

if(verificar(numero)){

    System.out.println(numero + " ");
}else{

    System.out.println( numero +"  ");
}

    }
 public static boolean verificar(int numero){

if( numero <=1){

return false;
}
return verificarRecurcivo (numero, 2);

}  
 public static boolean verificarRecurcivo (int numero, int divisor){

  if( divisor ==numero){

return true;
}
  if(numero % divisor ==0){


return false;
}
return verificarRecurcivo(numero,divisor + 1);
}
}
