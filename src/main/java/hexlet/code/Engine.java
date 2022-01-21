package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static void playGame(int choiseNumber) {
        final int gameExitNum = 0;
        final int gameGreetNum = 1;
        final int gameEvenNum = 2;
        final int gameCalcNum = 3;
        final int gameGCDNum = 4;
        final int gameProgressionNum = 5;
        final int gamePrimeNum = 6;
        final int countRaund = 3;
        String playeerName = "";
        String playeerAnswer = "";
        String result = "success";
        String[] gameIter = new String[2];
        Scanner engineScanner = new Scanner(System.in);

        if (choiseNumber > gameExitNum) {
            playeerName = Cli.welcomePlayeer();
            switch (choiseNumber) {
                case gameEvenNum:
                    System.out.println(Even.getStartText());
                    break;
                case gameCalcNum:
                    System.out.println(Calc.getStartText());
                    break;
                case gameGCDNum:
                    System.out.println(GCD.getStartText());
                    break;
                case gameProgressionNum:
                    System.out.println(Progression.getStartText());
                    break;
                case gamePrimeNum:
                    System.out.println(Prime.getStartText());
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
                        case gameGCDNum:
                            gameIter = GCD.playGame();
                            break;
                        case gameProgressionNum:
                            gameIter = Progression.playGame();
                            break;
                        case gamePrimeNum:
                            gameIter = Prime.playGame();
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
