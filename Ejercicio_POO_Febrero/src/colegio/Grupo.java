/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class Grupo {

    private String nombre;
    Alumno[] alumnos = new Alumno[10];
    private int numeroAlumno;

    public Grupo(String nombre, int numeroAlumno) {

        this.nombre = nombre;
        this.numeroAlumno = numeroAlumno;
    }

    public Grupo() {

        this.nombre = "";
        this.numeroAlumno = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void listadoAlumno() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                System.out.println(alumnos[i].boletin());
            }
        }
    }

    protected boolean insertarAlumno() {
        Scanner t = new Scanner(System.in);

        if (alumnos[numeroAlumno] == null) {
            Alumno alumno = new Alumno();
            alumnos[numeroAlumno] = alumno;
            //se pediran por teclado los datos del alumno que necesita el constructor
            System.out.println("DNI del alumno");
            alumno.setDni(t.nextLine());
            System.out.println("Nomber del alumno");
            alumno.setNombre(t.nextLine());
            System.out.println("Edad del alumno");
            alumno.setEdad(t.nextInt());
            numeroAlumno++;
            return true;
        } else {
            return true;
        }
    }

    protected Alumno buscarAlumno(String nombreAlumno) {
        for (int i = 0; i < numeroAlumno; i++) {
                if (alumnos[i].getNombre().equals(nombreAlumno)) {
                    return alumnos[i];
                } else {
                    return null;
                }
            
        }
        return null;

    }

    protected void evaluar() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null) {
                alumnos[i].rellenarNotas();
            }

        }
    }

    protected double mediaGrupo() {
        double mediaGrupo = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] == null) {
                i++;
            } else {
                if (alumnos[i].notaFinal() >= 0) {
                    mediaGrupo = +alumnos[i].notaFinal();
                } else {
                    return -1;
                }
            }
        }
        return (mediaGrupo / numeroAlumno);

    }

}
