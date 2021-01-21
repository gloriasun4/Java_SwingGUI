package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    //only works with reference types or Wrapper class (ex. Integer vs. int)
    JComboBox comboBox;

    MyFrame() {


        String[] roasts = {"boxed like a fish", "wiener built like a tic tac", "any askers?", "you're short", "literally grow"};
        comboBox = new JComboBox(roasts);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("freer than a Costco sample");
        //comboBox.insertItemAt("you were conceived at the back of a Dennys", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("you're short");
        //omboBox.removeItemAt(0);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        this.add(comboBox);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}

