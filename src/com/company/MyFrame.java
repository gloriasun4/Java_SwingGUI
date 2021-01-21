package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ButtonGroup group;
    ImageIcon pizzaImage;
    ImageIcon hamburgerImage;
    ImageIcon hotdogImage;

    MyFrame() {

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaImage = new ImageIcon("pizza_emoji.png");
        hamburgerImage = new ImageIcon("hamburger_emoji.png");
        hotdogImage = new ImageIcon("hot-dog_emoji.png");

        pizzaButton.setIcon(pizzaImage);
        hamburgerButton.setIcon(hamburgerImage);
        hotdogButton.setIcon(hotdogImage);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton){
            System.out.println("You ordered pizza!");
        }
        if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered hamburger!");
        }
        if (e.getSource() == hotdogButton) {
            System.out.println("You ordered hotdog!");
        }

    }
}

