/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana;

import javax.swing.JButton;

/**
 *
 * @author TeodorAndreiMardale
 */
public class Ejercicios_Ventana5 extends javax.swing.JFrame {
    
    public Ejercicios_Ventana5() {
        
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        
        setSize(400, 400);
        
        setResizable(false);
        
        JButton jButtonEmpezar = new JButton("Empezar");

        jButtonEmpezar.setBounds(282, 0, 100, 30);
        
        add(jButtonEmpezar);

    }
    
    public static void main(String[] args) {
        new Ejercicios_Ventana5();
    } 
}
