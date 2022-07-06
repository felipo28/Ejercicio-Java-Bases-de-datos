
package vista;

import dao.TblEmpleadoDAO;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class TblpersonaVista extends javax.swing.JFrame {

    private TblEmpleadoDAO tpd = new TblEmpleadoDAO();
    public TblpersonaVista() {
        initComponents();
        this.setTitle("Vista empleados");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        llenarTabla("");
        limpiarCmbPersona();
        llenarCmbPersona(cmbPersona);
    }
    
    private void llenarCmbPersona(JComboBox cmbPersona){
        tpd.getPersonaCmb(cmbPersona);
    }
    
    public void limpiarCmbPersona(){
        cmbPersona.removeAllItems();
    }
    
    public void limpiarTexto(){
        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellidos.setText("");
        TXTEdad.setText("");
        TXTTelefono.setText("");
    }
    
    public void llenarTabla(String nombre){
        tpd.listarPersona(tblTpersona, nombre);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXTTelefono = new javax.swing.JTextField();
        BtnInsertar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTpersona = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        cmbPersona = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Identificacion");

        TXTId.setBackground(new java.awt.Color(255, 255, 255));
        TXTId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTId.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        TXTNombre.setBackground(new java.awt.Color(255, 255, 255));
        TXTNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos");

        TXTApellidos.setBackground(new java.awt.Color(255, 255, 255));
        TXTApellidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTApellidos.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Edad");

        TXTEdad.setBackground(new java.awt.Color(255, 255, 255));
        TXTEdad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTEdadKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");

        TXTTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TXTTelefono.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTTelefono.setForeground(new java.awt.Color(0, 0, 0));

        BtnInsertar.setBackground(new java.awt.Color(0, 51, 255));
        BtnInsertar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        BtnInsertar.setText("Insertar");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnEditar.setBackground(new java.awt.Color(0, 51, 255));
        BtnEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(0, 51, 255));
        BtnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        tblTpersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTpersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTpersonaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTpersona);

        btnBuscar.setBackground(new java.awt.Color(102, 0, 204));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(0, 51, 255));
        btnCerrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        cmbPersona.setBackground(new java.awt.Color(255, 255, 255));
        cmbPersona.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TXTApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(TXTNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                    .addComponent(TXTEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTId, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)))
                        .addGap(60, 60, 60))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TXTApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TXTEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnInsertar)
                            .addComponent(BtnEditar)
                            .addComponent(BtnEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTEdadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c >'9') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TXTEdadKeyTyped

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
        if (TXTNombre.getText().equals("") || TXTApellidos.getText().equals("") || TXTEdad.getText().equals("") || TXTTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error, se deben digitar todos los datos.");
        } else {
            
            String nombre = TXTNombre.getText();
            String apellidos = TXTApellidos.getText();
            int edad = Integer.parseInt(TXTEdad.getText());
            
            //validacion de rango de edad entre o y 130
            
            String telefono = TXTTelefono.getText();
            
            String mensaje = tpd.insertar(nombre, apellidos, edad, telefono);
            JOptionPane.showMessageDialog(null, mensaje);
            
            llenarTabla("");
            limpiarTexto();
            limpiarCmbPersona();
            llenarCmbPersona(cmbPersona);
            
        }
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (TXTId.getText().equals("") || TXTNombre.getText().equals("") || TXTApellidos.getText().equals("") || TXTEdad.getText().equals("") || TXTTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error, se deben digitar todos los datos.");
        } else {
            int id = Integer.parseInt(TXTId.getText());
            String nombre = TXTNombre.getText();
            String apellidos = TXTApellidos.getText();
            int edad = Integer.parseInt(TXTEdad.getText());
            
            //validacion de rango de edad entre o y 130
            
            String telefono = TXTTelefono.getText();
            
            String mensaje = tpd.editar(id, nombre, apellidos, edad, telefono);
            JOptionPane.showMessageDialog(null, mensaje);
            llenarTabla("");
            limpiarTexto();
            limpiarCmbPersona();
            llenarCmbPersona(cmbPersona);
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (TXTId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Error, se deben digitar todos los datos.");
        } else {
            int id = Integer.parseInt(TXTId.getText());

            String mensaje = tpd.eliminar(id);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiarTexto();
            llenarTabla("");
            limpiarCmbPersona();
            llenarCmbPersona(cmbPersona);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void tblTpersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTpersonaMouseClicked
        int index = tblTpersona.getSelectedRow();
        TXTId.setText(tblTpersona.getValueAt(index, 0) +"");
        TXTNombre.setText(tblTpersona.getValueAt(index, 1)+"");
        TXTApellidos.setText(tblTpersona.getValueAt(index, 2)+"");
        TXTEdad.setText(tblTpersona.getValueAt(index, 3)+"");
        TXTTelefono.setText(tblTpersona.getValueAt(index, 4)+"");
        
    }//GEN-LAST:event_tblTpersonaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        llenarTabla(TXTNombre.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        tblusuarioVista login = new tblusuarioVista();
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(TblpersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TblpersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TblpersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TblpersonaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TblpersonaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JTextField TXTApellidos;
    private javax.swing.JTextField TXTEdad;
    private javax.swing.JTextField TXTId;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXTTelefono;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    public static javax.swing.JComboBox<String> cmbPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTpersona;
    // End of variables declaration//GEN-END:variables
}
