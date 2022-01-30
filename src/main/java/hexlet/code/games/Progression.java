package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String START_TEXT = "What number is missing in this progression?";
    public static final String GAME_NAME = "Progression";
    public static final int ARRAY_LENGTH = 10;

    public static String getStartText() {
        return START_TEXT;
    }

    public static void playGame() {
        Engine.playGame(GAME_NAME);
    }

    public static String getStringProgression(int[] array, int skipNumber) {
        StringBuilder progression = new StringBuilder();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i > 0) {
                progression = progression.append(" ");
            }
            if (i == skipNumber) {
                progression = progression.append("..");
            } else {
                progression = progression.append(array[i]);
            }
        }
        return progression.toString();
    }

    public static String[] getRoundData() {
        int differenceValue = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_10);
        int skipNumber = Utils.getRandom(Utils.RANGE_LIMIT_0, ARRAY_LENGTH - 1);
        int[] array = new int[ARRAY_LENGTH];
        String[] result = new String[2];
        array[0] = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        for (int i = 1; i < ARRAY_LENGTH; i++) {
            array[i] = array[i - 1] + differenceValue;
        }
        result[0] = getStringProgression(array, skipNumber);
        result[1] = Integer.toString(array[skipNumber]);
        return result;
    }
}
