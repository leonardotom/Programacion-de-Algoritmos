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
public abstract class ReservaVehiculos {
    protected String nombre;
    protected String direccion;
    protected String direccionfin;
    protected double km;
   
    public ReservaVehiculos(String nombre, String direccion, String direccionfin, double km) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.direccionfin = direccionfin;
        this.km = km;
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

    public double getKm() {
        return km;
    }
      
    public abstract double costocarrera();

    @Override
    public String toString() {
        return String.format("Reserva a nombre de: %s\nDirección de origen: %s\nDirección final: %s\nKm recorridos: %.2f\n", nombre, direccion, direccionfin, km);
    }
}
