package proyectofinprogramacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import javax.swing.JOptionPane;

/**
 *
 * @author leonardo
 */
public class Principal {

    static ArrayList<ReservaVehiculos> reservas = new ArrayList<ReservaVehiculos>();
    static int contcarrerasTaxi = 0, contcarrerasCamioneta = 0, contcarrerasCamion = 0, contcarrerasDina = 0;
    static int[] ordenXUso = new int[4];
    static double[] ordeXRenta = new double[4];

    public static double llenarreservas() {

        int opcion;
        double sumatotales = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Porfavor digite el número del vehículo que desea alquilar:\n1. Taxi.\n2. Camioneta.\n3. Dina.\n4. Camión.\n"));
        } while (opcion > 4 || opcion < 1);

        switch (opcion) {
            case 1:
                sumatotales = reservartaxi();
                contcarrerasTaxi++;
                ordenXUso[0] = contcarrerasTaxi;
                ordeXRenta[0] += sumatotales;

                break;
            case 2:
                sumatotales = reservarCamioneta();
                contcarrerasCamioneta++;
                ordenXUso[1] = contcarrerasCamioneta;
                ordeXRenta[1] += sumatotales;
                break;
            case 3:
                sumatotales = reservarDina();
                contcarrerasDina++;
                ordenXUso[2] = contcarrerasDina;
                ordeXRenta[2] += sumatotales;
                break;
            case 4:
                sumatotales = reservarCamion();
                contcarrerasCamion++;
                ordenXUso[3] = contcarrerasCamion;
                ordeXRenta[3] += sumatotales;
                break;

        }
        return sumatotales;
    }

    public static double reservartaxi() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        direccion = JOptionPane.showInputDialog("Ingrese la dirección de origen: ");
        direccionfin = JOptionPane.showInputDialog("Ingrese la dirección de destino: ");
        km = Integer.parseInt(JOptionPane.showInputDialog("Distancia en km de el viaje: "));

        Taxi taxi = new Taxi(nombre, direccion, direccionfin, km);
        reservas.add(taxi);

        return taxi.costocarrera();
    }

    public static double reservarCamioneta() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        direccion = JOptionPane.showInputDialog("Ingrese la dirección de origen: ");
        direccionfin = JOptionPane.showInputDialog("Ingrese la dirección de destino: ");
        km = Integer.parseInt(JOptionPane.showInputDialog("Distancia en km de el viaje: "));

        Camioneta camioneta = new Camioneta(nombre, direccion, direccionfin, km);
        reservas.add(camioneta);

        return camioneta.costocarrera();
    }

    public static double reservarDina() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        direccion = JOptionPane.showInputDialog("Ingrese la dirección de origen: ");
        direccionfin = JOptionPane.showInputDialog("Ingrese la dirección de destino: ");
        km = Integer.parseInt(JOptionPane.showInputDialog("Distancia en km de el viaje: "));

        Dina dina = new Dina(nombre, direccion, direccionfin, km);
        reservas.add(dina);

        return dina.costocarrera();
    }

    public static double reservarCamion() {
        String nombre;
        String direccion;
        String direccionfin;
        double km;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        direccion = JOptionPane.showInputDialog("Ingrese la dirección de origen: ");
        direccionfin = JOptionPane.showInputDialog("Ingrese la dirección de destino: ");
        km = Integer.parseInt(JOptionPane.showInputDialog("Distancia en km de el viaje: "));

        Camion camion = new Camion(nombre, direccion, direccionfin, km);
        reservas.add(camion);

        return camion.costocarrera();
    }

    public static void mostrarreservas() {
        for (ReservaVehiculos reserva : reservas) {
            JOptionPane.showMessageDialog(null, reserva.toString());

        }
    }

    public static void topUtilizados() {
        String mensaMasUsad = "El top 4 de los vehículos más rentables es:\n";
        Ordenar o1 = new Ordenar("Taxi", ordenXUso[0]);
        Ordenar o2 = new Ordenar("Camioneta", ordenXUso[1]);
        Ordenar o3 = new Ordenar("Dina", ordenXUso[2]);
        Ordenar o4 = new Ordenar("Camion", ordenXUso[3]);

        ArrayList<Ordenar> ordenar = new ArrayList<>();
        ordenar.add(o1);
        ordenar.add(o2);
        ordenar.add(o3);
        ordenar.add(o4);
        Collections.sort(ordenar, new Ordenamiento());
        String cadena = "";
        for (Ordenar e : ordenar) {
            cadena += e;
            //System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, mensaMasUsad + cadena);
    }

    public static void topRentables() {
        String mensaMasUsad = "El top 4 de los vehículos más usados es:\n";
        OrdenarRentabilida o1 = new OrdenarRentabilida("Taxi", ordeXRenta[0]);
        OrdenarRentabilida o2 = new OrdenarRentabilida("Camioneta", ordeXRenta[1]);
        OrdenarRentabilida o3 = new OrdenarRentabilida("Dina", ordeXRenta[2]);
        OrdenarRentabilida o4 = new OrdenarRentabilida("Camion", ordeXRenta[3]);

        ArrayList<OrdenarRentabilida> ordenar = new ArrayList<>();
        ordenar.add(o1);
        ordenar.add(o2);
        ordenar.add(o3);
        ordenar.add(o4);
        Collections.sort(ordenar, new OrdenamientoRent());
        String cadena = "";
        for (OrdenarRentabilida e : ordenar) {
            cadena += e;
            //System.out.println(e);
        }
        JOptionPane.showMessageDialog(null, mensaMasUsad + cadena);
    }

    public static void main(String[] args) {
        try {
            int contador = 0, preopt;
            double costotal = 0;
            int respuesta;
            Formatter resultados = new Formatter("Reporte.txt");
            resultados.format("Registro de Alquiler de Vehículos\r\n\r\n");

            do {
                do {
                    preopt = Integer.parseInt(JOptionPane.showInputDialog("Porfavor Seleccione una opción:\n"
                            + "1.Para nuevo alquiler.\n"
                            + "2.Para ver top 4 de los mas utilizados.\n"
                            + "3.Para ver top 4 vehículos más rentables.\n"
                            + "4.Presentar reporte.\n"
                            + "5.Salir."));
                    switch (preopt) {
                        case 1:
                            contador++;
                            costotal += llenarreservas();
                            break;
                        case 2:
                            topUtilizados();
                            break;
                        case 3:
                            topRentables();
                            break;
                        case 4:
                            mostrarreservas();
                        case 5:
                            JOptionPane.showMessageDialog(null, "Gracias por usar este programa.");
                            resultados.format("Taxis:\r\nNúmero de vehículos alquilados: %d\r\nTotal de dinero generado por taxis: $%.2f\r\n\r\n"
                                    + "Camionetas:\r\nNúmero de vehículos alquilados: %d\r\nTotal de dinero generado por camionetas: $%.2f\r\n\r\n"
                                    + "Dina:\r\nNúmero de vehículos alquilados: %d\r\nTotal de dinero generado por dinas: $%.2f\r\n\r\n"
                                    + "Camión:\r\nNúmero de vehículos alquilados: %d\r\nTotal de dinero generado por camiones: $%.2f\r\n\r\n"
                                    + "La ganancia total del servicio de alquiler es de : $%.2f", ordenXUso[0], ordeXRenta[0], ordenXUso[1], ordeXRenta[1], ordenXUso[2], ordeXRenta[2], ordenXUso[3], ordeXRenta[3],(ordeXRenta[0]+ordeXRenta[1]+ordeXRenta[2]+ordeXRenta[3]));
                            resultados.close();
                            break;
                    }
                } while (preopt > 4 || preopt < 1);

                int a = JOptionPane.YES_NO_OPTION;
                respuesta = JOptionPane.showConfirmDialog(null, "Desea volver al menu principal:");
            } while (respuesta == 0);

        } catch (Exception e) {
        }
    }
}
