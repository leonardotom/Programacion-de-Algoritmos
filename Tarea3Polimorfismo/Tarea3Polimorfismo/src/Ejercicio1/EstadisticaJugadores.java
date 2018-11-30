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
public abstract class EstadisticaJugadores {

    protected String nombre;
    protected int numeroDorsal;
    protected int rut;
    protected int golesMarcador;
    protected int pasesconExito;
    protected int baloresRecuperados;
    protected int valoracionGoles;
    protected int atajadas;
    
    public EstadisticaJugadores(String nombre, int numeroDorsal, int rut, int golesMarcador, int pasesconExito, int baloresRecuperados) {
        this.nombre = nombre;
        this.numeroDorsal = numeroDorsal;
        this.rut = rut;
        this.golesMarcador = golesMarcador;
        this.pasesconExito = pasesconExito;
        this.baloresRecuperados = baloresRecuperados;
    }

    public EstadisticaJugadores(String nombre, int numeroDorsal, int rut, int atajadas) {
        this.nombre = nombre;
        this.numeroDorsal = numeroDorsal;
        this.rut = rut;
        this.atajadas = atajadas;
    }

   
    public int ValoracionGoles(){
        return golesMarcador*30;
    }
    
    
    
    
}
