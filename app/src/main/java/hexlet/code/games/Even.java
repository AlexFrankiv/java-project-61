package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MAX_NUMBER = 100;
    private static final int MIN_NUMBER = 1;

    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(MIN_NUMBER, MAX_NUMBER);
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.runGame(description, questionsAndAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
