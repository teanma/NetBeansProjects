/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author TeodorAndreiMardale
 */
public class Ejercicios_Ventana7 extends javax.swing.JFrame {
    
    public Ejercicios_Ventana7() {
        
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
        
        JLabel lblradio = new JLabel("Fondo");
        
        lblradio.setBounds(20, 200, 150, 30);
        
        Font fondoFont = new Font("Tahoma", Font.PLAIN, 18);
        lblradio.setFont(fondoFont);
        
        lblradio.setForeground(Color.gray);
        
        lblradio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        lblradio.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        
        add(lblradio);
        
        JRadioButton jrbVerde = new JRadioButton("VERDE");
        
        jrbVerde.setBounds(25, 250, 100, 30);
        
        Font verdeFont = new java.awt.Font("Tahoma", 1, 18);
        jrbVerde.setFont(verdeFont);
        
        add(jrbVerde);
        
        JRadioButton jrbRojo = new JRadioButton("ROJO");
        
        jrbRojo.setBounds(125, 250, 100, 30);
        
        Font rojoFont = new java.awt.Font("Tahoma", 1, 18);
        jrbRojo.setFont(rojoFont);
        
        add(jrbRojo);
        
        ButtonGroup buttonGroupFondo = new ButtonGroup();
        buttonGroupFondo.add(jrbVerde);
        buttonGroupFondo.add(jrbRojo);
        
        jrbVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jrbVerde.isSelected()) {
                    getContentPane().setBackground(Color.green);
                }
            }
        });
        
        jrbRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.red);
            }
        });
        
    }
    
    public static void main(String[] args) {
        new Ejercicios_Ventana7();
    }
}
