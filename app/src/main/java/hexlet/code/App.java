package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calculator");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        String userChoice = sc.nextLine();

        switch (userChoice) {
            case "6":
                Prime.play();
                break;
            case "5":
                Progression.play();
                break;
            case "4":
                GCD.playGCD();
                break;
            case "3":
                Calc.play();
                break;
            case "2":
                Even.play();
                break;
            case "1":
                greetUser(sc);
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                throw new RuntimeException("Unknown user choice: " + userChoice);
        }

        sc.close();
    }

    private static void greetUser(Scanner sc) {
        System.out.println("Your choice: 1");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
