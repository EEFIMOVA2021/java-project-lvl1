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
    public static final String MENU_GAMES = GREET_NUM + " - Greet\n"
            + EVEN_NUM + " - Even\n"
            + CALC_NUM + " - Calc\n"
            + GCD_NUM + " - GCD\n"
            + PROGRESSION_NUM + " - Progression\n"
            + PRIME_NUM + " - Prime\n"
            + "0 - Exit\nYour choice: ";
    private static Scanner mainScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(MENU_TEXT);
        System.out.print(MENU_GAMES);
        playGame();
        mainScanner.close();
    }

    public static void playGame() {
        switch (mainScanner.nextInt()) {
            case GREET_NUM:
                Cli.welcome(new Scanner(System.in));
                break;
            case EVEN_NUM:
                Even.playGame(new Scanner(System.in));
                break;
            case CALC_NUM:
                Calc.playGame(new Scanner(System.in));
                break;
            case GCD_NUM:
                GCD.playGame(new Scanner(System.in));
                break;
            case PROGRESSION_NUM:
                Progression.playGame(new Scanner(System.in));
                break;
            case PRIME_NUM:
                Prime.playGame(new Scanner(System.in));
                break;
            default:
                break;
        }
    }
}
