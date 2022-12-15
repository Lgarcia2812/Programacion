/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Diurno
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 5;
        
    // Operadores de incremento y decremento
    
        numero++;
        System.out.println("El resultado de numero++ es " + numero);
    
        numero--;
        System.out.println("El resultado de numero-- es " + numero);
    
        int x = 5;
        int y = x++; // x = 6, y = 5
        System.out.println("La x es " + x + "y la y es " + y );
    
        x = 5;
        y = ++x;    // x = 6, y = 6
        System.out.println("La x es " + x + "y la y es " + y );
            
    // La clase Math      
      
    // Raíz cuadrada
    
        double raiz = Math.sqrt(9);
        System.out.println("La raiz cuadrada de 9 es " + raiz);
        
        int raiz2 = (int) Math.sqrt(16);
        System.out.println("La raiz cuadrada de 16 es " + raiz2 + "(entero)");

    // Potencia

        double base = 5, exponente = 3;
        double potencia = Math.pow(base, base);
        System.out.println("5 al cubo es " + potencia);
        
        
    // Redondear
        
        double num3 = 4.56;
        long redondeo = Math.round(num3);
        System.out.println("El reddondeo de " + num3 + " es " + redondeo);
        int redondeo2 = Math.round(5.67f);
     
    // Truncar en clase 
        
        float t = 2.7644f; 
        float numero1 = (float) Math.floor(t); //Truncar a entero
        float numero2 = (float) Math.floor(t * 100) / 100;
        
        System.out.println("Truncamiento a dos decimales" + numero2);
        
    // Random 
    
    // Número aleatorio entre 1 y excluido 
    
        double aleatorio = Math.random()*10+1;
        System.out.println("El aleatorio: " + aleatorio);
        
    // Número aleatorio entre 10 y 33 excluido    
        
        double aleatorio1 = Math.random()*22+10;
        System.out.println("El aleatorio1: " + aleatorio);
        
      //  double aleatorio
      
            
      // Generacion de un número aleatorio entre 0,1,n y m (exclusivo)
    
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dime el número inicial: ");
        int min = teclado.nextInt();
        System.out.print("Dime el número final: ");
        int max = teclado.nextInt();
        int alea = ThreadLocalRandom.current().nextInt(min,max + 1);
        System.out.println("El numero aleatorio entre: " + min + "y" + max +
                "es" + alea);
       
       
      
       
    
        
    // Otra forma mediante el uso de la hora local del sistema en milisegundos
    
        
        
        
    
    //CIUDADO CON LOS POSTINCREMENTOS COMBINADOS CON OPERACIONES ARITMETICAS    
        
        int j = 10;
        
    // Aquí primero sustituye la primera j por lo, luego aumenta en una a j
    // con lo que la segunda j ya vale 11, por tanto sale 21.
    
        int res = j++ + j;
        System.out.println("Resulto del postincremento con suma: " + res + " y "
                + " j vale " + j);
        
        j = 10;
        
    // Aquí primero hace la suma j + j, que es 20 y luego añade 1 a j     
    // Con lo que la segunfa j ya vale 11, por tanto sale 20.
    
        res = j + j++;
        System.out.println("Resultado del posincremento con suma:" + res +
                "y j vale " + j);
        
    // Sin embargo, el procedimiento lo hace bien.
        
        j = 10;
        res = ++j + j;
        System.out.println("Resultado del preincremento con suma: "+ res + 
                "y j vale " + j);
        
        j = 10;
        
    // Aquí sustituye primero la j por 10 y luego le suma 11.
        
        res = j + ++j;
        System.out.println("Resultado del preincremeento con suma: " + res + 
                "y j vale " + j );
    
    }
  
}

    public static void bucles(){
        byte i = 10;
        while (i>=0){
    
        
        }

        do {

        }while condicion 
        false

        for (inicial; ond)
   
}

