package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String START_TEXT = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final String ANSWER_YES = "yes";
    public static final String ANSWER_NO = "no";
    public static final String GAME_NAME = "Prime";

    private static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.runGame(getStartText(), getGameData());
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
        int number = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        String trueAnswer = ANSWER_YES;
        if (number < 2) {
            trueAnswer = ANSWER_NO;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    trueAnswer = ANSWER_NO;
                }
            }
        }
        roundData[0] = Integer.toString(number);
        roundData[1] = trueAnswer;
        return roundData;
    }
}
