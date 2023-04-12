/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tableros;

import Archivos.Archivos;
import Partida.Partida;
import com.mycompany.batallanaval.Menu;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class SeleccionTableros extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionTableros
     */
    //private static javax.swing.JFrame menuAnterior;
    private static Menu menu;
    private static TablerosGuardados tablerosGuardados;
    public SeleccionTableros(TablerosGuardados tablerosGuardados, Menu menu){
        this.tablerosGuardados = tablerosGuardados;
        this.menu = menu;
        initComponents();
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
        pnlSeleccionTableros = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTableroPrincipiante = new javax.swing.JButton();
        btnTableroIntermedio = new javax.swing.JButton();
        btnTableroTitan = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnSeleccionarTablero = new javax.swing.JButton();
        txtTableroNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnVisor = new javax.swing.JButton();
        pnlTableros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTableros = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("TABLEROS");

        btnTableroPrincipiante.setText("Principiante");
        btnTableroPrincipiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroPrincipianteActionPerformed(evt);
            }
        });

        btnTableroIntermedio.setText("Intermedio");
        btnTableroIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroIntermedioActionPerformed(evt);
            }
        });

        btnTableroTitan.setText("Titán");
        btnTableroTitan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableroTitanActionPerformed(evt);
            }
        });

        btnTodos.setText("Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnSeleccionarTablero.setText("Seleccionar");
        btnSeleccionarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTableroActionPerformed(evt);
            }
        });

        jLabel3.setText("Tablero No:");

        btnVisor.setText("Visor");
        btnVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSeleccionTablerosLayout = new javax.swing.GroupLayout(pnlSeleccionTableros);
        pnlSeleccionTableros.setLayout(pnlSeleccionTablerosLayout);
        pnlSeleccionTablerosLayout.setHorizontalGroup(
            pnlSeleccionTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSeleccionTablerosLayout.createSequentialGroup()
                .addGroup(pnlSeleccionTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSeleccionTablerosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSeleccionTablerosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSeleccionTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTableroPrincipiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTableroIntermedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTableroTitan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSeleccionarTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSeleccionTablerosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlSeleccionTablerosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTableroNo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlSeleccionTablerosLayout.setVerticalGroup(
            pnlSeleccionTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeleccionTablerosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTableroPrincipiante)
                .addGap(18, 18, 18)
                .addComponent(btnTableroIntermedio)
                .addGap(18, 18, 18)
                .addComponent(btnTableroTitan)
                .addGap(18, 18, 18)
                .addComponent(btnTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pnlSeleccionTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTableroNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionarTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisor)
                .addGap(9, 9, 9))
        );

        jPanel1.add(pnlSeleccionTableros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 150, 330));

        txtAreaTableros.setEditable(false);
        txtAreaTableros.setColumns(20);
        txtAreaTableros.setRows(5);
        jScrollPane1.setViewportView(txtAreaTableros);

        lblTitulo.setText("Tableros disponibles");

        javax.swing.GroupLayout pnlTablerosLayout = new javax.swing.GroupLayout(pnlTableros);
        pnlTableros.setLayout(pnlTablerosLayout);
        pnlTablerosLayout.setHorizontalGroup(
            pnlTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablerosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(pnlTablerosLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTablerosLayout.setVerticalGroup(
            pnlTablerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablerosLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(pnlTableros, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 400, 400));

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

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondomenu.jpg"))); // NOI18N
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTableroPrincipianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroPrincipianteActionPerformed
        txtAreaTableros.setText("");
        for (int i = 0; i < tablerosGuardados.getTablerosGuardados().length; i++) {
            int cantidadBotones = tablerosGuardados.getTablerosGuardados()[i].getColumnas() * tablerosGuardados.getTablerosGuardados()[i].getFilas();
            if (cantidadBotones <= 36) {
                if (tablerosGuardados.getTablerosGuardados()[i] != null) {
                    txtAreaTableros.setText(txtAreaTableros.getText() + "\n" + (i + 1) + ". " + tablerosGuardados.getTablerosGuardados()[i].getNombreArchivo());
                    
                }
            }
        }
        if (txtAreaTableros.getText().equals("")) {
            //No hay tableros
            txtAreaTableros.setText("No hay tableros disponibles");
        }
    }//GEN-LAST:event_btnTableroPrincipianteActionPerformed

    private void btnTableroIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroIntermedioActionPerformed
        txtAreaTableros.setText("");
        for (int i = 0; i < tablerosGuardados.getTablerosGuardados().length; i++) {
            int cantidadBotones = tablerosGuardados.getTablerosGuardados()[i].getColumnas() * tablerosGuardados.getTablerosGuardados()[i].getFilas();
            if (cantidadBotones > 36 && cantidadBotones <= 64) {
                if (tablerosGuardados.getTablerosGuardados()[i] != null) {
                    txtAreaTableros.setText(txtAreaTableros.getText() + "\n" + (i + 1) + ". " + tablerosGuardados.getTablerosGuardados()[i].getNombreArchivo());
                    
                }
            }
        }
        if (txtAreaTableros.getText().equals("")) {
            //No hay tableros
            txtAreaTableros.setText("No hay tableros disponibles");
        }
    }//GEN-LAST:event_btnTableroIntermedioActionPerformed

    private void btnTableroTitanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableroTitanActionPerformed
        txtAreaTableros.setText("");
        for (int i = 0; i < tablerosGuardados.getTablerosGuardados().length; i++) {
            int cantidadBotones = tablerosGuardados.getTablerosGuardados()[i].getColumnas() * tablerosGuardados.getTablerosGuardados()[i].getFilas();
            if (cantidadBotones > 64) {
                if (tablerosGuardados.getTablerosGuardados()[i] != null) {
                    txtAreaTableros.setText(txtAreaTableros.getText() + "\n" + (i + 1) + ". " + tablerosGuardados.getTablerosGuardados()[i].getNombreArchivo());
                    
                }
            }
        }
        if (txtAreaTableros.getText().equals("")) {
            //No hay tableros
            txtAreaTableros.setText("No hay tableros disponibles");
        }
    }//GEN-LAST:event_btnTableroTitanActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        txtAreaTableros.setText("");
        for (int i = 0; i < tablerosGuardados.getTablerosGuardados().length; i++) {
            if (tablerosGuardados.getTablerosGuardados()[0] == null) {
                //No hay tableros
                txtAreaTableros.setText("No hay tableros disponibles");
                break;
            } else{
                if (tablerosGuardados.getTablerosGuardados()[i] != null) {
                    txtAreaTableros.setText(txtAreaTableros.getText()+"\n"+(i+1) +". "+ tablerosGuardados.getTablerosGuardados()[i].getNombreArchivo());
                } else{
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnSeleccionarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTableroActionPerformed
        // Verificación que la casilla no este vacía
        boolean error = false;
        Partida partida = null;
        
        do {            
            try {
                error = false;
                int opcion = Integer.parseInt(txtTableroNo.getText()) - 1;
                partida = new Partida(menu, tablerosGuardados.getTablerosGuardados()[opcion]);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un número válido", "Valor inválido", JOptionPane.INFORMATION_MESSAGE);
                error = true;
            }
        } while (error);
        
        
        partida.setLocationRelativeTo(null);
        partida.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSeleccionarTableroActionPerformed

    private void btnVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisorActionPerformed
        // Verificación que la casilla no este vacía
        boolean error = false;
        Partida partida = null;
        
        int opcion = 0;
        do {
            try {
                error = false;
                opcion = Integer.parseInt(txtTableroNo.getText()) - 1;
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Asegurese de ingresar un número válido", "Valor inválido", JOptionPane.INFORMATION_MESSAGE);
                error = true;
            }
        } while (error);
        
        String caracter[][] = tablerosGuardados.getTablerosGuardados()[opcion].getDimTotal();
        int contBarcos = 0;
        int contBombas = 0;
        
        String texto = "";
        for (int i = 0; i < tablerosGuardados.getTablerosGuardados()[opcion].getFilas(); i++) {
            for (int j = 0; j < tablerosGuardados.getTablerosGuardados()[opcion].getColumnas(); j++) {
                texto += " X ";
                
                switch (caracter[i][j]) {
                    case "~":
                            
                            break;
                        case "B1":
                            contBarcos += 1;
                            break;
                        case "B2":
                            contBarcos += 1;
                            break;
                        case "B3":
                            contBarcos += 1;
                            break;
                        case "I":
                            contBombas += 1;
                            break;
                        case "T":
                            contBombas += 1;
                            break;
                        case "O":
                            contBombas += 1;
                            break;
                        default:
                            
                            break;
                    }
                }
                texto += "\n";
            }
            
            texto += ("\nBarcos: " + contBarcos);
            texto += ("\nBombas: " + contBombas);
            // Seteamos el nuevo texto del visor al txtArea
            txtAreaTableros.setText(texto);
    }//GEN-LAST:event_btnVisorActionPerformed

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
            java.util.logging.Logger.getLogger(SeleccionTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionTableros(tablerosGuardados, menu).setVisible(true);
            }
        });
    }
    
    private File[] archivosTableros;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSeleccionarTablero;
    private javax.swing.JButton btnTableroIntermedio;
    private javax.swing.JButton btnTableroPrincipiante;
    private javax.swing.JButton btnTableroTitan;
    private javax.swing.JButton btnTodos;
    private javax.swing.JButton btnVisor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlSeleccionTableros;
    private javax.swing.JPanel pnlTableros;
    private javax.swing.JTextArea txtAreaTableros;
    private javax.swing.JTextField txtTableroNo;
    // End of variables declaration//GEN-END:variables
}
