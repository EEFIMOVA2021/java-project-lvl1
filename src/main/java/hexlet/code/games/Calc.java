package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String START_TEXT = "What is the result of the expression?";
    public static final String GAME_NAME = "Calc";
    private static char[] operationArray = {'+', '-', '*'};

    private static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.runGame(GAME_NAME, getStartText(), getGameData());
    }

    private static char getOperation() {
        return operationArray[Utils.getRandom(Utils.RANGE_LIMIT_0, operationArray.length -  1)];
    }

    private static int getTrueAnswer(int number1, int number2, char operation) {
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

    private static String[][] getGameData() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        int number1;
        int number2;
        int trueAnswer;
        char operation;
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            number1 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
            number2 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
            operation = getOperation();
            trueAnswer = getTrueAnswer(number1, number2, operation);
            gameData[round][0] = Integer.toString(number1) + ' ' + operation + ' ' + number2;
            gameData[round][1] = Integer.toString(trueAnswer);
        }
        return gameData;
    }
}
