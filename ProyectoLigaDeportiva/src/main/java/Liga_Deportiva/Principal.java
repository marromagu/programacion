/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Liga_Deportiva;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Liga miLiga = new Liga();
        miLiga.leerEquipos();
        Equipo miEquipo;
        String clave;
        int op, opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    miEquipo = new Equipo();
                    miLiga.añadirEquipo(miEquipo);
                    break;
                case 2:
                    
                    System.out.println("Escribe una clave del equipo a borrar");
                    clave= teclado.nextLine();
                    miLiga.borrarEquipo(clave);
                    break;
                case 3:
                    String nombre;
                    String pais;
                    System.out.println("Escribe una clave del equipo a modificar");
                    clave= teclado.nextLine();
                    System.out.println("Nuevo nombre");
                    nombre=teclado.nextLine();
                    System.out.println("Pais");
                    pais=teclado.nextLine();
                    miLiga.modifiarEquipo(nombre, clave, pais);
                    break;
                case 4:
                    miLiga.leerJornada();
                    break;
                case 5:
                    miLiga.verClasificacion();
                    break;
                
                default:
            }
            opcion = menu();
        }
    }

    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int op;
        System.out.println("");
        System.out.println("1.- Inserción.");
        System.out.println("2.- Borrado.");
        System.out.println("3.- Modificación.");
        System.out.println("4.- Carga de los partidos de una jornada.");
        System.out.println("5.- Ver clasificacion.");
        System.out.println("0.- Salir.");
        System.out.print("\nElija opción:");
        try {
            op = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            op = 100;
        }

        return op;
    }

}
