package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    public static void play() {
        String description = "What number is missing in the progression?";

        String[][] questionsAndAnswers = new String[Engine.ROUNDS_COUNT][2];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = Utils.generateNumber(MIN_LENGTH, MAX_LENGTH);
            int start = Utils.generateNumber(MIN_START, MAX_START);
            int step = Utils.generateNumber(MIN_STEP, MAX_STEP);

            String[] progression = makeProgression(start, step, length);
            int hiddenIndex = random.nextInt(length);
            String answer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";
            String question = String.join(" ", progression);

            questionsAndAnswers[i][0] = question;
            questionsAndAnswers[i][1] = answer;
        }
        Engine.runGame(description, questionsAndAnswers);
    }
    public static String[] makeProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}
