package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void playGCD() {
        String description = "Find the greatest common divisor of given numbers.";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
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
    return random.nextInt(100) + 1;
}
}
