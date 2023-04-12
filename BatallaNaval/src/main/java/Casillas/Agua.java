/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Partida.ControladorPartida;
import Partida.Inventario;

/**
 *
 * @author carlo
 */
public class Agua extends Casillas{
   
    public Agua(Inventario inventario){
        super.caracterCasillas = "Agua";
        super.ruta = "/imagenes/mar.png";
        super.tipoCasilla = 2;
        this.inventario = inventario;
    }
}
