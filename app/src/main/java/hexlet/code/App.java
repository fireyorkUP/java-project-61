package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                5 - Progression
                4 - GCD
                3 - Calc
                2 - Even
                1 - Greet
                0 - Exit""");
        String userChoice = scanner.nextLine();
        System.out.println("Your choice: " + userChoice);
        selectGame(userChoice);
    }

    public static void selectGame(String userChoice) {
        switch (userChoice) {
            case ("1"):
                Cli.greeting();
                break;
            case ("2"):
                Cli.greeting();
                Even.getAnswer();
                break;
            case ("3"):
                Cli.greeting();
                Calc.game();
                break;
            case ("4"):
                Cli.greeting();
                GCD.gcdGame();
            case ("5"):
                Cli.greeting();
                Progression.getStart();
            case ("0"):
                break;
            default:
                System.out.println("invalid value");
        }
    }
}
