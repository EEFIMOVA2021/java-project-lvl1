package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String START_TEXT = "What is the result of the expression?";
    private static char[] operationArray = {'+', '-', '*'};

    public static void playGame() {
        Engine.runGame(START_TEXT, getGameData());
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
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        return gameData;
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        int number2 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        char operation = getOperation();
        int trueAnswer = getTrueAnswer(number1, number2, operation);
        roundData[0] = Integer.toString(number1) + ' ' + operation + ' ' + number2;
        roundData[1] = Integer.toString(trueAnswer);
        return roundData;
    }
}
