package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String START_TEXT = "Find the greatest common divisor of given numbers.";
    public static final String GAME_NAME = "GCD";

    private static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.runGame(GAME_NAME, getStartText(), getGameData());
    }

    private static String[][] getGameData() {
        String[][] result = new String[Engine.COUNT_ROUND][2];
        int number1;
        int number2;
        int numberMin;
        int trueAnswer = 0;
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            number1 = Utils.getRandom(Utils.RANGE_LIMIT_1, Utils.RANGE_LIMIT_100);
            number2 = Utils.getRandom(Utils.RANGE_LIMIT_1, Utils.RANGE_LIMIT_100);
            numberMin = Math.min(number1, number2);
            for (int i = 1; i <= numberMin; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    trueAnswer = i;
                }
            }
            result[round][0] = Integer.toString(number1) + ' ' + number2;
            result[round][1] = Integer.toString(trueAnswer);
        }
        return result;
    }
}
