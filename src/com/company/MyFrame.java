package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame() {

        this.getContentPane().setBackground(Color.black);

        label = new JLabel();
        label.setBounds(200,350, 100, 100);
        //label.setBackground(Color.red);
        //label.setOpaque(true);

        icon = new ImageIcon(getClass().getResource("egg_small.jpg"));
        label.setIcon(icon);

        this.add(label);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);


        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'w': label.setLocation(label.getX(), label.getY()-5);
                break;
            case 'a': label.setLocation(label.getX()-5, label.getY());
                break;
            case 's': label.setLocation(label.getX(), label.getY()+5);
                break;
            case 'd': label.setLocation(label.getX()+5, label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 38: label.setLocation(label.getX(), label.getY()-5);
                break;
            case 37: label.setLocation(label.getX()-5, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY()+5);
                break;
            case 39: label.setLocation(label.getX()+5, label.getY());
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
}

