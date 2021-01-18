package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10));



        for (int i = 1; i <10; i++) {
            frame.add(new JButton("" + i));
        }

        frame.setVisible(true);

    }
}