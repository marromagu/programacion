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
public class ordenarPorNrp implements Comparator<Personal>{
    @Override
    public int compare(Personal o1, Personal o2) {
        return o1.getNrp().compareTo(o2.getNrp());
    }
        
}
