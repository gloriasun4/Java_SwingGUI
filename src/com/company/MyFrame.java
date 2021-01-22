package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon pleading;
    ImageIcon hug;
    ImageIcon smilingBlushing;
    ImageIcon smile;
    ImageIcon neutral;
    ImageIcon worried;
    ImageIcon unamused;
    ImageIcon yawning;


    MyFrame() {

        pleading = new ImageIcon(getClass().getResource("pleading_emoji.png"));
        hug = new ImageIcon(getClass().getResource("hug_emoji.png"));
        smilingBlushing = new ImageIcon(getClass().getResource("smilingBlushing_emoji.png"));
        smile = new ImageIcon(getClass().getResource("smile_emoji.png"));
        neutral = new ImageIcon(getClass().getResource("neutral_emoji.png"));
        worried = new ImageIcon(getClass().getResource("worried_emoji.png"));
        unamused = new ImageIcon(getClass().getResource("unamused_emoji.png"));
        yawning = new ImageIcon(getClass().getResource("yawning_emoji.png"));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);

        label = new JLabel();
        //label.setBackground(Color.red);
        //label.setOpaque(true);
        this.addMouseListener(this);
        //label.setText("Give me attention!");
        //label.setFont(new Font("Lucida", Font.ITALIC, 50));
        label.setIcon(pleading);

        this.add(label);
        this.pack();
        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        label.setIcon(unamused);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setIcon(smilingBlushing);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setIcon(unamused);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setIcon(hug);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setIcon(pleading);
    }
}

