/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarligaarraylist;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author JMRivera
 */
public class Liga implements IOrdenaArray, Serializable{
  private ArrayList <Equipo> equipos;

  public Liga() {
    this.equipos = new ArrayList<Equipo>();
  }

  @Override
  public void ordenaPor(int opcion) {
    Equipo aux;
    for (int i = 0; i < equipos.size(); i++){
      for (int j = equipos.size()-1; j > i; j--){
          switch(opcion){
              case 1:
                    if (equipos.get(j).mayorQue(equipos.get(j-1), opcion)){
                      aux = equipos.get(j);
                      equipos.set(j,equipos.get(j-1));
                      equipos.set(j-1, aux);
                    }
                  break;
              case 2:
                    if (equipos.get(j).menorQue(equipos.get(j-1), opcion)){
                      aux = equipos.get(j);
                      equipos.set(j,equipos.get(j-1));
                      equipos.set(j-1, aux);
                    }
                  break;
          }
      }
    }
  }
  
  
  public void descenso(){
    System.out.println("Equipos en posición de descenso:");
    for (int i = 17; i < equipos.size(); i++) {
        System.out.println(equipos.get(i).getNombre());
    }
  }

  public void campeon(){
    System.out.println("Equipo líder:");
    System.out.println(equipos.get(0).getNombre());
  }
  
  public int verEquipos(){
    int contador = 0;
    System.out.println("Equipo\t\tP\tPJ\tPG\tPE\tPP\tGF\tGC\tD");
    for (Equipo eq: equipos) {
        System.out.print(++contador+" ");
        eq.verDatos();
      }
    return contador;
  }
  
  public Equipo pedirDatos(){
      Equipo eq = new Equipo(Entrada.leerCadena("Nombre del equipo:"));
      eq.setPartidosGanados(Entrada.leerEntero("Partidos ganados:"));
      eq.setPartidosEmpatados(Entrada.leerEntero("Partidos empatados:"));
      eq.setPartidosPerdidos(Entrada.leerEntero("Partidos perdidos:"));
      eq.setGolesAFavor(Entrada.leerEntero("Goles a favor:"));
      eq.setGolesEnContra(Entrada.leerEntero("Goles en contra:"));
      return eq;
  }

  public void pedirDatos(Equipo eq){
      eq.setNombre(Entrada.leerCadena("Nombre del equipo:"));
      eq.setPartidosGanados(Entrada.leerEntero("Partidos ganados:"));
      eq.setPartidosEmpatados(Entrada.leerEntero("Partidos empatados:"));
      eq.setPartidosPerdidos(Entrada.leerEntero("Partidos perdidos:"));
      eq.setGolesAFavor(Entrada.leerEntero("Goles a favor:"));
      eq.setGolesEnContra(Entrada.leerEntero("Goles en contra:"));
  }

    public ArrayList <Equipo> getEquipos() {
        return equipos;
    }

}
