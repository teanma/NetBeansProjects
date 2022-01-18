/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miventana;

/**
 *
 * @author TeodorAndreiMardale
 */
public class MiVentana1 extends javax.swing.JFrame {
    
    //Constructor
    public MiVentana1() {
        //Mostrar ventana
        setVisible(true);
        
        //Cerrar la aplicación
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //Crear las dimensiones de la ventana
        setBounds(300, 100, 600, 500);
        
        //No redimensionable
        setResizable(false);
        
        //Título
        setTitle("Mi Ventana");
        
        //Centrar la ventana
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new MiVentana1();
    }
}
