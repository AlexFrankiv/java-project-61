package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String greetingWithPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("May i have your name? ");
        String answerPlayer = sc.nextLine();
        return answerPlayer;
    }
}
