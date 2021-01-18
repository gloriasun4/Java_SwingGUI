package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,500,500);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(new Color(0xF45B69));
        label1.setBounds(50,50,200,200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(new Color(0xF6E8EA));
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(new Color(0x22181C));
        label3.setBounds(150,150,200,200);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(new Color(0x5A0001));
        label4.setBounds(200,200,200,200);

        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        label5.setBackground(new Color(0xF13030));
        label5.setBounds(250,250,200,200);


        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, Integer.valueOf(0));
        layeredPane.add(label3, Integer.valueOf(0));
        layeredPane.add(label4, Integer.valueOf(0));
        layeredPane.add(label5, Integer.valueOf(0));

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);




        frame.setVisible(true);

    }
}