package com.company;

import javax.swing.*;
public class JoptionPaneTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JoptionPane Test");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(frame, "Hello Java");
        JOptionPane.showMessageDialog(frame, "You have less amount, please recharge","Apocalyptic message", JOptionPane.WARNING_MESSAGE);
        int result = JOptionPane.showConfirmDialog(null, "Do you want to remove item now?");
        switch (result) {
            case JOptionPane.YES_OPTION -> System.out.println("Yes");
            case JOptionPane.NO_OPTION -> System.out.println("No");
            case JOptionPane.CANCEL_OPTION -> System.out.println("Cancel");
            case JOptionPane.CLOSED_OPTION -> System.out.println("Closed");
        }
        String name = JOptionPane.showInputDialog(null, "Please enter your name.");
        System.out.println(name);
        JTextField userField = new JTextField();
        TextPrompt userPlaceholder = new TextPrompt("Enter ID", userField);
        userPlaceholder.changeAlpha(0.75f);
        JPasswordField passField = new JPasswordField();
        TextPrompt passPlaceholder = new TextPrompt("Enter Password", passField);
        passPlaceholder.changeAlpha(0.75f);
        String message = "Please enter your ID and password.";
        result = JOptionPane.showOptionDialog(frame, new Object[] {message, userField, passField},
                "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (result == JOptionPane.OK_OPTION)
            System.out.println(userField.getText() + " " + new String(passField.getPassword()));
        System.exit(0);
    }
}