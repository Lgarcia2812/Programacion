/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_clase;

/**
 *
 * @author Diurno
 */
public class Coche {
    // Atrivutos, campos, miembros, caracteristica...

    String marca;
    String color;
//    String matricula;
//    String modelo;
//    double kms;
//    String combustible;
    int velocidad;

    // Métodos
    public void inicializar(String marcaCoche, String colorCoche) {

        marca = marcaCoche;
        color = colorCoche;
        velocidad = 0;
        
    }

    public void arrancar() {

        velocidad = 10;

    }

    public void parar() {

        velocidad = 0;

    }

    public void acelerar() {

        velocidad += 10;

    }

    public void frenar() {

        velocidad = - 10;

    }

}
