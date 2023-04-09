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
public class BarcoNavio extends Barcos{
    
    public BarcoNavio(Tableros tableros) throws IOException{
        super.caracterCasillas = "Navio";
        super.ruta = "/imagenes/BarcoGrande.png";
        super.puntos = 25;
        this.tableros = tableros;
        //cambiarIcono();
    }
}
