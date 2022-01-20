package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String welcomePlayeer() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String playeerName = sc.nextLine();
        System.out.println("Hello, " + playeerName + "!");
        return playeerName;
    }
    public static void getGameResult(String result, String playeerName) {
        if (result.equals("success")) {
            System.out.println("Congratulations, " + playeerName + "!");
        } else {
            System.out.println("Let's try again, " + playeerName + "!");
        }
    }
}
