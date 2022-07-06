package vista;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import modelo.claseFondo;
import javax.swing.ImageIcon;


public class vistaPrincipal extends javax.swing.JFrame {

    public InputStream imagenFondo = this.getClass().getResourceAsStream("/imagenes/fondo.jpg");

    String [] sesionInterna = new String[3];
    
    public vistaPrincipal(String [] sesion) {
        initComponents();
        cargarImagenFondo(jEscritorio, imagenFondo);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconos/icono.png")).getImage());
        mnuUsuario.setText("Menu " + sesion[1]);
        sesionInterna = sesion;
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
        mnuGestionarTaller = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCliente = new javax.swing.JMenuItem();
        mnuVehiculo = new javax.swing.JMenuItem();
        mnuMecanico = new javax.swing.JMenuItem();
        mnuOrdenesServicio = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuReporteCliente = new javax.swing.JMenuItem();
        mnuReporteVehiculo = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        mnuGestionarTaller.setForeground(new java.awt.Color(0, 0, 0));
        mnuGestionarTaller.setText("Gestionar taller");
        mnuGestionarTaller.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuGestionarTaller.add(jSeparator1);

        mnuCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuCliente.setForeground(new java.awt.Color(0, 0, 0));
        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        mnuGestionarTaller.add(mnuCliente);

        mnuVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        mnuVehiculo.setText("Vehiculo");
        mnuVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVehiculoActionPerformed(evt);
            }
        });
        mnuGestionarTaller.add(mnuVehiculo);

        mnuMecanico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuMecanico.setForeground(new java.awt.Color(0, 0, 0));
        mnuMecanico.setText("Mecanico");
        mnuMecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMecanicoActionPerformed(evt);
            }
        });
        mnuGestionarTaller.add(mnuMecanico);

        mnuOrdenesServicio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuOrdenesServicio.setForeground(new java.awt.Color(0, 0, 0));
        mnuOrdenesServicio.setText("Ordenes de Servicio");
        mnuOrdenesServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOrdenesServicioActionPerformed(evt);
            }
        });
        mnuGestionarTaller.add(mnuOrdenesServicio);

        jMenuBar1.add(mnuGestionarTaller);

        mnuReportes.setForeground(new java.awt.Color(0, 0, 0));
        mnuReportes.setText("Reportes");
        mnuReportes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuReportes.add(jSeparator2);

        mnuReporteCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuReporteCliente.setForeground(new java.awt.Color(0, 0, 0));
        mnuReporteCliente.setText("Reporte Cliente");
        mnuReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteClienteActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuReporteCliente);

        mnuReporteVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuReporteVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        mnuReporteVehiculo.setText("Reporte Vehiculo");
        mnuReporteVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteVehiculoActionPerformed(evt);
            }
        });
        mnuReportes.add(mnuReporteVehiculo);

        jMenuBar1.add(mnuReportes);

        mnuUsuario.setForeground(new java.awt.Color(0, 0, 0));
        mnuUsuario.setText("Menu");
        mnuUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuUsuario.add(jSeparator3);

        mnuSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnuSalir.setForeground(new java.awt.Color(0, 0, 0));
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuUsuario.add(mnuSalir);

        jMenuBar1.add(mnuUsuario);

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
        vistaInternaCliente vtnInterna = new vistaInternaCliente();
        jEscritorio.add(vtnInterna);
        vtnInterna.show();
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteClienteActionPerformed
        vistaInternaReportesCliente vtnInternaReporteCli = new vistaInternaReportesCliente();
        jEscritorio.add(vtnInternaReporteCli);
        vtnInternaReporteCli.show();
    }//GEN-LAST:event_mnuReporteClienteActionPerformed

    private void mnuVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVehiculoActionPerformed
        vistaInternaVehiculo vtnInternaVehiculo = new vistaInternaVehiculo();
        jEscritorio.add(vtnInternaVehiculo);
        vtnInternaVehiculo.show();
    }//GEN-LAST:event_mnuVehiculoActionPerformed

    private void mnuMecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMecanicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMecanicoActionPerformed

    private void mnuOrdenesServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOrdenesServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuOrdenesServicioActionPerformed

    private void mnuReporteVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteVehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuReporteVehiculoActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new vistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenu mnuGestionarTaller;
    private javax.swing.JMenuItem mnuMecanico;
    private javax.swing.JMenuItem mnuOrdenesServicio;
    private javax.swing.JMenuItem mnuReporteCliente;
    private javax.swing.JMenuItem mnuReporteVehiculo;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JMenuItem mnuVehiculo;
    // End of variables declaration//GEN-END:variables
}
