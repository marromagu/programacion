/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploarraylist;


import java.util.Objects;

/**
 *
 * @author JMRivera
 */
public class Alumno implements Comparable<Alumno>{
  private String nombre;
  private String apellidos;
  private double nota;

  public Alumno(String nombre, String apellidos, double nota) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.nota = nota;
  }
  
  public Alumno() {
    this.nombre = "";
    this.apellidos = "";
    this.nota = 0;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre != ""){
      this.nombre = nombre;
    }
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    if (apellidos != ""){
      this.apellidos = apellidos;
    }  
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    if (nota >= 0 && nota<=10){
      this.nota = nota;
    }
  }
  
  public void ver(){
    System.out.println(apellidos+", "+nombre+"\t"+nota);
  }

  @Override
  public int compareTo(Alumno o) {
    int compara = this.apellidos.compareTo(o.getApellidos());
    if ( compara == 0){
      return this.nombre.compareTo(o.getNombre());
    }
    return compara;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.nombre);
    hash = 97 * hash + Objects.hashCode(this.apellidos);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Alumno other = (Alumno) obj;

    return Objects.equals(this.nombre, other.nombre);
  }

  
}
