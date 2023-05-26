/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Liga_Deportiva;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author mario
 */
public class Liga {

    private HashMap<String, Equipo> liga_HashMap = new HashMap<>();
    private Equipo equipo;

//Añadir equipo
    public Equipo añadirEquipo(Equipo miequipo) {
        try {
            liga_HashMap.put(miequipo.getClave(), miequipo);//Posible error
            return miequipo;
        } catch (Exception e) {
            return null;
        }
    }
//Modificar equipo

    public void modifiarEquipo(String nuevoNombre, String miClave, String nuevoPais) {
        if (!nuevoNombre.isEmpty()) {
            liga_HashMap.get(miClave).setNombre(nuevoNombre);
            liga_HashMap.get(miClave).setPais(nuevoPais);
            System.out.println("Nombre: " + nuevoNombre + " Pais: " + nuevoPais);
        } else {
            System.out.println("Tienes que poner un nombre");
        }
    }
//Borrar equipo

    public void borrarEquipo(String clave) {
        liga_HashMap.remove(clave);
    }
//Pasar el Hashmap a una arraylist
    //ver clasificación

    public void verClasificacion() {
        //TreeMap treeLiga = new TreeMap<>();
        ArrayList arrayLiga = new ArrayList<>(liga_HashMap.values());
        Collections.sort(arrayLiga, new OrdenarPorPuntos());
        for (int i = 0; i < arrayLiga.size(); i++) {
            System.out.println(arrayLiga.get(i).toString());

        }
    }
//cargar jornada

    public void leerJornada() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("Liga.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            Scanner s;
            String clave1, clave2;
            int puntos1, puntos2;
            Equipo e1, e2;
            while ((linea = br.readLine()) != null) {
                s = new Scanner(linea);
                clave1 = s.next();
                e1 = liga_HashMap.get(clave1);
                puntos1 = s.nextInt();
                clave2 = s.next();
                e2 = liga_HashMap.get(clave2);
                puntos2 = s.nextInt();
                liga_HashMap.get(clave1).actualizarPartidos();
                liga_HashMap.get(clave2).actualizarPartidos();
                liga_HashMap.get(clave1).calcularPuntosTotales();
                liga_HashMap.get(clave2).calcularPuntosTotales();

            }
        } catch (Exception e) {
            System.out.println("No hay");
        }finally{
            try{
                
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }

    public void guardarJornada() {
        FileWriter archivo = null;
        BufferedWriter escritor = null;

        try {
            archivo = new FileWriter("Liga.txt");
            escritor = new BufferedWriter(archivo);

            for (Equipo equipo : liga_HashMap.values()) {

                String linea = equipo.getNombre() + "," + equipo.getPais() + "," + equipo.getPuntaje();

                escritor.write(linea);
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

//Ficheros.dat
    public void leerEquipos() throws IOException {
        FileInputStream archivo = null;
        ObjectInputStream obj = null;
        equipo = null;

        try {
            archivo = new FileInputStream("Liga.dat");
            obj = new ObjectInputStream(archivo);

            while (true) {
                equipo = (Equipo) obj.readObject();
                liga_HashMap.put(equipo.getClave(), equipo);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
                if (obj != null) {
                    obj.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

    public void guardarEquipos() {
        FileOutputStream archivo = null;
        ObjectOutputStream obj = null;

        try {
            archivo = new FileOutputStream("Liga.dat");
            obj = new ObjectOutputStream(archivo);

            obj.writeObject(this.equipo);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

}
