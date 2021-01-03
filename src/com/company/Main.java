package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("eggbacon.jpg");
        JLabel label = new JLabel();
        label.setText("Bro, do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);

    }
}
