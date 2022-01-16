package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void welcomePlayeer() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String playeerName = sc.nextLine();
        System.out.println("Hello, " + playeerName + "!");
    }
}
