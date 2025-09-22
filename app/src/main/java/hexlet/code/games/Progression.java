package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void play() {
        String description = "What number is missing in the progression?";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            String[] progressionData = generateProgression();
            questions[i] = progressionData[0];
            answers[i] = progressionData[1];
        }
        Engine.runGame(description, questions, answers);
    }
        public static String[] generateProgression() {
            Random random = new Random();

            int length = random.nextInt(6) + 5;
            int start = random.nextInt(20) + 1;
            int step = random.nextInt(10) + 1;

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
