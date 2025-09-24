package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_NUMBER = 2;
    private static final int MAX_NUMBER = 100;

    public static void play() {
    String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    String[] questions = new String[ROUNDS_COUNT];
    String[] answers = new String[ROUNDS_COUNT];

    for (int i = 0; i < ROUNDS_COUNT; i++) {
        int number = generateNumber();
        questions[i] = String.valueOf(number);
        answers[i] = isPrime(number) ? "yes" : "no";
    }

    Engine.runGame(description, questions, answers);
}

    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + MIN_NUMBER;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
