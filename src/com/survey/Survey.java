package com.survey;

import java.util.*;

public class Survey {

    private String title;
    private String topic;
    private String description;
    private List<Question> questionList;
    private Map<Candidate, Answer> answerMap;

    public Survey(String title, String topic, String description) {
        this.title = title;
        this.topic = topic;
        this.description = description;
        this.questionList = new ArrayList<>();
        this.answerMap = new HashMap<>();
    }


    //shto pyetje nese  check me pak se 40 pyetje OK
    public void addQuestion(Question question) {
        if (questionList.size() < 40) {
            questionList.add(question);
            System.out.println("Pyetja e shtuar: " + question.getQuestionText());
        } else {
            System.out.println("Eshte arritur limiti i 40 pyetjeve!");
        }
    }

    public void deleteQuestion(Question question) {
        questionList.remove(question);
        // System.out.println("Pyetje e fshire: " + " " + question.getQuestionText());
    }


    public void addResponse(Candidate candidate, Answer answer) {
        answerMap.put(candidate, answer);
    }

    // most frequent per question
    public AnswerOption findMostGivenAnswer(Question question) {
        Map<AnswerOption, Integer> answerCounts = new HashMap<>();
        for (Answer answer : answerMap.values()) {
            AnswerOption response = answer.getAnswer(question);
            answerCounts.put(response, answerCounts.getOrDefault(response, 0) + 1);
        }
        return answerCounts.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(AnswerOption.NOT_ANSWERED);
    }

    //survey result
    public void printSurveyResults() {
        for (Question question : questionList) {
            System.out.println("Pergjigje per pyetjen: " + question.getQuestionText());
            Map<AnswerOption, Integer> answerCounts = new HashMap<>();
            for (Answer answer : answerMap.values()) {
                AnswerOption answerOption = answer.getAnswer(question);
                answerCounts.put(answerOption, answerCounts.getOrDefault(answerOption, 0) + 1);
            }
            for (AnswerOption option : AnswerOption.values()) {
                System.out.println(option.getLabel() + ": " + answerCounts.getOrDefault(option, 0));
            }
        }
    }


    // answers givne by a candidate
    public Map<Question, AnswerOption> answersPerCandidate(Candidate candidate) {
        Answer answer = answerMap.getOrDefault(candidate, null);
        return answer.getAllAnswers();
    }


    public void checkAndRemoveLessAnswered() {
        int totalCandidates = answerMap.size();
        System.out.println("Kandidad Total: " + totalCandidates);

        List<Question> toBeRemoved = new ArrayList<>();

        for (Question question : questionList) {
            int answeredCount = 0;
            for (Answer answer : answerMap.values()) {
                if (answer.isAnswered(question)) {
                    answeredCount++;
                }
            }

            System.out.println("AnsweredCount : " + answeredCount);
            if (answeredCount < totalCandidates * 0.5) {
                toBeRemoved.add(question);
                //System.out.println("Deleted question: " + question);
            }

        }
        for (Question question : toBeRemoved) {
            deleteQuestion(question);
            System.out.println("E fshire:  " + question.getQuestionText());
        }
    }

    public Candidate mostAnswersCandidate() {
        Candidate mostAnswersCandidate = null;
        int maxAnsweredCount = 0;

        for (Candidate candidate : answerMap.keySet()) {
            int anweredCount = 0;

            for (Answer answer : answerMap.values()) {
                if (answer.getAllAnswers().containsKey(candidate)) {
                    anweredCount++;
                }
            }

            if (anweredCount > maxAnsweredCount) {
                maxAnsweredCount = anweredCount;
                mostAnswersCandidate = candidate;
            }
        }
        return mostAnswersCandidate;
    }

    public boolean isValid() {
        if (questionList.size() < 10) {
            System.out.println("Survey too short! At least 10 qustions.");
        }
        if (questionList.size() > 40) {
            System.out.println("Max of 40 questions is reached! Cannot add more!");
        }

        Set<String> questionTexts = new HashSet<>();
        for (Question question : questionList) {
            if (questionTexts.contains(question.getQuestionText())) {
                System.out.println("E dyfishte: " + question.getQuestionText());
                return false;

            } else {
                questionTexts.add(question.getQuestionText());
            }
        }

        return true;

    }
}
