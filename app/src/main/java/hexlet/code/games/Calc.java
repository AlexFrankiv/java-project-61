package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calc {
    private static final int MAX_NUMBER = 20;
    private static final int MIN_NUMBER = 1;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void play() {
        String description = "What is the result of the expression?";

        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int secondNumber = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            char operator = generateRandomOperator();

            if (operator == '-' && firstNumber < secondNumber) {
                int temp = firstNumber;
                firstNumber = secondNumber;
                secondNumber = temp;
            }

            String question = firstNumber + " " + operator + " " + secondNumber;
            int answer = calculate(operator, firstNumber, secondNumber);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = String.valueOf(answer);
        }
        Engine.runGame(description, questionsAndAnswers);
    }

    private static char generateRandomOperator() {
        Random random = new Random();
        return OPERATORS[random.nextInt(OPERATORS.length)];
    }

    private static int calculate(char operator, int number1, int number2) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Unknown operator: " + operator);
        };
    }
}
