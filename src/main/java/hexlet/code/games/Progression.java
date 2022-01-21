package hexlet.code.games;

public class Progression {
    public static String getStartText() {
        String startText = "Answer 'yes' if number even otherwise answer 'no'.";
        return startText;
    }
    public static String[] playGame() {
        final int countRandom = 100;
        final int countRandomIter = 10;
        int iter = 0;
        int[] number = new int[countRandomIter];
        String[] result = new String[2];
        StringBuilder progression = new StringBuilder();

        number[0] = (int) (Math.random() * countRandom);
        iter = (int) (Math.random() * countRandomIter);
        for (int i = 1; i < number.length; i++) {
            number[i] = number[i - 1] + iter;
        }

        iter = (int) (Math.random() * countRandomIter);
        if (iter > number.length) {
            iter = --iter;
        }
        for (int i = 0; i < number.length; i++) {
            if (i > 0) {
                progression = progression.append(" ");
            }
            if (i == iter) {
                progression = progression.append("..");
            } else {
                progression = progression.append(Integer.toString(number[i]));
            }
        }
        result[0] = progression.toString();
        result[1] = Integer.toString(number[iter]);
        return result;
    }
}
