
package proyectofinprogramacion;
import java.util.Comparator;
/**
 *
 * @author Andres Roman
 */
public class Ordenamiento implements Comparator<Ordenar>{
    @Override
    public int compare(Ordenar c1, Ordenar c2){
        // atributos de los objetos
        int n1 = c1.getContador();
        int n2 = c2.getContador();
        // descendente
        return new Integer(n2).compareTo(new Integer(n1));
    }

}