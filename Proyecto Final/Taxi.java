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
public class Taxi extends ReservaVehiculos{
   
    private double costocarreraTaxi = 1.25;

    public Taxi(String nombre, String direccion, String drireccionfin, double km) {
        super(nombre, direccion, drireccionfin, km);
    }

    public double getCostocarreraTaxi() {
        return costocarreraTaxi;
    }
    
    @Override
    public double costocarrera(){
        if (km >= 4)
         return costocarreraTaxi = km*0.30;
        else
         return costocarreraTaxi;
    }
    
    
    @Override
    public String toString(){
        return String.format("Alquiler de Taxi\n%s\nEl coto de la carrera es de: %.2f", super.toString(), costocarrera());
    }
    
}
