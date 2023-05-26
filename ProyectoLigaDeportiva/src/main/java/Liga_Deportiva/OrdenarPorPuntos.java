/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Liga_Deportiva;

import java.util.Comparator;

/**
 *
 * @author mario
 */
public class OrdenarPorPuntos implements Comparator<Equipo>{

    @Override
    public int compare(Equipo o1, Equipo o2) {
        return o1.compareTo(o2);
    }
    
}
