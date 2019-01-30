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
public class Camion extends ReservaVehiculos{

    private double costocarreraCamion = 20.00;
    
    public Camion(String nombre, String direccion, String drireccionfin, double km) {
        super(nombre, direccion, drireccionfin, km);
    }
    
    @Override
     public double costocarrera(){
        if (km >= 4) 
            return costocarreraCamion = km*1.10;
        else
            return costocarreraCamion;
    }
    
    @Override
    public String toString(){
        return String.format("Alquiler de Camión\n%s\nEl coto de la carrera es de: %.2f", super.toString(), costocarrera());
    }
}
