package com.company;

public class Customer {
    private String ID;
    private String password;
    private String question;
    private String answer;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
