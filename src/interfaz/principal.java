/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Complejo;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();

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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtImaginario1 = new javax.swing.JTextField();
        txtReal2 = new javax.swing.JTextField();
        txtImaginario2 = new javax.swing.JTextField();
        txtReal1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbOperacion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtImaginario3 = new javax.swing.JTextField();
        txtReal3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtNumImaginario = new javax.swing.JTextField();
        jLabelSignoReal = new javax.swing.JLabel();
        txtNumReal = new javax.swing.JTextField();
        txtDenImaginario = new javax.swing.JTextField();
        txtDenReal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelSignoImg = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Ejercicio 3");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operación"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Real 1");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setText("Imaginario 1");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel4.setText("Real 2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Imaginario 2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        txtImaginario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImaginario1KeyTyped(evt);
            }
        });
        jPanel2.add(txtImaginario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 80, 30));

        txtReal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReal2KeyTyped(evt);
            }
        });
        jPanel2.add(txtReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 30));

        txtImaginario2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImaginario2KeyTyped(evt);
            }
        });
        jPanel2.add(txtImaginario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 80, 30));

        txtReal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReal1KeyTyped(evt);
            }
        });
        jPanel2.add(txtReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 30));

        jLabel6.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        jLabel6.setText("i");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 20, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel2.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, 30));

        jLabel9.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        jLabel9.setText("i");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 20, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 290, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtImaginario3.setEditable(false);
        jPanel3.add(txtImaginario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 70, 30));

        txtReal3.setEditable(false);
        jPanel3.add(txtReal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 20, 20));

        jLabel7.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        jLabel7.setText("i");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 20, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel10.setText(")");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 30, 20, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel11.setText("(");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 240, 100));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, 40));

        cmdBorrar.setText("Limpiar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 150, 160));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("División"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumImaginario.setEditable(false);
        jPanel5.add(txtNumImaginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 30));

        jLabelSignoReal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jLabelSignoReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 20, 20));

        txtNumReal.setEditable(false);
        jPanel5.add(txtNumReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 40, 30));

        txtDenImaginario.setEditable(false);
        jPanel5.add(txtDenImaginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 40, 30));

        txtDenReal.setEditable(false);
        jPanel5.add(txtDenReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 30));

        jLabel14.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        jLabel14.setText("i");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 20, 20));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 40, 10));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 40, 10));

        jLabelSignoImg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(jLabelSignoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 20, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 150, 140));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("\" para distinguir la suma de la resta");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 20));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("-");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 20, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Use \"");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtReal1.setText("");
        txtImaginario1.setText("");
        txtReal2.setText("");
        txtImaginario2.setText("");
        txtReal3.setText("");
        txtImaginario3.setText("");
        txtNumReal.setText("");
        txtNumImaginario.setText("");
        txtDenReal.setText("");
        txtDenImaginario.setText("");
        jLabel8.setText("");
        jLabelSignoImg.setText("");
        jLabelSignoReal.setText("");

        txtReal1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        if (txtReal1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor digite el primer real", "Error", JOptionPane.ERROR_MESSAGE);
            txtReal1.requestFocusInWindow();
            txtReal1.selectAll();
        } else if (txtImaginario1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor digite el primer imaginario", "Error", JOptionPane.ERROR_MESSAGE);
            txtImaginario1.requestFocusInWindow();
            txtImaginario1.selectAll();
        } else if (txtReal2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor digite el segundo real", "Error", JOptionPane.ERROR_MESSAGE);
            txtReal2.requestFocusInWindow();
            txtReal2.selectAll();
        } else if (txtImaginario2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor digite el segundo imaginario", "Error", JOptionPane.ERROR_MESSAGE);
            txtImaginario2.requestFocusInWindow();
            txtImaginario2.selectAll();
        } else {
            int op, r1, r2, i1, i2, i3, ni, di, nr, dr, aux, aux1;
            Complejo c1, c2, c3 = null, c4 = null;
            try {

                op = cmbOperacion.getSelectedIndex();
                r1 = Integer.parseInt(txtReal1.getText());
                r2 = Integer.parseInt(txtReal2.getText());
                i1 = Integer.parseInt(txtImaginario1.getText());
                i2 = Integer.parseInt(txtImaginario2.getText());

                c1 = new Complejo(r1, i1);
                c2 = new Complejo(r2, i2);

                switch (op) {
                    case 0:
                        c3 = c1.sumar(c2);

                        break;
                    case 1:
                        c3 = c1.restar(c2);

                        break;
                    case 2:
                        c3 = c1.multiplicar(c2);

                        break;
                    case 3:
                        c3 = c1.denominadordividir(c2);
                        c4 = c1.numeradordividir(c2);

                        break;

                }
                if (op == 3) {
                    txtReal3.setText("");
                    txtImaginario3.setText("");
                    txtNumReal.setText("" + c4.getReal());
                    txtNumImaginario.setText("" + c4.getImaginario());
                    txtNumReal.setText("" + c4.getReal());
                    txtNumImaginario.setText("" + c4.getImaginario());
                    txtDenReal.setText("" + c3.getReal());
                    txtDenImaginario.setText("" + c3.getImaginario());
                    ni = Integer.parseInt(txtNumImaginario.getText());
                    di = Integer.parseInt(txtDenImaginario.getText());
                    nr = Integer.parseInt(txtNumReal.getText());
                    dr = Integer.parseInt(txtDenReal.getText());

                    if (nr < 0 && dr < 0) {
                        aux = nr * (-1);
                        aux1 = dr * (-1);
                        jLabelSignoReal.setText("");
                        txtNumReal.setText("" + aux);
                        txtDenReal.setText("" + aux1);
                    } else if (nr > 0 && dr > 0) {
                        jLabelSignoReal.setText("");
                    } else if (nr < 0 && dr > 0) {
                        aux = nr * (-1);
                        txtNumReal.setText("" + aux);
                        jLabelSignoReal.setText("-");
                    } else if (nr > 0 && dr < 0) {
                        aux1 = dr * (-1);
                        txtDenReal.setText("" + aux1);
                        jLabelSignoReal.setText("-");
                    }
                    if (ni < 0 && di < 0) {
                        aux = ni * (-1);
                        aux1 = di * (-1);
                        jLabelSignoImg.setText("+");
                        txtNumImaginario.setText("" + aux);
                        txtDenImaginario.setText("" + aux1);
                    } else if (ni > 0 && di > 0) {
                        jLabelSignoImg.setText("+");
                    } else if (ni < 0 && di > 0) {
                        aux = ni * (-1);
                        txtNumImaginario.setText("" + aux);
                        jLabelSignoImg.setText("-");
                    } else if (ni > 0 && di < 0) {
                        aux1 = di * (-1);
                        txtNumImaginario.setText("" + aux1);
                        jLabelSignoImg.setText("-");
                    }

                } else {
                    txtReal3.setText("" + c3.getReal());
                    txtImaginario3.setText("" + c3.getImaginario());
                    i3 = Integer.parseInt(txtImaginario3.getText());
                    if (i3 < 0) {
                        aux = i3 * (-1);
                        jLabel8.setText("-");
                        txtImaginario3.setText("" + aux);
                    } else {
                        jLabel8.setText("+");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtReal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReal1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && evt.getKeyChar() != '-') {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar() == '-' && txtReal1.getText().contains("-")) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReal1KeyTyped

    private void txtImaginario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImaginario1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && evt.getKeyChar() != '-') {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar() == '-' && txtImaginario1.getText().contains("-")) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImaginario1KeyTyped

    private void txtReal2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReal2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && evt.getKeyChar() != '-') {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar() == '-' && txtReal2.getText().contains("-")) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReal2KeyTyped

    private void txtImaginario2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImaginario2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && evt.getKeyChar() != '-') {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar() == '-' && txtImaginario2.getText().contains("-")) {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImaginario2KeyTyped

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSignoImg;
    private javax.swing.JLabel jLabelSignoReal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDenImaginario;
    private javax.swing.JTextField txtDenReal;
    private javax.swing.JTextField txtImaginario1;
    private javax.swing.JTextField txtImaginario2;
    private javax.swing.JTextField txtImaginario3;
    private javax.swing.JTextField txtNumImaginario;
    private javax.swing.JTextField txtNumReal;
    private javax.swing.JTextField txtReal1;
    private javax.swing.JTextField txtReal2;
    private javax.swing.JTextField txtReal3;
    // End of variables declaration//GEN-END:variables
}
