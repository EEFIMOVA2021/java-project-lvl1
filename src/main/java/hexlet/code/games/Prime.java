package hexlet.code.games;

public class Prime {
    public static String getStartText() {
        String startText = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        return startText;
    }
    public static String[] playGame() {
        final int countRandom = 100;
        int number = 0;
        String trueAnswer = "yes";
        String[] result = new String[2];

        number = (int) (Math.random() * countRandom);
        if (number < 2) {
            trueAnswer = "no";
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    trueAnswer = "no";
                }
            }
        }
        result[0] = Integer.toString(number);
        result[1] = trueAnswer;
        return result;
    }
}
