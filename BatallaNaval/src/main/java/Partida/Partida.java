/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Partida;

import Archivos.Archivos;
import Casillas.Casillas;
import Casillas.ExplosionesBombas;
import com.mycompany.batallanaval.Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Partida extends javax.swing.JFrame {

    /**
     * Creates new form MenuTableros
     */
    private static Menu menu;
    private static Archivos archivoTablero;
    private String usuario;
    public Partida(Menu menu, Archivos tableroSeleccionado) {
        this.menu = menu;
        this.archivoTablero = tableroSeleccionado;
        initComponents();
        usuario = JOptionPane.showInputDialog(null, "Ingrese su nickname:");
        partidaActiva();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        pnlInventario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBombaNormal = new javax.swing.JButton();
        btnBombaMisil = new javax.swing.JButton();
        btnBombaTorpedo = new javax.swing.JButton();
        btnBombaHecatombe = new javax.swing.JButton();
        lblBombasNormales1 = new javax.swing.JLabel();
        lblCantBombasNormales = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCantBombasMisil = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCantBombasTorpedo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCantBombasHecatombe = new javax.swing.JLabel();
        lblBarcos1 = new javax.swing.JLabel();
        lblCantBarcos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblBombaActual = new javax.swing.JLabel();
        pnlTablero = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(400, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Artifakt Element Heavy", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 0));
        lblTitulo.setText("BATALLA NAVAL");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 120, -1));

        jLabel7.setText("Inventario");

        btnBombaNormal.setText("Bomba Normal");
        btnBombaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBombaNormalActionPerformed(evt);
            }
        });

        btnBombaMisil.setText("Bomba Misil");
        btnBombaMisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBombaMisilActionPerformed(evt);
            }
        });

        btnBombaTorpedo.setText("Bomba Torpedo");
        btnBombaTorpedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBombaTorpedoActionPerformed(evt);
            }
        });

        btnBombaHecatombe.setText("Bomba Hecatombe");
        btnBombaHecatombe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBombaHecatombeActionPerformed(evt);
            }
        });

        lblBombasNormales1.setText("Normal:");

        lblCantBombasNormales.setText("0");

        jLabel8.setText("Misil:");

        lblCantBombasMisil.setText("0");

        jLabel9.setText("Torpedo:");

        lblCantBombasTorpedo.setText("0");

        jLabel10.setText("Hecatombe:");

        lblCantBombasHecatombe.setText("0");

        lblBarcos1.setText("Barcos:");

        lblCantBarcos.setText("0");

        jLabel2.setText("Bomba actual:");

        lblBombaActual.setText("Normal");

        javax.swing.GroupLayout pnlInventarioLayout = new javax.swing.GroupLayout(pnlInventario);
        pnlInventario.setLayout(pnlInventarioLayout);
        pnlInventarioLayout.setHorizontalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInventarioLayout.createSequentialGroup()
                        .addComponent(lblBombasNormales1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantBombasNormales, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInventarioLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantBombasMisil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInventarioLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantBombasTorpedo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInventarioLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantBombasHecatombe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInventarioLayout.createSequentialGroup()
                        .addComponent(lblBarcos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCantBarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBombaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBombaTorpedo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBombaMisil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBombaNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlInventarioLayout.createSequentialGroup()
                        .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnBombaHecatombe))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlInventarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInventarioLayout.setVerticalGroup(
            pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInventarioLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBombaNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBombasNormales1)
                    .addComponent(lblCantBombasNormales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBombaMisil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblCantBombasMisil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBombaTorpedo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCantBombasTorpedo))
                .addGap(14, 14, 14)
                .addComponent(btnBombaHecatombe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblCantBombasHecatombe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(lblBombaActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarcos1)
                    .addComponent(lblCantBarcos))
                .addContainerGap())
        );

        jPanel1.add(pnlInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 330));

        javax.swing.GroupLayout pnlTableroLayout = new javax.swing.GroupLayout(pnlTablero);
        pnlTablero.setLayout(pnlTableroLayout);
        pnlTableroLayout.setHorizontalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlTableroLayout.setVerticalGroup(
            pnlTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel1.add(pnlTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 400, 400));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomenu.jpg"))); // NOI18N
        lblFondo.setInheritsPopupMenu(false);
        lblFondo.setMaximumSize(new java.awt.Dimension(79, 26));
        lblFondo.setMinimumSize(new java.awt.Dimension(79, 26));
        lblFondo.setName(""); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBombaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBombaNormalActionPerformed
        bombaSeleccionada = 0;
        lblBombaActual.setText("Normal");
    }//GEN-LAST:event_btnBombaNormalActionPerformed

    private void btnBombaMisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBombaMisilActionPerformed
        bombaSeleccionada = 1;
        lblBombaActual.setText("Misil");
    }//GEN-LAST:event_btnBombaMisilActionPerformed

    private void btnBombaTorpedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBombaTorpedoActionPerformed
        bombaSeleccionada = 2;
        lblBombaActual.setText("Torpedo");
    }//GEN-LAST:event_btnBombaTorpedoActionPerformed

    private void btnBombaHecatombeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBombaHecatombeActionPerformed
        bombaSeleccionada = 3;
        lblBombaActual.setText("Hecatombe");
    }//GEN-LAST:event_btnBombaHecatombeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partida(menu, archivoTablero).setVisible(true);
            }
        });
    }

    private Inventario inventario = new Inventario();
    private ControladorPartida control = new ControladorPartida(inventario);
    private String ruta;
    private int bombaSeleccionada;
    private Casillas[][] botonesAsignados;

    public void partidaActiva() {
        
        //Construye el tablero
        control.construccionTablero(archivoTablero);
        botonesAsignados = control.getBotonesAsignados();

        //Seteo del texto en inventario
        lblCantBombasNormales.setText(String.valueOf(inventario.cantidadBombasPartida[0]));
        lblCantBombasMisil.setText(String.valueOf(inventario.cantidadBombasPartida[1]));
        lblCantBombasTorpedo.setText(String.valueOf(inventario.cantidadBombasPartida[2]));
        lblCantBombasHecatombe.setText(String.valueOf(inventario.cantidadBombasPartida[3]));
        lblCantBarcos.setText(String.valueOf(inventario.getCantidadBarcosTablero()));
        
        mostrarTablero();
    }

    public void mostrarTablero() {
        int x, y;
        int casillaTamañoFilas = (400 / control.getFilas());
        int casillaTamañoColumnas = (400 / control.getColumnas());
        ButtonController bt = new ButtonController();

        for (int i = 0; i < control.getFilas(); i++) {
            y = casillaTamañoFilas * i;
            for (int j = 0; j < control.getColumnas(); j++) {
                x = casillaTamañoColumnas * j;
                botonesAsignados[i][j].setCoordenadaY(i);
                botonesAsignados[i][j].setCoordenadaX(j);

                botonesAsignados[i][j].setBackground(Color.blue);

                botonesAsignados[i][j].setBounds(x, y, casillaTamañoColumnas, casillaTamañoFilas);
                botonesAsignados[i][j].setFont(new Font("Arial", Font.PLAIN, (int) (8)));

                botonesAsignados[i][j].addActionListener(bt);
                pnlTablero.add(botonesAsignados[i][j]);
            }
        }
        pnlTablero.repaint();
        pnlTablero.revalidate();
    }

    public void cerrarPartida(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje + "\nPuntos: "+inventario.getPuntosPartida(), "Partida terminada", JOptionPane.INFORMATION_MESSAGE);
        // Se almacena el punteo
        control.almacenarPuntaje(usuario);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        // Se cierra este formulario
        this.dispose();
    }

    //Actividad de cada botón
    
    private ExplosionesBombas explosionesBombas = new ExplosionesBombas();

    private class ButtonController implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < botonesAsignados.length; i++) {
                for (int j = 0; j < botonesAsignados[0].length; j++) {
                    System.out.println(botonesAsignados[i][j].getCaracterCasillas());
                    if (e.getSource().equals(botonesAsignados[i][j])) {
                        try {

                            if (inventario.cantidadBombasPartida[bombaSeleccionada] > 0) {
                                if (!botonesAsignados[i][j].isRevelada()) {
                                    switch (bombaSeleccionada) {
                                        case 0:
                                            // Explosión simple
                                            botonesAsignados = botonesAsignados[i][j].accionBoton(botonesAsignados);
                                            break;
                                        case 1:
                                            // Explosión tipo misil
                                            botonesAsignados = botonesAsignados[i][j].accionBoton(botonesAsignados);
                                            botonesAsignados = explosionesBombas.explosionBombaMisil(botonesAsignados, i, j);
                                            break;
                                        case 2:
                                            // Explosión tipo torpedo
                                            botonesAsignados = botonesAsignados[i][j].accionBoton(botonesAsignados);
                                            botonesAsignados = explosionesBombas.explosionBombaTorpedo(botonesAsignados, i, j);
                                            break;
                                        case 3:
                                            // Explosión tipo hecatombe
                                            botonesAsignados = botonesAsignados[i][j].accionBoton(botonesAsignados);
                                            botonesAsignados = explosionesBombas.explosionBombaHecatombe(botonesAsignados, i, j);
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                    //Se descuenta 1 de la bomba actual
                                    inventario.cantidadBombasPartida[bombaSeleccionada] -= 1;
                                }

                                switch (bombaSeleccionada) {
                                    case 0:
                                        lblCantBombasNormales.setText(String.valueOf(inventario.cantidadBombasPartida[bombaSeleccionada]));
                                        break;
                                    case 1:
                                        lblCantBombasMisil.setText(String.valueOf(inventario.cantidadBombasPartida[bombaSeleccionada]));
                                        break;
                                    case 2:
                                        lblCantBombasTorpedo.setText(String.valueOf(inventario.cantidadBombasPartida[bombaSeleccionada]));
                                        break;
                                    case 3:
                                        lblCantBombasHecatombe.setText(String.valueOf(inventario.cantidadBombasPartida[bombaSeleccionada]));
                                        break;
                                    default:
                                        throw new AssertionError();
                                }

                                lblCantBarcos.setText(String.valueOf(inventario.getCantidadBarcosTablero()));
                                if (inventario.getCantidadBarcosTablero() <= 0) {
                                    //Ganó la partida
                                    cerrarPartida("Ganaste, has defendido a tu nación");
                                } else {
                                    if (inventario.cantidadBombasPartida[0] <= 0 && inventario.cantidadBombasPartida[1] <= 0 && inventario.cantidadBombasPartida[2] <= 0 && inventario.cantidadBombasPartida[3] <= 0) {
                                        System.out.println("Te quedaste sin bombas, mi helmano");
                                        //jLabel1.setText("No tienes más bombas de este tipo");
                                        //Perdió la partida
                                        cerrarPartida("Perdiste, te has quedado sin bombas");
                                    }
                                }
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Partida.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBombaHecatombe;
    private javax.swing.JButton btnBombaMisil;
    private javax.swing.JButton btnBombaNormal;
    private javax.swing.JButton btnBombaTorpedo;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBarcos1;
    private javax.swing.JLabel lblBombaActual;
    private javax.swing.JLabel lblBombasNormales1;
    private javax.swing.JLabel lblCantBarcos;
    private javax.swing.JLabel lblCantBombasHecatombe;
    private javax.swing.JLabel lblCantBombasMisil;
    private javax.swing.JLabel lblCantBombasNormales;
    private javax.swing.JLabel lblCantBombasTorpedo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlInventario;
    private javax.swing.JPanel pnlTablero;
    // End of variables declaration//GEN-END:variables
}
