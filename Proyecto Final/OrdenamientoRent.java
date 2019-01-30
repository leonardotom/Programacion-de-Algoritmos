/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinprogramacion;
import java.util.Comparator;

/**
 *
 * @author leonardo
 */
public class OrdenamientoRent implements Comparator<OrdenarRentabilida>{
    @Override
    public int compare(OrdenarRentabilida c1, OrdenarRentabilida c2){
        // atributos de los objetos
        double n1 = c1.getContador();
        double n2 = c2.getContador();
        // descendente
        return new Double(n2).compareTo(new Double(n1));
    }

    
}
