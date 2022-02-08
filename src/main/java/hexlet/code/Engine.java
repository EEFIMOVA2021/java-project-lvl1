package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;

    public static void runGame(String startText, String[][] gameData) {
        Scanner engineScanner = new Scanner(System.in);
        String gamerName = "";
        System.out.println(Cli.WELCOME_TEXT);
        System.out.print(Cli.WELCOME_QUESTION);
        gamerName = engineScanner.nextLine();
        System.out.println("Hello, " + gamerName + "!");
        System.out.println(startText);
        boolean gameResult = true;
        for (String[] gameQuestionAnswer: gameData) {
            System.out.print("Question: " + gameQuestionAnswer[0] + "\nYour answer: ");
            String gamerAnswer = engineScanner.nextLine();
            if (gamerAnswer.equals(gameQuestionAnswer[1])) {
                System.out.println("Correct!");
            } else {
                gameResult = false;
                System.out.print("'" + gamerAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gameQuestionAnswer[1] + "'.");
                break;
            }
        }
        if (gameResult) {
            System.out.println("Congratulations, " + gamerName + "!");
        } else {
            System.out.println("Let's try again, " + gamerName + "!");
        }
        engineScanner.close();
    }
}
