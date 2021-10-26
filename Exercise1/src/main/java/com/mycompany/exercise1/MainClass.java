/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise1;

import java.awt.*;  
import javax.swing.*;  

/**
 *
 * @author TeodorAndreiMardale
 */
public class MainClass {

    public MainClass() {
        
        JFrame frame = new JFrame();
        frame.setTitle("Primera ventana en java");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBounds(40,60,300,200);
        panel.setBackground(Color.red);
        
        JButton btn1 = new JButton("Cyan");
        btn1.setBackground(Color.CYAN);
        JButton btn2 = new JButton("Green");
        btn2.setBackground(Color.green);
        JButton btn3 = new JButton("Yellow");
        btn3.setBackground(Color.yellow);
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        
        frame.add(panel);
        frame.setSize(400, 400);
    }
    
    public static void main(String[] args) {
        new MainClass();
    }
}
