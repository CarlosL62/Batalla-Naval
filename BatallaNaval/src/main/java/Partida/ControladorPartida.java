/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partida;

import Archivos.Archivos;
import Casillas.Agua;
import Casillas.BarcoBergantin;
import Casillas.BarcoNavio;
import Casillas.BarcoPailebot;
import Casillas.BombaHecatombe;
import Casillas.BombaMisil;
import Casillas.BombaTorpedo;
import Casillas.Casillas;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ControladorPartida {
    
    public ControladorPartida(Inventario inventario){
        this.inventario = inventario;
    }

    private Casillas[][] botonesAsignados;

    public Casillas[][] getBotonesAsignados() {
        return botonesAsignados;
    }

    private Inventario inventario;

    private int filas, columnas;

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
    
    private int cantidadBotones;

    public int getCantidadBotones() {
        return cantidadBotones;
    }

    public void construccionTablero(Archivos archivoTablero) {
        
        //Obtenemos los valores de filas y columnas
        filas = archivoTablero.getFilas();
        columnas = archivoTablero.getColumnas();
        //Obtenemos los caracteres del tablero archivo
        String[][] dimTotal = archivoTablero.getDimTotal();

        //Creamos un arreglo de botones
        botonesAsignados = new Casillas[filas][columnas];

        //Seteamos cada valor de las bombas según el tipo de tablero
        cantidadBotones = filas * columnas;
        if (cantidadBotones <= 36) {
            inventario.cantidadBombasPartida[0] = 14;
            inventario.cantidadBombasPartida[1] = 4;
            inventario.cantidadBombasPartida[2] = 4;
            inventario.cantidadBombasPartida[3] = 4;
        }
        if (cantidadBotones > 36 && cantidadBotones <= 64) {
            inventario.cantidadBombasPartida[0] = 12;
            inventario.cantidadBombasPartida[1] = 3;
            inventario.cantidadBombasPartida[2] = 3;
            inventario.cantidadBombasPartida[3] = 3;
        }
        if (cantidadBotones > 64) {
            inventario.cantidadBombasPartida[0] = 7;
            inventario.cantidadBombasPartida[1] = 2;
            inventario.cantidadBombasPartida[2] = 2;
            inventario.cantidadBombasPartida[3] = 2;
        }

        // Se asigna a cada casilla una identidad según el caracter del tablero
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                try {
                    String caracter = dimTotal[i][j];
                    switch (caracter) {
                        case "~":
                            botonesAsignados[i][j] = new Agua(inventario);
                            break;
                        case "B1":
                            botonesAsignados[i][j] = new BarcoPailebot(inventario);
                            inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() + 1);
                            break;
                        case "B2":
                            botonesAsignados[i][j] = new BarcoBergantin(inventario);
                            inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() + 1);
                            break;
                        case "B3":
                            botonesAsignados[i][j] = new BarcoNavio(inventario);
                            inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() + 1);
                            break;
                        case "I":
                            botonesAsignados[i][j] = new BombaMisil(inventario);
                            break;
                        case "T":
                            botonesAsignados[i][j] = new BombaTorpedo(inventario);
                            break;
                        case "O":
                            botonesAsignados[i][j] = new BombaHecatombe(inventario);
                            break;
                        default:
                            botonesAsignados[i][j] = new Agua(inventario);
                            break;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ControladorPartida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void almacenarPuntaje(String usuario){
        Archivos archivo = new Archivos();
        try {
            archivo.almacenarPuntaje(usuario, inventario.getPuntosPartida());
        } catch (IOException ex) {
            Logger.getLogger(ControladorPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
