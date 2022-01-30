package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String START_TEXT = "Find the greatest common divisor of given numbers.";
    public static final String GAME_NAME = "GCD";

    public static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.playGame(GAME_NAME);
    }

    public static String[] getRoundData() {
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        int number2 = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        int numberMin = Math.min(number1, number2);
        int trueAnswer = 0;
        String[] result = new String[2];
        for (int i = 1; i <= numberMin; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                trueAnswer = i;
            }
        }
        result[0] = Integer.toString(number1) + ' ' + number2;
        result[1] = Integer.toString(trueAnswer);
        return result;
    }
}
