/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ExplosionesBombas {
    
    // Metodo para generar números aleatorios en un rango de dos números
    private int numeroAleatorio(int max, int min){
        int numeroAleatorio = (int) (Math.floor(Math.random()*(max-min+1)+min));
        return numeroAleatorio;
    }
    
    // Método para verificar que la acción en una casilla sea válida, es decir, que este dentro del rango del tablero
    private boolean explosionBombaValida(Casillas[][] casillas, int destinoFila, int destinoColumna) {
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
    
    public Casillas[][] explosionBombaMisil(Casillas[][] casillas, int coordenadaY, int coordenadaX){
        int fila = coordenadaY, columna = coordenadaX;
        boolean movimientoValido = false;
        int numDireccion;
        do {            
            numDireccion = numeroAleatorio(4, 1);
            switch (numDireccion) {
                case 1:
                    if (explosionBombaValida(casillas, coordenadaY, coordenadaX-1)) {
                        movimientoValido = true;
                    }
                    break;
                case 2:
                    if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX)) {
                        movimientoValido = true;
                    }
                    break;
                case 3:
                    if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX)) {
                        movimientoValido = true;
                    }
                    break;
                case 4:
                    if (explosionBombaValida(casillas, coordenadaY, coordenadaX+1)) {
                        movimientoValido = true;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!movimientoValido);
        
        switch (numDireccion) {
            case 1:
                for (int pcolumna = coordenadaX-1; pcolumna >= 0; pcolumna--) {
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, coordenadaY, pcolumna)) {
                        if (casillas[coordenadaY][pcolumna].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                    } else {
                        // Coordenada incorrecta y continua
                    }
                }
                break;
            case 2:
                for (int pFila = coordenadaY-1; pFila >= 0; pFila--) {
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, pFila, coordenadaX)) {
                        if (casillas[pFila][coordenadaX].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                    } else {
                        // Coordenada incorrecta y continua
                    }
                }
                break;
            case 3:
                for (int pFila = coordenadaY+1; pFila < casillas.length; pFila++) {
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, pFila, coordenadaX)) {
                        if (casillas[pFila][coordenadaX].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[pFila][coordenadaX].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                    } else {
                        // Coordenada incorrecta y continua
                    }
                }
                break;
            case 4:
                for (int pcolumna = coordenadaX+1; pcolumna < casillas[0].length; pcolumna++) {
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, coordenadaY, pcolumna)) {
                        if (casillas[coordenadaY][pcolumna].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[coordenadaY][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            break;
                        }
                    } else {
                        // Coordenada incorrecta y continua
                    }
                }
                break;
            default:

                break;
        }
        return casillas;
    }
    
    public Casillas[][] explosionBombaTorpedo(Casillas[][] casillas, int coordenadaY, int coordenadaX){
        int fila = coordenadaY, columna = coordenadaX;
        boolean movimientoValido = false;
        int numDireccion;
        do {            
            numDireccion = numeroAleatorio(4, 1);
            switch (numDireccion) {
                case 1:
                    //Hacia arriba izquierda
                    if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX-1)) {
                        movimientoValido = true;
                    }
                    break;
                case 2:
                    //Hacia arriba derecha
                    if (explosionBombaValida(casillas, coordenadaY-1, coordenadaX+1)) {
                        movimientoValido = true;
                    }
                    break;
                case 3:
                    //Hacia abajo izquierda
                    if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX-1)) {
                        movimientoValido = true;
                    }
                    break;
                case 4:
                    //Hacia abajo derecha
                    if (explosionBombaValida(casillas, coordenadaY+1, coordenadaX+1)) {
                        movimientoValido = true;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!movimientoValido);
        
        int pfila = coordenadaY;
        int pcolumna = coordenadaX;
        boolean movimientoTerminado = false;
                
        switch (numDireccion) {
            case 1:
                do {                    
                    pfila = pfila - 1;
                    pcolumna = pcolumna - 1;
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                                movimientoTerminado = true;
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        // Coordenada incorrecta
                        movimientoTerminado = true;
                    }
                } while (!movimientoTerminado);
                break;
            case 2:
                do {                    
                    pfila = pfila - 1;
                    pcolumna = pcolumna + 1;
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                                movimientoTerminado = true;
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        // Coordenada incorrecta
                        movimientoTerminado = true;
                    }
                } while (!movimientoTerminado);
                break;
            case 3:
                do {                    
                    pfila = pfila + 1;
                    pcolumna = pcolumna - 1;
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                                movimientoTerminado = true;
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        // Coordenada incorrecta
                        movimientoTerminado = true;
                    }
                } while (!movimientoTerminado);
                break;
            case 4:
                do {
                    pfila = pfila + 1;
                    pcolumna = pcolumna + 1;
                    // Verificación de coordenada válida
                    if (explosionBombaValida(casillas, pfila, pcolumna)) {
                        if (casillas[pfila][pcolumna].tipoCasilla == 2) {
                            try {
                                //Realiza la explosión
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            try {
                                // Realiza la explosión y se detiene
                                casillas = casillas[pfila][pcolumna].accionBoton(casillas);
                                movimientoTerminado = true;
                            } catch (IOException ex) {
                                Logger.getLogger(BombaMisil.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        // Coordenada incorrecta
                        movimientoTerminado = true;
                    }
                } while (!movimientoTerminado);
                break;
            default:

                break;
        }
        return casillas;
    }
    
    public Casillas[][] explosionBombaHecatombe(Casillas[][] casillas, int coordenadaY, int coordenadaX){
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
