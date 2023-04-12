/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archivos;

import com.mycompany.batallanaval.Menu;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class Archivos {
    
    //TABLEROS
    
    private int filas, columnas;
    private String[][] dimTotal;
    private String nombreArchivo;
    private File archivo;

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public String[][] getDimTotal() {
        return dimTotal;
    }

    public File getArchivo() {
        return archivo;
    }
    
    public void iniciarArchivo(String ruta) {

        archivo = new File(ruta);
        BufferedReader br;
        String cadena;
        String[] dimensiones;
        int contFila = 0;
        int contColumna;
        String[] dim1;
        boolean inicio = true;

        if (archivo.exists()) {
            try {
                br = new BufferedReader(new FileReader(archivo));
                while ((cadena = br.readLine()) != null) {
                    if (cadena.contains("tablero")) {
                        String[] text1 = cadena.split("<<");
                        String[] text2 = text1[1].split(">>");
                        nombreArchivo = text2[0];
                    }
                    if (cadena.contains("dimension")) {
                        dim1 = cadena.split(" ");
                        dimensiones = dim1[1].split("x");

                        columnas = Integer.parseInt(dimensiones[0]);
                        filas = Integer.parseInt(dimensiones[1]);

                        if (inicio) {
                            dimTotal = new String[filas][columnas];
                            inicio = false;
                        }
                    }

                    if (cadena.contains("~") || cadena.contains("B1") || cadena.contains("B2") || cadena.contains("B3") || cadena.contains("T") || cadena.contains("O") || cadena.contains("I")) {
                        dim1 = cadena.split(",");
                        contColumna = 0;
                        for (int i = 0; i < dim1.length; i++) {
                            dimTotal[contFila][contColumna] = dim1[i];
                            contColumna = contColumna + 1;
                        }
                        contFila = contFila + 1;
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            System.out.println("El archivo no existe");
        }
    }
    
    public void buscarid(String texto){
        //Se busca el id del archivo
        nombreArchivo = "tableroEjemplo";
        if (texto.contains("tablero")) {
            String[] lineas = texto.split("\\r?\\n");
            String[] text1 = lineas[0].split("<<");
            String[] text2 = text1[1].split(">>");
            nombreArchivo = text2[0];
        }
    }
    
    public void crearArchivo(String texto){
        String ruta;
        buscarid(texto);
        ruta = nombreArchivo+".th";
        System.out.println(ruta);
        
        // Se crea el nuevo archivo de texto
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            bw.write(texto);
        } catch (Exception e) {
            System.out.println("Error");
        }
        iniciarArchivo(ruta);
    }
    
    //PUNTAJES
    public void almacenarPuntaje(String usuario, int puntaje) throws FileNotFoundException, IOException {
        File archivo = new File("punteos.war");
        FileWriter escribir;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                escribir.write(usuario + "___"+ puntaje+"\n");
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            escribir = new FileWriter(archivo, true);
            escribir.write("\n "+ usuario + "___"+ puntaje);
            escribir.close();
        }
    }
    
    public String[] leerPuntajes(){
        archivo = new File("punteos.war");
        BufferedReader br;
        int cont = 0;
        String cadena;
        String[] puntajes = new String[100];

        if (archivo.exists()) {
            try {
                br = new BufferedReader(new FileReader(archivo));
                while ((cadena = br.readLine()) != null) {
                    puntajes[cont] = cadena;
                    cont += 1;
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else{
            System.out.println("El archivo no existe");
        }
        return puntajes;
    }
    
    public String[] ordanamientoPuntajes(String[] puntajes, int opcion){
        int[] orden = null;
        int cont = 0;
        int[] puntos = new int[100];
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] != null) {
                String[] puntosTexto = puntajes[i].split("___");
                puntos[i] = Integer.parseInt(puntosTexto[1]);
            } else {
                break;
            }
        }
        
        boolean hayCambios;
        int auxiliar = 0;
        String auxiliarTexto = "";
        // opcion = 0 = Mayor a menor | opcion = 1 = Menor a mayor
        if (opcion == 0) { 
            do {
                hayCambios = false;
                for (int i = 0; i < puntos.length - 1; i++) {
                    if (puntos[i + 1] > puntos[i]) {
                        auxiliar = puntos[i];
                        auxiliarTexto = puntajes[i];
                        puntos[i] = puntos[i + 1];
                        puntajes[i] = puntajes[i + 1];
                        puntos[i + 1] = auxiliar;
                        puntajes[i + 1] = auxiliarTexto;
                        hayCambios = true;
                    }
                }
            } while (hayCambios);
        } else if(opcion == 1){
            do {
                hayCambios = false;
                for (int i = 0; i < puntos.length - 1; i++) {
                    if (puntos[i+1]!=0){
                    if (puntos[i + 1] < puntos[i]) {
                        auxiliar = puntos[i];
                        auxiliarTexto = puntajes[i];
                        puntos[i] = puntos[i + 1];
                        puntajes[i] = puntajes[i + 1];
                        puntos[i + 1] = auxiliar;
                        puntajes[i + 1] = auxiliarTexto;
                        hayCambios = true;
                    }
                    }
                }
            } while (hayCambios);
        }
        
        return puntajes;
    }
}
