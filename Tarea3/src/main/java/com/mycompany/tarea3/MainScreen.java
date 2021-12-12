/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author TeodorAndreiMardale
 */
public class MainScreen extends JFrame {
    
    public static void main(String[] args) {
       inicializar();
    }
    
    private static void inicializar() {
        JFrame jFrameMainScreen = new JFrame();
        jFrameMainScreen.setTitle("Aplicación con código");
        jFrameMainScreen.setVisible(true);
        jFrameMainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameMainScreen.setLayout(null);
        jFrameMainScreen.setLocationRelativeTo(null);
        jFrameMainScreen.setSize(320, 160);
        
        JLabel jLabelSelecOpc = new JLabel();
        jLabelSelecOpc.setText("Seleccione una de las opciones");
        jLabelSelecOpc.setBounds(62, 20, 240, 15);
       
        JButton jButtonEdad = new JButton("Introducir edad");
        jButtonEdad.setBounds(25, 70, 120, 25);
        jButtonEdad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String edad = JOptionPane.showInputDialog("Introduzca su edad");
                    while (edad.isEmpty()) {
                        JOptionPane.showMessageDialog(jFrameMainScreen, "El campo no debe estar vacío");
                        edad = JOptionPane.showInputDialog("Introduzca su edad");
                    }
                    while (!edad.matches("[0-9]+")) {
                        JOptionPane.showMessageDialog(jFrameMainScreen, "El campo debe ser un número");
                        edad = JOptionPane.showInputDialog("Introduzca su edad");
                    }
                    JOptionPane.showMessageDialog(jFrameMainScreen, "Edad del usuario: " + edad + " años");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(jFrameMainScreen, "Operación cancelada");
                }
                }
            });
          
        JButton jButtonFinalizar = new JButton("Finalizar");
        jButtonFinalizar.setBounds(190, 70, 85, 25);
        jButtonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(jFrameMainScreen, "Finalizando aplicación");
                System.exit(0);
            }
        });
        
        jFrameMainScreen.add(jLabelSelecOpc);
        jFrameMainScreen.add(jButtonEdad);
        jFrameMainScreen.add(jButtonFinalizar);
    }
}
