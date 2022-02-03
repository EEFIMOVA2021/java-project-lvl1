package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class GCD {
    public static final String START_TEXT = "Find the greatest common divisor of given numbers.";
    public static final String GAME_NAME = "GCD";

    private static String getStartText() {
        return START_TEXT;
    }

    public static void playGame(Scanner engineScanner) {
        Engine.runGame(getStartText(), getGameData(), engineScanner);
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
        int number1 = Utils.getRandom(Utils.RANGE_LIMIT_1, Utils.RANGE_LIMIT_100);
        int number2 = Utils.getRandom(Utils.RANGE_LIMIT_1, Utils.RANGE_LIMIT_100);
        int numberMin = Math.min(number1, number2);
        int trueAnswer = 0;
        for (int i = 1; i <= numberMin; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                trueAnswer = i;
            }
        }
        roundData[0] = Integer.toString(number1) + ' ' + number2;
        roundData[1] = Integer.toString(trueAnswer);
        return roundData;
    }
}
