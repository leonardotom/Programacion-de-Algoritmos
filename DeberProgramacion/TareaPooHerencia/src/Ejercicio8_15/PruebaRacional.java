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
public class PruebaRacional {
    public static void main(String[] args) {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        Racional rn1 = new Racional(1, 2);
        Racional rn2 = new Racional(2, 5);
        Racional obj1 = new Racional();
        
        System.out.println("Fraccion 1: "+ rn1);
        System.out.println("Fraccion 2: "+ rn2);
        System.out.println("Ingrese la Opcion que desea ejecutar:\n1. Suma.\n2. Resta.\n3. Multiplicación.\n4. División en fracción.\n5. Division entera.\n");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Suma: "+ obj1.suma(rn1, rn2));
                break;
            case 2:
                System.out.println("Resta: "+obj1.resta(rn1, rn2));
                break;
            case 3:
                System.out.println("Multiplicación: "+obj1.multiplicacion(rn1, rn2));
                break;
            case 4: 
                System.out.println("División Racional: "+obj1.division(rn1, rn2));
                break;
            case 5:
                
                System.out.println("División Entera: "+obj1.divisionEntera(rn1, rn2));
                break;
        }
                
        
        
        
        
    }
    
    
   
}
