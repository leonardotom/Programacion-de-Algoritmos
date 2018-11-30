/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3_13;

/**
 *
 * @author leonardo
 */
public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidadPieza;
    private double precioPieza;
    

    public Factura(String numeroPieza, String descripcionPieza, int cantidadPieza, double precioPieza) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        setCantidadPieza(cantidadPieza);
        setPrecioPieza(precioPieza);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public int getCantidadPieza() {
        return cantidadPieza;
    }

    public void setCantidadPieza(int cantidadPieza) {
        this.cantidadPieza = (cantidadPieza > 0) ? cantidadPieza : 0;
    }

    public double getPrecioPieza() {
        return precioPieza;
    }

    public void setPrecioPieza(double precioPieza) {
        this.precioPieza = (precioPieza > 0) ? precioPieza : 0.0;
    }
    
    public double getMontoFactura(double precio, int cantidad){
        double montofacrura;
        this.precioPieza = precio;
        this.cantidadPieza = cantidad;
        montofacrura = (precio * cantidad);        
        return montofacrura;
    }
    
    @Override
    public String toString(){
        return "Numero de pieza: "+getNumeroPieza()+ "\t\tDescripcion: "+getDescripcionPieza()+ "\nCantidad: "+getCantidadPieza() + "\nPrecio Unitario: " + getPrecioPieza() + "\n\nPrecio Final: " + getMontoFactura(precioPieza, cantidadPieza);
        
    }
    
    
}
