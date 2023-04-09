/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Tableros.Tableros;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class BombaHecatombe extends Bombas{
    
    public BombaHecatombe(Tableros tableros){
        super.caracterCasillas = "Hecatombe";
        super.ruta = "/imagenes/BombaHecatombe.png";
        this.tableros = tableros;
    }
    
    @Override
    public Casillas[][] explosionBomba(Casillas[][] casillas){
        int fila = coordenadaY, columna = coordenadaX;
        boolean movimientoValido = false;
        int numDireccion;
        
        // Verificación de coordenada válida
        
        //Hacia la izquierda
        if (explosionBombaValida(casillas, coordenadaY, coordenadaX-1)) {
            if (casillas[coordenadaY][coordenadaX-1].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY][coordenadaX-1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY][coordenadaX-1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia arriba
        if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX)) {
            if (casillas[coordenadaY-1][coordenadaX].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY-1][coordenadaX].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY-1][coordenadaX].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia abajo
        if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX)) {
            if (casillas[coordenadaY+1][coordenadaX].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY+1][coordenadaX].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY+1][coordenadaX].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia la derecha
        if (explosionBombaValida(casillas, coordenadaY, coordenadaX+1)) {
            if (casillas[coordenadaY][coordenadaX+1].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY][coordenadaX+1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY][coordenadaX+1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia arriba izquierda
        if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX-1)) {
            if (casillas[coordenadaY-1][coordenadaX-1].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY-1][coordenadaX-1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY-1][coordenadaX-1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia arriba derecha
        if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX+1)) {
            if (casillas[coordenadaY-1][coordenadaX+1].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY-1][coordenadaX+1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY-1][coordenadaX+1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia abajo izquierda
        if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX-1)) {
            if (casillas[coordenadaY+1][coordenadaX-1].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY+1][coordenadaX-1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY+1][coordenadaX-1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        //Hacia abajo derecha
        if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX+1)) {
            if (casillas[coordenadaY+1][coordenadaX+1].tipoCasilla == 2) {
                try {
                    //Realiza la explosión
                    casillas = casillas[coordenadaY+1][coordenadaX+1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    // Realiza la explosión y se detiene
                    casillas = casillas[coordenadaY+1][coordenadaX+1].accionBoton(casillas);
                } catch (IOException ex) {
                    Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            // Coordenada incorrecta y continua
        }
        
        
        return casillas;
    }
}
