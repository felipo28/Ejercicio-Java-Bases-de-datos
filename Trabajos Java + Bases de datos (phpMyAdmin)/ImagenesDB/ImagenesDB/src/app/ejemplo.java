package app;

import modelo.claseImagenMySQL;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import modelo.claseConexion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.claseControladorDatos;
import modelo.claseDatos;

public class ejemplo extends javax.swing.JFrame {
    DefaultTableModel modelo;

    public ejemplo() {
        initComponents();
        this.setTitle("Registro");
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        limpiarTabla();
        listarTable();
    }
    
    public void listarTable(){
        claseControladorDatos controlEmpleado = new claseControladorDatos();
        List <claseDatos> lista = new ArrayList<>();
        lista = controlEmpleado.listar();
        modelo = (DefaultTableModel) tblEmpleados.getModel();
        Object [] obj = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getId();
            obj[1] = lista.get(i).getCedula();
            obj[2] = lista.get(i).getNombre();
            obj[3] = lista.get(i).getApellidos();
            obj[4] = lista.get(i).getTelefono();
            modelo.addRow(obj);
        }
        tblEmpleados.setModel(modelo);
    }
    
    public void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    public void limpiarTexto(){
        TXTcedula.setText("");
        TXTnombre.setText("");
        TXTapellidos.setText("");
        TXTtelefono.setText("");
        jpImagen.removeAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpImagen = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTcedula = new javax.swing.JTextField();
        TXTnombre = new javax.swing.JTextField();
        TXTtelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TXTapellidos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jpImagen.setBackground(new java.awt.Color(255, 255, 255));
        jpImagen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2)));

        javax.swing.GroupLayout jpImagenLayout = new javax.swing.GroupLayout(jpImagen);
        jpImagen.setLayout(jpImagenLayout);
        jpImagenLayout.setHorizontalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );
        jpImagenLayout.setVerticalGroup(
            jpImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        btnCargar.setBackground(new java.awt.Color(102, 0, 204));
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cedula", "Nombre ", "Apellidos", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleados);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cedula");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Telefono");

        TXTcedula.setBackground(new java.awt.Color(255, 255, 255));
        TXTcedula.setForeground(new java.awt.Color(0, 0, 0));

        TXTnombre.setBackground(new java.awt.Color(255, 255, 255));
        TXTnombre.setForeground(new java.awt.Color(0, 0, 0));

        TXTtelefono.setBackground(new java.awt.Color(255, 255, 255));
        TXTtelefono.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellidos");

        TXTapellidos.setBackground(new java.awt.Color(255, 255, 255));
        TXTapellidos.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTcedula)
                            .addComponent(TXTtelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(TXTnombre))
                        .addGap(75, 75, 75)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TXTapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXTcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TXTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TXTapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCargar)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jpImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
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

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.jpg", "jpg");
        fc.setFileFilter(filtro);
        
        int seleccion = fc.showOpenDialog(this);
        
        PreparedStatement ps;
        ResultSet rs;
        claseConexion miConexion = new claseConexion();
        claseDatos empleado = new claseDatos();
        empleado.setCedula(Integer.parseInt(TXTcedula.getText()));
        empleado.setNombre(TXTnombre.getText());
        empleado.setApellidos(TXTapellidos.getText());
        empleado.setTelefono(TXTtelefono.getText());
        
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            String ruta = archivo.getAbsolutePath();
            
            try {
                FileInputStream fis = new FileInputStream(archivo);
                Connection con = miConexion.getConnection();
                ps = con.prepareStatement("INSERT INTO datos (imagen,cedula,nombre,apellidos,telefono) values (?,?,?,?,?)");
                ps.setBinaryStream(1, fis, (int) archivo.length());
                ps.setInt(2, empleado.getCedula());
                ps.setString(3, empleado.getNombre());
                ps.setString(4, empleado.getApellidos());
                ps.setString(5, empleado.getTelefono());
                ps.execute();
                JOptionPane.showMessageDialog(null, "Datos e Imagen Guardada");
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ejemplo.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(null, "Error al gestionar el archivo " + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(ejemplo.class.getName()).log(Level.SEVERE,null,ex);
                JOptionPane.showMessageDialog(null, "Error al abrir o guardar en la base de datos " + ex.getMessage());
            }
        }
        limpiarTabla();
        listarTable();
        limpiarTexto();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void mostrar(int id){
     PreparedStatement ps;
        ResultSet rs;
        claseConexion miConexion = new claseConexion();
        
        try {
            Connection con = miConexion.getConnection();
            ps = con.prepareStatement("SELECT imagen,cedula,nombre,apellidos,telefono FROM datos WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            BufferedImage buffimg = null;
            byte[] image = null;
            while (rs.next()) {                
                image = rs.getBytes("imagen");
                InputStream img = rs.getBinaryStream(1);
                buffimg = ImageIO.read(img);
                claseImagenMySQL imagen = new claseImagenMySQL(jpImagen.getHeight(),jpImagen.getWidth(),buffimg);
                jpImagen.add(imagen);
                jpImagen.repaint();
                TXTcedula.setText(String.valueOf(rs.getInt("cedula")));
                TXTnombre.setText(rs.getString("nombre"));
                TXTapellidos.setText(rs.getString("apellidos"));
                TXTtelefono.setText(rs.getString("telefono"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ejemplo.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex.getMessage());
        }catch (IOException ex) {
            Logger.getLogger(ejemplo.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex.getMessage());
        }
}
    private void tblEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadosMouseClicked
        int index = tblEmpleados.getSelectedRow();
        
        TXTcedula.setText(tblEmpleados.getValueAt(index, 1) + "");
        TXTnombre.setText(tblEmpleados.getValueAt(index, 2) + "");
        TXTapellidos.setText(tblEmpleados.getValueAt(index, 3) + "");
        TXTtelefono.setText(tblEmpleados.getValueAt(index, 4) + "");
        String id = String.valueOf(tblEmpleados.getValueAt(index, 0));
        limpiarTexto();
        mostrar(Integer.parseInt(id));
    }//GEN-LAST:event_tblEmpleadosMouseClicked

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
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejemplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejemplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTapellidos;
    private javax.swing.JTextField TXTcedula;
    private javax.swing.JTextField TXTnombre;
    private javax.swing.JTextField TXTtelefono;
    private javax.swing.JButton btnCargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpImagen;
    private javax.swing.JTable tblEmpleados;
    // End of variables declaration//GEN-END:variables
}
