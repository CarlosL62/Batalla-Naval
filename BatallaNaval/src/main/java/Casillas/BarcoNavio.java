/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Partida.ControladorPartida;
import Partida.Inventario;
import java.io.IOException;

/**
 *
 * @author carlo
 */
public class BarcoNavio extends Barcos{
    
    public BarcoNavio(Inventario inventario) throws IOException{
        super.caracterCasillas = "Navio";
        super.ruta = "/imagenes/BarcoGrande.png";
        super.puntos = 25;
        this.inventario = inventario;
    }
}
