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
public class BombaTorpedo extends Bombas{
 
    public BombaTorpedo(Inventario inventario){
        super.caracterCasillas = "Torpedo";
        super.ruta = "/imagenes/BombaTorpedo.png";
        this.inventario = inventario;
    }
    
    @Override
    public Casillas[][] explosionBomba(Casillas[][] casillas){
        casillas = explosionesBombas.explosionBombaTorpedo(casillas, coordenadaY, coordenadaX);
        return casillas;
    }
    
//    @Override
//    public Casillas[][] explosionBomba(Casillas[][] casillas){
//        int fila = coordenadaY, columna = coordenadaX;
//        boolean movimientoValido = false;
//        int numDireccion;
//        do {            
//            numDireccion = numeroAleatorio(4, 1);
//            switch (numDireccion) {
//                case 1:
//                    //Hacia arriba izquierda
//                    if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX-1)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                case 2:
//                    //Hacia arriba derecha
//                    if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX+1)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                case 3:
//                    //Hacia abajo izquierda
//                    if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX-1)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                case 4:
//                    //Hacia abajo derecha
//                    if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX+1)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        } while (!movimientoValido);
//        
//        int pfila = coordenadaY;
//        int pcolumna = coordenadaX;
//        boolean movimientoTerminado = false;
//                
//        switch (numDireccion) {
//            case 1:
//                do {                    
//                    pfila = pfila - 1;
//                    pcolumna = pcolumna - 1;
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
//                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                                movimientoTerminado = true;
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                } while (!movimientoValido);
//                break;
//            case 2:
//                do {                    
//                    pfila = pfila - 1;
//                    pcolumna = pcolumna + 1;
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
//                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                                movimientoTerminado = true;
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                } while (!movimientoValido);
//                break;
//            case 3:
//                do {                    
//                    pfila = pfila + 1;
//                    pcolumna = pcolumna - 1;
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
//                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                                movimientoTerminado = true;
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                } while (!movimientoValido);
//                break;
//            case 4:
//                do {
//                    pfila = pfila + 1;
//                    pcolumna = pcolumna + 1;
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
//                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
//                                movimientoTerminado = true;
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                } while (!movimientoValido);
//                break;
//            default:
//
//                break;
//        }
//        return casillas;
//    }
}
