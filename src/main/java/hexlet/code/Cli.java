package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String WELCOME_TEXT = "Welcome to the Brain Games!";
    public static final String WELCOME_QUESTION = "May I have your name? ";
    public static final String HELLO_TEXT_1 = "Hello, ";
    public static final String HELLO_TEXT_2 = "!";
    public static final Scanner CLI_SCANNER = new Scanner(System.in);

    public static String welcome() {
        String gamerName = "";
        System.out.println(WELCOME_TEXT);
        System.out.print(WELCOME_QUESTION);
        gamerName = CLI_SCANNER.nextLine();
        System.out.println(HELLO_TEXT_1 + gamerName + HELLO_TEXT_2);
        return gamerName;
    }
}
