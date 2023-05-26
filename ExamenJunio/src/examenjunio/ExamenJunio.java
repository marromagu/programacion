/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenjunio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JMRivera
 */
public class ExamenJunio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instituto instituto = new Instituto("41006900", "Velázquez", "Francisco Carrión Mejías 10", "Sevilla");
        //inicio(instituto);
        leerDatosDeArchivo(instituto);
        Personal empleado;
        int op, opcion = menu();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    instituto.verDatos();
                    empleado = instituto.director();
                    empleado.verDatos();
                    break;
                case 2:
                    empleado = instituto.pedirDatosEmpleado();
                    if (instituto.altaEmpleado(empleado)){
                        System.out.println("Operación terminada con éxito.");
                    }else{
                        System.out.println("No se pudo dar de alta.");
                    }
                    break;
                case 3:
                    switch (Entrada.leerEntero("\nBuscar por:\n 1.- NRP\n 2.- Telefono\n¿?")) {
                        case 1:
                            empleado = instituto.buscarEmpleado(Entrada.leerCadena("NRP"));
                            break;
                        case 2:
                            empleado = instituto.buscarEmpleado(Entrada.leerEntero("Teléfono"));
                            break;
                        default:
                            empleado = null;
                    }
                    if (empleado != null){
                        empleado.verDatos();
                        if (Entrada.leerBoolean("¿Desea borrarlo?")){
                            instituto.bajaEmpleado(empleado);
                        }
                    }
                    break;
                case 4:
                    switch (Entrada.leerCaracter("\nOrdenar por:\n a) Nombre\n b) NRP\n c) Antigüedad\n d) Tipo Empleado\n¿?")) {
                        case 'a':
                            Collections.sort(instituto.getPlantilla(), new ordenarPorNombre());
                            break;
                        case 'b':
                            Collections.sort(instituto.getPlantilla(), new ordenarPorNrp());
                            break;
                        case 'c':
                            Collections.sort(instituto.getPlantilla(), new ordenarPorFecha());
                            break;
                        case 'd':
                            Collections.sort(instituto.getPlantilla(), new ordenarPorTipo());
                            break;
                        default:
                    }
                    break;
                case 5:
                    switch (Entrada.leerEntero("\nBuscar por:\n 1.- NRP\n 2.- Telefono")) {
                        case 1:
                            empleado = instituto.buscarEmpleado(Entrada.leerCadena("NRP"));
                            break;
                        case 2:
                            empleado = instituto.buscarEmpleado(Entrada.leerEntero("Teléfono"));
                            break;
                        default:
                            empleado = null;
                    }
                    if (empleado != null){
                        empleado.verDatos();
                    }
                    break;
                case 6:
                    switch (Entrada.leerEntero("\nBuscar por:\n 1.- NRP\n 2.- Telefono")) {
                        case 1:
                            empleado = instituto.buscarEmpleado(Entrada.leerCadena("NRP"));
                            break;
                        case 2:
                            empleado = instituto.buscarEmpleado(Entrada.leerEntero("Teléfono"));
                            break;
                        default:
                            empleado = null;
                    }
                    if (empleado != null){
                        empleado.verDatos();
                        if (Entrada.leerBoolean("¿Desea modicar el nombre?")){
                            empleado.setNombre(Entrada.leerCadena("Nuevo nombre:"));
                        }
                    }
                    break;
                case 7:
                    op = Entrada.leerEntero(" 1.- Laborales\n 2.- Profesores\n 3.- Todos\n¿?");
                    switch (op) {
                        case 1:
                            instituto.verLaborales();
                            break;
                        case 2:
                            instituto.verProfesores();
                            break;
                        case 3:
                            instituto.verPersonal();
                            break;
                        default:
                    }
                    break;
                default:
            }
            opcion = menu();
        }
        guardarDatosEnArchivo(instituto);
    }

    public static int menu() {
        int op;
        System.out.println("");
        System.out.println("1.- Ver los datos del instituto.");
        System.out.println("2.- Dar de alta un empleado.");
        System.out.println("3.- Dar de baja un empleado.");
        System.out.println("4.- Ordenar empleados por distintos criterios.");
        System.out.println("5.- Ver los datos de un empleado.");
        System.out.println("6.- Modificar los datos de un empleado.");
        System.out.println("7.- Ver los datos de todos los empleados.");
        System.out.println("0.- Salir.");
        op = Entrada.leerEntero("\nElija opción:");

        return op;
    }

    public static void inicio(Instituto inst) {
        Personal p;
        Fecha f1, f2;
        f1 = new Fecha(1, 1, 1990);
        f2 = new Fecha(1, 9, 2021);
        p = new ProfesorInterino(false, "Informática", "Tutor", "1000", "Paco", f2, f1, 600222333);
        inst.altaEmpleado(p);
        p = new ProfesorInterino(false, "Informática", "", "2000", "Pepa", f2, f1, 600555666);
        inst.altaEmpleado(p);
        p = new ProfesorInterino(false, "Lengua", "", "3000", "Antonio", f2, f1, 600888999);
        inst.altaEmpleado(p);
        p = new ProfesorInterino(false, "Lengua", "Tutor", "4000", "Vicente", f2, f1, 600333111);
        inst.altaEmpleado(p);
        f1 = new Fecha(2, 6, 1965);
        f2 = new Fecha(1, 9, 2005);
        p = new ProfesorTitular(true, "Informática", "Tutor", "5000", "José María", f2, f1, 620555999);
        inst.altaEmpleado(p);
        f1 = new Fecha(10, 8, 1960);
        f2 = new Fecha(1, 9, 1999);
        p = new ProfesorTitular(true, "Matemáticas", "Director", "6000", "Pepe", f2, f1, 620777222);
        inst.altaEmpleado(p);
        f2 = new Fecha(1, 9, 2014);
        p = new ProfesorTitular(true, "Matemáticas", "Secretario", "7000", "Lourdes", f2, f1, 630222555);
        inst.altaEmpleado(p);
        f2 = new Fecha(1, 9, 2000);
        p = new ProfesorTitular(true, "Lengua", "Jefe de Departamento", "8000", "Emilio", f2, f1, 610555333);
        inst.altaEmpleado(p);
        f1 = new Fecha(10, 8, 1993);
        f2 = new Fecha(1, 9, 2019);
        p = new Laboral("Limpieza", "Mañana", "9000", "Alfredo", f2, f1, 680555999);
        inst.altaEmpleado(p);
        p = new Laboral("Ordenanza", "Mañana", "9100", "Baldomero", f2, f1, 680444000);
        inst.altaEmpleado(p);
        p = new Laboral("Ordenanza", "Tarde", "9200", "Fulgencio", f2, f1, 680777333);
        inst.altaEmpleado(p);
        p = new Laboral("Administrativo", "Mañana", "9300", "Carmen", f2, f1, 680333111);
        inst.altaEmpleado(p);
    }
    
    public static void guardarDatosEnArchivo(Instituto ins){
        ins.guardarLaborales();
        ins.guardarTitulares();
        ins.guardarInterinos();
    }

    public static void leerDatosDeArchivo(Instituto ins){
        ins.leerLaborales();
        ins.leerTitulares();
        ins.leerInterinos();
    }

}
