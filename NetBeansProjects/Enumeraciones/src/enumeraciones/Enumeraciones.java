/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

import java.util.Scanner;

/**
 *
 * @author Diurno
 */
public class Enumeraciones {

    enum Level{LOW, MEDIUM, HIGH}
    
//    enum DiasDeSemana{DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO}
    
    // Creamos un tipo de datos DiasSemana con los dias de la semana.
    // Vamos a crear una funcion llamada perdirDia, que le pida el dia de la 
    // semana al usuaurio. La funcion devolverá el dia de la semana introducicdo
    // y si el usuario introduce algo erroneo vamos a budcar el dia de a la semana
    // al S.O y devolvemos.
    
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Level nivelGasoil;
        System.out.println("Pon tu nivel de gasoil");
        try{
            nivelGasoil = Level.valueOf(teclado.nextLine().toUpperCase());
        } catch (RuntimeException error){
            System.out.println("No renozco ese nivel");
            //  Por defecto meto low
            nivelGasoil = Level.LOW;
        }
        
             
        switch (nivelGasoil){
            case LOW: System.out.println("Ve a echar gasolina ya");
                    break;
            case MEDIUM: System.out.println("Tienes el deposito a la mitad ");
                    break;
            case HIGH: System.out.println("Dale gaaas !!!!!!!");
                    break;
            default : System.out.println("No reconozco el nivel de la gasolina");    
        }
        
        System.out.println(nivelGasoil);
        
        for (Level nivel : Level.values()){
            
            
        }
        
        
    }
    
//    public static DiasDeSemana pedirDia(){
        
    
}

