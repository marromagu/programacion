/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colegio;

/**
 *
 * @author DAM_T
 */
public class Alumno {

    //Atributos de la clase
    private String dni;
    private String nombre;
    private int edad;
    private int nota1;
    private int nota2;
    private int nota3;

    public Alumno(String dni, String nombre, int edad, int nota1, int nota2, int nota3) {
        //constructor por defecto
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Alumno() {
        //Constructor por parametros
        this("", "", 0, -1, -1, -1);
        //-1 para indicar q no essta evaluado
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        if (nota1 >= 0) {
            this.nota1 = nota1;
        }
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        if (nota2 >= 0) {
            this.nota2 = nota2;
        }
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        if (nota3 >= 0) {
            this.nota3 = nota3;
        }

    }

    protected double notaFinal() {
        double notaFinal = -1;
        if ((nota1 < 0) || (nota2 < 0) || (nota3 < 0)) {
            return notaFinal;
        } else {
            notaFinal = (nota1 + nota2 + nota3) / 3;

            return notaFinal;
        }
    }

    public String boletin() {
        return "Alumno " + "DNI: " + dni + ", Nombre: " + nombre + ", Edad: " + edad + ", Nota 1º: " + nota1 + ", Nota 2º: " + nota2 + ", Nota 3º: " + nota3 + " Nota Final: " + notaFinal();
    }

    protected void rellenarNotas() {
        this.nota1 = (int) (Math.random() * 11);
        this.nota2 = (int) (Math.random() * 11);
        this.nota3 = (int) (Math.random() * 11);
    }
}
