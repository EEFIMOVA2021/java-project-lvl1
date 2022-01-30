package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
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
    public static final Scanner ENGINE_SCANNER = new Scanner(System.in);
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

    public static void playGame(String gameName) {
        setGamerName(Cli.welcome());
        System.out.println(getStartText(gameName));
        playGameCycle(gameName);
        printGameResult();
    }

    public static String getStartText(String gameName) {
        switch (gameName) {
            case Even.GAME_NAME:
                return Even.getStartText();
            case Calc.GAME_NAME:
                return  Calc.getStartText();
            case GCD.GAME_NAME:
                return  GCD.getStartText();
            case Progression.GAME_NAME:
                return  Progression.getStartText();
            case Prime.GAME_NAME:
                return  Prime.getStartText();
            default:
                return "";
        }
    }

    public static void playGameCycle(String gameName) {
        String[] gameQuestionAnswer = new String[2];
        setGameResult(RESULT_SUCCESS);
        for (int i = 0; i < COUNT_ROUND; i++) {
            gameQuestionAnswer = getRoundData(gameName);
            System.out.print(QUESTION + gameQuestionAnswer[0] + ANSWER);
            setGamerAnswer(ENGINE_SCANNER.nextLine());
            if (getGamerAnswer().equals(gameQuestionAnswer[1])) {
                System.out.println(CORRECT);
            } else {
                i = COUNT_ROUND;
                setGameResult(RESULT_ERROR);
                System.out.print(WRONG_ANSWER_1 + getGamerAnswer() + WRONG_ANSWER_2);
                System.out.println(WRONG_ANSWER_3 + gameQuestionAnswer[1] + WRONG_ANSWER_4);
            }
        }
    }

    public static String[] getRoundData(String gameName) {
        switch (gameName) {
            case Even.GAME_NAME:
                return Even.getRoundData();
            case Calc.GAME_NAME:
                return  Calc.getRoundData();
            case GCD.GAME_NAME:
                return  GCD.getRoundData();
            case Progression.GAME_NAME:
                return  Progression.getRoundData();
            case Prime.GAME_NAME:
                return  Prime.getRoundData();
            default:
                return new String[2];
        }
    }

    public static void printGameResult() {
        if (getGameResult().equals(RESULT_SUCCESS)) {
            System.out.println(CONGRATULATIONS + getGamerName() + EXCLAMATION_POINT);
        } else {
            System.out.println(TRY_AGAIN + getGamerName() + EXCLAMATION_POINT);
        }
    }
}
