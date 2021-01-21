package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame("SliderDemo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100, 50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setOrientation(SwingConstants.VERTICAL);

        slider.setPaintLabels(true);
        slider.setFont(new Font("SansSerif", Font.PLAIN, 10));
        label.setFont(new Font("SansSerif", Font.PLAIN, 20));
        slider.addChangeListener(this);


        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("how fire this is: " + slider.getValue());
    }
}
