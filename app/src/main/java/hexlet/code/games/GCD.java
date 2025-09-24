package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void playGCD() {
        String description = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[ROUNDS_COUNT];
        String[] answers = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int a = generateNumber();
            int b = generateNumber();

            questions[i] = a + " " + b;
            answers[i] = String.valueOf(GCD.findGCD(a, b));
        }
        Engine.runGame(description, questions, answers);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
public static int generateNumber() {
    Random random = new Random();
    return random.nextInt(MAX_NUMBER) + MIN_NUMBER;
}
}
