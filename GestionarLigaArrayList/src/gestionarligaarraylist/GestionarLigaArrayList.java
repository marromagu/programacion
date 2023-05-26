/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionarligaarraylist;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;

/**
 *
 * @author jmrivera
 */
public class GestionarLigaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Liga miLiga = leerLigaDeFichero();
        int opcion;

        if (miLiga == null) {
            miLiga = new Liga();
        }else{
            Collections.sort(miLiga.getEquipos());
        }

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    guardarLigaEnFichero(miLiga);
                    break;
                case 2:
                    miLiga = leerLigaDeFichero();
                    break;
                case 3:
                    miLiga.verEquipos();
                    break;
                case 4:
                    int orden = Entrada.leerEntero("\nOrdenar por:\n 1.- Puntos.\n 2.- Nombres equipos.");
                    miLiga.ordenaPor(orden);
                    miLiga.verEquipos();
                    break;
                case 5:
                    if (miLiga.getEquipos().size() < 20) {
                        Equipo unEquipo = miLiga.pedirDatos();
                        miLiga.getEquipos().add(unEquipo);
                    } else {
                        System.out.println("Liga completa.");
                    }
                    break;
                case 6:
                    int posicion = Entrada.leerEntero("Posicion del equipo a modificar:") - 1;
                    Equipo unEquipo = miLiga.getEquipos().get(posicion);
                    unEquipo.verDatos();
                    miLiga.pedirDatos(unEquipo);
                    miLiga.getEquipos().set(posicion, unEquipo);
                    break;
                case 7:
                    miLiga.campeon();
                    break;
                case 8:
                    miLiga.descenso();
                    break;
            }
        } while (opcion != 0);
    }

    public static int menu() {
        int op;
        System.out.println("\nMenu");
        System.out.println("");
        System.out.println("1.- Guardar los datos de la liga en un fichero.");
        System.out.println("2.- Recuperar los datos de la liga de un fichero.");
        System.out.println("3.- Mostrar todos los equipos.");
        System.out.println("4.- Ordenar los equipos: por puntos o por orden alfabético.");
        System.out.println("5.- Insertar un equipo.");
        System.out.println("6.- Modificar los datos de un equipo.");
        System.out.println("7.- Ver los datos del equipo que va campeón.");
        System.out.println("8.- Ver los datos de los equipos que descienden.");
        System.out.println("0.- Salir.");
        op = Entrada.leerEntero("\nElija opción:");

        return op;
    }

    public static void guardarLigaEnFichero(Liga liga) {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Liga.dat");
            salida = new ObjectOutputStream(fichero);
            salida.writeObject(liga);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fichero.close();
                salida.close();
            } catch (IOException e) {
            }
        }
    }

    public static Liga leerLigaDeFichero() {
        FileInputStream fichero = null;
        ObjectInputStream entrada = null;
        Liga liga = null;
        try {
            fichero = new FileInputStream("Liga.dat");
            entrada = new ObjectInputStream(fichero);
            liga = (Liga) entrada.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            //
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
            }
        }
        return liga;
    }

}
