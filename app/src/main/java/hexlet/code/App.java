package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter\n1 - Greet\n2 - Even Game\n0 - Exit");
        String userChoice = sc.nextLine();

        switch (userChoice) {
            case "2":
                playEvenGame(sc);
                break;

            case "1":
                greetUser(sc);
                break;

            case "0":
                break;

            default:
                break;
        }

        sc.close();
    }

    private static void playEvenGame(Scanner sc) {
        System.out.println("Your choice: 2");
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswerCount = 0;
        int rounds = 3;
        for (int i = 0; i < rounds; i++) {
            int number = Even.startGameEven();
            System.out.println("Question: " + number);

            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if (Even.checkAnswer(number, answer)) {
                System.out.println("Correct!");
                correctAnswerCount++;
            } else {
                String correctAnswer = Even.isEven(number) ? "yes" : "no";
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        if (correctAnswerCount == rounds) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    private static void greetUser(Scanner sc) {
        System.out.println("Your choice: 1");
        System.out.println("Welcome to the Brain Games!\nMay I have your name? ");
        String user1Name = sc.nextLine();
        System.out.println("Hello, " + user1Name);
    }
}
