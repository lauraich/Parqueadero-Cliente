/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.presentacion;

import co.unicauca.parqueadero.negocio.GestorEstadisticas;
import co.unicauca.parqueadero.negocio.Parqueadero;
import co.unicauca.parqueadero.negocio.clsEstadisticas;
import co.unicauca.parqueadero.negocio.clsUsuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GUIEstadisticas extends javax.swing.JFrame {

    private clsUsuario atrUsuario;
    private Parqueadero atrParqueadero;

    /**
     * Creates new form GUIEstadisticas
     */
    public GUIEstadisticas() {
        initComponents();
    }

    public GUIEstadisticas(clsUsuario usuario, Parqueadero Parqueadero) {
        initComponents();
        atrUsuario = usuario;
        atrParqueadero = Parqueadero;
        this.setLocationRelativeTo(null);
        
    }

    public void desplegarEstadisticas() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = dateFormat.format(jDateChooser1.getDate());
        GestorEstadisticas gestor = new GestorEstadisticas();
        try {
            List<clsEstadisticas> listEstadistica = gestor.generarEstadisticas(fecha, atrParqueadero.getId());
            for (clsEstadisticas estadisticas : listEstadistica) {
                if (estadisticas.getHora().equals("7")) {
                    pb7.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("8")) {
                    pb8.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("9")) {
                    pb9.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("10")) {
                    pb10.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("11")) {
                    pb11.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("12")) {
                    pb12.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("13")) {
                    pb13.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("14")) {
                    pb14.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("15")) {
                    pb15.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("16")) {
                    pb16.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("17")) {
                    pb17.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("18")) {
                    pb18.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
                if (estadisticas.getHora().equals("19")) {
                    pb19.setValue((Integer.parseInt(estadisticas.getNumeroEntradas())*100)/50);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar el despliegue de las estadisticas.");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEstadisticasHead = new javax.swing.JPanel();
        lblEstadisticas = new javax.swing.JLabel();
        pnlEstadisticasBody = new javax.swing.JPanel();
        pb19 = new javax.swing.JProgressBar();
        pb7 = new javax.swing.JProgressBar();
        pb8 = new javax.swing.JProgressBar();
        pb9 = new javax.swing.JProgressBar();
        pb10 = new javax.swing.JProgressBar();
        pb11 = new javax.swing.JProgressBar();
        pb12 = new javax.swing.JProgressBar();
        pb13 = new javax.swing.JProgressBar();
        pb14 = new javax.swing.JProgressBar();
        pb15 = new javax.swing.JProgressBar();
        pb16 = new javax.swing.JProgressBar();
        pb17 = new javax.swing.JProgressBar();
        pb18 = new javax.swing.JProgressBar();
        lbl11 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        lblMensaje = new javax.swing.JLabel();
        lblSeleccione = new javax.swing.JLabel();
        lblnum7 = new javax.swing.JLabel();
        lblnum8 = new javax.swing.JLabel();
        lblnum9 = new javax.swing.JLabel();
        lblnum10 = new javax.swing.JLabel();
        lblnum11 = new javax.swing.JLabel();
        lblnum12 = new javax.swing.JLabel();
        lblnum13 = new javax.swing.JLabel();
        lblnum14 = new javax.swing.JLabel();
        lblnum15 = new javax.swing.JLabel();
        lblnum16 = new javax.swing.JLabel();
        lblnum17 = new javax.swing.JLabel();
        lblnum18 = new javax.swing.JLabel();
        lblnum19 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEstadisticasHead.setBackground(new java.awt.Color(250, 152, 58));

        lblEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        lblEstadisticas.setText("Estadísticas");

        pnlEstadisticasBody.setBackground(new java.awt.Color(10, 61, 98));

        pb19.setOrientation(1);

        pb7.setOrientation(1);

        pb8.setOrientation(1);

        pb9.setOrientation(1);

        pb10.setOrientation(1);

        pb11.setOrientation(1);

        pb12.setOrientation(1);

        pb13.setOrientation(1);

        pb14.setOrientation(1);

        pb15.setOrientation(1);

        pb16.setOrientation(1);

        pb17.setOrientation(1);

        pb18.setOrientation(1);

        lbl11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl11.setForeground(new java.awt.Color(247, 241, 227));
        lbl11.setText("11 A.M");

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl7.setForeground(new java.awt.Color(247, 241, 227));
        lbl7.setText("7 A.M");

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl8.setForeground(new java.awt.Color(247, 241, 227));
        lbl8.setText("8 A.M");

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl9.setForeground(new java.awt.Color(247, 241, 227));
        lbl9.setText("9 A.M");

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl10.setForeground(new java.awt.Color(247, 241, 227));
        lbl10.setText("10 A.M");

        lbl13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl13.setForeground(new java.awt.Color(247, 241, 227));
        lbl13.setText("1 P.M");

        lbl14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl14.setForeground(new java.awt.Color(247, 241, 227));
        lbl14.setText("2 P.M");

        lbl12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl12.setForeground(new java.awt.Color(247, 241, 227));
        lbl12.setText("12 P.M");

        lbl15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl15.setForeground(new java.awt.Color(247, 241, 227));
        lbl15.setText("3 P.M");

        lbl16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl16.setForeground(new java.awt.Color(247, 241, 227));
        lbl16.setText("4 P.M");

        lbl17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl17.setForeground(new java.awt.Color(247, 241, 227));
        lbl17.setText("5 P.M");

        lbl18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl18.setForeground(new java.awt.Color(247, 241, 227));
        lbl18.setText("6 P.M");

        lbl19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl19.setForeground(new java.awt.Color(247, 241, 227));
        lbl19.setText("7 P.M");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");

        lblMensaje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(247, 241, 227));
        lblMensaje.setText("Las siguientes gráficas muestran la cantidad de vehículos que ingresan al parqueadero por hora");

        lblSeleccione.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSeleccione.setForeground(new java.awt.Color(247, 241, 227));
        lblSeleccione.setText("Seleccione una fecha:");

        lblnum7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum7.setForeground(new java.awt.Color(247, 241, 227));
        lblnum7.setText("0");

        lblnum8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum8.setForeground(new java.awt.Color(247, 241, 227));
        lblnum8.setText("0");

        lblnum9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum9.setForeground(new java.awt.Color(247, 241, 227));
        lblnum9.setText("0");

        lblnum10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum10.setForeground(new java.awt.Color(247, 241, 227));
        lblnum10.setText("0");

        lblnum11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum11.setForeground(new java.awt.Color(247, 241, 227));
        lblnum11.setText("0");

        lblnum12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum12.setForeground(new java.awt.Color(247, 241, 227));
        lblnum12.setText("0");

        lblnum13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum13.setForeground(new java.awt.Color(247, 241, 227));
        lblnum13.setText("0");

        lblnum14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum14.setForeground(new java.awt.Color(247, 241, 227));
        lblnum14.setText("0");

        lblnum15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum15.setForeground(new java.awt.Color(247, 241, 227));
        lblnum15.setText("0");

        lblnum16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum16.setForeground(new java.awt.Color(247, 241, 227));
        lblnum16.setText("0");

        lblnum17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum17.setForeground(new java.awt.Color(247, 241, 227));
        lblnum17.setText("0");

        lblnum18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum18.setForeground(new java.awt.Color(247, 241, 227));
        lblnum18.setText("0");

        lblnum19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnum19.setForeground(new java.awt.Color(247, 241, 227));
        lblnum19.setText("0");

        btnOk.setBackground(new java.awt.Color(30, 144, 255));
        btnOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OK");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEstadisticasBodyLayout = new javax.swing.GroupLayout(pnlEstadisticasBody);
        pnlEstadisticasBody.setLayout(pnlEstadisticasBodyLayout);
        pnlEstadisticasBodyLayout.setHorizontalGroup(
            pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadisticasBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                        .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje)
                            .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                                        .addComponent(lbl7)
                                        .addGap(36, 36, 36)
                                        .addComponent(lbl8)
                                        .addGap(36, 36, 36)
                                        .addComponent(lbl9)
                                        .addGap(36, 36, 36)
                                        .addComponent(lbl10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl11))
                                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                                        .addComponent(pb7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(pb8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(pb9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(pb10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(pb11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pb12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl12))
                                .addGap(30, 30, 30)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pb13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl13))
                                .addGap(30, 30, 30)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                                        .addComponent(pb14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(pb15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                                        .addComponent(lbl14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl15)))
                                .addGap(30, 30, 30)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pb16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl16))
                                .addGap(40, 40, 40)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pb17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl17))
                                .addGap(40, 40, 40)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pb18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl18))
                                .addGap(40, 40, 40)
                                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl19)
                                    .addComponent(pb19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                                .addComponent(lblSeleccione)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnOk)))
                        .addGap(28, 28, 28))
                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblnum7)
                        .addGap(59, 59, 59)
                        .addComponent(lblnum8)
                        .addGap(63, 63, 63)
                        .addComponent(lblnum9)
                        .addGap(66, 66, 66)
                        .addComponent(lblnum10)
                        .addGap(61, 61, 61)
                        .addComponent(lblnum11)
                        .addGap(57, 57, 57)
                        .addComponent(lblnum12)
                        .addGap(71, 71, 71)
                        .addComponent(lblnum13)
                        .addGap(59, 59, 59)
                        .addComponent(lblnum14)
                        .addGap(64, 64, 64)
                        .addComponent(lblnum15)
                        .addGap(61, 61, 61)
                        .addComponent(lblnum16)
                        .addGap(71, 71, 71)
                        .addComponent(lblnum17)
                        .addGap(73, 73, 73)
                        .addComponent(lblnum18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblnum19)
                        .addGap(44, 44, 44))))
        );
        pnlEstadisticasBodyLayout.setVerticalGroup(
            pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEstadisticasBodyLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addGap(18, 18, 18)
                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSeleccione)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(btnOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblnum7)
                    .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblnum8)
                        .addComponent(lblnum9)
                        .addComponent(lblnum10)
                        .addComponent(lblnum11)
                        .addComponent(lblnum12)
                        .addComponent(lblnum13)
                        .addComponent(lblnum14)
                        .addComponent(lblnum15)
                        .addComponent(lblnum16)
                        .addComponent(lblnum17)
                        .addComponent(lblnum18)
                        .addComponent(lblnum19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pb7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb16, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb17, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb18, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb19, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl7)
                            .addComponent(lbl8)
                            .addComponent(lbl9)
                            .addComponent(lbl10)
                            .addComponent(lbl11)))
                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl12)
                            .addComponent(lbl13)
                            .addComponent(lbl14)
                            .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl15)
                                .addComponent(lbl16))))
                    .addGroup(pnlEstadisticasBodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlEstadisticasBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl18)
                            .addComponent(lbl17)
                            .addComponent(lbl19))))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout pnlEstadisticasHeadLayout = new javax.swing.GroupLayout(pnlEstadisticasHead);
        pnlEstadisticasHead.setLayout(pnlEstadisticasHeadLayout);
        pnlEstadisticasHeadLayout.setHorizontalGroup(
            pnlEstadisticasHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadisticasHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstadisticas)
                .addContainerGap(869, Short.MAX_VALUE))
            .addComponent(pnlEstadisticasBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlEstadisticasHeadLayout.setVerticalGroup(
            pnlEstadisticasHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEstadisticasHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstadisticas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEstadisticasBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlEstadisticasHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        if (!jDateChooser1.getDateFormatString().equals("")) {
            desplegarEstadisticas();
        }else{
             JOptionPane.showMessageDialog(null, "Se debe ingresar una fecha.");
        }
        
    }//GEN-LAST:event_btnOkMouseClicked

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
            java.util.logging.Logger.getLogger(GUIEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEstadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEstadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnOk;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblEstadisticas;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblnum10;
    private javax.swing.JLabel lblnum11;
    private javax.swing.JLabel lblnum12;
    private javax.swing.JLabel lblnum13;
    private javax.swing.JLabel lblnum14;
    private javax.swing.JLabel lblnum15;
    private javax.swing.JLabel lblnum16;
    private javax.swing.JLabel lblnum17;
    private javax.swing.JLabel lblnum18;
    private javax.swing.JLabel lblnum19;
    private javax.swing.JLabel lblnum7;
    private javax.swing.JLabel lblnum8;
    private javax.swing.JLabel lblnum9;
    private javax.swing.JProgressBar pb10;
    private javax.swing.JProgressBar pb11;
    private javax.swing.JProgressBar pb12;
    private javax.swing.JProgressBar pb13;
    private javax.swing.JProgressBar pb14;
    private javax.swing.JProgressBar pb15;
    private javax.swing.JProgressBar pb16;
    private javax.swing.JProgressBar pb17;
    private javax.swing.JProgressBar pb18;
    private javax.swing.JProgressBar pb19;
    private javax.swing.JProgressBar pb7;
    private javax.swing.JProgressBar pb8;
    private javax.swing.JProgressBar pb9;
    private javax.swing.JPanel pnlEstadisticasBody;
    private javax.swing.JPanel pnlEstadisticasHead;
    // End of variables declaration//GEN-END:variables
}
