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
public class Defensores extends EstadisticaJugadores{
    
    public Defensores(String nombre, int numeroDorsal, int rut, int golesMarcador, int pasesconExito, int baloresRecuperados) {
        super(nombre, numeroDorsal, rut, golesMarcador, pasesconExito, baloresRecuperados);
    }
    
    public int ValoracionGoles(){
        return super.ValoracionGoles() + this.pasesconExito + this.baloresRecuperados*4;
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

    public int getGolesMarcador() {
        return golesMarcador;
    }

    public void setGolesMarcador(int golesMarcador) {
        this.golesMarcador = golesMarcador;
    }

    public int getPasesconExito() {
        return pasesconExito;
    }

    public void setPasesconExito(int pasesconExito) {
        this.pasesconExito = pasesconExito;
    }

    public int getBaloresRecuperados() {
        return baloresRecuperados;
    }

    public void setBaloresRecuperados(int baloresRecuperados) {
        this.baloresRecuperados = baloresRecuperados;
    }
    
    public String toString(){
    return String.format("----------ESTADISTICA JUGADORES---------\nInformación jugador\nNombre: %s.\tNúmero Dorsal: %d.\tRut:%d.\n"
            + "Estadisticas:\nGoles Marcados: %d\nPases con exito: %d\nBalones recuperados: %d\n\nPUNTAJE FINAL: %d\n", getNombre(), getNumeroDorsal(), getRut(), getGolesMarcador(), getPasesconExito(), getBaloresRecuperados(), ValoracionGoles());
    }
    
    
}
