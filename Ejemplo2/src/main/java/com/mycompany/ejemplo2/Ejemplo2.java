/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author TeodorAndreiMardale
 */
public class Ejemplo2 extends JFrame implements ActionListener {
    
    JButton botonFinalizar;
    public Ejemplo2() {
        
    //Layout absoluto
        setLayout(null);
    //Tamaño de la ventana
        setBounds(0, 0, 450, 350);
        
    //Título
        setTitle("Ejemplo2");
        
    //No redimensionable
        setResizable(false);
        
    //Modo de cierre de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    //Hacemos el frame visible
        setVisible(true);
         
    //Botón
        botonFinalizar = new JButton("Finalizar");
        
    //Añadimos al botón sus dimensiones
        botonFinalizar.setBounds(300, 250, 100, 30);
            
    //Añadir el botón 
        add(botonFinalizar);
    
    //Escuchador del botón
        botonFinalizar.addActionListener(this);
        
    //Centrar la ventana
        setLocationRelativeTo(null);    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == botonFinalizar) {
            botonFinalizar.setForeground(Color.red);
            botonFinalizar.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null, "Finalizando la apliccación");
            System.exit(0);
            //JOptionPane.showInputDialog(null, "Introduzca un texto");
        }
    }
    
    public static void main(String[] args) {
        new Ejemplo2();
    }
}
