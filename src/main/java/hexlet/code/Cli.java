package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static final String WELCOME_TEXT = "Welcome to the Brain Games!";
    public static final String WELCOME_QUESTION = "May I have your name? ";
    public static final String HELLO_TEXT_1 = "Hello, ";
    public static final String HELLO_TEXT_2 = "!";
    private static Scanner cliScanner;

    public static String welcome() {
        String gamerName = "";
        System.out.println(WELCOME_TEXT);
        System.out.print(WELCOME_QUESTION);
        cliScanner = new Scanner(System.in);
        gamerName = cliScanner.nextLine();
        System.out.println(HELLO_TEXT_1 + gamerName + HELLO_TEXT_2);
        //если закрываю здесь то получаю ошибку
        // Exception in thread "main" java.util.NoSuchElementException: No line found
        //...at hexlet.code.Engine.playGameCycle(Engine.java:84)
        //cliScanner.close();
        return gamerName;
    }
}
