/*
 * Se desea realizar una aplicación que permita a un periodista deportivo llevar las estadísticas de los jugadores de un equipo de fútbol para poder
valorar su actuación en el partido. */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class PruebaEstadistica {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroDorsal = 0;
        int rut;
        int golesMarcados = 0;
        int pasesconExito = 0;
        int balonesRecuperados = 0;
        int equipo [][]= new int [3][11];
        
        
        System.out.println("Ingrese Opción que desea ejecutar:\n"
                + "1. Agregar jugador.\n"
                + "2. Resultado del Equipo.\n"
                + "3. Anotar un gol.\n"
                + "4. Anotar Pase.\n"
                + "5. Anotar Recuperacion de balon.\n");
        int resultado = entrada.nextInt();
        
        switch(resultado){
            case 1:
                System.out.println("Ingrese el nombre del jugador: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese número de jugador: ");
                numeroDorsal = entrada.nextInt();
                System.out.println("Ingrese su rut: ");
                rut = entrada.nextInt();
                System.out.println("Ingrese:\n1. Si es arquero.\n2. si es defensa.\n3. si es atacante.\n");
                int opcion = entrada.nextInt();
                if (opcion == 1){
                    Porteros ptr = new Porteros(nombre, numeroDorsal, rut, 0);
                }
                if (opcion==2){
                    Defensores dfsr = new Defensores(nombre, numeroDorsal, rut, 0, 0, 0);
                }
                if (opcion ==3){
                    Atacantes atct = new Atacantes(nombre, numeroDorsal, rut, 0, 0, 0);
                    
                }else{
                    System.out.println("opcion incorrecta.");
                }
            break;
            
            case 2:
                System.out.println("Resultado final del Equipo es de: ");
                break;
            
            case 3:
                System.out.println("Ingrese numero de camisa de jugador que anoto el gol: ");
                    int jugador = entrada.nextInt();
                    while ( jugador == numeroDorsal){
                        golesMarcados += 1;
                    }
            break;
            
            case 4:
                System.out.println("Ingrese numero de camisa de jugador que dio el pase: ");
                    jugador = entrada.nextInt();
                    while ( jugador == numeroDorsal){
                        pasesconExito += 1;
                    }
            break;
            
            case 5: 
                System.out.println("Ingrese numero de camisa de jugador que recupero el balón: ");
                    jugador = entrada.nextInt();
                    while ( jugador == numeroDorsal){
                        balonesRecuperados += 1;
                    }
            break;              
                                                    
        }
        
    }
    
}
