/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Casillas;

import Partida.ControladorPartida;
import Partida.Inventario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * @author carlo
 */
public class Casillas extends JButton{
    
    protected String caracterCasillas;

    public String getCaracterCasillas() {
        return caracterCasillas;
    }

    public void setCaracterCasillas(String caracterCasillas) {
        this.caracterCasillas = caracterCasillas;
    }
    
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //0 = Bomba, 1 = Barco, 2 = Agua
    protected int tipoCasilla;

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    protected boolean revelada = false;

    public boolean isRevelada() {
        return revelada;
    }

    public void setRevelada(boolean revelada) {
        this.revelada = revelada;
    }
    
    
    private int tamaño;
    protected int coordenadaX;
    protected int coordenadaY;

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
    
    
    public Casillas(){
        
    }
    
//    public void cambiarIcono(String ruta, int tamañoFila, int tamañoColumna) throws IOException{
//        BufferedImage myPicture = ImageIO.read(new File(ruta));
//        Image newimg = myPicture.getScaledInstance(tamañoColumna, tamañoFila, java.awt.Image.SCALE_SMOOTH); 
//    }
    
    protected Inventario inventario;
    
    protected String ruta = "";
    
    public Casillas[][] accionBoton(Casillas[][] casillas) throws IOException{
        if (!revelada) {
            revelada = true;
            cambiarIcono();
        }
        return casillas;
    }
    
    public void cambiarIcono() throws IOException{
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        InputStream input = classLoader.getResourceAsStream(ruta);
//        Image logo = ImageIO.read(input);
//        Image newimg = logo.getScaledInstance(this.getWidth() - 1, this.getHeight() - 1, java.awt.Image.SCALE_SMOOTH);
//        //BufferedImage myPicture = ImageIO.read(new File(ruta));
//        //Image newimg = myPicture.getScaledInstance(this.getWidth()-1, this.getHeight()-1, java.awt.Image.SCALE_SMOOTH);
//        super.setIcon(new ImageIcon(newimg));

        //Se obtiene la ruta de la imagen
        Icon iconoOriginal = new ImageIcon(getClass().getResource(ruta));
        ImageIcon i = (ImageIcon) iconoOriginal;
        //Redimension de la imagen
        ImageIcon redimension = new ImageIcon(i.getImage().getScaledInstance(this.getWidth(), this.getHeight(), java.awt.Image.SCALE_SMOOTH));
        //Settear el icono
        this.setIcon(redimension);
        //super.setEnabled(true);
        super.revalidate();
        super.repaint();
    }
}
