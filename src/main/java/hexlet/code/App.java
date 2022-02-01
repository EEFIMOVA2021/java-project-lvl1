package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static final int GREET_NUM = 1;
    public static final int EVEN_NUM = 2;
    public static final int CALC_NUM = 3;
    public static final int GCD_NUM = 4;
    public static final int PROGRESSION_NUM = 5;
    public static final int PRIME_NUM = 6;
    public static final String MENU_TEXT = "Please enter the game number and press Enter.";
    //я бы рада не разбивать текст меню на несколько констант, но при сборке
    //получаю ошибку "Line is longer than 120 characters"
    public static final String MENU_GAMES_1 = GREET_NUM + " - Greet\n" + EVEN_NUM + " - Even\n" + CALC_NUM + " - Calc";
    public static final String MENU_GAMES_2 = "\n" + GCD_NUM + " - GCD\n" + PROGRESSION_NUM + " - Progression\n";
    public static final String MENU_GAMES_3 = PRIME_NUM + " - Prime\n0 - Exit\nYour choice: ";
    private static  Scanner mainScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(MENU_TEXT);
        System.out.print(MENU_GAMES_1 + MENU_GAMES_2 + MENU_GAMES_3);
        playGame();
        mainScanner.close();
    }

    public static void playGame() {
        switch (mainScanner.nextInt()) {
            case GREET_NUM:
                Cli.welcome();
                break;
            case EVEN_NUM:
                Even.playGame();
                break;
            case CALC_NUM:
                Calc.playGame();
                break;
            case GCD_NUM:
                GCD.playGame();
                break;
            case PROGRESSION_NUM:
                Progression.playGame();
                break;
            case PRIME_NUM:
                Prime.playGame();
                break;
            default:
                break;
        }
    }
}
