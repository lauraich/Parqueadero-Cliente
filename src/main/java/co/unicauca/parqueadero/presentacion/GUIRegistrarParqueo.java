/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.presentacion;

import co.unicauca.parqueadero.negocio.clsUsuario;
import co.unicauca.parqueadero.negocio.GestorParqueo;
import co.unicauca.parqueadero.negocio.Parqueadero;
import co.unicauca.parqueadero.negocio.Vehiculo;
import co.unicauca.parqueadero.negocio.clsFactura;
import co.unicauca.parqueadero.negocio.clsGestorFacturacion;
import co.unicauca.parqueadero.negocio.clsRegistroParqueo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Interfaz gráfica de Registrar Entrada de vehiculo
 *
 */
public class GUIRegistrarParqueo extends javax.swing.JFrame {

    clsUsuario atrUsuario;
    Parqueadero atrParqueadero;
    clsRegistroParqueo atrRegistro;
    String atrDias = "";
    String atrHoras = "";
    String atrMinutos = "";
    String atrTotalApagar = "";

    /**
     * Creates new form GUIRegistrarEntrada
     *
     * @param prmUsuario usuario que inicio sesión
     * @param prmParqueadero parqueadero aen el cual trabaja el usuario
     */
    public GUIRegistrarParqueo(clsUsuario prmUsuario, Parqueadero prmParqueadero) {
        initComponents();
        this.setLocationRelativeTo(null);
        lblParqueadero.setText("Parqueadero "+prmParqueadero.getNombre());
        ocultarEntrada();
        ocultarSalida();
        atrUsuario = prmUsuario;
        atrParqueadero = prmParqueadero;
    }

    public GUIRegistrarParqueo() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblParqueadero.setText(atrParqueadero.getNombre());
        ocultarEntrada();
        ocultarSalida();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistrarEntrada = new javax.swing.JPanel();
        lblRegistrar = new java.awt.Label();
        btnBuscar = new javax.swing.JButton();
        tfCodigoPlaca = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblNumCascos = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JButton();
        btnRegistrarCancel1 = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        lblTipoVehiculo1 = new javax.swing.JLabel();
        cbTipoVehiculo = new javax.swing.JComboBox<>();
        lblPropietario1 = new javax.swing.JLabel();
        tfPropietario = new javax.swing.JTextField();
        lblFechaHoraSalida = new javax.swing.JLabel();
        tfFechaHoraEntrada = new java.awt.TextField();
        chbUno = new java.awt.Checkbox();
        chbDos = new java.awt.Checkbox();
        lblCasillero1 = new javax.swing.JLabel();
        tfCasillero1 = new java.awt.TextField();
        lblObservaciones1 = new javax.swing.JLabel();
        tfObservaciones = new java.awt.TextField();
        chbLlaves1 = new java.awt.Checkbox();
        lblCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lblFechaHoraEntrada = new javax.swing.JLabel();
        tfFechaHoraSalida = new java.awt.TextField();
        lblTiempo = new javax.swing.JLabel();
        tfTiempo = new java.awt.TextField();
        tfTipoVehiculo = new javax.swing.JTextField();
        tfNumCascos = new javax.swing.JTextField();
        lblValorPagar = new javax.swing.JLabel();
        tfValorPagar = new javax.swing.JTextField();
        chbDejaFicha = new java.awt.Checkbox();
        lblRecargo = new java.awt.Label();
        btnRegistrarSalida = new javax.swing.JButton();
        rbCodigo = new javax.swing.JRadioButton();
        rbPlaca = new javax.swing.JRadioButton();
        lblParqueadero = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRegistrarEntrada.setBackground(new java.awt.Color(250, 152, 58));

        lblRegistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setName(""); // NOI18N
        lblRegistrar.setText("Registrar");

