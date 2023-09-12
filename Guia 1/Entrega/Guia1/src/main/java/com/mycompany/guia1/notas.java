package com.mycompany.guia1;
import javax.swing.JOptionPane;
public class notas extends javax.swing.JFrame {

    public notas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        lbTitulo = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbCarrera = new javax.swing.JLabel();
        lbCiclo = new javax.swing.JLabel();
        lbCum = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCUM = new javax.swing.JTextField();
        cbCarrera = new javax.swing.JComboBox<>();
        cbCiclo = new javax.swing.JComboBox<>();
        lbMaterias = new javax.swing.JLabel();
        tfMateria1 = new javax.swing.JTextField();
        tfMateria2 = new javax.swing.JTextField();
        tfMateria3 = new javax.swing.JTextField();
        tfMateria4 = new javax.swing.JTextField();
        tfMateria5 = new javax.swing.JTextField();
        lbUv = new javax.swing.JLabel();
        cbuv1 = new javax.swing.JComboBox<>();
        cbuv2 = new javax.swing.JComboBox<>();
        cbuv3 = new javax.swing.JComboBox<>();
        cbuv4 = new javax.swing.JComboBox<>();
        cbuv5 = new javax.swing.JComboBox<>();
        tfNota1 = new javax.swing.JTextField();
        tfNota2 = new javax.swing.JTextField();
        tfNota3 = new javax.swing.JTextField();
        tfNota4 = new javax.swing.JTextField();
        tfNota5 = new javax.swing.JTextField();
        tfEstado1 = new javax.swing.JTextField();
        tfEstado2 = new javax.swing.JTextField();
        tfEstado3 = new javax.swing.JTextField();
        tfEstado4 = new javax.swing.JTextField();
        tfEstado5 = new javax.swing.JTextField();
        lbNota = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setText("Control de Notas");

        lbNombre.setText("Nombre");

        lbCarrera.setText("Carrera");

        lbCiclo.setText("Ciclo");

