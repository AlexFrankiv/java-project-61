package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final int ROUNDS_COUNT = 3;
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_START = 1;
    private static final int MAX_START = 20;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;

    public static void play() {
        String description = "What number is missing in the progression?";

        String[] questions = new String[ROUNDS_COUNT];
        String[] answers = new String[ROUNDS_COUNT];

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] progressionData = generateProgression();
            questions[i] = progressionData[0];
            answers[i] = progressionData[1];
        }
        Engine.runGame(description, questions, answers);
    }
        public static String[] generateProgression() {
            Random random = new Random();

            int length = random.nextInt(MAX_LENGTH) + MIN_LENGTH;
            int start = random.nextInt(MAX_START) + MIN_START;
            int step = random.nextInt(MAX_STEP) + MIN_STEP;

            int[] progression = new int[length];
            for (int i = 0; i < length; i++) {
                progression[i] = start + i * step;
            }

            int hiddenIndex = random.nextInt(length);
            int correctAnswer = progression[hiddenIndex];

            StringBuilder question = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (i == hiddenIndex) {
                    question.append(".. ");
                } else {
                    question.append(progression[i]).append(" ");
                }
            }

            return new String[]{question.toString().trim(), String.valueOf(correctAnswer)};
        }
}
