/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjunio;

/**
 *
 * @author JMRivera
 */
public abstract class Profesor extends Personal {

    private String especialidad;
    private String puesto;

    public Profesor(String especialidad, String puesto, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
        super(nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        this.especialidad = especialidad;
        this.puesto = puesto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public double complemento() {
        double compl = 0;
        if (puesto.compareTo("Director") == 0) {
            compl = 800.0;
        }
        if (puesto.compareTo("Jefe de Estudios") == 0 || puesto.compareTo("Vicedirector") == 0 || puesto.compareTo("Secretario") == 0) {
            compl = 400.0;
        }
        if (puesto.compareTo("Jefe de Departamento") == 0) {
            compl = 50.0;
        }
        if (puesto.compareTo("Tutor") == 0) {
            compl = 25.0;
        }
        return compl;
    }

    @Override
    public double salario() {
        return 1800.0;
    }

    @Override
    public void verDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append(especialidad);
        sb.append("\t").append(puesto);
        System.out.println(sb.toString());
        super.verDatos();
    }

}
