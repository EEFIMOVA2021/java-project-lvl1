package hexlet.code;
import java.util.Scanner;

public class Even {
    public static void playEven() {
        int number = 0;
        final int countTry = 3;
        final int countRandom = 100;
        String playeerAnswer = "";
        String playeerName = Cli.welcomePlayeer();
        String result = "success";
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Scanner evenScanner = new Scanner(System.in);
        for (int i = 0; i < countTry; i++) {
            number = (int) (Math.random() * countRandom);
            System.out.println("Question: " + number + "\nYour answer: ");
            playeerAnswer = evenScanner.nextLine();
            if (playeerAnswer.equals("yes") && number % 2 == 0 || playeerAnswer.equals("no") && number % 2 == 1) {
                System.out.println("Correct!");
            } else {
                i = countTry;
                result = "error";
                if (playeerAnswer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                } else {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                }
            }
        }
        if (result.equals("success")) {
            System.out.println("Congratulations, " + playeerName + "!");
        } else {
            System.out.println("Let's try again, " + playeerName + "!");
        }
    }
}
