package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT_ROUND = 3;
    public static final String RESULT_SUCCESS = "success";
    public static final String RESULT_ERROR = "error";
    public static final String QUESTION = "Question: ";
    public static final String ANSWER = "\nYour answer: ";
    public static final String CORRECT = "Correct!";
    public static final String WRONG_ANSWER_1 = "'";
    public static final String WRONG_ANSWER_2 = "' is wrong answer ;(. ";
    public static final String WRONG_ANSWER_3 = "Correct answer was '";
    public static final String WRONG_ANSWER_4 = "'.";
    public static final String CONGRATULATIONS = "Congratulations, ";
    public static final String TRY_AGAIN = "Let's try again, ";
    public static final String EXCLAMATION_POINT = "!";
    private static Scanner engineScanner;
    private static String gamerName = "";
    private static String gamerAnswer = "";
    private static String gameResult = "";

    public static String getGamerName() {
        return gamerName;
    }

    public static void setGamerAnswer(String answer) {
        gamerAnswer = answer;
    }

    public static String getGamerAnswer() {
        return gamerAnswer;
    }

    public static void setGamerName(String name) {
        gamerName = name;
    }

    public static String getGameResult() {
        return gameResult;
    }

    public static void setGameResult(String result) {
        gameResult = result;
    }

    public static void runGame(String gameName, String startText, String[][] gameData) {
        setGamerName(Cli.welcome());
        System.out.println(startText);
        play(gameData);
        printGameResult();
    }

    private static void play(String[][] gameData) {
        String[] gameQuestionAnswer;
        engineScanner = new Scanner(System.in);
        setGameResult(RESULT_SUCCESS);
        for (int i = 0; i < COUNT_ROUND; i++) {
            gameQuestionAnswer = gameData[i];
            System.out.print(QUESTION + gameQuestionAnswer[0] + ANSWER);
            setGamerAnswer(engineScanner.nextLine());
            if (getGamerAnswer().equals(gameQuestionAnswer[1])) {
                System.out.println(CORRECT);
            } else {
                i = COUNT_ROUND;
                setGameResult(RESULT_ERROR);
                System.out.print(WRONG_ANSWER_1 + getGamerAnswer() + WRONG_ANSWER_2);
                System.out.println(WRONG_ANSWER_3 + gameQuestionAnswer[1] + WRONG_ANSWER_4);
            }
        }
        engineScanner.close();
    }

    private static void printGameResult() {
        if (getGameResult().equals(RESULT_SUCCESS)) {
            System.out.println(CONGRATULATIONS + getGamerName() + EXCLAMATION_POINT);
        } else {
            System.out.println(TRY_AGAIN + getGamerName() + EXCLAMATION_POINT);
        }
    }
}
