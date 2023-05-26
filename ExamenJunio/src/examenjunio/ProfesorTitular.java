/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjunio;

/**
 *
 * @author JMRivera
 */
public class ProfesorTitular extends Profesor{  
  private boolean conDestino;

  public ProfesorTitular(boolean conDestino, String especialidad, String puesto, String nrp, String nombre, Fecha fechaIngreso, Fecha fechaNacimiento, int telefono) {
    super(especialidad, puesto, nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
    this.conDestino = conDestino;
  }

  public boolean isConDestino() {
    return conDestino;
  }

  public void setConDestino(boolean conDestino) {
    this.conDestino = conDestino;
  }
  
  @Override
  public double salario() {
    return super.salario() + 300.0;
  }

  @Override
  public double complemento() {
    double compl;
    Fecha f = new Fecha(1,1,2000);
    f.setHoy();
    int trienios = this.getFechaIngreso().trienios(f);
    compl = super.complemento() + 50.0 * trienios + (conDestino?300:0);
    return compl;
  }

    @Override
    public void verDatos() {
        System.out.println("Profesor titular " + (conDestino ? "con destino" : ""));
        super.verDatos();
    }

}
