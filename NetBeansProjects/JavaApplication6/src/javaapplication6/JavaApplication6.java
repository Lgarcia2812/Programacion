/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class JavaApplication6 {

  
      public static arrayString();
    
    public static void arraysString() {
        // TODO code application logic here
        
        // Creamos un array con nombres introducidos por el usuario
        
        String[] nombres = new String[5]; 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Please, enter a name: ");
        String nombreIntroducido = teclado.next();
        nombres[0] = nombreIntroducido;
                
        System.out.println(Arrays.toString(nombres));
        
                
        

    }
}
    

