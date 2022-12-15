
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diurno
 */
public class NewClass2 {
    
    public static void main(String[] args){
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha actual" + fecha);
        
        LocalTime hora = LocalTime.now();
        System.out.println("Hora actual" + hora);
        
        LocalDateTime fechaYHora = LocalDateTime.now();
        System.out.println("Fecha y hora actual" + fechaYHora);
        
        DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("E dd-MM-yyyy HH:mm:ss");
        String text = fechaYHora.format(fechaFormateada);
        System.out.println("Fecha y hora formateada:" + text);
        
        ZonedDateTime monthOFYear = ZonedDateTime.now();
        System.out.println("La zona horaraia completa : " + monthOFYear);
        
        
        System.out.println("La fecha dentro de 10 días: " + LocalDate.now().plusDays(10));
        
    }

       
}
