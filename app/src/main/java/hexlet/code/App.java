package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       /*System.out.println("Welcome to the Brain Games!");
        System.out.println("Hello, " + Cli.greetingWithPlayer());
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter\n1 - Greet\n0 - Exit");
        String userChoice = sc.nextLine();
        switch (userChoice) {
            case "1":
                System.out.println("Your choice: "
                        + userChoice + "\nWelcome to the Brain Games!\nMay i havw yor name? ");
                String userName = sc.nextLine();
                System.out.println("Hello, " + userName);
                break;
            case "0":
                break;
            default:
                break;
        }
    }
}