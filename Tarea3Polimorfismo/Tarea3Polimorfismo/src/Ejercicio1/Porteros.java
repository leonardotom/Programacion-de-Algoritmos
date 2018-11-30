/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author leonardo
 */
public class Porteros extends EstadisticaJugadores{
    
    public Porteros(String nombre, int numeroDorsal, int rut, int atajadas) {
        super(nombre, numeroDorsal, rut, atajadas);
    }

    public int ValoracionGoles(){
        return super.ValoracionGoles() + this.atajadas*5;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDorsal() {
        return numeroDorsal;
    }

    public void setNumeroDorsal(int numeroDorsal) {
        this.numeroDorsal = numeroDorsal;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }
    
    public String toString(){
    return String.format("----------ESTADISTICA JUGADORES---------\nInformación jugador\nNombre: %s.\tNúmero Dorsal: %d.\tRut:%d.\n"
            + "Estadisticas:\nTiros Atajados: %d\n\nPUNTAJE FINAL: %d\n", getNombre(), getNumeroDorsal(), getRut(), getAtajadas(), ValoracionGoles());
    }
    
}
