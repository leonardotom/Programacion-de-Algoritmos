/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3_14;

/**
 *
 * @author leonardo
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private double salariomensual;

    
    public Empleado(String nombre, String apellido, double salariomensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        setSalarioMensual(salariomensual);
        setSalarioAnual(salariomensual);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioMensual() {
        return salariomensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(double salariomensual) {
        this.salariomensual = (salariomensual > 0) ? salariomensual : 0.0;

    }

    public double getSalarioAnual() {
        double salarioAnual;
        double aumento;
        salarioAnual = (salariomensual * 12);
        aumento = salarioAnual * 0.10;
        salarioAnual += aumento;
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        
       // this.salarioAnual = salarioAnual;
    }
}
