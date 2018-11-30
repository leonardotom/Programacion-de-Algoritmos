/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoalquiler.vehiculos;

/**
 *
 * @author leonardo
 */
public abstract class ReservaVehiculos {
    protected String nombre;
    protected String direccion;
    protected String direccionfin;
    
    public ReservaVehiculos(String nombre, String direccion, String drireccionfin) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.direccionfin = drireccionfin;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDireccionfin() {
        return direccionfin;
    }
    
    
    public abstract double costocarrera();

    @Override
    public String toString() {
        return String.format("Reserva a nombre de: %s\nDirección de origen: %s\nDirección final: %s\n", nombre, direccion, direccionfin);
    }
    
    
    
}
