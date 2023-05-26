/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Liga_Deportiva;

import java.io.Serializable;
import java.util.Scanner;
import java.util.function.Consumer;

/**
 *
 * @author mario
 */
public class Equipo implements Comparable, Serializable {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private String pais;
    private int puntaje;
    private String clave;
    private int puntosAFavor;
    private int puntosEnContra;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;

    public Equipo(String nombre, String pais, int puntaje, String clave, int puntosAFavor, int puntosEnContra, int partidosGanados, int partidosPerdidos, int partidosEmpatados) {
        this.nombre = nombre;
        this.pais = pais;
        this.puntaje = puntaje;
        this.clave = clave;
        this.puntosAFavor = puntosAFavor;
        this.puntosEnContra = puntosEnContra;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
    }
        public Equipo() {
        System.out.println("Nombre");
        this.nombre = teclado.nextLine();
        this.pais = "";
        this.puntaje = 0;
        System.out.println("Clave");
        this.clave = teclado.nextLine();
        this.puntosAFavor = 0;
        this.puntosEnContra = 0;
        this.partidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getPuntosAFavor() {
        return puntosAFavor;
    }

    public void setPuntosAFavor(int puntosAFavor) {
        this.puntosAFavor = puntosAFavor;
    }

    public int getPuntosEnContra() {
        return puntosEnContra;
    }

    public void setPuntosEnContra(int puntosEnContra) {
        this.puntosEnContra = puntosEnContra;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    // Método para validar la clave
    private boolean validarClave(String clave) {
        return clave != null && clave.length() == 3 && clave.matches("[a-zA-Z]+");
    }
    // Método para calcular los puntos totales

    public int calcularPuntosTotales() {
        return (partidosGanados * 3) + (partidosEmpatados * 1);
    }

    // Método para actualizar los partidos ganados, perdidos y empatados
    public void actualizarPartidos() {
        if (puntosAFavor > puntosEnContra) {
            partidosGanados++;
        } else if (puntosAFavor < puntosEnContra) {
            partidosPerdidos++;
        } else {
            partidosEmpatados++;
        }
    }

    @Override
    public int compareTo(Object o) {
        Equipo otro = (Equipo) o;
        int compara = 0;
        if (otro.calcularPuntosTotales() == this.calcularPuntosTotales()) {
            compara = 0;
        } else {
            if (otro.calcularPuntosTotales() < this.calcularPuntosTotales()) {
                compara = -1;
            } else {
                if (otro.calcularPuntosTotales() > this.calcularPuntosTotales()) {
                    compara = 1;
                }
            }
        }

        return compara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\t Equipo ");
        sb.append("\n nombre ").append(nombre);
        sb.append("\n pais ").append(pais);
        sb.append("\n puntaje ").append(puntaje);
        sb.append("\n clave ").append(clave);
        sb.append("\n puntosAFavor ").append(puntosAFavor);
        sb.append("\n puntosEnContra ").append(puntosEnContra);
        sb.append("\n partidosGanados ").append(partidosGanados);
        sb.append("\n partidosPerdidos ").append(partidosPerdidos);
        sb.append("\n partidosEmpatados ").append(partidosEmpatados);
        sb.append(' ');
        return sb.toString();
    }


}
