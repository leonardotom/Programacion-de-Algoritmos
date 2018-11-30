/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3_17;

import java.util.Calendar;

/**
 *
 * @author leonardo
 */
public class PerfilMedico {

    private String nombre;
    private String apellido;
    private String sexo;
    private double altuta;
    private double peso;
    private int mesNacimiento;
    private int anioNacimiento;
    private int diaNacimiento;
    private int mesActual;
    private int anioActual;
    private int diaActual;
    private double edad;

    public PerfilMedico(String nombre, String apellido, String sexo, double altuta, double peso, int mesNacimiento, int anioNacimiento, int diaNacimiento, int mesActual, int anioActual, int diaActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.altuta = altuta;
        this.peso = peso;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.mesActual = mesActual;
        this.anioActual = anioActual;
        this.diaActual = diaActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltuta() {
        return altuta;
    }

    public void setAltuta(double altuta) {
        this.altuta = altuta;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public double getEdad() {
        double fechaNacimiento = 10000 * anioNacimiento + 100 * mesNacimiento + diaNacimiento; 
        double fechaActual = 10000 * anioActual + 100 * mesActual + diaActual;     
        return (double) ( fechaActual - fechaNacimiento)/10000;
        }

    public void setEdad(int diaActual, int mesActual, int anioActual, int diaNacimiento, int mesNacimiento, int anioNacimiento) {
        this.diaActual = diaActual;
        this.mesActual = mesActual;
        this.anioActual = anioActual;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.edad = edad;
    }
    
    public double getFrecuenciaCardiacaMax() {
        return 220 - getEdad();
    }

    public String toString() {
        return String.format("Nombre: %s\t Apellido: %s\nEdad: %.2f\nFrecuencia Cardiaca maxima: %.2f", getNombre(), getApellido(), getEdad(), getFrecuenciaCardiacaMax());
    }
}
