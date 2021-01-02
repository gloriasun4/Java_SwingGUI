package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("My first GUI!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("eggbacon.png");
        frame.setIconImage(image.getImage());


    }
}
