/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Segundoparcial;

import java.awt.Color;

/**
 *
 * @author Cesar
 */
public class colores extends javax.swing.JFrame {

    /**
     * Creates new form colores
     */
    public colores() {
        initComponents();
        setLocationRelativeTo (null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinnerRojo = new javax.swing.JSpinner();
        jSpinner2Azul = new javax.swing.JSpinner();
        jSpinner3Verde = new javax.swing.JSpinner();
        jSlider1Rojo = new javax.swing.JSlider();
        jSlider2Azul = new javax.swing.JSlider();
        jSlider3Verde = new javax.swing.JSlider();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ROJO = new javax.swing.JLabel();
        AZUL = new javax.swing.JLabel();
        VERDE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSpinnerRojo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jSpinnerRojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerRojoStateChanged(evt);
            }
        });

        jSpinner2Azul.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jSpinner2Azul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2AzulStateChanged(evt);
            }
        });

        jSpinner3Verde.setModel(new javax.swing.SpinnerNumberModel(0, 0, 255, 1));
        jSpinner3Verde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3VerdeStateChanged(evt);
            }
        });

        jSlider1Rojo.setMaximum(255);
        jSlider1Rojo.setToolTipText("");
        jSlider1Rojo.setValue(0);
        jSlider1Rojo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1RojoStateChanged(evt);
            }
        });

        jSlider2Azul.setMaximum(255);
        jSlider2Azul.setToolTipText("");
        jSlider2Azul.setValue(0);
        jSlider2Azul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider2AzulStateChanged(evt);
            }
        });

        jSlider3Verde.setMaximum(255);
        jSlider3Verde.setToolTipText("");
        jSlider3Verde.setValue(0);
        jSlider3Verde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3VerdeStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ROJO.setText("ROJO");

        AZUL.setText("AZUL");

        VERDE.setText("VERDE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ROJO)
                                    .addComponent(AZUL)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(VERDE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider1Rojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider2Azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider3Verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner3Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner2Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider1Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ROJO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner2Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSlider2Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AZUL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSpinner3Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSlider3Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VERDE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1RojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1RojoStateChanged
        jSpinnerRojo.setValue(jSlider1Rojo.getValue());

    }//GEN-LAST:event_jSlider1RojoStateChanged

    private void jSpinnerRojoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerRojoStateChanged
        jSlider1Rojo.setValue((Integer) jSpinnerRojo.getValue());
        Color color = new Color((Integer) jSpinnerRojo.getValue(), (Integer) jSpinner2Azul.getValue(), (Integer) jSpinner3Verde.getValue());
        jPanel1.setBackground(color);
    }//GEN-LAST:event_jSpinnerRojoStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider2AzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2AzulStateChanged
        jSpinner2Azul.setValue(jSlider2Azul.getValue());
    }//GEN-LAST:event_jSlider2AzulStateChanged

    private void jSpinner2AzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2AzulStateChanged
        jSlider2Azul.setValue((Integer) jSpinner2Azul.getValue());
        Color color = new Color((Integer) jSpinnerRojo.getValue(), (Integer) jSpinner2Azul.getValue(), (Integer) jSpinner3Verde.getValue());
        jPanel1.setBackground(color);
    }//GEN-LAST:event_jSpinner2AzulStateChanged

    private void jSlider3VerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3VerdeStateChanged
        jSpinner3Verde.setValue(jSlider3Verde.getValue());
    }//GEN-LAST:event_jSlider3VerdeStateChanged

    private void jSpinner3VerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3VerdeStateChanged
        jSlider3Verde.setValue((Integer) jSpinner3Verde.getValue());
        Color color = new Color((Integer) jSpinnerRojo.getValue(), (Integer) jSpinner2Azul.getValue(), (Integer) jSpinner3Verde.getValue());
        jPanel1.setBackground(color);
    }//GEN-LAST:event_jSpinner3VerdeStateChanged

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
            java.util.logging.Logger.getLogger(colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new colores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AZUL;
    private javax.swing.JLabel ROJO;
    private javax.swing.JLabel VERDE;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1Rojo;
    private javax.swing.JSlider jSlider2Azul;
    private javax.swing.JSlider jSlider3Verde;
    private javax.swing.JSpinner jSpinner2Azul;
    private javax.swing.JSpinner jSpinner3Verde;
    private javax.swing.JSpinner jSpinnerRojo;
    // End of variables declaration//GEN-END:variables

}
