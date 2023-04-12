/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tableros;

import Archivos.Archivos;
import java.io.File;

/**
 *
 * @author carlo
 */
public class TablerosGuardados {
    
    private Archivos[] tablerosGuardados = new Archivos[25];

    public Archivos[] getTablerosGuardados() {
        return tablerosGuardados;
    }
    private int cont = 0;
    
    public void añadirTablero(Archivos archivoTablero){
        tablerosGuardados[cont] = archivoTablero;
        cont++;
    }
}
