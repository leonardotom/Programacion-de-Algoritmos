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
public class Dina extends ReservaVehiculos{

    private double costocarreraDina = 10.00; 
    
    public Dina(String nombre, String direccion, String drireccionfin, double km) {
        super(nombre, direccion, drireccionfin, km);
    }
    
    
    @Override
     public double costocarrera(){
        if (km >= 4) 
            return costocarreraDina = km*0.75;
        else
            return costocarreraDina;
    }
    
    @Override
    public String toString(){
        return String.format("Alquiler de Dina\n%s\nEl coto de la carrera es de: %.2f", super.toString(), costocarrera());
    }
}
