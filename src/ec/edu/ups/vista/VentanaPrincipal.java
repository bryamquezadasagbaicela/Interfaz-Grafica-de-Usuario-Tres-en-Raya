/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author QuezadaBryam
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private int[][] matriz;
    private JButton[][] mBotones;
    Icon icruz, icirculo;
    int fila1, fila2, fila3;
    int columna1, columna2, columna3;
    int diagonal1, diagonal2;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        matriz = new int[3][3];
        mBotones = new JButton[3][3];
        mBotones[0][0] = b00;
        mBotones[0][1] = b01;
        mBotones[0][2] = b02;
        mBotones[1][0] = b10;
        mBotones[1][1] = b11;
        mBotones[1][2] = b12;
        mBotones[2][0] = b20;
        mBotones[2][1] = b21;
        mBotones[2][2] = b22;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        ImageIcon cruz = new ImageIcon(getClass().getResource("/ec/edu/ups/imagen/CIRCULO.png"));
        ImageIcon circulo = new ImageIcon(getClass().getResource("/ec/edu/ups/imagen/cruz.png"));
        icruz = new ImageIcon(cruz.getImage().getScaledInstance(b00.getWidth(), b00.getHeight(), Image.SCALE_SMOOTH));
        icirculo = new ImageIcon(circulo.getImage().getScaledInstance(b00.getWidth(), b00.getHeight(), Image.SCALE_SMOOTH));

    }

    //creacion para el metodo de el ganador
    public void ganador() {
        if (fila1 == 3 || fila2 == 3 || fila3 == 3 || columna1 == 3 || columna2 == 3 || columna3 == 3 || diagonal1 == 3 || diagonal2 == 3) {
            JOptionPane.showMessageDialog(this, "Ganador Humano","ganador",JOptionPane.OK_OPTION);
        }
        if (fila1 == 30 || fila2 == 30 || fila3 == 30 || columna1 == 30 || columna2 == 30 || columna3 == 30 || diagonal1 == 30 || diagonal2 == 30) {
            JOptionPane.showMessageDialog(this, "Ganador Computadora","ganador", JOptionPane.OK_OPTION);
        }

    }

    //creacion para verificiar si hay un ganador 

    private void calcularGanador() {

        fila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        fila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        fila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        columna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        columna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        columna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        diagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];

    }

    //juega la maquina

    private void Computadora() {

        if (fila1 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[0][i].isEnabled()) {
                    mBotones[0][i].setIcon(icirculo);
                    matriz[0][i] = 10;
                    mBotones[0][i].setEnabled(false);
                }
            }
        } else if (fila2 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[1][i].isEnabled()) {
                    mBotones[1][i].setIcon(icirculo);
                    matriz[1][i] = 10;
                    mBotones[1][i].setEnabled(false);
                }
            }
        } else if (fila3 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[2][i].isEnabled()) {
                    mBotones[2][i].setIcon(icirculo);
                    matriz[2][i] = 10;
                    mBotones[2][i].setEnabled(false);
                }
            }
        } else if (columna1 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][0].isEnabled()) {
                    mBotones[i][0].setIcon(icirculo);
                    matriz[i][0] = 10;
                    mBotones[i][0].setEnabled(false);
                }
            }
        } else if (columna2 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][1].isEnabled()) {
                    mBotones[i][1].setIcon(icirculo);
                    matriz[i][1] = 10;
                    mBotones[i][1].setEnabled(false);
                }
            }
        } else if (columna3 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][2].isEnabled()) {
                    mBotones[i][2].setIcon(icirculo);
                    matriz[i][2] = 10;
                    mBotones[i][2].setEnabled(false);
                }
            }
        } else if (diagonal1 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][i].isEnabled()) {
                    mBotones[i][i].setIcon(icirculo);
                    matriz[i][i] = 10;
                    mBotones[i][i].setEnabled(false);
                }
            }
        } else if (diagonal2 == 20) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][2 - i].isEnabled()) {
                    mBotones[i][2 - i].setIcon(icirculo);
                    matriz[i][2 - i] = 10;
                    mBotones[i][2 - i].setEnabled(false);
                }
            }
        } else if (fila1 == 2 || fila1 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[0][i].isEnabled()) {
                    mBotones[0][i].setIcon(icirculo);
                    matriz[0][i] = 10;
                    mBotones[0][i].setEnabled(false);
                }
            }
        } else if (fila2 == 2 || fila2 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[1][i].isEnabled()) {
                    mBotones[1][i].setIcon(icirculo);
                    matriz[1][i] = 10;
                    mBotones[1][i].setEnabled(false);
                }
            }
        } else if (fila3 == 2 || fila3 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[2][i].isEnabled()) {
                    mBotones[2][i].setIcon(icirculo);
                    matriz[2][i] = 10;
                    mBotones[2][i].setEnabled(false);
                }
            }
        } else if (columna1 == 2 || columna1 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][0].isEnabled()) {
                    mBotones[i][0].setIcon(icirculo);
                    matriz[i][0] = 10;
                    mBotones[i][0].setEnabled(false);
                }
            }
        } else if (columna2 == 2 || columna2 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][1].isEnabled()) {
                    mBotones[i][1].setIcon(icirculo);
                    matriz[i][1] = 10;
                    mBotones[i][1].setEnabled(false);
                }
            }
        } else if (columna3 == 2 || columna3 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][2].isEnabled()) {
                    mBotones[i][2].setIcon(icirculo);
                    matriz[i][2] = 10;
                    mBotones[i][2].setEnabled(false);
                }
            }
        } else if (diagonal1 == 2 || diagonal1 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][i].isEnabled()) {
                    mBotones[i][i].setIcon(icirculo);
                    matriz[i][i] = 10;
                    mBotones[i][i].setEnabled(false);
                }
            }
        } else if (diagonal2 == 2 || diagonal2 == 3) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][2 - i].isEnabled()) {
                    mBotones[i][2 - i].setIcon(icirculo);
                    matriz[i][2 - i] = 10;
                    mBotones[i][2 - i].setEnabled(false);
                }
            }
        } else if (fila1 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[0][i].isEnabled()) {
                    mBotones[0][i].setIcon(icirculo);
                    matriz[0][i] = 10;
                    mBotones[0][i].setEnabled(false);
                    break;
                }
            }
        } else if (fila2 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[1][i].isEnabled()) {
                    mBotones[1][i].setIcon(icirculo);
                    matriz[1][i] = 10;
                    mBotones[1][i].setEnabled(false);
                    break;
                }
            }
        } else if (fila3 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[2][i].isEnabled()) {
                    mBotones[2][i].setIcon(icirculo);
                    matriz[2][i] = 10;
                    mBotones[2][i].setEnabled(false);
                    break;
                }
            }
        } else if (columna1 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][0].isEnabled()) {
                    mBotones[i][0].setIcon(icirculo);
                    matriz[i][0] = 10;
                    mBotones[i][0].setEnabled(false);
                    break;
                }
            }
        } else if (columna2 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][1].isEnabled()) {
                    mBotones[i][1].setIcon(icirculo);
                    matriz[i][1] = 10;
                    mBotones[i][1].setEnabled(false);
                    break;
                }
            }
        } else if (columna3 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][2].isEnabled()) {
                    mBotones[i][2].setIcon(icirculo);
                    matriz[i][2] = 10;
                    mBotones[i][2].setEnabled(false);
                    break;
                }
            }
        } else if (diagonal1 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][i].isEnabled()) {
                    mBotones[i][i].setIcon(icirculo);
                    matriz[i][i] = 10;
                    mBotones[i][i].setEnabled(false);
                    break;
                }
            }
        } else if (diagonal2 == 10) {
            for (int i = 0; i < mBotones.length; i++) {
                if (mBotones[i][2 - i].isEnabled()) {
                    mBotones[i][2 - i].setIcon(icirculo);
                    matriz[i][2 - i] = 10;
                    mBotones[i][2 - i].setEnabled(false);
                    break;
                }
            }
        } else {
            boolean acabado = false;
            for (int i = 0; i < mBotones.length; i++) {
                for (int j = 0; j < mBotones.length; j++) {
                    if (mBotones[i][j].isEnabled()) {
                        acabado = true;
                        break;
                    }
                }
            }
            if (acabado) {
                int x = (int) (Math.random() * 3);
                int y = (int) (Math.random() * 3);
                while (mBotones[x][y].isEnabled() == false) {
                    x = (int) (Math.random() * 3);
                    y = (int) (Math.random() * 3);
                }
                mBotones[x][y].setIcon(icirculo);
                matriz[x][y] = 10;
                mBotones[x][y].setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Juego Empatado");
            }

        }
        calcularGanador();
        ganador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton11.setBackground(new java.awt.Color(204, 0, 0));
        jButton11.setText("NUEVO JUEGO");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jLabel1.setText("3 EN RAYA");

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });
        jPanel1.add(b00);

        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });
        jPanel1.add(b01);

        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });
        jPanel1.add(b02);

        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        jPanel1.add(b10);

        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        jPanel1.add(b12);

        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        jPanel1.add(b20);

        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        jPanel1.add(b21);

        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        jPanel1.add(b11);

        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        jPanel1.add(b22);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("HUMANO");

        jLabel3.setText("COMPUTADORA");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/CIRCULO.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagen/cruz.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //sirve para borrar todo
        b00.setIcon(null);
        b01.setIcon(null);
        b02.setIcon(null);
        b10.setIcon(null);
        b11.setIcon(null);
        b12.setIcon(null);
        b20.setIcon(null);
        b21.setIcon(null);
        b22.setIcon(null);

        b00.setEnabled(true);
        b01.setEnabled(true);
        b02.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b20.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed

        b00.setIcon(icruz);
        matriz[0][0] = 1;
        b00.setEnabled(false);
        Computadora();


    }//GEN-LAST:event_b00ActionPerformed

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed

        b01.setIcon(icruz);
        matriz[0][1] = 1;
        b01.setEnabled(false);
        Computadora();

    }//GEN-LAST:event_b01ActionPerformed

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed
        b02.setIcon(icruz);
        matriz[0][2] = 1;
        b02.setEnabled(false);
        Computadora();

    }//GEN-LAST:event_b02ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        b10.setIcon(icruz);
        matriz[1][0] = 1;
        b10.setEnabled(false);
        Computadora();

    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        b11.setIcon(icruz);
        matriz[1][1] = 1;
        b11.setEnabled(false);
        Computadora();

    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        b12.setIcon(icruz);
        matriz[1][2] = 1;
        b12.setEnabled(false);
        Computadora();


    }//GEN-LAST:event_b12ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        b20.setIcon(icruz);
        matriz[2][0] = 1;
        b20.setEnabled(false);
        Computadora();
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        b21.setIcon(icruz);
        matriz[2][1] = 1;
        b21.setEnabled(false);
        Computadora();
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        b22.setIcon(icruz);
        matriz[2][2] = 1;
        b22.setEnabled(false);
        Computadora();
    }//GEN-LAST:event_b22ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarBotones() {
        b00.setEnabled(false);
        b01.setEnabled(false);
        b02.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b20.setEnabled(false);
        b21.setEnabled(false);
        b22.setEnabled(false);
    }
}
