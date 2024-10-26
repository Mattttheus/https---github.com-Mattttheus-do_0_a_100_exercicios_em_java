public class App {
    public static boolean iSpalavraPrima(String palavra){

        palavra = palavra.toLowerCase();

        int somaValores= 0;

        for( int i=0; i<palavra.length(); i++){
            char letra = palavra.charAt(i);
            int valorLetra =  letra- 'a' +1;
            somaValores += valorLetra;
        }

        boolean iSPrimo = true;
        if(somaValores <2 ){
            for(int i=0; i <= Math.sqrt(somaValores); i++){
                if(somaValores % i==0){
                    iSPrimo=false;
                    break;
                }
            }
        }

        return iSPrimo;
    }

    public static void main(String[] args) {
     
        String palavra = "Open";
        if(iSpalavraPrima(palavra)){
            System.out.println("A Palavra " + palavra + "E uma palavra Prima");
        }else{
            System.out.println("A Palavra " + palavra + "Não é uma palavra Prima");
        }
    }
}