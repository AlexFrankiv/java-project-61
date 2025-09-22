package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void play() {
        String description = "What is the result of the expression?";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            String question = generateQuestion();
            questions[i] = question;
            answers[i] = String.valueOf(calculateAnswer(question));
        }

        Engine.runGame(description, questions, answers);
    }

    private static String generateQuestion() {
        Random random = new Random();
        int firstNumb = random.nextInt(100) + 1;
        int secondNumb = random.nextInt(100) + 1;

        char[] operators = {'+', '-', '*'};
        char randomOperator = operators[random.nextInt(operators.length)];

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
