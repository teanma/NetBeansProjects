/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.radioboton;

import javax.swing.JOptionPane;

/**
 *
 * @author TeodorAndreiMardale
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroupMedios = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonGo = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonFin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonTv = new javax.swing.JRadioButton();
        jRadioButtonInter = new javax.swing.JRadioButton();
        jRadioButtonLibro = new javax.swing.JRadioButton();
        jLabelSel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 10));

        jButtonGo.setText("Go");
        jButtonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGo);

        jButtonLimpiar.setText("Reset");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar);

        jButtonFin.setText("Finalizar");
        jButtonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFin);

        jPanel2.setLayout(new java.awt.GridLayout(3, 1, 10, 20));

        buttonGroupMedios.add(jRadioButtonTv);
        jRadioButtonTv.setText("Televisi??n");
        jRadioButtonTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTvActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonTv);

        buttonGroupMedios.add(jRadioButtonInter);
        jRadioButtonInter.setText("Internet");
        jPanel2.add(jRadioButtonInter);

        buttonGroupMedios.add(jRadioButtonLibro);
        jRadioButtonLibro.setText("Libro");
        jPanel2.add(jRadioButtonLibro);

        jLabelSel.setText("Seleccione una de las tres opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelSel)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabelSel)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTvActionPerformed

    private void jButtonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinActionPerformed
        JOptionPane.showMessageDialog(null, "Finalizando aplicaci??n");
        System.exit(0);
    }//GEN-LAST:event_jButtonFinActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        buttonGroupMedios.clearSelection();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoActionPerformed
        Libro libro = new Libro(this, true);
        Internet internet = new Internet(this, true);
        Television television = new Television(this, true);
        if (jRadioButtonTv.isSelected()) {
            television.setVisible(true);
        }
        if (jRadioButtonInter.isSelected()) {
            internet.setVisible(true);
        }
        if (jRadioButtonLibro.isSelected()) {
            libro.setVisible(true);
        }
    }//GEN-LAST:event_jButtonGoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMedios;
    private javax.swing.JButton jButtonFin;
    private javax.swing.JButton jButtonGo;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelSel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonInter;
    private javax.swing.JRadioButton jRadioButtonLibro;
    private javax.swing.JRadioButton jRadioButtonTv;
    // End of variables declaration//GEN-END:variables
}
