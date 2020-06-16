/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.presentacion;

import co.unicauca.parqueadero.negocio.Parqueadero;
import co.unicauca.parqueadero.negocio.clsUsuario;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import co.unicauca.parqueadero.presentacion.GUIRegistrarParqueo;

/**
 * Interfaz gráfica Principal
 */
public class GUIPrincipal extends javax.swing.JFrame {
    private clsUsuario usuario;
    private Parqueadero parqueadero;
    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal() {
        initComponents();
        
    }

    public GUIPrincipal(clsUsuario prmUsuario,Parqueadero prmParqueadero) {
        initComponents();
        usuario=prmUsuario;
        parqueadero=prmParqueadero;
        this.setTitle("Parqueadero "+parqueadero.getNombre());
        interfazTipoUsuario();
        lblAdmin.setText(usuario.getAtrLogin());
        lblAdmin.setName(usuario.getAtrLogin());
        lblParqueadero.setText(parqueadero.getNombre());
        lblParqueadero.setName(parqueadero.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPrincipal = new javax.swing.JLabel();
        lblParqueadero = new javax.swing.JLabel();
        btnRegistrar = new rojerusan.RSButtonMetro();
        btnAgregarParqueadero = new rojerusan.RSButtonMetro();
        btnAgregarFuncionarios = new rojerusan.RSButtonMetro();
        btnAjustes = new rojerusan.RSButtonMetro();
        btnCerrarSesion = new rojerusan.RSButtonMetro();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 61, 98));

        lblPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        lblPrincipal.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrincipal.setText("Parqueadero");

        lblParqueadero.setBackground(new java.awt.Color(255, 255, 255));
        lblParqueadero.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblParqueadero.setForeground(new java.awt.Color(255, 255, 255));
        lblParqueadero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblParqueadero.setText("Parqueadero");

        btnRegistrar.setBackground(new java.awt.Color(10, 61, 98));
        btnRegistrar.setText("      Registrar Entrada/Salida");
        btnRegistrar.setActionCommand("      Registrar ");
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        btnAgregarParqueadero.setBackground(new java.awt.Color(10, 61, 98));
        btnAgregarParqueadero.setText("      Agregar Parqueadero");
        btnAgregarParqueadero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarParqueadero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregarParqueadero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarParqueaderoMouseClicked(evt);
            }
        });

        btnAgregarFuncionarios.setBackground(new java.awt.Color(10, 61, 98));
        btnAgregarFuncionarios.setText("      Agregar Funcionarios");
        btnAgregarFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAgregarFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnAjustes.setBackground(new java.awt.Color(10, 61, 98));
        btnAjustes.setText("      Ajustes");
        btnAjustes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAjustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnCerrarSesion.setBackground(new java.awt.Color(10, 61, 98));
        btnCerrarSesion.setText("      Cerrar Sesión");
        btnCerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAgregarFuncionarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addComponent(btnAgregarParqueadero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblParqueadero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPrincipal)
                .addGap(18, 18, 18)
                .addComponent(lblParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarParqueadero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(10, 61, 98));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setText("User");
        jPanel3.add(lblAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 550, 440));

        setSize(new java.awt.Dimension(838, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void interfazTipoUsuario(){
        if(usuario.getAtrRol().equals("Funcionario")){
            btnAgregarParqueadero.setVisible(false);
            btnAgregarFuncionarios.setVisible(false);
            btnAjustes.setAlignmentX(btnAgregarParqueadero.getAlignmentX());
            btnAjustes.setAlignmentY(btnAgregarParqueadero.getAlignmentY());
            btnCerrarSesion.setAlignmentX(btnAgregarFuncionarios.getAlignmentX());
            btnCerrarSesion.setAlignmentY(btnAgregarFuncionarios.getAlignmentY());
        }
    }
    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        GUIRegistrarParqueo registrar = new GUIRegistrarParqueo(usuario,parqueadero);
        registrar.setVisible(true);
        registrar.pack();
        registrar.setLocationRelativeTo(null);
        registrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void btnAgregarParqueaderoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarParqueaderoMouseClicked
        GUIRegistrarParqueadero registrar = new GUIRegistrarParqueadero();
        registrar.setVisible(true);
        registrar.pack();
        registrar.setLocationRelativeTo(null);
        registrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnAgregarParqueaderoMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        this.dispose();
        GUIAutenticacion login = new GUIAutenticacion();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked
    
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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonMetro btnAgregarFuncionarios;
    private rojerusan.RSButtonMetro btnAgregarParqueadero;
    private rojerusan.RSButtonMetro btnAjustes;
    private rojerusan.RSButtonMetro btnCerrarSesion;
    private rojerusan.RSButtonMetro btnRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblParqueadero;
    private javax.swing.JLabel lblPrincipal;
    // End of variables declaration//GEN-END:variables
}
