/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colegio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Grupo grupo = new Grupo();
        int opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    consultarModificarGrupo(teclado, grupo);
                    break;
                case 2:
                    grupo.listadoAlumno();
                    break;
                case 3:
                    grupo.insertarAlumno();
                    break;
                case 4:
                    grupo.evaluar();
                    break;
                case 5:
                    System.out.println(grupo.mediaGrupo());
                    break;
                case 6:
                    System.out.println("Dime el nombre de un alumno para buscar");
                    String nombre = teclado.nextLine();
                    if (grupo.buscarAlumno(nombre) != null) {
                        System.out.println(grupo.buscarAlumno(nombre).boletin());

                        System.out.println("Desea modificar los datos s/n");
                        String respuesta = teclado.nextLine();
                        switch (respuesta) {
                            case "s":
                                System.out.println("Nota 1º");
                                grupo.buscarAlumno(nombre).setNota1(teclado.nextInt());
                                System.out.println("Nota 2º");
                                grupo.buscarAlumno(nombre).setNota2(teclado.nextInt());
                                System.out.println("Nota 3º");
                                grupo.buscarAlumno(nombre).setNota3(teclado.nextInt());
                                break;
                            case "n":
                                System.out.println("OK");
                                break;
                            default://Nada que hacer
                        }
                    }

                    break;
            }
            esperar();
            opcion = menu();
        }
    }

    /**
     * Método que muestra el menú y devuelve la opción elegida por el usuario
     *
     * @return
     */
    public static int menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("COLEGIO");
        System.out.println("-------");
        System.out.println("1. Consultar/Modificar nombre del grupo");
        System.out.println("2. Listado de alumnos del grupo");
        System.out.println("3. Matricular un alumno");
        System.out.println("4. Evaluar todos los alumnos (nota aleatoria)");
        System.out.println("5. Ver nota media del grupo");
        System.out.println("6. Buscar un alumno por su nombre/ cambiar nota");
        System.out.println("0. Salir");
        System.out.print("\n¿Opción?: ");
        try {
            opcion = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            opcion = 100;
        }
        return opcion;
    }

    /**
     * Método que espera pulsar intro para continuar
     */
    public static void esperar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulse intro para continuar...");
        teclado.nextLine();
    }

    public static void consultarModificarGrupo(Scanner t, Grupo grupo) {
        System.out.println(grupo.getNombre());
        System.out.println("Desea modificar los datos s/n");
        String respuesta = t.nextLine();
        switch (respuesta) {
            case "s":
                System.out.println("Nuevo nombre de grupo");
                grupo.setNombre(t.nextLine());

                break;
            case "n":
                System.out.println("OK");
                break;
            default://Nada que hacer
            }
    }

}
