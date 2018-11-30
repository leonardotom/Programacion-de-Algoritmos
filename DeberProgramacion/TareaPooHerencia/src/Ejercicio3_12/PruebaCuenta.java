/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3_12;

import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cuenta cuenta1 = new Cuenta(50.00);
    Cuenta cuenta2 = new Cuenta(-7.53);
    
        System.out.printf("Sando de cuenta1: $%.2f\n", cuenta1.getSaldo());
        System.out.printf("Sando de cuenta2: $%.2f\n", cuenta2.getSaldo());
    Scanner entrada = new Scanner(System.in);
    
    double montoDeposito;
    double montoRetiro;
        System.out.println("Escriba el monto a depositar para cuanta1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nsumando $%.2f al sando de cuanta1\n\n", montoDeposito);
        cuenta1.abonar(montoDeposito);
        
        //mostramos los saldos
        System.out.printf("Saldo cuenta1: $%.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: $%.2f\n",cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a depositar para cuanta2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\nsumando $%.2f al sando de cuanta1\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito);
        
        //mostramos los saldos
        System.out.printf("Saldo cuenta1: $%.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: $%.2f\n",cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a retirar de cuanta1: ");
        montoRetiro = entrada.nextDouble();
        System.out.printf("\nrestando $%.2f al sando de cuanta1\n\n", montoRetiro);
        cuenta1.cargar(montoRetiro);
        
        //mostramos los saldos
        System.out.printf("Saldo cuenta1: $%.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: $%.2f\n",cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a retirar de cuanta2: ");
        montoRetiro = entrada.nextDouble();
        System.out.printf("\nrestando $%.2f al sando de cuanta2\n\n", montoRetiro);
        cuenta2.cargar(montoRetiro);
        
        System.out.printf("Saldo cuenta1: $%.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo cuenta2: $%.2f\n",cuenta2.getSaldo());
        
    }
}
