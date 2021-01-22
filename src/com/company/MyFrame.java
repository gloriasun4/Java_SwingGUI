package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Choose a color!");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("This is some text");
        label.setFont(new Font("SansSerif", Font.BOLD, 50));

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
            label.setBackground(color);
        }
    }
}

