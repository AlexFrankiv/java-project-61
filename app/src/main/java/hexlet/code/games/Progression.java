package hexlet.code.games;

import hexlet.code.Engine;

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

        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];

        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {

            int length = random.nextInt(MAX_LENGTH) + MIN_LENGTH;
            int start = random.nextInt(MAX_START) + MIN_START;
            int step = random.nextInt(MAX_STEP) + MIN_STEP;

            int[] progression = makeProgression(start, step, length);

            int hiddenIndex = random.nextInt(length);
            int correctAnswer = progression[hiddenIndex];

            String question = buildQuestion(progression, hiddenIndex);

            questions[i] = question;
            answers[i] = String.valueOf(correctAnswer);
        }

        Engine.runGame(description, questions, answers);
    }

    public static int[] makeProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    private static String buildQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]).append(" ");
            }
        }
        return question.toString().trim();
    }
}
