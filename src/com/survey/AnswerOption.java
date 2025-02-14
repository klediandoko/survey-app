package com.survey;

public enum AnswerOption {

    AGREE("Agree"),
    SLIGHTLY_AGREE("Slightly Agree"),
    SLIGHTLY_DISAGREE("Slightly Disagree"),
    DISAGREE("Disagree"),
    NOT_ANSWERED("Not Answered");

    private final String label;

    AnswerOption(String text) {
        this.label = text;
    }

    public String getLabel() {
        return label;
    }
}
