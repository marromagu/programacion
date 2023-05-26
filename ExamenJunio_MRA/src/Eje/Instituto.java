/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
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

    public ArrayList<Personal> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Personal> platilla) {
        this.plantilla = platilla;
    }

    public Personal buscarEmpleadoNrp(String nrp) {
        for (int i = 0; i < plantilla.size(); i++) {
            if (plantilla.get(i).getNrp().equals(nrp)) {
                return plantilla.get(i);
            }
        }
        return null;
    }

    public Personal buscarEmpleadoTlf(int telefono) {
        for (Personal personal : plantilla) {
            if (personal.getTelefono() == telefono) {
                return personal;
            }
        }
        return null;
    }

    public Personal director() {
        for (Personal personal : plantilla) {
            if (personal instanceof Profesor) {
                if (((Profesor) personal).getPuesto().compareTo("Direcctor") == 0) {
                    return personal;
                }
            }
        }
        return null;
    }

    public void verDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\nInstituto");
        sb.append("\nCodigo: ").append(codigo);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nDireccion: ").append(direccion);
        sb.append("\nCiudad: ").append(ciudad);
        sb.append("\nPlantilla: ").append(plantilla);
        System.out.println(sb.toString());
    }

    public boolean altaEmpleado(Personal personal) {
        if (plantilla.add(personal)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean bajaEmpleado(Personal personal) {
        if (plantilla.remove(personal)) {
            return true;
        } else {
            return false;
        }
    }

    public void verLaborales() {
        System.out.println("\nListado de laborales");
        System.out.println("--------------------");
        for (Personal personal : plantilla) {
            if (personal instanceof Laboral) {
                personal.verDatos();

            }
        }
    }

    public void verProfesores() {
        System.out.println("\nListado de Profesores");
        System.out.println("--------------------");
        for (Personal personal : plantilla) {
            if (personal instanceof Profesor) {
                personal.verDatos();

            }
        }
    }

    public void verPersonal() {
        System.out.println("\nListado de Personal");
        System.out.println("--------------------");
        for (Personal personal : plantilla) {
            if (personal instanceof Personal) {
                personal.verDatos();

            }
        }
    }

    public void guardarLaborales() {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Laborales.dat");
            salida = new ObjectOutputStream(fichero);
            for (Personal personal : plantilla) {
                if (personal instanceof Laboral) {
                    salida.writeObject(personal);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fichero.close();
                salida.close();
            } catch (Exception e) {
            }
        }
    }

    public void guadarInterinos() {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Interinos.dat");
            salida = new ObjectOutputStream(fichero);
            for (Personal personal : plantilla) {
                if (personal instanceof ProfesorInterino) {
                    salida.writeObject(personal);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fichero.close();
                salida.close();
            } catch (Exception e) {
            }
        }
    }

    public void guardarTitulares() {
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        try {
            fichero = new FileOutputStream("Titulares.dat");
            salida = new ObjectOutputStream(fichero);
            for (Personal personal : plantilla) {
                if (personal instanceof ProfesorTitular) {
                    salida.writeObject(personal);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fichero.close();
                salida.close();
            } catch (Exception e) {
            }
        }
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
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
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
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
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
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
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

    public Personal pedirDatos() {
        Scanner r = new Scanner(System.in);
        Personal personal = null;
        System.out.println("Tipo de empleado: \nLaboral | Interino | Titular");
        String tipo = r.nextLine();
        System.out.println("Nrp");
        String nrp = r.nextLine();
        System.out.println("Nombre");
        String nombre = r.nextLine();
        System.out.println("Fecha de Ingreso");
        Fecha fingreso = new Fecha();
        System.out.println("Fecha de nacimiento");
        Fecha fnacimiento = new Fecha();
        System.out.println("telefono");
        int tlf = r.nextInt();
        switch (tipo) {
            case "Laboral":
                System.out.println("Categoria: Administrativo | Ordenanza | Limpieza");
                String categoria = r.nextLine();
                System.out.println("Turno");
                String turno = r.nextLine();
                Laboral nuevoLaboral = new Laboral(categoria, turno, nrp, nombre, fingreso, fnacimiento, tlf);
                personal = nuevoLaboral;
                break;
            case "Interino":
                System.out.println("Especialidad");
                String especialidad = r.nextLine();
                System.out.println("Pueso");
                String pueso = r.nextLine();
                System.out.println("¿Sustituto?");
                String respuesta = r.nextLine();
                boolean sustituto = false;
                if (respuesta == "si") {
                    sustituto = true;
                } else {
                    sustituto = false;
                }
                ProfesorInterino nuevoInterino = new ProfesorInterino(sustituto, pueso, especialidad, nrp, nombre, fingreso, fnacimiento, tlf);
                personal = nuevoInterino;
                break;
            case "Titular":
                System.out.println("Especialidad");
                String especialidad2 = r.nextLine();
                System.out.println("Pueso");
                String pueso2 = r.nextLine();
                System.out.println("¿Con Destino?");
                String respuesta2 = r.nextLine();
                boolean destino = false;
                if (respuesta2 == "si") {
                    sustituto = true;
                } else {
                    sustituto = false;
                }
                ProfesorTitular nuevoTitular = new ProfesorTitular(destino, especialidad2, pueso2, nrp, nombre, fingreso, fnacimiento, tlf);
                personal = nuevoTitular;
                break;
            default:
                throw new AssertionError();
        }
        return personal;
    }

}
