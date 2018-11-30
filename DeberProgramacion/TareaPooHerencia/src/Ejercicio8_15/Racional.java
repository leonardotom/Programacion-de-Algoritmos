/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8_15;

import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class Racional {

    int numerador;
    int denominador;
    Scanner entrada = new Scanner(System.in);

    public Racional() {
        numerador = 0;
        denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public String toString() {
        return String.format("%d/%d\n", numerador, denominador);
    }

    public Racional suma(Racional rn1, Racional rn2) {
        int a = rn1.numerador;
        int b = rn1.denominador;
        int c = rn2.numerador;
        int d = rn2.denominador;
        this.setNumerador((a * d) + (b * c));
        this.setDenominador(b * d);
        return this;
    }

    public Racional resta(Racional rn1, Racional rn2) {
        int a = rn1.numerador;
        int b = rn1.denominador;
        int c = rn2.numerador;
        int d = rn2.denominador;
        this.setNumerador((a * d) - (b * c));
        this.setDenominador(b * d);
        return this;
    }

    public Racional multiplicacion(Racional rn1, Racional rn2) {
        int a = rn1.numerador;
        int b = rn1.denominador;
        int c = rn2.numerador;
        int d = rn2.denominador;
        this.setNumerador(a * c);
        this.setDenominador(b * d);
        return this;
    }

    public Racional division(Racional rn1, Racional rn2) {
        int a = rn1.numerador;
        int b = rn1.denominador;
        int c = rn2.numerador;
        int d = rn2.denominador;
        this.setNumerador(a * d);
        this.setDenominador(b * c);
        return this;
    }

    public String divisionEntera(Racional rn1, Racional rn2) {
        int a = rn1.numerador;
        int b = rn1.denominador;
        int c = rn2.numerador;
        int d = rn2.denominador;
        double divisionEntera = (a * d) / (b * c);
        System.out.println("Ingrese el numero de decimales que desea imprimir");
        int presicion = entrada.nextInt();
        return String.format("División entera: %.2f", divisionEntera);
    }

}
