package com.company;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class LogInJOptionPane {
    public static void main(String[] args) {
        final int CANCEL_OPTION = 0;
        final int SIGNUP_OPTION = 1;
        final int LOGIN_OPTION = 2;

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        Object[] possibleResults = { "Cancel", "Sign Up", "Log In" };
        String message = "Please enter your ID and password.";

        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        Object[] objects = {message, userField, passField};

        TextPrompt userPlaceholder = new TextPrompt("Enter ID", userField);
        TextPrompt passPlaceholder = new TextPrompt("Enter Password", passField);
        userPlaceholder.changeAlpha(0.75f);
        passPlaceholder.changeAlpha(0.75f);

        int result = JOptionPane.showOptionDialog(frame, objects, "Log In", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, possibleResults, 0);

        switch (result) {
            case CANCEL_OPTION -> System.out.println("Cancel chosen");
            case SIGNUP_OPTION -> System.out.println("Sign up chosen");
            case LOGIN_OPTION -> {
                System.out.println("Log in chosen");
                System.out.println(userField.getText() + " " + new String(passField.getPassword()));
            }
        }
        System.exit(0);
    }
}