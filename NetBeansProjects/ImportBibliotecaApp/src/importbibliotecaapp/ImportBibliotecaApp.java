/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package importbibliotecaapp;

import acm.program.ConsoleProgram;

/**
 *
 * @author Diurno
 */
public class ImportBibliotecaApp extends ConsoleProgram{
    
    @Override
    public void run(){
      println("Este programa suma 2 numeros");
      int n1 = readInt("Pon el primero numero : ");
      int n2 = readInt("Introduce el siguiente : ");
      int total = n1 + n2;
      println("El total es " + total + ".");
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ImportBibliotecaApp().start(args);
    }
    
}
