/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjunio;

/**
 *
 * @author JMRivera
 */
public class Laboral extends Personal{

    private String categoria;
    private String turno;

    public Laboral(String categoria, String turno, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        this.categoria = categoria;
        this.turno = turno;
    }

    @Override
    public double salario() {
        return 1000.0;
    }

    @Override
    public double complemento() {
        double compl = 0;
        if (categoria.compareTo("Administrativo") == 0) {
            compl = 300.0;
        }
        if (categoria.compareTo("Ordenanza") == 0) {
            compl = 200.0;
        }
        if (categoria.compareTo("Limpieza") == 0) {
            compl = 100.0;
        }
        return compl;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void verDatos() {
        System.out.println(categoria + " " + turno);
        super.verDatos();
    }

}
