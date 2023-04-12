/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

/**
 *
 * @author carlo
 */
public class PruebaOrdenamiento {
    
    public static void main(String[] args) {
        int[] puntos = {9, 7, 3, 1};

        boolean hayCambios;
        int auxiliar = 0;
        do {
            hayCambios = false;
            for (int i = 0; i < puntos.length - 1; i++) {
                if (puntos[i + 1] > puntos[i]) {
                    auxiliar = puntos[i];
                    puntos[i] = puntos[i + 1];
                    puntos[i + 1] = auxiliar;
                    hayCambios = true;
                }
            }

        } while (hayCambios);

        for (int i = 0; i < puntos.length; i++) {
            System.out.print(puntos[i] + ", ");
        }

    }
}
