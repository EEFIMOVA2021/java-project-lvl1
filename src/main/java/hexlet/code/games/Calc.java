package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String START_TEXT = "What is the result of the expression?";
    public static final String GAME_NAME = "Calc";
    private static char[] operationArray = {'+', '-', '*'};

    public static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.playGame(GAME_NAME);
    }

    public static char getOperation() {
        return operationArray[Utils.getRandom(Utils.RANGE_LIMIT_0, operationArray.length -  1)];
    }

    public static int getTrueAnswer(int number1, int number2, char operation) {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '/':
                return number1 / number2;
            case '*':
                return number1 * number2;
            default:
                return Integer.MIN_VALUE;
        }
    }

    public static String[] getRoundData() {
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        int number2 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        char operation = getOperation();
        int trueAnswer = getTrueAnswer(number1, number2, operation);
        String[] gameData = new String[2];
        gameData[0] = Integer.toString(number1) + ' ' + operation + ' ' + number2;
        gameData[1] = Integer.toString(trueAnswer);
        return gameData;
    }
}
