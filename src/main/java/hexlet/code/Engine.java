package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void playGame(int choiseNumber) {
        final int gameExitNum = 0;
        final int gameGreetNum = 1;
        final int gameEvenNum = 2;
        final int gameCalcNum = 3;
        int number = 0;
        final int countRaund = 3;
        final int countRandom = 100;
        String playeerName = "";
        String playeerAnswer = "";
        String result = "success";
        String[] gameIter = new String[2];
        Scanner engineScanner = new Scanner(System.in);

        if (choiseNumber > gameExitNum) {
            switch (choiseNumber) {
                case gameGreetNum:
                    playeerName = Cli.welcomePlayeer();
                    break;
                case gameEvenNum:
                    playeerName = Cli.welcomePlayeer();
                    System.out.println(Even.getStartText());
                    break;
                case gameCalcNum:
                    playeerName = Cli.welcomePlayeer();
                    System.out.println(Calc.getStartText());
                    break;
                default:
                    break;
            }
            if (choiseNumber > gameGreetNum) {
                for (int i = 0; i < countRaund; i++) {
                    switch (choiseNumber) {
                        case gameEvenNum:
                            gameIter = Even.playGame();
                            break;
                        case gameCalcNum:
                            gameIter = Calc.playGame();
                            break;
                        default:
                            break;
                    }
                    System.out.print("Question: " + gameIter[0] + "\nYour answer: ");
                    playeerAnswer = engineScanner.nextLine();
                    if (playeerAnswer.equals(gameIter[1])) {
                        System.out.println("Correct!");
                    } else {
                        i = countRaund;
                        result = "error";
                        System.out.print("'" + playeerAnswer + "' is wrong answer ;(. ");
                        System.out.println("Correct answer was '" + gameIter[1] + "'.");
                    }
                }
                Cli.getGameResult(result, playeerName);
            }
        }
    }
}
