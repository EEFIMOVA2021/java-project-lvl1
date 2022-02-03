package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;
    public static final String RESULT_SUCCESS = "success";
    public static final String RESULT_ERROR = "error";

    public static void runGame(String startText, String[][] gameData) {
        Scanner engineScanner = new Scanner(System.in);
        String gamerName = welcome(engineScanner);
        System.out.println(startText);
        String gameResult = play(gameData, engineScanner);
        printGameResult(gamerName, gameResult);
        engineScanner.close();
    }

    private static String play(String[][] gameData, Scanner engineScanner) {
        String gameResult = RESULT_SUCCESS;
        for (String[] gameQuestionAnswer: gameData) {
            System.out.print("Question: " + gameQuestionAnswer[0] + "\nYour answer: ");
            String gamerAnswer = engineScanner.nextLine();
            if (gamerAnswer.equals(gameQuestionAnswer[1])) {
                System.out.println("Correct!");
            } else {
                gameResult = RESULT_ERROR;
                System.out.print("'" + gamerAnswer + "' is wrong answer ;(. ");
                System.out.println("Correct answer was '" + gameQuestionAnswer[1] + "'.");
                engineScanner.close();
                return gameResult;
            }
        }
        return gameResult;
    }

    private static void printGameResult(String gamerName, String gameResult) {
        if (gameResult.equals(RESULT_SUCCESS)) {
            System.out.println("Congratulations, " + gamerName + "!");
        } else {
            System.out.println("Let's try again, " + gamerName + "!");
        }
    }

    public static String welcome(Scanner engineScanner) {
        String gamerName = "";
        System.out.println(Cli.WELCOME_TEXT);
        System.out.print(Cli.WELCOME_QUESTION);
        gamerName = engineScanner.nextLine();
        System.out.println("Hello, " + gamerName + "!");
        return gamerName;
    }
}
