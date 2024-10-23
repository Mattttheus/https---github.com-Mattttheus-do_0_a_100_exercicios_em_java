public class Mdc {


    public static void main(String[] args) {
int numero1=36;
int numero2=48;
int mdc = calcularmdc(numero1,numero2);
System.out.println("O MdcDo numero " + numero1 + " é " +mdc);
}
public static int calcularmdc(int numero1, int numero2){
if(numero2==0){
return numero1;
}else{

return calcularmdc(numero2,numero1 % numero2);

}
     
    }
    
}
