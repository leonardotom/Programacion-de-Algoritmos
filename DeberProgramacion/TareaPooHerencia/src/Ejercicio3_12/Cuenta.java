/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3_12;

/**
 *
 * @author leonardo
 */
public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial > 0.0) {
            saldo = saldoInicial;
        }
    }

    public void abonar(double monto) {
        saldo = saldo + monto;
    }

    public void cargar(double monto) {
        if (monto > saldo)
            System.out.println("El monto a cargar excede el saldo de la cuenta\n");
        else
            saldo = saldo - monto;
    }

    public double getSaldo() {
        return saldo;
    }

}
