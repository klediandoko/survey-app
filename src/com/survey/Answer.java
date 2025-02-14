package com.survey;

import java.util.*;

public class Answer {

    private final Map<Question, AnswerOption> answers;

    public Answer() {
        answers = new HashMap<>();
    }


    public void setAnswer(Question question, AnswerOption answer) {
        answers.put(question, answer);
        System.out.println("Pergjigja: " + " " + answer.getLabel());
    }


    public AnswerOption getAnswer(Question question) {
        return answers.getOrDefault(question, AnswerOption.NOT_ANSWERED);
    }

    public boolean isAnswered(Question question) {
        return !getAnswer(question).equals(AnswerOption.NOT_ANSWERED);
    }

    public Map<Question, AnswerOption> getAllAnswers() {
        return answers;
    }
}

