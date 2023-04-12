/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Barcos extends Casillas{
    protected int puntos;
    
    Barcos(){
        super.tipoCasilla = 1;
    }
    
    @Override
    public Casillas[][] accionBoton(Casillas[][] casillas) throws IOException{
        if (!revelada) {
            revelada = true;
            cambiarIcono();
            inventario.setCantidadBarcosTablero(inventario.getCantidadBarcosTablero() - 1);
            inventario.setPuntosPartida(inventario.getPuntosPartida() + puntos);
            //controlPuntajes();
        }
        return casillas;
    }
    
    public void controlPuntajes(){
        File f = new File("puntajes.txt");
        BufferedReader br;
        BufferedWriter bw;
        String cadena;
        String[] dim1 = null;
        int puntajeTotal;
        boolean  inicio = true;
        if (f.exists()) {
            try {
                br = new BufferedReader(new FileReader(f));
                bw = new BufferedWriter(new FileWriter(f));
                
                while ((cadena = br.readLine()) != null) {
                    if (cadena.contains("usuario")) {
                        dim1 = cadena.split(" ");
                        puntajeTotal = Integer.parseInt(dim1[1]);
                        puntajeTotal += puntos;
                        bw.write("usuario " + 400);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Barcos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex){
                //Error
            }
        }
        
    }
}
