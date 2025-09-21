package games;

import hexlet.code.Engine;
import java.util.Random;


public class Even {
    public static void play() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[] questions = new String[3];
        String[] answers = new String[3];

        for (int i = 0; i < 3; i++) {
            int number = generateRandomNumber();
            questions[i] = String.valueOf(number);
            answers[i] = isEven(number) ? "yes" : "no";
        }

        Engine.runGame(description, questions, answers);
    }

    private static int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100) + 1;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
