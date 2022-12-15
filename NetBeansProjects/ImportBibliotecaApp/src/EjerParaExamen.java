
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diurno
 */
public class EjerParaExamen {
    
    // Declarar un enum que sea amigos con las constantes:
    // JEROEN, JAVI, FRAN, ANGEL, FELIX, LEO.
    // Vamos a pedirle al usuario, mediante una funcion que introduzacas
    // un nombre y si es uno de mis amigo lo voy a meter en un array
    // hasta tener 5 amigos. 
    // Tambien vamos a llevar un array con la edad de mis amigos.
    // Luego se mostrará en patnalla, cuales de los nombres introducidos son 
    // amigos mio 
    // Mejora: Sacar los amigos ordenados alfabeticamente y contamos
    // cuántas vecesse repite cada uno y tambien podemos sacarlos
    // de los jóvemeos a los más mayores.
    
    enum Amigos {JEROEN, FRAN, JAVI, FELIX, ANGEL, LEO}
    static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args){
        
        Amigos[] misAmigos = new Amigos[5];
        int contadorAmigos = 0;
        String miNombre = pedirNombre();
        System.out.println(miNombre);
        Amigos miAmigo = esAmigo(miNombre);
        if ( miAmigo != null){
            misAmigos[contadorAmigos] = miAmigo;
            int miEdad = pedirEdad();
            System.out.printf(" La edad de %s es %d ", miAmigo, miEdad);
        } else {
            System.out.println(miNombre + " no es mi amigo");
        ++contadorAmigos;    
        }
                
    }
    
    // Esta funcion solo me va a dovelver el nombre introducido por el usuario
    
    public static String pedirNombre (){
        System.out.println("Introduce un nombre");
        String nombre = entrada.next();
        return nombre;
        
    }
    
    // Esta funcion va a pedir la edad del usuario hasta que meta una que sea
    // correcta (entre  y 150).
    
    public static int pedirEdad(){
        
        int edad;
        System.out.println("Introduce la edad"); 
        edad = entrada.nextInt();
        while (edad < 0 || edad > 150){
            System.out.println("Introduce la edad"); 
            edad = entrada.nextInt();
        }
        return edad;
    }
    
    // La funcion esAmigo comprueba si es uno de los valores de mi enums
    // si no lo es, devuelvo un null.
    
    public static Amigos esAmigo(String unNombre){
        
        String unNombreMayus = unNombre.toUpperCase();
        Amigos miAmigo = null;
        try{
            miAmigo = Amigos.valueOf(unNombreMayus);
        } catch (IllegalArgumentException error){
            
        }
        return miAmigo;
                
        
    }
}
