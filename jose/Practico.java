/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico;

/**
 *
 * @author jose clavijo
 */
public class Practico {

    /**
     * @param args the command line arguments 3764dzs
     */
    public static void main(String[] args) {
Practico p = new Practico();
p.par(5);
    }
   public int par(int numero){
       int resultado=0 ;

      
       if (numero ==0) {
            return 1;
      
               
       }
       else{
           System.out.println("mi factorial es: "+(resultado=numero*(par(numero-1))));
           
          return resultado ;
              
                 
              
       }
   }
}
