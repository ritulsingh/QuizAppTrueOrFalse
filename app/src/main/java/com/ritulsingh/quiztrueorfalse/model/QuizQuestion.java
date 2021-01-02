package com.ritulsingh.quiztrueorfalse.model;

public class QuizQuestion {

    private String quizQuestion;
    private boolean trueAnswer;

    public QuizQuestion(String quizQuestion, boolean trueAnswer) {
        this.quizQuestion = quizQuestion;
        this.trueAnswer = trueAnswer;
    }

    public String getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        this.quizQuestion = quizQuestion;
    }

    public boolean isTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        this.trueAnswer = trueAnswer;
    }
}
