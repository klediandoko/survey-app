package com.survey;

import java.util.HashMap;
import java.util.Map;


public class Question {

    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    @Override
    public String toString() {
        return "Question{" +
                " " + questionText +
                '}';
    }
}
