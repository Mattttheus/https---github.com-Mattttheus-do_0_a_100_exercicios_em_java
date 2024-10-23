
public class App {
    public static void main(int[] array) {
    
    int tamanho = array.length;

    for(int i =0; i< tamanho -1 ;i++){
        for(int j =0; j< tamanho -1 ;j++){

            if(array[j]  > array[j +1]){
   
             int temp = array[j];
              array [j] = array[j +1];
              array[j + 1 ]= temp; 

             }


            }
        }
   }
}
