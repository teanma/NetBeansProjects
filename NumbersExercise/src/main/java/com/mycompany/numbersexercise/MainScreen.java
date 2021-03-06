/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.numbersexercise;

/**
 *
 * @author TeodorAndreiMardale
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        jLabelPrimNum = new javax.swing.JLabel();
        jTextFieldPrimNum = new javax.swing.JTextField();
        jLabelSegNum = new javax.swing.JLabel();
        jTextFieldSegNum = new javax.swing.JTextField();
        jButtonComparar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jLabelTextoResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comparación de dos números");

        jLabelPrimNum.setText("Introduzca el primer número");

        jTextFieldPrimNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrimNumActionPerformed(evt);
            }
        });

        jLabelSegNum.setText("Introduzca el segundo número");

        jButtonComparar.setText("Comparar");
        jButtonComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompararActionPerformed(evt);
            }
        });

        jLabelResultado.setText("Resultado de la comparación:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonComparar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelResultado)
                                .addGap(51, 51, 51)
                                .addComponent(jLabelTextoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPrimNum)
                                    .addComponent(jLabelSegNum))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPrimNum, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSegNum))))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrimNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrimNum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSegNum)
                    .addComponent(jTextFieldSegNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButtonComparar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTextoResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPrimNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrimNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrimNumActionPerformed

    private void jButtonCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompararActionPerformed
        try {
            String numberText1 = jTextFieldPrimNum.getText();
            String numberText2 = jTextFieldSegNum.getText();
            String newNumber1 = numberText1.replace(",", ".");
            String newNumber2 = numberText2.replace(",", ".");
            Double number1 = Double.parseDouble(newNumber1);
            Double number2 = Double.parseDouble(newNumber2);
            if (number1 < number2) {
            jLabelTextoResultado.setText("El número 1 es " + number1 + " y el número 2 es " + number2 + 
            ". Por lo tanto el numero 1 " + "(" + number1 + ")" + " es menor que el número 2 " + "(" + number2 + ")");
            } else if (number1 > number2) {
            jLabelTextoResultado.setText("El número 1 es " + number1 + " y el número 2 es " + number2 + 
            ". Por lo tanto el numero 1 " + "(" + number1 + ")" + " es mayor que el número 2 " + "(" + number2 + ")");
            } else {
            jLabelTextoResultado.setText("El número 1 es " + number1 + " y el número 2 es " + number2 + 
            ". Por lo tanto el numero 1 " + "(" + number1 + ")" + " es igual que el número 2 " + "(" + number2 + ")");
            }
        } catch (NumberFormatException e) {
            jLabelTextoResultado.setText("No has introducido un número");
        }
    }//GEN-LAST:event_jButtonCompararActionPerformed

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComparar;
    private javax.swing.JLabel jLabelPrimNum;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelSegNum;
    private javax.swing.JLabel jLabelTextoResultado;
    private javax.swing.JTextField jTextFieldPrimNum;
    private javax.swing.JTextField jTextFieldSegNum;
    // End of variables declaration//GEN-END:variables
}
