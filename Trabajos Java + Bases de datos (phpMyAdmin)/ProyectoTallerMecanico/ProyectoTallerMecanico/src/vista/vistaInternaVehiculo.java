package vista;

import controlador.claseControladorCliente;
import controlador.claseControladorMarca;
import controlador.claseControladorVehiculo;
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
import modelo.claseCliente;
import modelo.claseFondo;
import modelo.claseMarca;
import modelo.claseVehiculo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class vistaInternaVehiculo extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public vistaInternaVehiculo() {
        initComponents();
        this.setTitle("Vehiculo");
        llenarIdCliente();
        llenarMarca();
        limpiarTabla();
        listarTabla();
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
    }
    
    public void llenarIdCliente(){
        claseControladorCliente controlCliente = new claseControladorCliente();
        List <claseCliente> listaCliente = new ArrayList<>();
        listaCliente = controlCliente.listar();
        cmbIdCliente.addItem("Seleccione una opcion");
        for (int i = 0; i < listaCliente.size(); i++) {
            cmbIdCliente.addItem(String.valueOf(listaCliente.get(i).getIdentificacion()));
        }
    }
    public void llenarMarca(){
        claseControladorMarca controlMarca = new claseControladorMarca();
        List <claseMarca> listaMarca = new ArrayList<>();
        listaMarca = controlMarca.listar();
        cmbMarca.addItem("Seleccione una opcion");
        for (int i = 0; i < listaMarca.size(); i++) {
            cmbMarca.addItem(String.valueOf(listaMarca.get(i).getNombre()));
        }
    }

    public void listarTabla() {
        claseControladorVehiculo controlVehiculo = new claseControladorVehiculo();
        List <claseVehiculo> lista = new ArrayList<>();
        lista = controlVehiculo.listar();
        modelo = (DefaultTableModel) tblVehiculo.getModel();
        Object[] obj = new Object [7];
        
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getPlaca();
            obj[1] = lista.get(i).getIdCliente();
            obj[2] = lista.get(i).getNombre_cliente();
            obj[3] = lista.get(i).getCodMarca();
            obj[4] = lista.get(i).getNombre_marca();
            obj[5] = lista.get(i).getModelo();
            obj[6] = lista.get(i).getColor();
            modelo.addRow(obj);
        }
        tblVehiculo.setModel(modelo);
    }
    public void limpiarTabla() {
        for (int i = 0; i < tblVehiculo.getRowCount(); i++) {
            modelo.removeRow(i);
            i -= 1;
        }
    }
    
    public void limpiarTextos() {
        cmbIdCliente.setSelectedItem("Seleccione una opcion");
        cmbMarca.setSelectedItem("Seleccione una opcion");
        TXTPlaca.setText("");
        TXTModelo.setText("");
        TXTColor.setText("");
    }
    
    public void deshabilitarBotones() {
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);
        btnEditar.setVisible(false);
        btnAgregar.setVisible(false);
        btnElimiar.setVisible(false);
        btnBuscar.setVisible(false);
        btnExportar.setVisible(false);
    }
    
    public void habilitarBotones() {
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        btnEditar.setVisible(true);
        btnAgregar.setVisible(true);
        btnElimiar.setVisible(true);
        btnBuscar.setVisible(true);
        btnExportar.setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnElimiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXTModelo = new javax.swing.JTextField();
        TXTColor = new javax.swing.JTextField();
        TXTPlaca = new javax.swing.JTextField();
        cmbIdCliente = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbMarca = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculo = new javax.swing.JTable();

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

        btnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8-agregar-archivo-16.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setFocusable(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAgregar);

        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8-editar-propiedad-16.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnEditar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8-guardar-cerrar-16.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnGuardar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnElimiar.setForeground(new java.awt.Color(0, 0, 0));
        btnElimiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8-eliminar-16.png"))); // NOI18N
        btnElimiar.setText("Eliminar");
        btnElimiar.setFocusable(false);
        btnElimiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnElimiar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnElimiar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnElimiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnElimiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnElimiar);

        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setMaximumSize(new java.awt.Dimension(64, 44));
        btnCancelar.setMinimumSize(new java.awt.Dimension(64, 44));
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancelar);

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Gestionar Vehiculos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Identificacion");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Placa de vehiculo");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Modelo");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Color");

        TXTModelo.setBackground(new java.awt.Color(255, 255, 255));
        TXTModelo.setForeground(new java.awt.Color(0, 0, 0));
        TXTModelo.setToolTipText("Escriba su correo electronico");
        TXTModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTModeloKeyTyped(evt);
            }
        });

        TXTColor.setBackground(new java.awt.Color(255, 255, 255));
        TXTColor.setForeground(new java.awt.Color(0, 0, 0));
        TXTColor.setToolTipText("Escriba su telefono celular");
        TXTColor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTColorKeyTyped(evt);
            }
        });

        TXTPlaca.setBackground(new java.awt.Color(255, 255, 255));
        TXTPlaca.setForeground(new java.awt.Color(0, 0, 0));
        TXTPlaca.setToolTipText("Escriba su nombre");
        TXTPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTPlacaKeyTyped(evt);
            }
        });

        cmbIdCliente.setBackground(new java.awt.Color(255, 255, 255));
        cmbIdCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Marca del vehiculo");

        cmbMarca.setBackground(new java.awt.Color(255, 255, 255));
        cmbMarca.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(TXTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TXTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(TXTColor)
                                    .addGap(1, 1, 1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cmbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(TXTPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cmbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        tblVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        tblVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        tblVehiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Id Cliente", "Nombre Cliente", "Cod Marca", "Nombre Marca", "Modelo", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVehiculo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        claseControladorVehiculo controlVehiculo = new claseControladorVehiculo();
        claseVehiculo vehiculo = new claseVehiculo();
        
        if (TXTColor.getText().equals("") || TXTModelo.getText().equals("") || TXTPlaca.getText().equals("") || cmbIdCliente.getSelectedItem().equals("Seleccione una opcion") 
                || cmbMarca.getSelectedItem().equals("Seleccione una opcion") ) {
            JOptionPane.showMessageDialog(null, "Todos los datos deben ser digitados.");
        }else{
            vehiculo.setPlaca(TXTPlaca.getText());
            vehiculo.setIdCliente(Integer.parseInt(cmbIdCliente.getSelectedItem().toString()));
            
            //combo de marcas y son los nombres que necesito pasarlo al codigo de la marca
            claseControladorMarca controladorMarca = new claseControladorMarca();
            List <claseMarca> listaMarca = new ArrayList<>();
            listaMarca = controladorMarca.listar();
            for (int i = 0; i < listaMarca.size(); i++) {
                if (cmbMarca.getSelectedItem().toString().equals(listaMarca.get(i).getNombre())) {
                    vehiculo.setCodMarca(listaMarca.get(i).getCodigo());
                }
            }
            vehiculo.setModelo(Integer.parseInt(TXTModelo.getText()));
            vehiculo.setColor(TXTColor.getText());
            controlVehiculo.agregar(vehiculo);
            limpiarTabla();
            listarTabla();
            limpiarTextos();
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = 0;
        limpiarTextos();
        index = tblVehiculo.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para editarlo", "Error de seleccion.", HEIGHT);
        } else {
            TXTPlaca.setText(String.valueOf(tblVehiculo.getValueAt(index, 0)));
            cmbIdCliente.setSelectedItem(String.valueOf(tblVehiculo.getValueAt(index, 1)));
            cmbMarca.setSelectedItem(String.valueOf(tblVehiculo.getValueAt(index, 4)));
            TXTModelo.setText(String.valueOf(tblVehiculo.getValueAt(index, 5)));
            TXTColor.setText(String.valueOf(tblVehiculo.getValueAt(index, 6)));
            
            deshabilitarBotones();
            TXTPlaca.setEnabled(false);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        claseControladorVehiculo controlVehiculo = new claseControladorVehiculo();
        claseVehiculo vehiculo = new claseVehiculo();
        
        if (TXTColor.getText().equals("") || TXTModelo.getText().equals("") || TXTPlaca.getText().equals("") || cmbIdCliente.getSelectedItem().equals("Seleccione una opcion") 
                || cmbMarca.getSelectedItem().equals("Seleccione una opcion") ) {
            JOptionPane.showMessageDialog(null, "Todos los datos deben ser digitados.");
        } else {
            
            vehiculo.setPlaca(TXTPlaca.getText());
            vehiculo.setIdCliente(Integer.valueOf(cmbIdCliente.getSelectedItem().toString()));
            
            claseControladorMarca controladorMarca = new claseControladorMarca();
            List <claseMarca> listaMarcas = new ArrayList<>();
            listaMarcas = controladorMarca.listar();
            for (int i = 0; i < listaMarcas.size(); i++) {
                if (cmbMarca.getSelectedItem().toString().equals(listaMarcas.get(i).getNombre())) {
                    vehiculo.setCodMarca(listaMarcas.get(i).getCodigo());
                }
            }
            vehiculo.setModelo(Integer.valueOf(TXTModelo.getText()));
            vehiculo.setColor(TXTColor.getText());

            controlVehiculo.editar(vehiculo);
            
            TXTPlaca.setEnabled(true);
            limpiarTabla();
            listarTabla();
            habilitarBotones();
            limpiarTextos();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnElimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiarActionPerformed

    }//GEN-LAST:event_btnElimiarActionPerformed

    
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TXTPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTPlacaKeyTyped

    }//GEN-LAST:event_TXTPlacaKeyTyped

    private void TXTColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTColorKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTColorKeyTyped

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
                for (int f = 0; f < tblVehiculo.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio); //creo la fila
                    filaInicio++;
                    for (int c = 0; c < tblVehiculo.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(tblVehiculo.getColumnName(c));
                        } 
                    }
                }
                filaInicio = 2;
                for (int f = 0; f < tblVehiculo.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < tblVehiculo.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (tblVehiculo.getValueAt(f, c) instanceof Integer) {
                            celda.setCellValue(Integer.parseInt(tblVehiculo.getValueAt(f, c).toString()));
                        } else {
                            celda.setCellValue(String.valueOf(tblVehiculo.getValueAt(f, c)));
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

    private void TXTModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTModeloKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTModeloKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTColor;
    private javax.swing.JTextField TXTModelo;
    private javax.swing.JTextField TXTPlaca;
    public static javax.swing.JButton btnActualizar;
    public static javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnElimiar;
    public static javax.swing.JButton btnExportar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbIdCliente;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblVehiculo;
    // End of variables declaration//GEN-END:variables
}
