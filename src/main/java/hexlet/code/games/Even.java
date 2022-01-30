package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String START_TEXT = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final String GAME_NAME = "Even";
    public static final String ANSWER_YES = "yes";
    public static final String ANSWER_NO = "no";

    public static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.playGame(GAME_NAME);
    }

    public static String[] getRoundData() {
        int number = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        String trueAnswer = "";
        String[] result = new String[2];
        if (number % 2 == 0) {
            trueAnswer = ANSWER_YES;
        } else {
            trueAnswer = ANSWER_NO;
        }
        result[0] = Integer.toString(number);
        result[1] = trueAnswer;
        return result;
    }
}
