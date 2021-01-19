package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

            /* uncomment to get absolutely memed
            int answer = JOptionPane.showConfirmDialog(null, "Are you freer than a Costco sample?", "Only one right answer.",
            JOptionPane.YES_NO_CANCEL_OPTION);
            while (answer != 0) {
                answer = JOptionPane.showConfirmDialog(null, "Are you freer than a Costco sample?", "Only one right answer.",
                JOptionPane.YES_NO_CANCEL_OPTION);
            }
            String answer = JOptionPane.showInputDialog("What's up?: ");
            System.out.println("Ok, so " + answer + ". Any askers?");
            */
        String[] responses = {"Yeah, ME", "You're mean", "Huh?"};
        ImageIcon icon = new ImageIcon("egg_smaller.jpg");
        JOptionPane.showOptionDialog(null, "Any askers?", null,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);


    }
}