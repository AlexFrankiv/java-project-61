package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void play() {
        String description = "What is the result of the expression?";

        String[] questions = new String[ROUNDS_COUNT];
        String[] answers = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = generateQuestion();
            questions[i] = question;
            answers[i] = String.valueOf(calculateAnswer(question));
        }

        Engine.runGame(description, questions, answers);
    }

    private static String generateQuestion() {
        Random random = new Random();
        int firstNumb = random.nextInt(MAX_NUMBER) + MIN_NUMBER;
        int secondNumb = random.nextInt(MAX_NUMBER) + MIN_NUMBER;

        char randomOperator = OPERATORS[random.nextInt(OPERATORS.length)];

        if (randomOperator == '-' && firstNumb < secondNumb) {
            int temp = firstNumb;
            firstNumb = secondNumb;
            secondNumb = temp;
        }

        return firstNumb + " " + randomOperator + " " + secondNumb;
    }

    private static int calculateAnswer(String question) {
        String[] parts = question.split(" ");
        int first = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int second = Integer.parseInt(parts[2]);

        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            default:
                return 0;
        }
    }
}
