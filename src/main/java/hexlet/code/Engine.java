package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;
    public static final String RESULT_SUCCESS = "success";
    public static final String RESULT_ERROR = "error";
    public static final String QUESTION = "Question: ";
    public static final String ANSWER = "\nYour answer: ";
    public static final String CORRECT = "Correct!";
    public static final String CONGRATULATIONS = "Congratulations, ";
    public static final String TRY_AGAIN = "Let's try again, ";
    public static final String EXCLAMATION_POINT = "!";

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
            System.out.print(QUESTION + gameQuestionAnswer[0] + ANSWER);
            String gamerAnswer = engineScanner.nextLine();
            if (gamerAnswer.equals(gameQuestionAnswer[1])) {
                System.out.println(CORRECT);
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
            System.out.println(CONGRATULATIONS + gamerName + EXCLAMATION_POINT);
        } else {
            System.out.println(TRY_AGAIN + gamerName + EXCLAMATION_POINT);
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
