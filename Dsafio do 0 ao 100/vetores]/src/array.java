import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
 
public class array {

  public static void main(String[] args) throws Exception {

    String [ ] paises = new String[5];
    int [] numeros = new int[10];


for( int i = 0 ; i< paises.length; i++){  

paises [i] = JOptionPane.showInputDialog("Informe um pais ");

  }

  for(String lista :paises){

   System.out.println(lista);
   }

      for (int i = 0; i < 10; i++) {

         numeros [i] = Integer.parseInt(  JOptionPane.showInputDialog("Informe um numero"));
      }

     for(Integer lista :numeros){

   System.out.println(lista);
   }
          
      }

  @Override
  public String toString() {
    return "array []";
  }

 }