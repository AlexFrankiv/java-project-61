package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void play() {
    String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    String[] questions = new String[3];
    String[] answers = new String[3];

    for (int i = 0; i < 3; i++) {
        int number = generateNumber();
        questions[i] = String.valueOf(number);
        answers[i] = isPrime(number) ? "yes" : "no";
    }

    Engine.runGame(description, questions, answers);
}

    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(100) + 2;
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
