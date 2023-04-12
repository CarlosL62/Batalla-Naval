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
public class BarcoPailebot extends Barcos{
   
    public BarcoPailebot(Inventario inventario) throws IOException{
        super.caracterCasillas = "Pailebot";
        super.ruta = "/imagenes/BarcoPequeño.png";
        super.puntos = 100;
        this.inventario = inventario;
    }
}
