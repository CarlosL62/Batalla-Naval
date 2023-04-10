/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Tableros.Tableros;
import java.io.IOException;

/**
 *
 * @author carlo
 */
public class BarcoPailebot extends Barcos{
   
    public BarcoPailebot(Tableros tableros) throws IOException{
        super.caracterCasillas = "Pailebot";
        super.ruta = "/imagenes/BarcoPequeño.png";
        super.puntos = 100;
        this.tableros = tableros;
    }
}
