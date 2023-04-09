/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tableros;

import Casillas.Casillas;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;

/**
 *
 * @author carlo
 */
public class Tableros{

    public int getCantidadBombasTablero() {
        return cantidadBombasTablero;
    }

    public void setCantidadBombasTablero(int cantidadBombasTablero) {
        this.cantidadBombasTablero = cantidadBombasTablero;
    }

    public int getCantidadBarcosTablero() {
        return cantidadBarcosTablero;
    }

    public void setCantidadBarcosTablero(int cantidadBarcosTablero) {
        this.cantidadBarcosTablero = cantidadBarcosTablero;
    }

    public int getCantidadBombasPartida() {
        return cantidadBombasPartida;
    }

    public void setCantidadBombasPartida(int cantidadBombasPartida) {
        this.cantidadBombasPartida = cantidadBombasPartida;
    }
 
    
    private int cantidadBombasTablero;
    private int cantidadBarcosTablero;
    private int cantidadBombasPartida;
    private int puntosPartida;

    public int getPuntosPartida() {
        return puntosPartida;
    }

    public void setPuntosPartida(int puntosPartida) {
        this.puntosPartida = puntosPartida;
    }
    
    public Tableros(){
        
    }
    
    
    
    public void mostrarTablero(){
        String texto = "";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("puntajes.war"))) {
            bw.write(texto);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    
}
