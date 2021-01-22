package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {

    ImageIcon icon = new ImageIcon(getClass().getResource("hamburger_emoji.png"));
    ImageIcon icon2 = new ImageIcon(getClass().getResource("hot-dog_emoji.png"));
    final int WIDTH = icon.getIconWidth();
    final int HEIGHT = icon.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel() {
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
        icon2.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed (MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged (MouseEvent e) {
            Point currentPoint = e.getPoint();
            imageCorner.translate((int)(currentPoint.getX()-prevPt.getX()), (int)(currentPoint.getY()-prevPt.getY()));
            prevPt = currentPoint;
            repaint();
        }
    }
}
