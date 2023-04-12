/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partida;

/**
 *
 * @author carlo
 */
public class Inventario {
    
    public int getCantidadBombasTablero() {
            return cantidadBombasTablero;
        }

        public void setCantidadBombasTablero(int cantidadBombasTablero) {
            this.cantidadBombasTablero = cantidadBombasTablero;
        }

        public int getCantidadBarcosTablero() {
            return cantidadBarcosTablero;
        }

        public void setCantidadBarcosTablero(int cantidadBarcosTablero) {
            this.cantidadBarcosTablero = cantidadBarcosTablero;
        }

        private int cantidadBombasTablero;
        private int cantidadBarcosTablero;

        //Espacios en el arreglo para cada tipo de bomba
        //0 = normal, 1 = misil, 2 = torpedo, 3 = hecatombe
        protected int[] cantidadBombasPartida = new int[4];

        private int puntosPartida;

        public int getPuntosPartida() {
            return puntosPartida;
        }

        public void setPuntosPartida(int puntosPartida) {
            this.puntosPartida = puntosPartida;
        }
}
