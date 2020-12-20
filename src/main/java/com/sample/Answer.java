package com.sample;

public class Answer{
    public String question;
    public String answer;

    public Answer() {
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Answer(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }
}