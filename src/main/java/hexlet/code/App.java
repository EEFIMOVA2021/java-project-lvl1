package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        Scanner mainScanner = new Scanner(System.in);
        int choiseNumber = mainScanner.nextInt();
        Engine.playGame(choiseNumber);
    }
}
