package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String START_TEXT = "What number is missing in this progression?";
    public static final int ARRAY_LENGTH = 10;

    public static void playGame() {
        Engine.runGame(START_TEXT, getGameData());
    }

    private static String getStringProgression(int[] array, int skipNumber) {
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

    private static String[][] getGameData() {
        String[][] gameData = new String[Engine.COUNT_ROUND][2];
        for (int round = 0; round < Engine.COUNT_ROUND; round++) {
            gameData[round] = generateRoundData();
        }
        return gameData;
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int differenceValue = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_10);
        int skipNumber = Utils.getRandom(Utils.RANGE_LIMIT_0, ARRAY_LENGTH - 1);
        int[] array = new int[ARRAY_LENGTH];
        array[0] = Utils.getRandom(Utils.RANGE_LIMIT_0, Utils.RANGE_LIMIT_100);
        for (int i = 1; i < ARRAY_LENGTH; i++) {
            array[i] = array[i - 1] + differenceValue;
        }
        roundData[0] = getStringProgression(array, skipNumber);
        roundData[1] = Integer.toString(array[skipNumber]);
        return roundData;
    }
}
