package hexlet.code;

public class Even {
    public static String getStartText() {
        String startText = "Answer 'yes' if number even otherwise answer 'no'.";
        return startText;
    }
    public static String[] playGame() {
        int number = 0;
        final int countRandom = 100;
        String trueAnswer = "";
        String[] result = new String[2];

        number = (int) (Math.random() * countRandom);
        if (number % 2 == 0) {
            trueAnswer = "yes";
        } else {
            trueAnswer = "no";
        }
        result[0] = Integer.toString(number);
        result[1] = trueAnswer;
        return result;
    }
}
