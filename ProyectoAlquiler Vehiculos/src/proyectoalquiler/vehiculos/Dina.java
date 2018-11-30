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
public class Dina extends ReservaVehiculos{
    private double km;

    public Dina(double km, String nombre, String direccion, String drireccionfin) {
        super(nombre, direccion, drireccionfin);
        this.km = km;
    }

    public double getKm() {
        return km;
    }
    
     public double costocarrera(){
        double costocarrera;
        if (km >= 4) 
            costocarrera = km*0.75;
        else
            costocarrera = 10.00;
        return costocarrera;
    }
    
    @Override
    public String toString(){
        return String.format("Alquiler de Dina\n%s\nEl coto de la carrera es de: %.2f", super.toString(), costocarrera());
    }
}
