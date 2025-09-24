package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public class Even {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[ROUNDS_COUNT];
        String[] answers = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int number = generateRandomNumber();
            questions[i] = String.valueOf(number);
            answers[i] = isEven(number) ? "yes" : "no";
        }

        Engine.runGame(description, questions, answers);
    }

    private static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(MAX_NUMBER) + MIN_NUMBER;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
