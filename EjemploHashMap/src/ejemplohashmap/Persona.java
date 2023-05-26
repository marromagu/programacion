/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohashmap;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author JMRivera
 */
public class Persona implements Serializable, Comparable<Persona>{
  private String nombre;
  private String apellidos;
  private int telefono;
  private String email;

  public Persona(String nombre, String apellidos, int telefono, String email) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.email = email;
  }

  public Persona() {
    this.nombre = Entrada.leerCadena("Nombre:");
    this.apellidos =  Entrada.leerCadena("Apellidos:");
    this.telefono =  Entrada.leerEntero("Telefono:");
    this.email =  Entrada.leerCadena("email:");
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(apellidos).append(", ");
    sb.append(nombre).append("\t");
    sb.append(telefono).append("\t");
    sb.append(email);
    return sb.toString();
  }

  @Override
  public int hashCode() {
    return this.telefono;
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
    final Persona other = (Persona) obj;
    return Objects.equals(this.email, other.email);
  }

  @Override
  public int compareTo(Persona o) {
    int compara;
    compara = this.apellidos.compareTo(o.getApellidos());
    if (compara == 0){
      compara = this.nombre.compareTo(o.getNombre());
    }
    return compara;
  }
  
  
  
}
