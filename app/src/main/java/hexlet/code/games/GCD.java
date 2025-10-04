package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int MAX_NUMBER = 50;
    private static final int MIN_NUMBER = 1;

    public static void playGCD() {
        String description = "Find the greatest common divisor of given numbers.";

        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            int b = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            questionsAndAnswers[i][0] = a + " " + b;
            questionsAndAnswers[i][1] = String.valueOf(findGCD(a, b));
        }
        Engine.runGame(description, questionsAndAnswers);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
