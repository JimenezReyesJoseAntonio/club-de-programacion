/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alreves;
    import java.util.Scanner;

/**
 *
 * @author pepe
 */
public class Alreves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
/**
 *
 * @author SEVEN
 */

    /**
     * @param args the command line arguments
     */
      Scanner entrada=new Scanner(System.in);
      String palabra="";
        
      System.out.println("ingrese una palabra ");
      palabra=entrada.nextLine();
        //el string lo vuelve a char
      char[]Aux=palabra.toCharArray();
      
      int aux=palabra.length();
      char[]Nuev=new char[aux];
        //invertimos la palbra 
      
        for(int i=aux-1;i>=0;i--){
     
          System.out.println(Aux[i]);
         
      
      
      }
                
   
   
        
     
        
        
    }
        
   }
    

