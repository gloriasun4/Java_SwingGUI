package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 650;
    final int PANEL_HEIGHT = 650;

    Image sbPatrick;
    Image sbImagination;
    Timer timer;
    int xVelocity = 2;
    int yVelocity = 2;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);

        sbPatrick = new ImageIcon(getClass().
                getResource("spongebob_patrick_concentrated.png")).getImage();
        sbImagination = new ImageIcon(getClass().
                getResource("spongebob_imagination.jpg")).getImage();

        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(sbImagination,0,0,null);
        g2d.drawImage(sbPatrick, x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x >= PANEL_WIDTH - sbPatrick.getWidth(null) ||
        x < 0) {
            xVelocity = xVelocity * -1;
        }
        if (y >= PANEL_HEIGHT - sbPatrick.getHeight(null) ||
                y < 0) {
            yVelocity = yVelocity * -1;
        }
        x = x + xVelocity;
        y = y + yVelocity;
        repaint();

    }
}
