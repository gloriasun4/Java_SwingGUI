package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;

    MyFrame() {

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.red);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username: ");

        button = new JButton("Submit");
        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //has to be before pack
        this.add(button);
        this.add(textField);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println("Hello " + textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}

