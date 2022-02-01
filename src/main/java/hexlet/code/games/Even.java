package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String START_TEXT = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final String GAME_NAME = "Even";
    public static final String ANSWER_YES = "yes";
    public static final String ANSWER_NO = "no";

    private static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.runGame(GAME_NAME, getStartText(), getGameData());
    }

    private static String[][] getGameData() {
        String[][] result = new String[Engine.COUNT_ROUND][2];
        int number;
        String trueAnswer;
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            number = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
            if (number % 2 == 0) {
                trueAnswer = ANSWER_YES;
            } else {
                trueAnswer = ANSWER_NO;
            }
            result[round][0] = Integer.toString(number);
            result[round][1] = trueAnswer;
        }
        return result;
    }
}
