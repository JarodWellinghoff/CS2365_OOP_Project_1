package com.company;

import javax.swing.*;

public class SignUpJOptionPane {
    public static void main(String[] args) {
        final int CANCEL_OPTION = 0;
        final int SIGNUP_OPTION = 1;

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        Object[] possibleResults = { "Cancel", "Sign Up" };
        String[] possibleQuestions = { "Q1", "Q2", "Q3" };
        String message1 = "Please enter your information";
        String message2 = "Chose a security question";
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JPasswordField passCheckField = new JPasswordField();
        JComboBox<String> questionComboBox = new JComboBox<>(possibleQuestions);
        JTextField answerField = new JTextField();
        Object[] objects = {message1, userField, passField, passCheckField, message2, questionComboBox, answerField};

        TextPrompt userPlaceholder = new TextPrompt("Enter ID", userField);
        TextPrompt passPlaceholder = new TextPrompt("Enter Password", passField);
        TextPrompt passCheckPlaceholder = new TextPrompt("Confirm Password", passCheckField);
        TextPrompt answerPlaceholder = new TextPrompt("Answer", answerField);
        userPlaceholder.changeAlpha(0.75f);
        passPlaceholder.changeAlpha(0.75f);
        passCheckPlaceholder.changeAlpha(0.75f);
        answerPlaceholder.changeAlpha(0.75f);

        int result = JOptionPane.showOptionDialog(frame, objects, "Sign Up", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, possibleResults, 0);

        switch (result) {
            case CANCEL_OPTION -> System.out.println("Cancel chosen");
            case SIGNUP_OPTION -> System.out.println(questionComboBox.getSelectedItem() + answerField.getText());

        }
        System.exit(0);
    }
}