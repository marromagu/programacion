/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenjunio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author JMRivera
 */
public class Instituto {

    private String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private ArrayList<Personal> plantilla;

    public Instituto(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.plantilla = new ArrayList<Personal>();
    }

    public ArrayList<Personal> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Personal> plantilla) {
        this.plantilla = plantilla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Personal buscarEmpleado(String nrp) {
        for (Personal p : plantilla) {
            if (p.getNrp().compareTo(nrp) == 0) {
                return p;
            }
        }
        return null;
    }

    public Personal buscarEmpleado(int telefono) {
        for (Personal p : plantilla) {
            if (p.getTelefono() == telefono) {
                return p;
            }
        }
        return null;
    }

    public Personal director() {
        for (Personal p : plantilla) {
            if (p instanceof Profesor) {
                if (((Profesor) p).getPuesto().compareTo("Director") == 0) {
                    return p;
                }
            }
        }
        return null;
    }

    public void verLaborales() {
        System.out.println("\nListado de laborales");
        System.out.println("--------------------");
        for (Personal p : plantilla) {
            if (p instanceof Laboral) {
                p.verDatos();
            }
        }
    }

    public void verProfesores() {
        System.out.println("\nListado de profesores");
        System.out.println("---------------------");
        for (Personal p : plantilla) {
            if (p instanceof Profesor) {
                p.verDatos();
            }
        }
    }

    public void verPersonal() {
        System.out.println("\nListado de personal");
        System.out.println("-------------------");
        for (Personal p : plantilla) {
            p.verDatos();
        }
    }

    public Personal pedirDatosEmpleado() {
        Personal p = null;
        int op = Entrada.leerEntero(" 1.- Laboral\n 2.- Profesor Titular\n 3.- Profesor Interino");
        switch (op) {
            case 1:
                p = pedirDatosLaboral();
                break;
            case 2:
                p = pedirDatosTitular();
                break;
            case 3:
                p = pedirDatosInterino();
                break;
            default:
        }
        return p;
    }

    public Personal pedirDatosLaboral() {
        Personal p;
        String categoria = Entrada.leerCadena("Categoria (Administrativo/Ordenanza/Limpieza):");
        String turno = Entrada.leerCadena("Turno (Mañana/Tarde):");
        String nrp = Entrada.leerCadena("NRP:");
        String nombre = Entrada.leerCadena("Nombre");
        System.out.println("Fecha de ingreso:");
        Fecha fechaIngreso = new Fecha();
        System.out.println("Fecha de nacimiento:");
        Fecha fechaNacimiento = new Fecha();
        int telefono = Entrada.leerEntero("Teléfono: ");
        p = new Laboral(categoria, turno, nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        return p;
    }

    public Personal pedirDatosTitular() {
        Personal p;
        boolean conDestino = Entrada.leerBoolean("¿Tiene destino en el centro?");
        String especialidad = Entrada.leerCadena("Especialidad:");
        String puesto = Entrada.leerCadena("Puesto:");
        String nrp = Entrada.leerCadena("NRP:");
        String nombre = Entrada.leerCadena("Nombre");
        System.out.println("Fecha de ingreso:");
        Fecha fechaIngreso = new Fecha();
        System.out.println("Fecha de nacimiento:");
        Fecha fechaNacimiento = new Fecha();
        int telefono = Entrada.leerEntero("Teléfono: ");
        p = new ProfesorTitular(conDestino, especialidad, puesto, nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        return p;
    }

    public Personal pedirDatosInterino() {
        Personal p;
        boolean sustituto = Entrada.leerBoolean("¿Está sustituyendo?");
        String especialidad = Entrada.leerCadena("Especialidad:");
        String puesto = Entrada.leerCadena("Puesto:");
        String nrp = Entrada.leerCadena("NRP:");
        String nombre = Entrada.leerCadena("Nombre");
        System.out.println("Fecha de ingreso:");
        Fecha fechaIngreso = new Fecha();
        System.out.println("Fecha de nacimiento:");
        Fecha fechaNacimiento = new Fecha();
        int telefono = Entrada.leerEntero("Teléfono: ");
        p = new ProfesorInterino(sustituto, especialidad, puesto, nrp, nombre, fechaIngreso, fechaNacimiento, telefono);
        return p;
    }

    public boolean altaEmpleado(Personal p) {
        boolean estado = false;
        if (p != null) {
            plantilla.add(p);
            estado = true;
        }
        return estado;
    }

    public boolean bajaEmpleado(Personal p) {
        return plantilla.remove(p);
    }

    public void verDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nInstituto ");
        sb.append(nombre);
        sb.append(" ").append(codigo);
        sb.append("\n").append(direccion);
        sb.append(" ").append(ciudad);
        System.out.println(sb.toString());
    }

    public void leerLaborales() {
        FileInputStream fichero = null;
        ObjectInputStream entrada = null;
        Laboral empleado = null;
        try {
            fichero = new FileInputStream("Laborales.dat");
            entrada = new ObjectInputStream(fichero);
            empleado = (Laboral) entrada.readObject();
            while (empleado != null) {
                altaEmpleado(empleado);
                empleado = (Laboral) entrada.readObject();
            }
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
    }

    public void leerTitulares() {
        FileInputStream fichero = null;
        ObjectInputStream entrada = null;
        ProfesorTitular empleado = null;
        try {
            fichero = new FileInputStream("Titulares.dat");
            entrada = new ObjectInputStream(fichero);
            empleado = (ProfesorTitular) entrada.readObject();
            while (empleado != null) {
                altaEmpleado(empleado);
                empleado = (ProfesorTitular) entrada.readObject();
            }
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
    }

    public void leerInterinos() {
        FileInputStream fichero = null;
        ObjectInputStream entrada = null;
        ProfesorInterino empleado = null;
        try {
            fichero = new FileInputStream("Interinos.dat");
            entrada = new ObjectInputStream(fichero);
            empleado = (ProfesorInterino) entrada.readObject();
            while (empleado != null) {
                altaEmpleado(empleado);
                empleado = (ProfesorInterino) entrada.readObject();
            }
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
    }

    public void guardarLaborales() {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Laborales.dat");
            salida = new ObjectOutputStream(fichero);
            for (Personal empleado : plantilla) {
                if(empleado instanceof Laboral){
                    salida.writeObject(empleado);
                }
            }
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

    public void guardarTitulares() {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Titulares.dat");
            salida = new ObjectOutputStream(fichero);
            for (Personal empleado : plantilla) {
                if(empleado instanceof ProfesorTitular){
                    salida.writeObject(empleado);
                }
            }
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

    public void guardarInterinos() {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Interinos.dat");
            salida = new ObjectOutputStream(fichero);
            for (Personal empleado : plantilla) {
                if(empleado instanceof ProfesorInterino){
                    salida.writeObject(empleado);
                }
            }
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
}
