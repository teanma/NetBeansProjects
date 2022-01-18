/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author TeodorAndreiMardale
 */
public class Ejercicios_Ventana6 extends javax.swing.JFrame {
    
    public Ejercicios_Ventana6() {
        
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        
        setSize(600, 600);
        
        setLocationRelativeTo(null);
        
        setTitle("Mi ventana");
        
        JButton jButtonEmpezar = new JButton("Empezar");
     
        jButtonEmpezar.setBounds(480, 0, 100, 30);
        
        add(jButtonEmpezar);
        
        JTextField jTextFieldHolaMundo = new JTextField("Hola Mundo");
        
        jTextFieldHolaMundo.setBounds(10, 50, 500, 30);
        
        Font boldAndItalicFont = new Font("Tahoma", Font.ITALIC | Font.BOLD, 18);
        jTextFieldHolaMundo.setFont(boldAndItalicFont);
        
        add(jTextFieldHolaMundo);
        
        JLabel jLabelEtiqueta = new JLabel("MI PRIMERA ETIQUETA");
        
        jLabelEtiqueta.setBounds(10, 5, 450, 30);
        
        Font plainFont = new Font("Tahoma", Font.PLAIN, 18);
        jLabelEtiqueta.setFont(plainFont);
        
        jLabelEtiqueta.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        jLabelEtiqueta.setForeground(Color.blue);
        
        jLabelEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        jLabelEtiqueta.setVerticalAlignment(JLabel.CENTER);
        
        add(jLabelEtiqueta);  
    }
    
    public static void main(String[] args) {
        new Ejercicios_Ventana6();
    }   
}
