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
public class BombaMisil extends Bombas{
    
    public BombaMisil(Tableros tableros){
        super.caracterCasillas = "Misil";
        super.ruta = "/imagenes/BombaMisil.png";
        this.tableros = tableros;
    }
    
    @Override
    public Casillas[][] explosionBomba(Casillas[][] casillas){
        casillas = explosionesBombas.explosionBombaMisil(casillas, coordenadaY, coordenadaX);
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
//                    if (explosionBombaValida(casillas, coordenadaY, coordenadaX-1)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                case 2:
//                    if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                case 3:
//                    if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                case 4:
//                    if (explosionBombaValida(casillas, coordenadaY, coordenadaX+1)) {
//                        movimientoValido = true;
//                    }
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        } while (!movimientoValido);
//        
//        switch (numDireccion) {
//            case 1:
//                for (int pcolumna = coordenadaX-1; pcolumna >= 0; pcolumna--) {
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, coordenadaY, pcolumna)) {
//                        if (casillas[coordenadaY][pcolumna].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            break;
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                }
//                break;
//            case 2:
//                for (int pFila = coordenadaY-1; pFila >= 0; pFila--) {
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, pFila, coordenadaX)) {
//                        if (casillas[pFila][coordenadaX].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            break;
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                }
//                break;
//            case 3:
//                for (int pFila = coordenadaY+1; pFila < casillas.length; pFila++) {
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, pFila, coordenadaX)) {
//                        if (casillas[pFila][coordenadaX].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            break;
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                }
//                break;
//            case 4:
//                for (int pcolumna = coordenadaX+1; pcolumna < casillas[0].length; pcolumna++) {
//                    // Verificación de coordenada válida
//                    if (explosionBombaValida(casillas, coordenadaY, pcolumna)) {
//                        if (casillas[coordenadaY][pcolumna].tipoCasilla == 2) {
//                            try {
//                                //Realiza la explosión
//                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                        } else {
//                            try {
//                                // Realiza la explosión y se detiene
//                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
//                            } catch (IOException ex) {
//                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
//                            }
//                            break;
//                        }
//                    } else {
//                        // Coordenada incorrecta y continua
//                    }
//                }
//                break;
//            default:
//
//                break;
//        }
//        return casillas;
//    }
}