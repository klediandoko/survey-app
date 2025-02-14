package com.survey;

public class Main {

    public static void main(String[] args) {

        Survey survey = new Survey("", "Test zero", "test");
        if (!survey.validateFields()) {
            System.out.println("Shtoni te dhenat e munguara");
        } else {
            System.out.println("Survey OK!");
        }

        /* Candidate candidate1 = new Candidate("Kledi", "Doko", "dkdkdkdk", "1456465");
        Candidate candidate2 = new Candidate("Kledi", "Doko", "dkdkdkdk", "1456465");
       // survey.addCandidate(candidate1);
        survey.addCandidate(candidate2);*//*

        Question question1 = new Question("Si eshte koha sot?");
        //survey.addQuestion(question1);
        //survey.deleteQuestion(question1);

        //System.out.println("Pyetesori eshte i rregullt: " + " " +survey.isValid());

        Answer answer1= new Answer();
        answer1.setAnswer(question1, AnswerOption.AGREE);
        survey.addResponse(candidate1,answer1);
        survey.answersPerCandidate(candidate1);

    }*/
        /*Survey survey = new Survey("Test2", "aslkjlksjds", "test find answer per candidatte");

        Candidate candidate1 = new Candidate("kd", "doko", "skflejlkdjlsj", "64548648632151");
        Candidate candidate2 = new Candidate("kd2", "doko", "sdkskfjslfjd", "54646654");

        Answer answer1 = new Answer();
        answer1.setAnswer(new Question("A jeni te lumtur sot?"), AnswerOption.AGREE);
        Answer answer2 = new Answer();
        answer2.setAnswer(new Question("A mundeni te jeni me te lumtur?"), AnswerOption.SLIGHTLY_AGREE);
        survey.addResponse(candidate1, answer1);
        survey.addResponse(candidate2, answer2);

        System.out.println("Pergjigja kandidadi i pare: " + "(" + candidate1.getFirstName() + ")"
                + survey.answersPerCandidate(candidate1));
        System.out.println("Pergjigja kandidadi i dyte: " + "(" + candidate2.getFirstName() + ")"
                + survey.answersPerCandidate(candidate2));
    }*/


/*
                // Create survey
                Survey survey = new Survey("Test2", "test", "test all functions");

                // Create candidates
                Candidate candidate1 = new Candidate("Kled", "Doko", "kdkdkdkd", "1234567890");
                Candidate candidate2 = new Candidate("Kledian", "Doko", "ffdfvv", "0987654321");
                Candidate candidate3 = new Candidate("kd", "ds", "ane.smith@example.com", "53456465465");

                // Create questions
                Question question1 = new Question("A je i lumtur?");
                Question question2 = new Question("A mund te behesh me i lumtur?");
                Question question3 = new Question("A eshte sot nje kohe e mire?");

                // Add questions to the survey
                survey.addQuestion(question1);
                survey.addQuestion(question2);
                survey.addQuestion(question3);

               // Create answers for the candidates
                Answer answer1 = new Answer();
                answer1.setAnswer(question1, AnswerOption.AGREE);
                answer1.setAnswer(question2, AnswerOption.SLIGHTLY_AGREE);
                answer1.setAnswer(question3, AnswerOption.SLIGHTLY_DISAGREE);

                Answer answer2 = new Answer();
                answer2.setAnswer(question1, AnswerOption.DISAGREE);
                answer2.setAnswer(question2, AnswerOption.AGREE);
                answer2.setAnswer(question3, AnswerOption.SLIGHTLY_AGREE);

                Answer answer3 = new Answer();
                answer3.setAnswer(question1, AnswerOption.DISAGREE);
                answer3.setAnswer(question2, AnswerOption.AGREE);
                answer3.setAnswer(question3, AnswerOption.SLIGHTLY_AGREE);

                // Add responses for the candidates
                survey.addResponse(candidate1, answer1);
                survey.addResponse(candidate2, answer2);
                survey.addResponse(candidate3, answer3);*/

        // survey result
        //  survey.printSurveyResults();

          /*  // frequent answer
                AnswerOption mostFrequentAnswer = survey.findMostGivenAnswer(question1);
                System.out.println("Most frequent answer for Question 1: " + mostFrequentAnswer.getLabel());*/

                 /*   // answer per candidate
                System.out.println("Answers by Candidate 1:");
                Map<Question, AnswerOption> answersCandidate1 = survey.answersPerCandidate(candidate1);
                for (Map.Entry<Question, AnswerOption> entry : answersCandidate1.entrySet()) {
                    System.out.println(entry.getKey().getQuestionText() + ": " + entry.getValue().getLabel());
                }

                // <50%
               // survey.checkAndRemoveLessAnswered();

                //
                Candidate mostAnsweredCandidate = survey.mostAnswersCandidate();
                System.out.println("Most active candidate: " + mostAnsweredCandidate.getFirstName() + " " + mostAnsweredCandidate.getLastName());
*/
        /*survey.addQuestion(question1);
        System.out.println("Validity: " + survey.isValid());*/

    }
}





