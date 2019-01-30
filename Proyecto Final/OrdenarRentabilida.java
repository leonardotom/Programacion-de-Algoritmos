/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinprogramacion;

/**
 *
 * @author leonardo
 */
public class OrdenarRentabilida {
    String nombre;
    double contador;

    public OrdenarRentabilida(String nombre, double contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    public OrdenarRentabilida() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getContador() {
        return contador;
    }

    @Override
    public String toString() {
        
        return String.format("%s con $%.2f de ganancia.\n", nombre,contador);
    }
}
