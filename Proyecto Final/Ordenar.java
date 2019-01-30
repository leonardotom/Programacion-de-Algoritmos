package proyectofinprogramacion;

/**
 *
 * @author Andres Roman
 */
public class Ordenar {
    String nombre;
    int contador;

    public Ordenar(String nombre, int contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    public Ordenar() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return nombre + " con " +contador+ " vehiculos alquilados\n";
    }
    
}
