/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjunio;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author JMRivera
 */
public abstract class Personal implements Serializable{

    private String nrp;
    private String nombre;
    private Fecha fechaIngreso;
    private Fecha fechaNacimiento;
    private int telefono;
    
    public Personal(String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        this.nrp = nrp;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }
    
    public void verDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("NRP: ").append(nrp);
        sb.append(" ").append(nombre);
        sb.append("\n").append(fechaIngreso);
        sb.append(" ").append(fechaNacimiento);
        sb.append(" tlf: ").append(telefono).append("\n");
        System.out.println(sb.toString());
    }

    /**
     *
     * @return devuelve el salario del empleado
     */
    public abstract double salario();

    /**
     *
     * @return devuelve el complemento del empleado
     */
    public abstract double complemento();
    
    public String getNrp() {
        return nrp;
    }
    
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }
    
    public void setFechaIngreso(Fecha fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