        btnBuscar.setBackground(new java.awt.Color(30, 144, 255));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("OK");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        tfCodigoPlaca.setBackground(new java.awt.Color(170, 166, 157));
        tfCodigoPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCodigoPlaca.setForeground(new java.awt.Color(241, 242, 246));

        jPanel3.setBackground(new java.awt.Color(10, 61, 98));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumCascos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumCascos.setForeground(new java.awt.Color(247, 241, 227));
        lblNumCascos.setText("Número de Cascos:");
        lblNumCascos.setEnabled(false);
        jPanel3.add(lblNumCascos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 135, -1));

        btnRegistrar1.setBackground(new java.awt.Color(30, 144, 255));
        btnRegistrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setText("Registrar");
        btnRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrar1MouseClicked(evt);
            }
        });
        jPanel3.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 115, -1));

        btnRegistrarCancel1.setBackground(new java.awt.Color(255, 94, 87));
        btnRegistrarCancel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarCancel1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCancel1.setText("Cancelar");
        btnRegistrarCancel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarCancel1MouseClicked(evt);
            }
        });
        jPanel3.add(btnRegistrarCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 118, -1));

        lblPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(247, 241, 227));
        lblPlaca.setText("Placa:");
        jPanel3.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 27, -1, -1));

        tfPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPlaca.setForeground(new java.awt.Color(241, 242, 246));
        tfPlaca.setEnabled(false);
        jPanel3.add(tfPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 27, 149, -1));

        lblTipoVehiculo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoVehiculo1.setForeground(new java.awt.Color(247, 241, 227));
        lblTipoVehiculo1.setText("Tipo de Vehiculo:");
        jPanel3.add(lblTipoVehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 81, -1, -1));

        cbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));
        cbTipoVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoVehiculoItemStateChanged(evt);
            }
        });
        jPanel3.add(cbTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 104, -1));

        lblPropietario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPropietario1.setForeground(new java.awt.Color(247, 241, 227));
        lblPropietario1.setText("Nombre y Apellido propietario(opcional):");
        jPanel3.add(lblPropietario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 133, -1, -1));
        jPanel3.add(tfPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 133, 380, -1));

        lblFechaHoraSalida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFechaHoraSalida.setForeground(new java.awt.Color(247, 241, 227));
        lblFechaHoraSalida.setText("Fecha y Hora de Salida:");
        jPanel3.add(lblFechaHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, -1, -1));

        tfFechaHoraEntrada.setEditable(false);
        tfFechaHoraEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFechaHoraEntradaMouseClicked(evt);
            }
        });
        jPanel3.add(tfFechaHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 170, -1));

        chbUno.setEnabled(false);
        chbUno.setForeground(new java.awt.Color(255, 255, 255));
        chbUno.setLabel("Uno");
        chbUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbUnoMouseClicked(evt);
            }
        });
        jPanel3.add(chbUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 223, -1, 29));

        chbDos.setEnabled(false);
        chbDos.setForeground(new java.awt.Color(255, 255, 255));
        chbDos.setLabel("Dos");
        chbDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbDosMouseClicked(evt);
            }
        });
        jPanel3.add(chbDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 262, -1, -1));

        lblCasillero1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCasillero1.setForeground(new java.awt.Color(247, 241, 227));
        lblCasillero1.setText("Casillero No:");
        lblCasillero1.setEnabled(false);
        jPanel3.add(lblCasillero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        tfCasillero1.setEditable(false);
        tfCasillero1.setEnabled(false);
        jPanel3.add(tfCasillero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 33, 28));

        lblObservaciones1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblObservaciones1.setForeground(new java.awt.Color(247, 241, 227));
        lblObservaciones1.setText("Observaciones(opcional):");
        jPanel3.add(lblObservaciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 312, -1, -1));
        jPanel3.add(tfObservaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 312, 470, 29));

        chbLlaves1.setForeground(new java.awt.Color(255, 255, 255));
        chbLlaves1.setLabel("Deja Llaves");
        jPanel3.add(chbLlaves1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 351, -1, -1));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(247, 241, 227));
        lblCodigo.setText("Código:");
        jPanel3.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 30, -1, -1));

        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 27, 149, -1));

        lblFechaHoraEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFechaHoraEntrada.setForeground(new java.awt.Color(247, 241, 227));
        lblFechaHoraEntrada.setText("Fecha y Hora de Entrada:");
        jPanel3.add(lblFechaHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 174, -1, -1));

        tfFechaHoraSalida.setEditable(false);
        tfFechaHoraSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFechaHoraSalidaMouseClicked(evt);
            }
        });
        jPanel3.add(tfFechaHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 170, -1));

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(247, 241, 227));
        lblTiempo.setText("Tiempo Transcurrido:");
        jPanel3.add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 140, -1));

        tfTiempo.setEditable(false);
        jPanel3.add(tfTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 170, -1));
        jPanel3.add(tfTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, -1));
        jPanel3.add(tfNumCascos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 40, -1));

        lblValorPagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValorPagar.setForeground(new java.awt.Color(247, 241, 227));
        lblValorPagar.setText("Valor a Pagar:");
        jPanel3.add(lblValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 90, -1));
        jPanel3.add(tfValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 170, -1));

        chbDejaFicha.setForeground(new java.awt.Color(255, 255, 255));
        chbDejaFicha.setLabel("Entrega Ficha");
        chbDejaFicha.setState(true);
        chbDejaFicha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chbDejaFichaItemStateChanged(evt);
            }
        });
        jPanel3.add(chbDejaFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        lblRecargo.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        lblRecargo.setForeground(new java.awt.Color(255, 255, 255));
        lblRecargo.setText("Recargo con valor de $5.000");
        jPanel3.add(lblRecargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, -1, -1));

        btnRegistrarSalida.setBackground(new java.awt.Color(30, 144, 255));
        btnRegistrarSalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarSalida.setText("Guardar");
        btnRegistrarSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarSalidaMouseClicked(evt);
            }
        });
        jPanel3.add(btnRegistrarSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 115, -1));

        rbCodigo.setBackground(new java.awt.Color(250, 152, 58));
        rbCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        rbCodigo.setText("Código");
        rbCodigo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbCodigoItemStateChanged(evt);
            }
        });

        rbPlaca.setBackground(new java.awt.Color(250, 152, 58));
        rbPlaca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbPlaca.setForeground(new java.awt.Color(255, 255, 255));
        rbPlaca.setSelected(true);
        rbPlaca.setText("Placa:");
        rbPlaca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbPlacaItemStateChanged(evt);
            }
        });

        lblParqueadero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        lblParqueadero.setName(""); // NOI18N
        lblParqueadero.setText("Parqueadero");

        javax.swing.GroupLayout pnlRegistrarEntradaLayout = new javax.swing.GroupLayout(pnlRegistrarEntrada);
        pnlRegistrarEntrada.setLayout(pnlRegistrarEntradaLayout);
        pnlRegistrarEntradaLayout.setHorizontalGroup(
            pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbCodigo)
                .addGap(18, 18, 18)
                .addComponent(rbPlaca)
                .addGap(31, 31, 31)
                .addComponent(tfCodigoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnBuscar)
                .addGap(101, 101, 101))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        pnlRegistrarEntradaLayout.setVerticalGroup(
            pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarEntradaLayout.createSequentialGroup()
                .addGroup(pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlRegistrarEntradaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(tfCodigoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbCodigo)
                            .addComponent(rbPlaca)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarEntradaLayout.createSequentialGroup()
                        .addComponent(lblParqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        lblRegistrar.getAccessibleContext().setAccessibleName("Registrar ");
        lblParqueadero.getAccessibleContext().setAccessibleName("Parqueadero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistrarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlRegistrarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarCancel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_btnRegistrarCancel1MouseClicked

    private void btnRegistrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrar1MouseClicked

        String placa = tfCodigoPlaca.getText().trim();

        String codigo = tfCodigo.getText().trim();

        String propietario = tfPropietario.getText().trim();

        String tipoVehiculo = cbTipoVehiculo.getSelectedItem().toString();

        String fechaHoraEntrada = tfFechaHoraEntrada.getText().trim();

        String numeroCascos;

        String casillero = tfCasillero1.getText().trim();

        String Observaciones = tfObservaciones.getText().trim();

        Boolean dejaLlaves = chbLlaves1.getState();

        GestorParqueo gestor = new GestorParqueo();
        if (casillero.equals("")) {
            casillero = "null";
        }
        if (chbUno.getState()) {
            numeroCascos = "1";
        } else if (chbDos.getState()) {
            numeroCascos = "2";
        } else {
            numeroCascos = "0";
        }
        Vehiculo vehiculo = new Vehiculo(placa, tipoVehiculo);
        try {
            if (placa.equals("") || codigo.equals("") || tipoVehiculo.equals("") || fechaHoraEntrada.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe diligenciar el formulario correctamente.");
            } else if (gestor.registrarEntrada(new clsRegistroParqueo(atrUsuario, vehiculo, codigo, atrParqueadero.getId(), propietario, fechaHoraEntrada, numeroCascos, casillero, dejaLlaves.toString(), Observaciones))) {
                JOptionPane.showMessageDialog(null, "Entrada registrada correctamente.");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo realizar el registro de la entrada.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro de la entrada.");
        }


    }//GEN-LAST:event_btnRegistrar1MouseClicked

    private void tfFechaHoraEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfFechaHoraEntradaMouseClicked
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tfFechaHoraEntrada.setText(hourdateFormat.format(date));

    }//GEN-LAST:event_tfFechaHoraEntradaMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        GestorParqueo gestor = new GestorParqueo();
        try {
            if (rbPlaca.isSelected()) {
                atrRegistro = gestor.buscarXplaca(tfCodigoPlaca.getText(), atrParqueadero.getId());
            } else {
                atrRegistro = gestor.buscarXcodigo(tfCodigoPlaca.getText(), atrParqueadero.getId());
            }
            if (atrRegistro == null) {
                ocultarSalida();
                desplegarEntrada();
            } else {
                ocultarEntrada();
                desplegarSalida();
                rellenarSalida();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void rellenarSalida() {

        tfCodigo.setText(atrRegistro.getCodigoBarras());
        tfFechaHoraEntrada.setText(atrRegistro.getFechaHoraEntrada());
        tfCodigo.setText(atrRegistro.getCodigoBarras());
        tfPropietario.setText(atrRegistro.getNombresApellidosProp());
        tfTipoVehiculo.setText(atrRegistro.getVehiculo().getTipoVehiculo());
        tfNumCascos.setText(atrRegistro.getNumeroCascos());
        if (!atrRegistro.getNumeroCasillero().equals("")) {
            tfCasillero1.setText(atrRegistro.getNumeroCasillero());
        } else {
            tfCasillero1.setText("");
        }
        tfObservaciones.setText(atrRegistro.getObservaciones());
        if (atrRegistro.getDejaLlaves().equals("0")) {
            chbLlaves1.setState(false);
        } else {
            chbLlaves1.setState(true);
        }

    }

    private void desplegarSalida() {
        lblRegistrar.setText("Registrar Salida");
        tfPlaca.setText(atrRegistro.getVehiculo().getPlaca());
        lblPlaca.setVisible(true);
        tfPlaca.setEnabled(false);
        tfPlaca.setVisible(true);
        lblCodigo.setVisible(true);
        tfCodigo.setVisible(true);
        tfCodigo.setEnabled(false);
        lblTipoVehiculo1.setVisible(true);
        tfTipoVehiculo.setVisible(true);
        tfTipoVehiculo.setEnabled(false);
        lblPropietario1.setVisible(true);
        tfPropietario.setVisible(true);
        tfPropietario.setEnabled(false);
        lblFechaHoraEntrada.setVisible(true);
        tfFechaHoraEntrada.setVisible(true);
        tfFechaHoraEntrada.setEnabled(false);
        lblFechaHoraSalida.setVisible(true);
        tfFechaHoraSalida.setVisible(true);
        lblTiempo.setVisible(true);
        tfTiempo.setVisible(true);
        lblNumCascos.setVisible(true);
        tfNumCascos.setVisible(true);
        tfNumCascos.setEnabled(false);
        lblCasillero1.setVisible(true);
        tfCasillero1.setVisible(true);
        tfCasillero1.setEnabled(false);
        lblObservaciones1.setVisible(true);
        tfObservaciones.setVisible(true);
        tfObservaciones.setEnabled(false);
        chbLlaves1.setVisible(true);
        chbLlaves1.setEnabled(false);
        chbDejaFicha.setVisible(true);
        lblValorPagar.setVisible(true);
        tfValorPagar.setVisible(true);
        lblRecargo.setVisible(false);
        btnRegistrarSalida.setVisible(true);
        btnRegistrarCancel1.setVisible(true);
    }

    private void ocultarSalida() {

        lblPlaca.setVisible(false);
        tfPlaca.setVisible(false);
        lblCodigo.setVisible(false);
        tfCodigo.setVisible(false);
        lblTipoVehiculo1.setVisible(false);
        tfTipoVehiculo.setVisible(false);
        lblPropietario1.setVisible(false);
        tfPropietario.setVisible(false);
        lblFechaHoraEntrada.setVisible(false);
        tfFechaHoraEntrada.setVisible(false);
        lblFechaHoraSalida.setVisible(false);
        tfFechaHoraSalida.setVisible(false);
        lblTiempo.setVisible(false);
        tfTiempo.setVisible(false);
        lblNumCascos.setVisible(false);
        tfNumCascos.setVisible(false);
        lblCasillero1.setVisible(false);
        tfCasillero1.setVisible(false);
        lblObservaciones1.setVisible(false);
        tfObservaciones.setVisible(false);
        chbLlaves1.setVisible(false);
        chbDejaFicha.setVisible(false);
        btnRegistrarSalida.setVisible(false);
        btnRegistrarCancel1.setVisible(false);
        lblRecargo.setVisible(false);
        lblValorPagar.setVisible(false);
        tfValorPagar.setVisible(false);
    }

    private void ocultarEntrada() {
        lblPlaca.setVisible(false);
        tfPlaca.setVisible(false);
        lblCodigo.setVisible(false);
        tfCodigo.setVisible(false);
        lblTipoVehiculo1.setVisible(false);
        cbTipoVehiculo.setVisible(false);
        lblPropietario1.setVisible(false);
        tfPropietario.setVisible(false);
        lblFechaHoraEntrada.setVisible(false);
        tfFechaHoraEntrada.setVisible(false);
        lblFechaHoraSalida.setVisible(false);
        tfFechaHoraSalida.setVisible(false);
        lblNumCascos.setVisible(false);
        chbUno.setVisible(false);
        chbDos.setVisible(false);
        lblCasillero1.setVisible(false);
        tfCasillero1.setVisible(false);
        lblObservaciones1.setVisible(false);
        tfObservaciones.setVisible(false);
        chbLlaves1.setVisible(false);
        btnRegistrar1.setVisible(false);
        btnRegistrarCancel1.setVisible(false);
    }

    private void desplegarEntrada() {
        lblRegistrar.setText("Registrar Entrada");
        lblPlaca.setVisible(true);
        if (rbCodigo.isSelected()) {
            tfPlaca.setText("");
            tfPlaca.setEnabled(true);
            tfCodigo.setText(tfCodigoPlaca.getText());
            tfCodigo.setEnabled(false);
        } else {
            tfPlaca.setText(tfCodigoPlaca.getText());
            tfPlaca.setEnabled(false);
            tfCodigo.setText("");
            tfCodigo.setEnabled(true);
        }

        tfPlaca.setVisible(true);
        lblCodigo.setVisible(true);
        tfCodigo.setVisible(true);
        lblTipoVehiculo1.setVisible(true);
        cbTipoVehiculo.setVisible(true);
        lblPropietario1.setVisible(true);
        lblPropietario1.setEnabled(true);
        tfPropietario.setVisible(true);
        tfPropietario.setEnabled(true);
        tfPropietario.setText("");
        lblFechaHoraEntrada.setVisible(true);
        lblFechaHoraEntrada.setEnabled(true);
        tfFechaHoraEntrada.setVisible(true);
        tfFechaHoraEntrada.setText("");
        lblNumCascos.setVisible(true);
        chbUno.setVisible(true);
        chbDos.setVisible(true);
        lblCasillero1.setVisible(true);
        tfCasillero1.setVisible(true);
        lblObservaciones1.setVisible(true);
        tfObservaciones.setVisible(true);
        chbLlaves1.setVisible(true);
        btnRegistrar1.setVisible(true);
        btnRegistrarCancel1.setVisible(true);
    }

    private void cbTipoVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoVehiculoItemStateChanged
        if (cbTipoVehiculo.getSelectedItem().equals("Moto")) {
            lblNumCascos.setEnabled(true);
            chbUno.setEnabled(true);
            chbDos.setEnabled(true);
            lblCasillero1.setEnabled(true);
            tfCasillero1.setEnabled(true);
            tfCasillero1.setEditable(true);
        } else {
            lblNumCascos.setEnabled(false);
            chbUno.setEnabled(false);
            chbDos.setEnabled(false);
            lblCasillero1.setEnabled(false);
            tfCasillero1.setEnabled(false);
            tfCasillero1.setEditable(false);
        }
    }//GEN-LAST:event_cbTipoVehiculoItemStateChanged

    private void rbCodigoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbCodigoItemStateChanged
        if (rbCodigo.isSelected()) {
            rbPlaca.setSelected(false);
        }
        if (rbPlaca.isSelected()) {
            rbCodigo.setSelected(false);
        }
    }//GEN-LAST:event_rbCodigoItemStateChanged

    private void rbPlacaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbPlacaItemStateChanged

        if (rbPlaca.isSelected()) {
            rbCodigo.setSelected(false);
        }
        if (rbCodigo.isSelected()) {
            rbPlaca.setSelected(false);
        }
    }//GEN-LAST:event_rbPlacaItemStateChanged

    private void chbUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbUnoMouseClicked
        if (!chbUno.getState()) {
            chbDos.setState(false);
        }

    }//GEN-LAST:event_chbUnoMouseClicked

    private void chbDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbDosMouseClicked
        if (!chbDos.getState()) {
            chbUno.setState(false);
        }

    }//GEN-LAST:event_chbDosMouseClicked

    private void tfFechaHoraSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfFechaHoraSalidaMouseClicked
        clsGestorFacturacion gestor = new clsGestorFacturacion();
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tfFechaHoraSalida.setText(hourdateFormat.format(date));
        try {
            tiempoTranscurrido();
            if (atrDias.equals("")) {
                atrDias = "0";
            }
            if (atrHoras.equals("")) {
                atrHoras = "0";
            }
            if (atrMinutos.equals("")) {
                atrMinutos = "0";
            }
            tfTiempo.setText(atrDias + " dias " + atrHoras + " horas " + atrMinutos + " minutos ");
            atrTotalApagar = gestor.totalPagar(tfTipoVehiculo.getText(), atrDias, atrHoras, atrMinutos);

            tfValorPagar.setText(atrTotalApagar);
        } catch (Exception e) {
        }


    }//GEN-LAST:event_tfFechaHoraSalidaMouseClicked
    private void tiempoTranscurrido() {
        Date tiempoSalida;
        Date tiempoEntrada;
        int diferencia;
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            tiempoSalida = formato.parse(tfFechaHoraSalida.getText());
            tiempoEntrada = formato.parse(tfFechaHoraEntrada.getText());
            diferencia = (int) ((tiempoSalida.getTime() - tiempoEntrada.getTime()) / 1000);

            if (diferencia > 86400) {
                atrDias = String.valueOf((int) Math.floor(diferencia / 86400));

                diferencia = diferencia - (Integer.parseInt(atrDias) * 86400);
            }
            if (diferencia > 3600) {
                atrHoras = String.valueOf((int) Math.floor(diferencia / 3600));
                diferencia = diferencia - (Integer.parseInt(atrHoras) * 3600);
            }
            if (diferencia > 60) {
                atrMinutos = String.valueOf((int) Math.floor(diferencia / 60));
                diferencia = diferencia - (Integer.parseInt(atrMinutos) * 60);
            }
        } catch (Exception e) {
        }

    }
    private void btnRegistrarSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaMouseClicked
        String fechaHoraSalida = tfFechaHoraSalida.getText().trim();
        String valorApagar = tfValorPagar.getText().trim();
        Boolean dejaFicha = chbDejaFicha.getState();
        clsGestorFacturacion gestorFac = new clsGestorFacturacion();
        GestorParqueo gestor = new GestorParqueo();
        try {
            atrRegistro.setFechaHoraSalida(fechaHoraSalida);
            atrRegistro.setEntregaFicha(dejaFicha.toString());
            if (gestor.registrarSalida(atrRegistro)) {
                if (gestorFac.registrarFactura(new clsFactura(valorApagar, atrRegistro.getIdRegistroParqueo()))) {
                    JOptionPane.showMessageDialog(null, "Salida registrada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo realizar el registro de la salida.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo realizar el registro de la salida.");
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnRegistrarSalidaMouseClicked

    private void chbDejaFichaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbDejaFichaItemStateChanged

        if (chbDejaFicha.getState()) {
            lblRecargo.setVisible(false);
            tfValorPagar.setText(atrTotalApagar);
        } else {
            lblRecargo.setVisible(true);
            String total = Integer.toString(Integer.parseInt(atrTotalApagar) + 5000);
            tfValorPagar.setText(total);
        }
    }//GEN-LAST:event_chbDejaFichaItemStateChanged

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
            java.util.logging.Logger.getLogger(GUIRegistrarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarParqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarParqueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrarCancel1;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JComboBox<String> cbTipoVehiculo;
    private java.awt.Checkbox chbDejaFicha;
    private java.awt.Checkbox chbDos;
    private java.awt.Checkbox chbLlaves1;
    private java.awt.Checkbox chbUno;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCasillero1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFechaHoraEntrada;
    private javax.swing.JLabel lblFechaHoraSalida;
    private javax.swing.JLabel lblNumCascos;
    private javax.swing.JLabel lblObservaciones1;
    private java.awt.Label lblParqueadero;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPropietario1;
    private java.awt.Label lblRecargo;
    private java.awt.Label lblRegistrar;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipoVehiculo1;
    private javax.swing.JLabel lblValorPagar;
    private javax.swing.JPanel pnlRegistrarEntrada;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbPlaca;
    private java.awt.TextField tfCasillero1;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigoPlaca;
    private java.awt.TextField tfFechaHoraEntrada;
    private java.awt.TextField tfFechaHoraSalida;
    private javax.swing.JTextField tfNumCascos;
    private java.awt.TextField tfObservaciones;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    private java.awt.TextField tfTiempo;
    private javax.swing.JTextField tfTipoVehiculo;
    private javax.swing.JTextField tfValorPagar;
    // End of variables declaration//GEN-END:variables
}
