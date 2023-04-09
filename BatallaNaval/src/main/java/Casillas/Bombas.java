/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Tableros.MenuTableros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Bombas extends Casillas{
    
    public Bombas(){
        super.tipoCasilla = 0;
    }
    
    @Override
    public Casillas[][] accionBoton(Casillas[][] casillas) throws IOException{
        if (!revelada) {
            revelada = true;
            cambiarIcono();
            casillas = explosionBomba(casillas);
        }
        return casillas;
    }
    
    public Casillas[][] explosionBomba(Casillas[][] casillas){
        return casillas;
    }
    
    public boolean explosionBombaValida(Casillas[][] casillas, int destinoFila, int destinoColumna) {
        // Verificación que la explosión sea válida, primero que este dentro del
        // tablero y que sea a una casilla válida
        boolean explosionValida;
        if (destinoColumna >= 0 && destinoFila >= 0 && destinoFila < casillas.length && destinoColumna < casillas[0].length){
            explosionValida = true;
        } else{
            explosionValida = false;
        }
        return explosionValida;
    }
    
    public int numeroAleatorio(int max, int min){
        int numeroAleatorio = (int) (Math.floor(Math.random()*(max-min+1)+min));
        return numeroAleatorio;
    }
}
