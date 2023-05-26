/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionarligaarraylist;

import java.io.Serializable;

/**
 *
 * @author JMRivera
 */
public class Equipo implements IComparable, Serializable, Comparable<Equipo>{
  private String nombre;
  private int partidosGanados;
  private int partidosEmpatados;
  private int partidosPerdidos;
  private int golesAFavor;
  private int golesEnContra;

  public Equipo(String nombre) {
    this.nombre = nombre;
    this.partidosGanados = 0;
    this.partidosEmpatados = 0;
    this.partidosPerdidos = 0;
    this.golesAFavor = 0;
    this.golesEnContra = 0;
  }

  public int getGolesEnContra() {
    return golesEnContra;
  }

  public void setGolesEnContra(int golesEnContra) {
    this.golesEnContra = golesEnContra;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre != ""){  
        this.nombre = nombre;
    }
  }

  public int getPartidosGanados() {
    return partidosGanados;
  }

  public void setPartidosGanados(int partidosGanados) {
    this.partidosGanados = partidosGanados;
  }

  public int getPartidosEmpatados() {
    return partidosEmpatados;
  }

  public void setPartidosEmpatados(int partidosEmpatados) {
    this.partidosEmpatados = partidosEmpatados;
  }

  public int getPartidosPerdidos() {
    return partidosPerdidos;
  }

  public void setPartidosPerdidos(int partidosPerdidos) {
    this.partidosPerdidos = partidosPerdidos;
  }

  public int getGolesAFavor() {
    return golesAFavor;
  }

  public void setGolesAFavor(int golesAFavor) {
    this.golesAFavor = golesAFavor;
  }

  public int puntos() {
    return partidosGanados*3+partidosEmpatados;
  }
  
  public int diferenciaDeGoles(){
    return golesAFavor-golesEnContra;
  }
  
  public int partidosJugados(){
    return partidosGanados + partidosEmpatados + partidosPerdidos;
  }
  
  @Override
  public boolean menorQue(IComparable otroObjeto, int opcion) {
    boolean estado;
    Equipo otroEquipo = (Equipo) otroObjeto;
    switch (opcion) {
      case 1:
        estado = this.puntos() < otroEquipo.puntos();
        break;
      case 2:
        estado = this.getNombre().compareTo(otroEquipo.getNombre()) < 0;
        break;
      default:
        estado = false;
    }
    return estado;
  }

  @Override
  public boolean mayorQue(IComparable otroObjeto, int opcion) {
    boolean estado;
    Equipo otroEquipo = (Equipo) otroObjeto;
    switch (opcion) {
      case 1:
        estado = this.puntos() > otroEquipo.puntos();
        break;
      case 2:
        estado = this.getNombre().compareTo(otroEquipo.getNombre()) > 0;
        break;
      default:
        estado = false;
    }
    return estado;
  }

  @Override
  public boolean igualQue(IComparable otroObjeto, int opcion) {
    boolean estado;
    Equipo otroEquipo = (Equipo) otroObjeto;
    switch (opcion) {
      case 1:
        estado = this.puntos() == otroEquipo.puntos();
        break;
      case 2:
        estado = this.getNombre().compareTo(otroEquipo.getNombre()) == 0;
        break;
      default:
        estado = false;
    }
    return estado;
  }

  public void verDatos(){
    StringBuilder sb = new StringBuilder();
    sb.append(nombre);
    sb.append("\t").append(puntos());
    sb.append("\t").append(partidosJugados());
    sb.append("\t").append(partidosGanados);
    sb.append("\t").append(partidosEmpatados);
    sb.append("\t").append(partidosPerdidos);
    sb.append("\t").append(golesAFavor);
    sb.append("\t").append(golesEnContra);
    sb.append("\t").append(diferenciaDeGoles());
    System.out.println(sb.toString());
  }

    @Override
    public int compareTo(Equipo otro) {
        return (this.nombre).compareTo(otro.getNombre());
    }
}
