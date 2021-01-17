package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon = new ImageIcon("egg_smaller.jpg");
        ImageIcon icon2 = new ImageIcon("mr_small.gif");

        button = new JButton();
        label = new JLabel();

        label.setIcon(icon2);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button.setBounds(200,200,250,100);
        button.addActionListener(this);
        button.setText("I'm a button. period");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setIconTextGap(-10);
        button.setFont(new Font("Comic Sans", Font.BOLD, 10));
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button) {
            //System.out.println("purr");
           // button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
