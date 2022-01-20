package hexlet.code;

public class GCD {
    public static String getStartText() {
        String startText = "Find the greatest common divisor of given numbers.";
        return startText;
    }
    public static String[] playGame() {
        final int countRandom = 100;
        int number1 = 0;
        int number2 = 0;
        int numberMin = 0;
        int trueAnswer = 0;
        String[] result = new String[2];

        number1 = (int) (Math.random() * countRandom);
        number2 = (int) (Math.random() * countRandom);

        if (number1 < number2) {
            numberMin = number1;
        } else {
            numberMin = number2;
        }
        for (int i = 1; i <= numberMin; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                trueAnswer = i;
            }
        }

        result[0] = Integer.toString(number1) + ' ' + Integer.toString(number2);
        result[1] = Integer.toString(trueAnswer);
        return result;
    }
}
