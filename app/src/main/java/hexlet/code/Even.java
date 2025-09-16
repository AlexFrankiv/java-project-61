package hexlet.code;

import java.util.Random;


public class Even {
    public static int startGameEven() {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int randomNumb = rand.nextInt(range) + min;
        return randomNumb;
    }

    public static boolean isEven(int randomNumb) {
        return randomNumb % 2 == 0;
    }
    public static boolean checkAnswer(int number, String answer) {
        boolean isEven = isEven(number);
        return (isEven && answer.equalsIgnoreCase("yes"))
                || (!isEven && answer.equalsIgnoreCase("no"));
    }
}
