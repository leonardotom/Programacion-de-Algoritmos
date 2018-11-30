package proyectoalquiler.vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static ArrayList<ReservaVehiculos> reservas = new ArrayList<ReservaVehiculos>();
    static Scanner entrada = new Scanner(System.in);

    public static double llenarreservas() {
        
        int opcion;
        double sumatotales = 0;

        do {
            System.out.println("Porfavor digite el número del vehículo que desea alquilar: ");
            System.out.println("1. Taxi.\n2. Camioneta.\n3. Dina.\n4. Camión.\n");
            opcion = entrada.nextInt();
            entrada.nextLine();
        } while (opcion > 5 || opcion < 1);

        switch (opcion) {
            case 1:
                sumatotales = reservartaxi();
                break;
            case 2:
                sumatotales = reservarCamioneta();
                break;
            case 3:
                sumatotales = reservarDina();
                break;
            case 4:
                sumatotales = reservarCamion();
                break;

        }

        return sumatotales;
    }

    public static double reservartaxi() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección de origen: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese la dirección de destino: ");
        direccionfin = entrada.nextLine();
        System.out.println("Distancia en km de el viaje: ");
        km = entrada.nextDouble();

        Taxi taxi = new Taxi(km, nombre, direccion, direccionfin);
        reservas.add(taxi);

        return taxi.costocarrera();
    }

    public static double reservarCamioneta() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección de origen: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese la dirección de destino: ");
        direccionfin = entrada.nextLine();
        System.out.println("Distancia en km de el viaje: ");
        km = entrada.nextDouble();

        Camioneta camioneta = new Camioneta(km, nombre, direccion, direccionfin);
        reservas.add(camioneta);

        return camioneta.costocarrera();
    }

    public static double reservarDina() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección de origen: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese la dirección de destino: ");
        direccionfin = entrada.nextLine();
        System.out.println("Distancia en km de el viaje: ");
        km = entrada.nextDouble();

        Dina dina = new Dina(km, nombre, direccion, direccionfin);
        reservas.add(dina);

        return dina.costocarrera();
    }

    public static double reservarCamion() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la dirección de origen: ");
        direccion = entrada.nextLine();
        System.out.println("Ingrese la dirección de destino: ");
        direccionfin = entrada.nextLine();
        System.out.println("Distancia en km de el viaje: ");
        km = entrada.nextDouble();

        Camion camion = new Camion(km, nombre, direccion, direccionfin);
        reservas.add(camion);

        return camion.costocarrera();
    }

    public static void mostrarreservas() {
        for (ReservaVehiculos reserva : reservas) {
            System.out.println(reserva.toString());
            System.out.println("\n-----------------------------");
        }
    }

    public static void main(String[] args) {
        int contador = 0;
        double costotal = 0;
        Scanner entrada = new Scanner(System.in);
        String respuesta;
        do{
            contador ++;
            costotal += llenarreservas();
            
            entrada.nextLine();
            System.out.println("Desea realizar otra reserva: ");
            respuesta = entrada.nextLine();
            System.out.println("");
            
        } while (respuesta.equals("si") || respuesta.equals("SI") || respuesta.equals("Si"));
        mostrarreservas();
        System.out.printf("-----------------------------"
                + "\nEl total de vehículos alquilados es de: %d\nEl total de ganancias es: %.2f\n", contador,costotal);
    }

}
