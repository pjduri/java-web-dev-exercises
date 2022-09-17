package org.launchcode.java.studios.inheritanceStudio;

import java.util.HashMap;
import java.util.Map;

public abstract class Question {

    private String questionText;
    private String correctAnswer;
    private HashMap<String, String> possibleAnswers;

    public Question(String questionText, String correctAnswer,
                    HashMap<String, String> possibleAnswers) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public HashMap<String, String> getPossibleAnswers() {
        return possibleAnswers;
    }

    @Override
    public String toString() {
        StringBuilder answersList = new StringBuilder();
        for (Map.Entry<String, String> possibleAnswer : possibleAnswers.entrySet()) {
            answersList.append(possibleAnswer.getKey()).append(": ").append(possibleAnswer.getValue()).append("\n");
        }
        return possibleAnswers + answersList.toString();
    }

    public abstract boolean isCorrect(String answer);

}
