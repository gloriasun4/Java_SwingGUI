package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame {

    MyPanel myPanel;

    MyFrame() {

        myPanel = new MyPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocationRelativeTo(null);

        this.add(myPanel);
        this.pack();

        this.setVisible(true);
    }




}

