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
import modelo.claseCliente;
import modelo.claseFondo;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class vistaInternaCliente extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    public vistaInternaCliente() {
        initComponents();
        this.setTitle("Cliente");
        modelo = new DefaultTableModel();
        limpiarTabla();
        listarTabla();
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
    }

    public void listarTabla() {
        claseControladorCliente controlCliente = new claseControladorCliente();
        List <claseCliente> lista = new ArrayList<>();
        lista = controlCliente.listar();
        modelo = (DefaultTableModel) tblClientes.getModel();
        Object[] obj = new Object [6];
        
        for (int i = 0; i < lista.size(); i++) {
            obj[0] = lista.get(i).getIdentificacion();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getApellidos();
            obj[3] = lista.get(i).getCorreo();
            obj[4] = lista.get(i).getDomicilio();
            obj[5] = lista.get(i).getTelefono();
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
    
    public void limpiarTextos() {
        TXTId.setText("");
        TXTNombre.setText("");
        TXTApellido.setText("");
        TXTDomicilio.setText("");
        TXTCorreo.setText("");
        TXTTelefono.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TXTId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXTApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TXTCorreo = new javax.swing.JTextField();
        TXTTelefono = new javax.swing.JTextField();
        TXTDomicilio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TXTNombre = new javax.swing.JTextField();

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

        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Domicilio", "Correo", "Telefono"
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Gestionar Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(51, 153, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Identificacion");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");

        TXTId.setBackground(new java.awt.Color(255, 255, 255));
        TXTId.setForeground(new java.awt.Color(0, 0, 0));
        TXTId.setToolTipText("Escriba su cedula");
        TXTId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTIdKeyTyped(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido");

        TXTApellido.setBackground(new java.awt.Color(255, 255, 255));
        TXTApellido.setForeground(new java.awt.Color(0, 0, 0));
        TXTApellido.setToolTipText("Escriba su apellido");
        TXTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTApellidoKeyTyped(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Telefono");

        TXTCorreo.setBackground(new java.awt.Color(255, 255, 255));
        TXTCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TXTCorreo.setToolTipText("Escriba su correo electronico");

        TXTTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TXTTelefono.setForeground(new java.awt.Color(0, 0, 0));
        TXTTelefono.setToolTipText("Escriba su telefono celular");
        TXTTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTTelefonoKeyTyped(evt);
            }
        });

        TXTDomicilio.setBackground(new java.awt.Color(255, 255, 255));
        TXTDomicilio.setForeground(new java.awt.Color(0, 0, 0));
        TXTDomicilio.setToolTipText("Escriba su direccion");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Domicilio");

        TXTNombre.setBackground(new java.awt.Color(255, 255, 255));
        TXTNombre.setForeground(new java.awt.Color(0, 0, 0));
        TXTNombre.setToolTipText("Escriba su nombre");
        TXTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(181, 181, 181))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TXTDomicilio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(TXTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(TXTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(TXTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        claseControladorCliente controlCliente = new claseControladorCliente();
        claseCliente cliente = new claseCliente();
        
        if (TXTId.getText().equals("") || TXTNombre.getText().equals("") || TXTApellido.getText().equals("") || TXTCorreo.getText().equals("") || TXTDomicilio.getText().equals("") || TXTTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los datos deben ser digitados.");
        }else{
            cliente.setIdentificacion(Integer.parseInt(TXTId.getText()));
            cliente.setNombre(TXTNombre.getText());
            cliente.setApellidos(TXTApellido.getText());
            cliente.setCorreo(TXTCorreo.getText());
            cliente.setDomicilio(TXTDomicilio.getText());
            cliente.setTelefono(TXTTelefono.getText());
            controlCliente.agregar(cliente);
        }
        limpiarTabla();
        listarTabla();
        limpiarTextos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int index = 0;
        limpiarTextos();
        index = tblClientes.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro para editarlo", "Error de seleccion.", HEIGHT);
        } else {
            TXTId.setText(String.valueOf(tblClientes.getValueAt(index, 0)));
            TXTNombre.setText(String.valueOf(tblClientes.getValueAt(index, 1)));
            TXTApellido.setText(String.valueOf(tblClientes.getValueAt(index, 2)));
            TXTCorreo.setText(String.valueOf(tblClientes.getValueAt(index, 3)));
            TXTDomicilio.setText(String.valueOf(tblClientes.getValueAt(index, 4)));
            TXTTelefono.setText(String.valueOf(tblClientes.getValueAt(index, 5)));

            deshabilitarBotones();
            TXTId.setEnabled(false);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        claseControladorCliente controlCliente = new claseControladorCliente();
        claseCliente cliente = new claseCliente();
        
        if (TXTId.getText().equals("") || TXTNombre.getText().equals("") || TXTApellido.getText().equals("") || TXTCorreo.getText().equals("") || TXTDomicilio.getText().equals("") || TXTTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los datos deben ser digitados.");
        } else {
            cliente.setIdentificacion(Integer.parseInt(TXTId.getText()));
            cliente.setNombre(TXTNombre.getText());
            cliente.setApellidos(TXTApellido.getText());
            cliente.setCorreo(TXTCorreo.getText());
            cliente.setDomicilio(TXTDomicilio.getText());
            cliente.setTelefono(TXTTelefono.getText());
            controlCliente.editar(cliente);
            
            TXTId.setEnabled(true);
            limpiarTabla();
            listarTabla();
            habilitarBotones();
            limpiarTextos();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnElimiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiarActionPerformed
        int index = 0;
        claseControladorCliente controladorCliente = new claseControladorCliente();
        index = tblClientes.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un registro de la tabla para eliminarlo", "Error de seleccion.", HEIGHT);
            
        }else{
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?", "Alerta!", JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(tblClientes.getValueAt(index, 0).toString());
                controladorCliente.eliminar(id);
                limpiarTabla();
                listarTabla();
            }
        }
    }//GEN-LAST:event_btnElimiarActionPerformed

    
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
            List <claseCliente> listado = new ArrayList<>();
            listado = controladorCliente.buscar(nombre);
            limpiarTabla();
            
            modelo = (DefaultTableModel) tblClientes.getModel();
            Object[] obj = new Object [6];
        
            for (int i = 0; i < listado.size(); i++) {
                obj[0] = listado.get(i).getIdentificacion();
                obj[1] = listado.get(i).getNombre();
                obj[2] = listado.get(i).getApellidos();
                obj[3] = listado.get(i).getCorreo();
                obj[4] = listado.get(i).getDomicilio();
                obj[5] = listado.get(i).getTelefono();
                modelo.addRow(obj);
            }
            tblClientes.setModel(modelo);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarBotones();
        limpiarTextos();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TXTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTNombreKeyTyped

    private void TXTTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTTelefonoKeyTyped

    }//GEN-LAST:event_TXTTelefonoKeyTyped

    private void TXTApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTApellidoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTApellidoKeyTyped

    private void TXTIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTIdKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_TXTIdKeyTyped

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
    private javax.swing.JTextField TXTApellido;
    private javax.swing.JTextField TXTCorreo;
    private javax.swing.JTextField TXTDomicilio;
    private javax.swing.JTextField TXTId;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTextField TXTTelefono;
    public static javax.swing.JButton btnActualizar;
    public static javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnElimiar;
    public static javax.swing.JButton btnExportar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
