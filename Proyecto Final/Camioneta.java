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
public class Camioneta extends ReservaVehiculos{

    double costocarreraCamioneta = 5.00;
    
    public Camioneta(String nombre, String direccion, String drireccionfin, double km) {
        super(nombre, direccion, drireccionfin, km);
    }
       
    @Override
     public double costocarrera(){
        if (km >= 4) 
            return costocarreraCamioneta = km*0.60;
        else
            return costocarreraCamioneta;
    }
    
    @Override
    public String toString(){
        return String.format("Alquiler de camioneta\n%s\nEl coto de la carrera es de: %.2f", super.toString(), costocarrera());
    }
}