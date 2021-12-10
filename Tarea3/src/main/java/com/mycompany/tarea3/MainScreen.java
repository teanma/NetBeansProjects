/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author TeodorAndreiMardale
 */
public class MainScreen {
    
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 600, 400);
        JLabel introduzcaEdad = new JLabel("Introduzca su edad");
        JTextField edadIntroducida = new JTextField(10);
        JButton enviar = new JButton("Enviar");
        JButton finalizar = new JButton("Finalizar");
        frame.add(panel);
        frame.add(introduzcaEdad);
        frame.add(edadIntroducida);
        frame.add(enviar);
        frame.add(finalizar);
        String edad = edadIntroducida.getText();
        if (enviar.isSelected()) {
            JOptionPane jOptionPane = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Su edad es: " + edad);
        }
        if (finalizar.isSelected()) {
            JOptionPane jOptionPane = new JOptionPane();
            JOptionPane.showMessageDialog(null, "Finalizando aplicación");
            System.exit(0);
        }
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
