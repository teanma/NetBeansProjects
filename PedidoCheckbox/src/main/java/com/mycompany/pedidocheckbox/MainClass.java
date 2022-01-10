/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pedidocheckbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author marda
 */
public class MainClass extends JFrame {
    
    private static double price;
    
    public static void main(String[] args) {
        inicializar();
    }
    
    private static void inicializar() {
        JFrame jFrameMainScreen = new JFrame();
        jFrameMainScreen.setTitle("Pedido con checkbox");
        jFrameMainScreen.setVisible(true);
        jFrameMainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameMainScreen.setLayout(null);
        jFrameMainScreen.setLocationRelativeTo(null);
        jFrameMainScreen.setSize(340, 220);
        
        JLabel jLabelSelecProd = new JLabel();
        jLabelSelecProd.setText("Selecciona los productos a pedir");
        jLabelSelecProd.setBounds(62, 30, 240, 15);
        
        JCheckBox jCheckBoxBurguer = new JCheckBox("Burguer");
        jCheckBoxBurguer.setBounds(120, 70, 85, 25);
        jCheckBoxBurguer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBoxBurguer.isSelected()) {
                    String producto = "Burguer";
                    double burguerPrice = 2.99;
                    price = price + burguerPrice;
                    String finalPrice = String.valueOf(producto + ": " + burguerPrice + "\n" + "Precio final: " + price);
                    JOptionPane.showMessageDialog(jFrameMainScreen, finalPrice);
                } else {
                    String producto = "Burguer";
                    double burguerPrice = 2.99;
                    price = price - burguerPrice;
                    String finalPrice = String.valueOf(producto + ": " + burguerPrice + "\n" + "Precio final: " + price);
                    JOptionPane.showMessageDialog(jFrameMainScreen, finalPrice);
                }
            }
        });
        
        JCheckBox jCheckBoxPizza = new JCheckBox("Pizza");
        jCheckBoxPizza.setBounds(120, 100, 85, 25);
        jCheckBoxPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBoxPizza.isSelected()) {
                    String producto = "Pizza";
                    double pizzaPrice = 5.99;
                    price = price + pizzaPrice;
                    String finalPrice = String.valueOf(producto + ": " + pizzaPrice + "\n" + "Precio final: " + price);
                    JOptionPane.showMessageDialog(jFrameMainScreen, finalPrice);
                } else {
                   String producto = "Pizza";
                   double pizzaPrice = 5.99;
                   price = price - pizzaPrice;
                   String finalPrice = String.valueOf(producto + ": " + pizzaPrice + "\n" + "Precio final: " + price);
                   JOptionPane.showMessageDialog(jFrameMainScreen, finalPrice); 
                }
            }
        });
        
        JCheckBox jCheckBoxKebab = new JCheckBox("Kebab");
        jCheckBoxKebab.setBounds(120, 130, 85, 25);
        jCheckBoxKebab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (jCheckBoxKebab.isSelected()) {
                    String producto = "Kebab";
                    double kebabPrice = 4.99;
                    price = price + kebabPrice;
                    String finalPrice = String.valueOf(producto + ": " + kebabPrice + "\n" + "Precio final: " + price);
                    JOptionPane.showMessageDialog(jFrameMainScreen, finalPrice);
                } else {
                    String producto = "Kebab";
                    double kebabPrice = 4.99;
                    price = price - kebabPrice;
                    String finalPrice = String.valueOf(producto + ": " + kebabPrice + "\n" + "Precio final: " + price);
                    JOptionPane.showMessageDialog(jFrameMainScreen, finalPrice);
                }
            }
        });
        
        jFrameMainScreen.add(jLabelSelecProd);
        jFrameMainScreen.add(jCheckBoxBurguer);
        jFrameMainScreen.add(jCheckBoxPizza);
        jFrameMainScreen.add(jCheckBoxKebab);
    }
}
