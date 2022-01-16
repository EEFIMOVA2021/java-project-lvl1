package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        //System.out.println("Welcome to the Brain Games!");
        Scanner mainScanner = new Scanner(System.in);
        int choiseNumber = mainScanner.nextInt();
        switch (choiseNumber) {
            case 1:
                Cli.welcomePlayeer();
                break;
            case 2:
                Even.playEven();
                break;
            default:
                break;
        }
    }
}
