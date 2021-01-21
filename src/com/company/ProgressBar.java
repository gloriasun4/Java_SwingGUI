package com.company;

import java.awt.*;
import javax.swing.*;

public class ProgressBar {

    JFrame frame;
    JProgressBar bar;

    ProgressBar() {
        frame = new JFrame();
        bar = new JProgressBar(0,100);

        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("SansSerif", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int count = 100;
        while(count>=0) {
            bar.setValue(count);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            count-=(Math.random()*10+1);
        }
    bar.setString("Game Over!");
    }
}
