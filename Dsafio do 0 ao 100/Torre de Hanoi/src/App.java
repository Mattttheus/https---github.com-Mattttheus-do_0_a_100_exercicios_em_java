public class App {
    public static void main(String[] args) throws Exception {
        int numDisco =3;

        respverTorreDeHano1(numDisco,'a','b','c');
    }


    public static void respverTorreDeHano1 ( int numDisco, char Origem , char auxiliar , char destino){
        
      if(numDisco==1){

        System.out.println(" Mover disco 1 de  " + Origem  + "  Para  " + destino  );
      }else{

        respverTorreDeHano1( numDisco -1, Origem,destino ,auxiliar);

        System.out.println(" Mover disco  " + numDisco + " de " + Origem + "  Para " + destino);

        respverTorreDeHano1( numDisco -1, Origem,destino ,auxiliar);
      }
    }   
}
