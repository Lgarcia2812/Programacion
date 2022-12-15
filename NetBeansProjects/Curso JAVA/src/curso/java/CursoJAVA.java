/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis García Díaz
 */
public class CursoJAVA {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        // Aqui se pone el programa que quiero que se ejecute
        
//    recorreArrays();
    trabajoArrays();
                 
    }
    
    public static void condicionales(){
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
                System.out.println("No tengo dinero para el cine, pero sí para la bolera.");
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


    public static void operadores() {
        int numero = 0;
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
        System.out.println("El numero aleatorio entre: " + min + "y" 
                + max + "es" + alea);
       
       
        
    
        
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
  
    
    public static void aprenderalgo() {
        
        // string para texto solo texto
        
        String texto;
        texto = " CHUPAME UN HUEVO @gmail.com ";
        System.out.println(texto);
        
        // int es para numeros enteros
        
        int edad;
        edad = 5; 
        System.out.println(" La edad es esta " + edad + " años" );
        
        // coge numeros muy pequeños y muy grandes
        // float es igual que double pero abarca menos múmeros
        // char sirve para poner cualquier tipo de caracter
        
        double x;
        x = 6.384635628 ;
        //x = x + 75;
        System.out.println(" X es igual " + x );
        
        
        // boolean sirve para true = 1 y false = 0
 
        boolean llover;
        llover = true;
        System.out.println("¿Es verdad que esta lloviendo? " + llover);
        
        
        // constante no va a cambiar en todo el programa ejem "pi"
        
        final double PI;
        PI = 3.127876646; 
        System.out.println("");
        
        
        // Scanner sirve para que el usuario pueda escribir en el programa
        
        Scanner teclado = new Scanner(System.in);
        int a, b, suma;
        System.out.println("Ingresa el valor de a");
        a = teclado.nextInt();
        System.out.println("Ingresa el valor de b");
        b = teclado.nextInt();
        
        suma = a + b;
        System.out.println(" La suma total es " + suma);             
        
                
    }
    
    
    public static void aprenderalgo2(){
        
        
        // Operadores matemáticos
           
        double raiz;
        raiz = Math.sqrt(121);
        System.out.println(raiz);
        
        
        double potencia;
        potencia = Math.pow(2,8);
        System.out.println(potencia);
        
        double numero;
        numero = Math.random() *10 + 10; 
// el numero maximo es el que multiplica mas el minimo y el que suma el minimo
        System.out.println(numero);
        
                 
    }

    
    public static void ejerciciosJavi(){
    
    //Calcular e imprimir la suma de un cuadrado
        
        Scanner teclado = new Scanner(System.in);
        double a1, a2, b1, b2, op;
        
        
        System.out.println("Ingresa el valor de a ");
        a1 = teclado.nextDouble();
        System.out.println("Ingresa el valor de b ");
        b1 = teclado.nextDouble();
        
        a2 = Math.pow(a1,2);
        b2 = Math.pow(b1,2);
                
        op = a2 + b2 + 2*a1*b1;
        
        System.out.println(op);
        
        
 
}
    
    
    public static void ifs(){
        
        
    }
    
    
    public static void recorreArrays(){
        
        // Definimos una array llamado numeros de 4 elementos byte
        short[] numeros = new short[4];
        numeros[0] = 9;
        numeros[3] = 256;
        numeros[2] = 8;
        
        
        // Intento ver lo que tiene numeros
        System.out.println(numeros);
        System.out.println(numeros[0]);
        
        // Recorro el array con un while 
        byte indice = 0;
        while (indice <= 4){
            System.out.println(numeros[indice]);
            ++indice;
        }
        
        // Recorro el array con un for (for + tab)
        for (int i = 0; i < 4; i++) {
            System.out.println(numeros[i]);
        }
        
        // Recorro el array con un foreach (fore + tab)
        for (short miNum : numeros) {
            System.out.println(miNum);
        }
        
        // No reconoce la variable de miNum
        // System.out.println(miNum);
        
    }  
    
    public static void trabajoArrays(){
        System.out.println("***TrabajoArrays***");
        // Declaramos un array de 6 elementos tipo cadena
        String[] cadenas = new String[6];
        cadenas[4] = "Luis"; 
        cadenas[1] = "Ángel"; 
        cadenas[2] = "  ";
                 
        for (int i = 0; i < cadenas.length; i++) {
            System.out.println(cadenas[i]);
            
        }
                            
    }
        
}













