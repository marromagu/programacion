/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjunio;

import java.util.Comparator;

/**
 *
 * @author jmrc
 */
public class ordenarPorNombre implements Comparator<Personal>{

    @Override
    public int compare(Personal o1, Personal o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
    
}
