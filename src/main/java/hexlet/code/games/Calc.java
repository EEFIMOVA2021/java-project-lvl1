package hexlet.code.games;

public class Calc {
    public static String getStartText() {
        String startText = "What is the result of the expression?";
        return startText;
    }
    public static String[] playGame() {
        final int createOper1 = 35;
        final int createOper2 = 70;
        //final int createOper3 = 75;
        final int countRandom = 100;
        int number1 = 0;
        int number2 = 0;
        int numberForOper = 0;
        int trueAnswer = 0;
        char oper = '+';
        String[] result = new String[2];

        number1 = (int) (Math.random() * countRandom);
        number2 = (int) (Math.random() * countRandom);
        numberForOper = (int) (Math.random() * countRandom);
        if (numberForOper < createOper1) {
            oper = '+';
        } else {
            if (numberForOper < createOper2) {
                oper = '-';
            } else {
                oper = '*';
            }
        }
        switch (oper) {
            case '+':
                trueAnswer = number1 + number2;
                break;
            case '-':
                trueAnswer = number1 - number2;
                break;
            case '/':
                trueAnswer = number1 / number2;
                break;
            case '*':
                trueAnswer = number1 * number2;
                break;
            default:
                break;
        }

        result[0] = Integer.toString(number1) + ' ' + Character.toString(oper) + ' ' + Integer.toString(number2);
        result[1] = Integer.toString(trueAnswer);
        return result;
    }
}
