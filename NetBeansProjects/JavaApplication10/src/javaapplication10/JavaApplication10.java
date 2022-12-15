/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Diurno
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" **************String format. ***************");
        String usuario = "zootropo";
        int mensajes = 36;
        String s = String.format("%s escribio %d mensajes" usuario, mensajes);
        System.out.println(s);
        
        int num = 45;
        float num1 = 4.5f;
        System.out.println(String.format("EL resultado de sumar %d con %f es %.2"));
        
        
        float numFloat = 3.14159f;
        String s2 = String.format("PI es %.3f", numFloat);
        System.out.println(s2);
        
        int numInt = 1234;
        String s3 = String.format("El numero es: %08d", numInt);
        
        
        
    }
    
}
