package org.zaidinvergeles.sam.personaapp;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diurno
 */
public class JavaAppication {
    
    // Crear una funcion llamada mediaArrays, que me devuelva la media aritmetica de aquellos 
    // enteros impares que haya dentro de un array unidimensional (de cualquier tamaño).
    // El main debe llamar a esta funcion y pasarle el correspondiente array. 
    // Tambien sera el main el que muestre la media obtenida.
    
    public static void main(String [] arg){
         
        int filas = 3;
        int columnas = 4;
        int [][]miArraydelMain = creaArray(filas,columnas);
        mostrarArrayBidi(miArraydelMain);
        
            
    }
       
    
    public static int [][] creaArray (int f, int c){
        int [][] miArray = new int [f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                miArray [i][j] = ThreadLocalRandom.current().nextInt(1,11) ;
                
            }
            
        }
        
        return miArray;
        
    } 
     
    public static void mostrarArrayBidi(int [][] bidi){
        for (int fila = 0; fila < bidi.length; fila++) {
            System.out.println();
            for (int columna = 0; columna < bidi[fila].length; columna++) {
                System.out.print(bidi[fila][columna] + "\t");
            }
            System.out.println();
        }

    }
}