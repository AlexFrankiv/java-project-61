package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static void runGame(String gameDescription, String[] questions, String[] correctAnswers) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();

            if (!userAnswer.equals(correctAnswers[i])) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
