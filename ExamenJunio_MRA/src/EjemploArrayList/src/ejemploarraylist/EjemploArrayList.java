/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JMRivera
 */
public class EjemploArrayList {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    ArrayList<Alumno> lista = new ArrayList<Alumno>();
    Alumno al;
    int opcion;
    cargarAlumnos(lista);
    do {
      opcion = menu();
      switch (opcion) {
        case 1:
          verArray(lista);
          verArrayNumerado(lista);
          break;
        case 2:
          Collections.sort(lista);
          break;
        case 3:
          al = pedirDatos();
          lista.add(al);
          break;
        case 4:
          al = new Alumno(Entrada.leerCadena("Nombre: "),"",0);
          int i = lista.indexOf(al);
          if (i>0){
            lista.get(i).ver();
            lista.remove(i);
          }
          break;
        default:
      }
    } while (opcion != 0);

  }

  public static void verArray(ArrayList<Alumno> lista) {
    System.out.println("\nAlumno \t\t\t Nota");
    for (Alumno al : lista) {
      al.ver();
    }
  }

  public static void verArrayNumerado(ArrayList<Alumno> lista) {
    System.out.println("\nAlumno \t\t\t Nota");
    for (int i = 0; i <lista.size(); i++) {
      System.out.print(i+"\t");
      lista.get(i).ver();
    }
  }

  public static int menu() {
    int op;
    System.out.println("Menu");
    System.out.println("");
    System.out.println("1.- Ver listado alumnos.");
    System.out.println("2.- Ordenar listado alfabéticamente.");
    System.out.println("3.- Dar de alta un alumno.");
    System.out.println("4.- Dar de baja un alumno.");
    System.out.println("0.- Salir.");
    op = Entrada.leerEntero("\nElija opción:");

    return op;
  }

  public static void cargarAlumnos(ArrayList<Alumno> lista) {
    Alumno al;

    al = new Alumno("Daniel", "Garcia Gonzalez", 5);
    lista.add(al);
    al = new Alumno("Marcos", "Varela Muñoz", 9);
    lista.add(al);
    al = new Alumno("Lucia", "Casado Caballero", 9);
    lista.add(al);
    al = new Alumno("Manuel", "Del Cuvillo Porrua", 7);
    lista.add(al);
    al = new Alumno("Angela", "Borges Cantarino", 8);
    lista.add(al);
    al = new Alumno("Alejandro", "Ruiz Martin", 6);
    lista.add(al);
    al = new Alumno("Jeronimo", "Silva Mulero", 10);
    lista.add(al);
    al = new Alumno("Manuel Alfonso", "Asuero Guerrero", 7);
    lista.add(al);
  }

  private static Alumno pedirDatos() {
    Alumno al = new Alumno();
    al.setNombre(Entrada.leerCadena("Nombre: "));
    al.setApellidos(Entrada.leerCadena("Apellidos: "));
    al.setNota(Entrada.leerDouble("Nota: "));
    return al;
  }

  
}
