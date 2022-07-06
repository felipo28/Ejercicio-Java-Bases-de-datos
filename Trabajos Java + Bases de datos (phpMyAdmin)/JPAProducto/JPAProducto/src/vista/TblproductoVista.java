package vista;

import dao.tblproductoDAO;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class TblproductoVista extends javax.swing.JFrame {
    
    private tblproductoDAO tpd = new tblproductoDAO();

    public TblproductoVista() {
        initComponents();
        this.setTitle("Vista empleados");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        llenarPantalla("");
        limpiarCmbPersona();
        llenarCmbproducto(cmbPersona);
    }
    
    private void llenarCmbproducto(JComboBox cmbPersona){
        tpd.getPersonaCmb(cmbPersona);
    }
    
    public void limpiarCmbPersona(){
        cmbPersona.removeAllItems();
    }
    
    public void limpiarTextos(){
        TXTId.setText("");
        TXTNomProducto.setText("");
        TXTPiezas_Caja.setText("");
        TXTPrecio_publico.setText("");
        TXTPrecio_mayoreo.setText("");
    }
    
    public void llenarPantalla(String producto){
        tpd.listar(tblProductoTable, producto);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TXTPiezas_Caja = new javax.swing.JTextField();
        TXTPrecio_publico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTPrecio_mayoreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        TXTNomProducto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        cmbPersona = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id Producto");

        TXTId.setBackground(new java.awt.Color(255, 255, 255));
        TXTId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTId.setForeground(new java.awt.Color(0, 0, 0));
        TXTId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTIdKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Piezas x Caja");

        TXTPiezas_Caja.setBackground(new java.awt.Color(255, 255, 255));
        TXTPiezas_Caja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTPiezas_Caja.setForeground(new java.awt.Color(0, 0, 0));

        TXTPrecio_publico.setBackground(new java.awt.Color(255, 255, 255));
        TXTPrecio_publico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTPrecio_publico.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio publico x caja");

        TXTPrecio_mayoreo.setBackground(new java.awt.Color(255, 255, 255));
        TXTPrecio_mayoreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTPrecio_mayoreo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio mayoreo x caja -20%");

        btnInsertar.setBackground(new java.awt.Color(0, 153, 204));
        btnInsertar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(0, 0, 0));
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 153, 204));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 204));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblProductoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProductoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductoTable);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre del producto");

        TXTNomProducto.setBackground(new java.awt.Color(255, 255, 255));
        TXTNomProducto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXTNomProducto.setForeground(new java.awt.Color(0, 0, 0));
        TXTNomProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNomProductoKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 153, 204));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(0, 153, 204));
        btnCerrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(TXTId)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTNomProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(TXTPiezas_Caja)
                        .addComponent(TXTPrecio_publico)
                        .addComponent(TXTPrecio_mayoreo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TXTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TXTNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TXTPiezas_Caja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TXTPrecio_publico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TXTPrecio_mayoreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnCerrar)
                            .addComponent(cmbPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

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

    private void TXTIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIdKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_TXTIdKeyTyped

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        if (TXTNomProducto.getText().equals("") || TXTPiezas_Caja.getText().equals("") || TXTPrecio_mayoreo.getText().equals("") || TXTPrecio_publico.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Error. Se deben digitar todos los datos.");
        }else {
            int piezasC = Integer.parseInt(TXTPiezas_Caja.getText());
            String nomProducto = TXTNomProducto.getText();
            int prePublico = Integer.parseInt(TXTPrecio_publico.getText());
            int preMayoreo = Integer.parseInt(TXTPrecio_mayoreo.getText());
            String mensaje = tpd.insertar(nomProducto, piezasC, prePublico, preMayoreo);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiarTextos();
            llenarPantalla("");
            limpiarCmbPersona();
            llenarCmbproducto(cmbPersona);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void TXTNomProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNomProductoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTNomProductoKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (TXTId.getText().equals("") || TXTNomProducto.getText().equals("") || TXTPiezas_Caja.getText().equals("") || TXTPrecio_mayoreo.getText().equals("") || TXTPrecio_publico.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Error. Se deben digitar todos los datos.");
        }else {
            int id = Integer.parseInt(TXTId.getText());
            int piezasC = Integer.parseInt(TXTPiezas_Caja.getText());
            String nomProducto = TXTNomProducto.getText();
            int prePublico = Integer.parseInt(TXTPrecio_publico.getText());
            int preMayoreo = Integer.parseInt(TXTPrecio_mayoreo.getText());
            String mensaje = tpd.editar(id, nomProducto, piezasC, prePublico, preMayoreo);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiarTextos();
            llenarPantalla("");
            
            limpiarCmbPersona();
            llenarCmbproducto(cmbPersona);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (TXTId.getText().equals("") ) {
            JOptionPane.showMessageDialog(null, "Error. Se debe digitar el id para poder eliminar.");
        }else {
            int id = Integer.parseInt(TXTId.getText());
            String mensaje = tpd.eliminar(id);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiarTextos();
            llenarPantalla("");
            
            limpiarCmbPersona();
            llenarCmbproducto(cmbPersona);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblProductoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoTableMouseClicked
        int index = tblProductoTable.getSelectedRow();
        TXTId.setText(tblProductoTable.getValueAt(index, 0) + "");
        TXTNomProducto.setText(tblProductoTable.getValueAt(index, 1) + "");
        TXTPiezas_Caja.setText(tblProductoTable.getValueAt(index, 2) + "");
        TXTPrecio_publico.setText(tblProductoTable.getValueAt(index, 3) + "");
        TXTPrecio_mayoreo.setText(tblProductoTable.getValueAt(index, 4) + "");
    }//GEN-LAST:event_tblProductoTableMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        llenarPantalla(TXTNomProducto.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        TblusuarioVista login = new TblusuarioVista();
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
            java.util.logging.Logger.getLogger(TblproductoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TblproductoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TblproductoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TblproductoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TblproductoVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTId;
    private javax.swing.JTextField TXTNomProducto;
    private javax.swing.JTextField TXTPiezas_Caja;
    private javax.swing.JTextField TXTPrecio_mayoreo;
    private javax.swing.JTextField TXTPrecio_publico;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    public static javax.swing.JComboBox<String> cmbPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductoTable;
    // End of variables declaration//GEN-END:variables
}
