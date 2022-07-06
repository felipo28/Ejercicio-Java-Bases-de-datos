package vista;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import modelo.claseFondo;


public class vistaPrincipal extends javax.swing.JFrame {

    public InputStream imagenFondo = this.getClass().getResourceAsStream("/imagenes/fondo3.jpg");

    public vistaPrincipal() {
        initComponents();
        this.setExtendedState(6);
        cargarImagenFondo(jEscritorio, imagenFondo);
    }

    public void cargarImagenFondo(javax.swing.JDesktopPane jDeskp, InputStream fileImagen) {
        try {
            BufferedImage imagen = ImageIO.read(fileImagen);
            jDeskp.setBorder(new claseFondo(imagen));
        } catch (Exception e) {
            System.out.println("Imagen no disponible");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuCliente = new javax.swing.JMenuItem();
        mnuCliente1 = new javax.swing.JMenuItem();
        mnuMecanico1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuCliente2 = new javax.swing.JMenuItem();
        mnuCliente3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1157, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jMenu2.setText("Gestionar");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        mnuCliente.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        mnuCliente.setText("Clientes");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCliente);

        mnuCliente1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        mnuCliente1.setText("Productos");
        mnuCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCliente1ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCliente1);

        mnuMecanico1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        mnuMecanico1.setText("Facturas");
        mnuMecanico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMecanico1ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuMecanico1);

        jSeparator2.setMinimumSize(new java.awt.Dimension(0, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 10));
        jMenu2.add(jSeparator2);

        mnuSalir.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N

        mnuCliente2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        mnuCliente2.setText("Clientes - Facturas");
        mnuCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCliente2ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCliente2);

        mnuCliente3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        mnuCliente3.setText("Facturas - Productos");
        mnuCliente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCliente3ActionPerformed(evt);
            }
        });
        jMenu3.add(mnuCliente3);
        jMenu3.add(jSeparator3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed

    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCliente1ActionPerformed

    private void mnuMecanico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMecanico1ActionPerformed
        vistaInternaFacturas vista = new vistaInternaFacturas();
        jEscritorio.add(vista);
        vista.show();
    }//GEN-LAST:event_mnuMecanico1ActionPerformed

    private void mnuCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCliente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCliente2ActionPerformed

    private void mnuCliente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCliente3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCliente3ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuCliente1;
    private javax.swing.JMenuItem mnuCliente2;
    private javax.swing.JMenuItem mnuCliente3;
    private javax.swing.JMenuItem mnuMecanico1;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
