package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyFrame extends JFrame {

    DragPanel dragPanel = new DragPanel();

    MyFrame() {
        this.setTitle("Drag & Drop demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(dragPanel);
        this.setVisible(true);
    }


}

