public class App {
    public static void gelerateCollatzSequence (int number ) throws Exception {
        System.out.println(number + " ");
    
    
    while (number != 1 ) {

        if(number % 2 ==0 ){
            number = number/2;
        }else{
            number = (number*3)+1;
        }
    
    System.out.println(number + "  ");
    
    }   
    
    
    }

    public static void main(String[] args) throws Exception {
         int number = 27 ;

    
         System.out.println("Sequecia de  collaz para o numero " + number + " : ");
         
         gelerateCollatzSequence(number);
    }
}
