/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Diurno
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        // TODO code application logic here
        // Ejercicio de clase:
        // Voy a la discoteca y si soy mayor de 18 años entro y si tengo dinero,
        // me pido una cocacola.
        // Ponen a tiburón fiestero y me pongo a bailar. A continuación, sexo.
        // Si no soy mayor, me voy al cine. Si está Avatar 2, la veo y si no,
        // me voy a la bolera.
        // Antes de irme del cine me tomo un helado.
        
       
        
        ejemploTiburonFiesteroConDinero();
    }
    
    public static void ejemploTiburonFiesteroConDinero(){
                      
        // Precios
        // Entrar a la disco --> 20 
        // CocaCola  --> 4
        // Ver Avatar --> 8
        // Bolera --> 12
        // Helado --> 2,5
        
        final byte ENTRADADISCO = 20 ;
        final byte COCACOLA = 4 ;
        final byte ENTRADAAVATAR2 = 8 ;
        final byte BOLERA = 12 ;
        final float HELADO = 2.5f;
          
      
        byte edad = Byte.parseByte(JOptionPane.showInputDialog
            ("¿Cuantos años tienes?"));
        float dinero = Byte.parseByte(JOptionPane.showInputDialog
            ("¿Cuanto dinero tienes?"));
        
        if (edad >= 18){
                                   
            if (dinero >= ENTRADADISCO){
                dinero = (dinero - ENTRADADISCO);
                System.out.println("Soy mayor. Entro a la disco");
                if (dinero >= COCACOLA){
                    System.out.println("ME tomo una coca cola");
                    dinero = (dinero - COCACOLA);
                }
                
                System.out.println("Ostras, el tiburon fiestero. Bailo como si "
                     + "no hubiera un mañana");
                System.out.println("Y luego...");  
                
            } 
            
            
        }else{ 
            System.out.println("Me voy al cine.");
            System.out.println("¿Tengo dinero?");
            float CINE = 0;
            if (dinero >= CINE){
                System.out.println("Sí, entro al cine.");
                dinero = dinero - CINE;
                
            } else if (dinero >= BOLERA) {
                System.out.println("No tengo dinero para el cine, pero sí "
                        + "para la bolera.");
                dinero = dinero - BOLERA;
            } else {
                System.out.println("No");
            }
            System.out.println("Me voy a por un helado.");
            System.out.println("¿Tengo dinero?");
            if (dinero >= HELADO){
                System.out.println("Sí,me tomo un helado.");
                dinero = dinero - HELADO;
            } else {
                System.out.println("No, me voy a casa.");
            }
        } 
    }
    


