/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.presentacion;

import co.unicauca.parqueadero.negocio.clsUsuario;
import co.unicauca.parqueadero.negocio.GestorEntrada;
import co.unicauca.parqueadero.negocio.Parqueadero;
import co.unicauca.parqueadero.negocio.Vehiculo;
import co.unicauca.parqueadero.negocio.clsRegistroParqueo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Interfaz gráfica de Registrar Entrada de vehiculo
 *
 */
public class GUIRegistrarEntrada extends javax.swing.JFrame {

    /**
     * Creates new form GUIRegistrarEntrada
     */
    public GUIRegistrarEntrada() {
        initComponents();
        this.setLocationRelativeTo(null);

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
        lblFechaHoraEntrada1 = new javax.swing.JLabel();
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
        rbCodigo = new javax.swing.JRadioButton();
        rbPlaca = new javax.swing.JRadioButton();

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
        jPanel3.add(lblNumCascos, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 235, 135, -1));

        btnRegistrar1.setBackground(new java.awt.Color(30, 144, 255));
        btnRegistrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setText("Registrar");
        btnRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrar1MouseClicked(evt);
            }
        });
        jPanel3.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 115, -1));

        btnRegistrarCancel1.setBackground(new java.awt.Color(255, 94, 87));
        btnRegistrarCancel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarCancel1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCancel1.setText("Cancelar");
        btnRegistrarCancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarCancel1MouseClicked(evt);
            }
        });
        jPanel3.add(btnRegistrarCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 118, -1));

        lblPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(247, 241, 227));
        lblPlaca.setText("Placa:");
        jPanel3.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 27, -1, -1));

        tfPlaca.setBackground(new java.awt.Color(170, 166, 157));
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
        jPanel3.add(cbTipoVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 81, 104, -1));

        lblPropietario1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPropietario1.setForeground(new java.awt.Color(247, 241, 227));
        lblPropietario1.setText("Nombre y Apellido propietario(opcional):");
        jPanel3.add(lblPropietario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 133, -1, -1));
        jPanel3.add(tfPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 133, 372, -1));

        lblFechaHoraEntrada1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFechaHoraEntrada1.setForeground(new java.awt.Color(247, 241, 227));
        lblFechaHoraEntrada1.setText("Fecha y Hora de Entrada:");
        jPanel3.add(lblFechaHoraEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 174, -1, -1));

        tfFechaHoraEntrada.setEditable(false);
        tfFechaHoraEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFechaHoraEntradaMouseClicked(evt);
            }
        });
        jPanel3.add(tfFechaHoraEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 171, 196, -1));

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
        jPanel3.add(lblCasillero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 235, -1, -1));

        tfCasillero1.setEditable(false);
        tfCasillero1.setEnabled(false);
        jPanel3.add(tfCasillero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 235, 33, 28));

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

        javax.swing.GroupLayout pnlRegistrarEntradaLayout = new javax.swing.GroupLayout(pnlRegistrarEntrada);
        pnlRegistrarEntrada.setLayout(pnlRegistrarEntradaLayout);
        pnlRegistrarEntradaLayout.setHorizontalGroup(
            pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarEntradaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbCodigo)
                .addGap(18, 18, 18)
                .addComponent(rbPlaca)
                .addGap(31, 31, 31)
                .addComponent(tfCodigoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnBuscar)
                .addGap(101, 101, 101))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlRegistrarEntradaLayout.setVerticalGroup(
            pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarEntradaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegistrarEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(tfCodigoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbCodigo)
                        .addComponent(rbPlaca))
                    .addComponent(lblRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        lblRegistrar.getAccessibleContext().setAccessibleName("Registrar ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistrarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegistrarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        GestorEntrada gestor = new GestorEntrada();
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
        clsUsuario usu = new clsUsuario();
        usu.setAtrCedula("34765126");
        usu.setAtrNombres("Jose");
        usu.setAtrApellidos("Cardenas");
        usu.setAtrLogin("jose");
        usu.setAtrRol("1");
        usu.setAtrPassword("123");
        Vehiculo vehiculo = new Vehiculo(placa, tipoVehiculo);
        try {
            if (placa.equals("") || codigo.equals("") || tipoVehiculo.equals("") || fechaHoraEntrada.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe diligenciar el formulario correctamente.");
            } else if (gestor.registrarEntrada(new clsRegistroParqueo(usu, vehiculo, codigo, "1", propietario, fechaHoraEntrada, numeroCascos, casillero, dejaLlaves.toString(), Observaciones))) {
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
        tfPlaca.setText(tfCodigoPlaca.getText());

    }//GEN-LAST:event_btnBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(GUIRegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarEntrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JButton btnRegistrarCancel1;
    private javax.swing.JComboBox<String> cbTipoVehiculo;
    private java.awt.Checkbox chbDos;
    private java.awt.Checkbox chbLlaves1;
    private java.awt.Checkbox chbUno;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCasillero1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFechaHoraEntrada1;
    private javax.swing.JLabel lblNumCascos;
    private javax.swing.JLabel lblObservaciones1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPropietario1;
    private java.awt.Label lblRegistrar;
    private javax.swing.JLabel lblTipoVehiculo1;
    private javax.swing.JPanel pnlRegistrarEntrada;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbPlaca;
    private java.awt.TextField tfCasillero1;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigoPlaca;
    private java.awt.TextField tfFechaHoraEntrada;
    private java.awt.TextField tfObservaciones;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfPropietario;
    // End of variables declaration//GEN-END:variables
}