        lbCum.setText("CUM");

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfCUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCUMActionPerformed(evt);
            }
        });

        cbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Ingenieria en Sistemas Computacionales", "Ingenieria Industrial", "Ingenieria Electrica", "Ingenieria en Agronegocios" }));
        cbCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarreraActionPerformed(evt);
            }
        });

        cbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      ", "01", "02" }));
        cbCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCicloActionPerformed(evt);
            }
        });

        lbMaterias.setText("Materias");

        tfMateria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMateria1ActionPerformed(evt);
            }
        });

        tfMateria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMateria2ActionPerformed(evt);
            }
        });

        tfMateria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMateria3ActionPerformed(evt);
            }
        });

        tfMateria5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMateria5ActionPerformed(evt);
            }
        });

        lbUv.setText("UV");

        cbuv1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     ", "3", "4" }));
        cbuv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuv1ActionPerformed(evt);
            }
        });

        cbuv2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "3", "4" }));

        cbuv3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "3", "4" }));

        cbuv4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "3", "4" }));

        cbuv5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "3", "4" }));

        tfNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota1ActionPerformed(evt);
            }
        });

        tfNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota2ActionPerformed(evt);
            }
        });

        tfNota3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota3ActionPerformed(evt);
            }
        });

        tfNota5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNota5ActionPerformed(evt);
            }
        });

        lbNota.setText("Nota");

        lbEstado.setText("Estado");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btCalcular)
                .addGap(234, 234, 234))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(lbNombre)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCarrera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbCiclo)
                                .addGap(88, 88, 88)
                                .addComponent(lbCum)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTitulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                            .addComponent(tfNota2)
                                            .addComponent(tfNota3)
                                            .addComponent(tfNota4)
                                            .addComponent(tfNota5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lbMaterias)
                        .addGap(81, 81, 81)
                        .addComponent(lbUv)
                        .addGap(113, 113, 113)
                        .addComponent(lbNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEstado)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMateria4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(tfMateria3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfMateria2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(tfMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfMateria5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbuv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbuv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbuv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbuv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbuv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEstado5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbCarrera)
                    .addComponent(lbCum)
                    .addComponent(lbCiclo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaterias)
                    .addComponent(lbUv)
                    .addComponent(lbNota)
                    .addComponent(lbEstado))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbuv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btCalcular)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCicloActionPerformed

    private void cbCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCarreraActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfCUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCUMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCUMActionPerformed

    private void cbuv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuv1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbuv1ActionPerformed

    private void tfNota5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNota5ActionPerformed

    private void tfNota3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNota3ActionPerformed

    private void tfNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNota1ActionPerformed

    private void tfMateria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMateria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMateria2ActionPerformed

    private void tfMateria5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMateria5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMateria5ActionPerformed

    private void tfMateria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMateria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMateria3ActionPerformed

    private void tfNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNota2ActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // TODO add your handling code here:
        double cum = 0.0;
        double totalUV = 0.0;
        double nota1 = Double.parseDouble(tfNota1.getText());
        double nota2 = Double.parseDouble(tfNota2.getText());
        double nota3 = Double.parseDouble(tfNota3.getText());
        double nota4 = Double.parseDouble(tfNota4.getText());
        double nota5 = Double.parseDouble(tfNota5.getText());
    
        double uv1 = Double.parseDouble(cbuv1.getSelectedItem().toString());
        double uv2 = Double.parseDouble(cbuv2.getSelectedItem().toString());
        double uv3 = Double.parseDouble(cbuv3.getSelectedItem().toString());
        double uv4 = Double.parseDouble(cbuv4.getSelectedItem().toString());
        double uv5 = Double.parseDouble(cbuv5.getSelectedItem().toString());
    
        totalUV = uv1 + uv2 + uv3 + uv4 + uv5;
        cum = ((uv1 * nota1) + (uv2 * nota2) + (uv3 * nota3) + (uv4 * nota4) + (uv5 * nota5)) / totalUV;
    
        tfCUM.setText(String.format("%.2f", cum));
           
        tfCUM.setEditable(false); // Desactivar la edición del CUM
    
    if (nota1 >= 6.0) {
        tfEstado1.setText("Aprobado");
        tfEstado1.setEditable(false);// Desactivar la edición
    } else {
        tfEstado1.setText("Reprobado");
    }
    if (nota2 >= 6.0) {
        tfEstado2.setText("Aprobado");
        tfEstado2.setEditable(false);// Desactivar la edición
    } else {
        tfEstado2.setText("Reprobado");
    }
        if (nota3 >= 6.0) {
        tfEstado3.setText("Aprobado");
        tfEstado3.setEditable(false);// Desactivar la edición
    } else {
        tfEstado3.setText("Reprobado");
    }
         if (nota4 >= 6.0) {
        tfEstado4.setText("Aprobado");
        tfEstado4.setEditable(false);// Desactivar la edición
    } else {
        tfEstado4.setText("Reprobado");
    }
          if (nota5 >= 6.0) {
        tfEstado5.setText("Aprobado");
        tfEstado5.setEditable(false);// Desactivar la edición
    } else {
        tfEstado5.setText("Reprobado");
    }
          
    }//GEN-LAST:event_btCalcularActionPerformed

    private void tfMateria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMateria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMateria1ActionPerformed

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
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JComboBox<String> cbCarrera;
    private javax.swing.JComboBox<String> cbCiclo;
    private javax.swing.JComboBox<String> cbuv1;
    private javax.swing.JComboBox<String> cbuv2;
    private javax.swing.JComboBox<String> cbuv3;
    private javax.swing.JComboBox<String> cbuv4;
    private javax.swing.JComboBox<String> cbuv5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbCiclo;
    private javax.swing.JLabel lbCum;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbMaterias;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNota;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUv;
    private javax.swing.JTextField tfCUM;
    private javax.swing.JTextField tfEstado1;
    private javax.swing.JTextField tfEstado2;
    private javax.swing.JTextField tfEstado3;
    private javax.swing.JTextField tfEstado4;
    private javax.swing.JTextField tfEstado5;
    private javax.swing.JTextField tfMateria1;
    private javax.swing.JTextField tfMateria2;
    private javax.swing.JTextField tfMateria3;
    private javax.swing.JTextField tfMateria4;
    private javax.swing.JTextField tfMateria5;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    private javax.swing.JTextField tfNota3;
    private javax.swing.JTextField tfNota4;
    private javax.swing.JTextField tfNota5;
    // End of variables declaration//GEN-END:variables
}
