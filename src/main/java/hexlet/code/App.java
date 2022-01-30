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
    public static final String MENU_GAMES_1 = "1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression";
    public static final String MENU_GAMES_2 = "\n6 - Prime\n0 - Exit\nYour choice: ";
    public static  final Scanner MAIN_SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(MENU_TEXT);
        System.out.print(MENU_GAMES_1 + MENU_GAMES_2);
        playGame();
        Cli.CLI_SCANNER.close();
        Engine.ENGINE_SCANNER.close();
        MAIN_SCANNER.close();
    }

    public static void playGame() {
        switch (MAIN_SCANNER.nextInt()) {
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
