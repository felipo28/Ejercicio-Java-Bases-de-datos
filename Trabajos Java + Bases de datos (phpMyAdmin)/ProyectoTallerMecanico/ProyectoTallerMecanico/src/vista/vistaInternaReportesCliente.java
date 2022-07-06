package vista;

import controlador.claseControladorCliente;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.claseClienteVehiculo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class vistaInternaReportesCliente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public vistaInternaReportesCliente() {
        initComponents();
        this.setTitle("Clientes Vehiculos");
        modelo = new DefaultTableModel();
        limpiarTabla();
        listarTabla();
    }

    public void listarTabla() {
        claseControladorCliente controlCliente = new claseControladorCliente();
        List <claseClienteVehiculo> lista = new ArrayList<>();
        lista = controlCliente.listarClienteVehiculo();
        modelo = (DefaultTableModel) tblClientes.getModel();
        Object[] obj = new Object [6];
        
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getPlaca();
            obj[1] = lista.get(i).getIdentificacion();
            obj[2] = lista.get(i).getNombre();
            obj[3] = lista.get(i).getApellidos();
            obj[4] = lista.get(i).getModelo();
            obj[5] = lista.get(i).getColor();
            modelo.addRow(obj);
        }
        tblClientes.setModel(modelo);
    }
    
    public void limpiarTabla() {
        for (int i = 0; i < tblClientes.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setIconifiable(true);
        setMaximizable(true);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(469, 53));
        jToolBar1.setMinimumSize(new java.awt.Dimension(448, 53));

        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnBuscar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/sincronizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActualizar);

        btnExportar.setForeground(new java.awt.Color(0, 0, 0));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/Excel.png"))); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.setFocusable(false);
        btnExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnExportar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExportar);

        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnCerrar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Reporte Vehiculos y clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Cedula", "Nombre", "Apellido", "Modelo", "Color"
            }
        ));
        tblClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblClientes.setGridColor(new java.awt.Color(255, 255, 255));
        tblClientes.setVerifyInputWhenFocusTarget(false);
        tblClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblClientesFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = null;
        nombre = JOptionPane.showInputDialog(null, "Escriba el nombre a buscar");
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "No digito ningun nombre", "error", HEIGHT);
        } else {
            claseControladorCliente controladorCliente = new claseControladorCliente();
            List <claseClienteVehiculo> listado = new ArrayList<>();
            listado = controladorCliente.buscarClienteVehiculo(nombre);
            limpiarTabla();
            
            modelo = (DefaultTableModel) tblClientes.getModel();
            Object[] obj = new Object [6];
        
            for (int i = 0; i < listado.size(); i++) {
                obj[0] = listado.get(i).getPlaca();
                obj[1] = listado.get(i).getIdentificacion();
                obj[2] = listado.get(i).getNombre();
                obj[3] = listado.get(i).getApellidos();
                obj[4] = listado.get(i).getModelo();
                obj[5] = listado.get(i).getColor();
                modelo.addRow(obj);
            }
            tblClientes.setModel(modelo);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblClientesFocusGained

    }//GEN-LAST:event_tblClientesFocusGained

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        //crear el archivo
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar Archivo");
        chooser.setAcceptAllFileFilterUsed(false); //activa el cuadro de dialogo para guardar como
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                //crear el archivo de excel
                File archivoXLS = new File(ruta); //objetivo tipo archivo
                if (archivoXLS.exists()) {  //pregunto si existe
                    archivoXLS.delete();    //elimino si existe
                }
                archivoXLS.createNewFile(); //creo el archivo
                Workbook libro = new HSSFWorkbook(); //creando el libro de excel
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Datos");    //nombre de la hoja dentro del libro de excel
                hoja.setDisplayGridlines(false);
                Row filTitulo = hoja.createRow(0);
                Cell celTitulo = filTitulo.createCell(0);
                celTitulo.setCellValue("LISTADO DE CLIENTES");
                int filaInicio = 1;
                for (int f = 0; f < tblClientes.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio); //creo la fila
                    filaInicio++;
                    for (int c = 0; c < tblClientes.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(tblClientes.getColumnName(c));
                        } 
                    }
                }
                filaInicio = 2;
                for (int f = 0; f < tblClientes.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < tblClientes.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (tblClientes.getValueAt(f, c) instanceof Integer) {
                            celda.setCellValue(Integer.parseInt(tblClientes.getValueAt(f, c).toString()));
                        } else {
                            celda.setCellValue(String.valueOf(tblClientes.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                System.err.println("No se pudo crear, abrir o guardar el archivo de excel. " + e.getMessage());
            }
        }
        
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        limpiarTabla();
        listarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCerrar;
    public static javax.swing.JButton btnExportar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
