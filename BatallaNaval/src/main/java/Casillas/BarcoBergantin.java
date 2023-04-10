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
public class BarcoBergantin extends Barcos{
    
    public BarcoBergantin(Tableros tableros) throws IOException{
        super.caracterCasillas = "Bergantin";
        super.ruta = "/imagenes/BarcoMediano.png";
        super.puntos = 40;
        this.tableros = tableros;
    }

}
