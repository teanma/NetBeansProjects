/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.checkboxpedido;

import javax.swing.JOptionPane;

/**
 *
 * @author TeodorAndreiMardale
 */
public class Pedido extends javax.swing.JFrame {

    private double price;
    /**
     * Creates new form Pedido
     */
    public Pedido() {
        initComponents();
    }
    
    public void Pedido(java.awt.event.ActionEvent evt) {
        if (jCheckBoxAjo.isSelected() && jCheckBoxCebolla.isSelected() && jCheckBoxPatatas.isSelected() && jCheckBoxPuerro.isSelected()) {
            jCheckBoxAjoActionPerformed(evt);
            jCheckBoxCebollaActionPerformed(evt);
            jCheckBoxPatatasActionPerformed(evt);
            jCheckBoxPuerroActionPerformed(evt);
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

        jLabelPedidos = new javax.swing.JLabel();
        jLabelVerduras = new javax.swing.JLabel();
        jCheckBoxCebolla = new javax.swing.JCheckBox();
        jCheckBoxPatatas = new javax.swing.JCheckBox();
        jCheckBoxPuerro = new javax.swing.JCheckBox();
        jCheckBoxAjo = new javax.swing.JCheckBox();
        jLabelFrutas = new javax.swing.JLabel();
        jCheckBoxPlátano = new javax.swing.JCheckBox();
        jCheckBoxManzana = new javax.swing.JCheckBox();
        jCheckBoxNaranja = new javax.swing.JCheckBox();
        jCheckBoxAguacate = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedidos");

        jLabelPedidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPedidos.setText("Pedidos");

        jLabelVerduras.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabelVerduras.setText("Verduras");

        jCheckBoxCebolla.setText("Cebolla");
        jCheckBoxCebolla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCebollaActionPerformed(evt);
            }
        });

        jCheckBoxPatatas.setText("Patata");
        jCheckBoxPatatas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPatatasActionPerformed(evt);
            }
        });

        jCheckBoxPuerro.setText("Puerro");
        jCheckBoxPuerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPuerroActionPerformed(evt);
            }
        });

        jCheckBoxAjo.setText("Ajo");
        jCheckBoxAjo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAjoActionPerformed(evt);
            }
        });

        jLabelFrutas.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabelFrutas.setText("Frutas");

        jCheckBoxPlátano.setText("Plátano");
        jCheckBoxPlátano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPlátanoActionPerformed(evt);
            }
        });

        jCheckBoxManzana.setText("Manzana");
        jCheckBoxManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxManzanaActionPerformed(evt);
            }
        });

        jCheckBoxNaranja.setText("Naranja");
        jCheckBoxNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxNaranjaActionPerformed(evt);
            }
        });

        jCheckBoxAguacate.setText("Aguacate");
        jCheckBoxAguacate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAguacateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxPuerro)
                            .addComponent(jCheckBoxPatatas)
                            .addComponent(jCheckBoxAjo)
                            .addComponent(jCheckBoxCebolla)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabelPedidos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelVerduras, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxManzana)
                    .addComponent(jCheckBoxNaranja)
                    .addComponent(jCheckBoxAguacate)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxPlátano)))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelPedidos)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelVerduras)
                    .addComponent(jLabelFrutas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPlátano)
                    .addComponent(jCheckBoxCebolla))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxManzana)
                    .addComponent(jCheckBoxPatatas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPuerro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxNaranja))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAjo)
                    .addComponent(jCheckBoxAguacate))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxAguacateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAguacateActionPerformed
        if (jCheckBoxAguacate.isSelected()) {
            String alimento = "Aguacate";
            double aguacatePrice = 20.99;
            String result = String.valueOf(alimento + ": " + aguacatePrice);
            price = price + aguacatePrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelFrutas, price);
        }
    }//GEN-LAST:event_jCheckBoxAguacateActionPerformed

    private void jCheckBoxPlátanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPlátanoActionPerformed
        if (jCheckBoxPlátano.isSelected()) {
            String alimento = "Plátano";
            double platanoPrice = 35.99;
            String result = String.valueOf(alimento + ": " + platanoPrice);
            price = price + platanoPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelFrutas, price);
        }
    }//GEN-LAST:event_jCheckBoxPlátanoActionPerformed

    private void jCheckBoxCebollaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCebollaActionPerformed
        if (jCheckBoxCebolla.isSelected()) {
            String alimento = "Cebolla";
            double cebollaPrice = 15.99;
            String result = String.valueOf(alimento + ": " + cebollaPrice);
            price = price + cebollaPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelVerduras, price);
        }
    }//GEN-LAST:event_jCheckBoxCebollaActionPerformed

    private void jCheckBoxPatatasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPatatasActionPerformed
        if (jCheckBoxPatatas.isSelected()) {
            String alimento = "Patata";
            double patataPrice = 12.99;
            String result = String.valueOf(alimento + ": " + patataPrice);
            price = price + patataPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelVerduras, price);
        }
    }//GEN-LAST:event_jCheckBoxPatatasActionPerformed

    private void jCheckBoxPuerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPuerroActionPerformed
        if (jCheckBoxPuerro.isSelected()) {
            String alimento = "Puerro";
            double puerroPrice = 9.99;
            String result = String.valueOf(alimento + ": " + puerroPrice);
            price = price + puerroPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelVerduras, price);
        }
    }//GEN-LAST:event_jCheckBoxPuerroActionPerformed

    private void jCheckBoxAjoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAjoActionPerformed
        if (jCheckBoxAjo.isSelected()) {
            String alimento = "Ajo";
            double ajoPrice = 10.99;
            String result = String.valueOf(alimento + ": " + ajoPrice);
            price = price + ajoPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelVerduras, price);
        }
    }//GEN-LAST:event_jCheckBoxAjoActionPerformed

    private void jCheckBoxManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxManzanaActionPerformed
        if (jCheckBoxManzana.isSelected()) {
            String alimento = "Manzana";
            double manzanaPrice = 5.99;
            String result = String.valueOf(alimento + ": " + manzanaPrice);
            price = price + manzanaPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelFrutas, price);
            
        }
    }//GEN-LAST:event_jCheckBoxManzanaActionPerformed

    private void jCheckBoxNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxNaranjaActionPerformed
        if (jCheckBoxNaranja.isSelected()) {
            String alimento = "Naranja";
            double naranjaPrice = 7.99;
            String result = String.valueOf(alimento + ": " + naranjaPrice);
            price = price + naranjaPrice;
            String finalPrice = String.valueOf(price);
            JOptionPane.showMessageDialog(jLabelFrutas, price);
        }
    }//GEN-LAST:event_jCheckBoxNaranjaActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxAguacate;
    private javax.swing.JCheckBox jCheckBoxAjo;
    private javax.swing.JCheckBox jCheckBoxCebolla;
    private javax.swing.JCheckBox jCheckBoxManzana;
    private javax.swing.JCheckBox jCheckBoxNaranja;
    private javax.swing.JCheckBox jCheckBoxPatatas;
    private javax.swing.JCheckBox jCheckBoxPlátano;
    private javax.swing.JCheckBox jCheckBoxPuerro;
    private javax.swing.JLabel jLabelFrutas;
    private javax.swing.JLabel jLabelPedidos;
    private javax.swing.JLabel jLabelVerduras;
    // End of variables declaration//GEN-END:variables
}
