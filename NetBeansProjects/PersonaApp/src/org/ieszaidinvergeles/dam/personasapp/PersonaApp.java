/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ieszaidinvergeles.dam.personasapp;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Diurno
 */
public class PersonaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pepe = new Persona("1234", "PEPE", "SANCHEZ", LocalDate.of(2000, 3, 21), 1.88, 79.99);
        System.out.println(pepe.getNombre()+);
        
    }
    
}
