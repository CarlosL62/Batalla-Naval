/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Tableros.Tableros;

/**
 *
 * @author carlo
 */
public class Agua extends Casillas{
   
    public Agua(Tableros tableros){
        super.caracterCasillas = "Agua";
        super.ruta = "/imagenes/mar.png";
        super.tipoCasilla = 2;
        this.tableros = tableros;
    }
}
