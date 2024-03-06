package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                6 - Prime
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
                Even.getAnswer();
                break;
            case ("3"):
                Calc.game();
                break;
            case ("4"):
                GCD.gcdGame();
                break;
            case ("5"):
                Progression.getStart();
                break;
            case ("6"):
                Prime.getPrime();
                break;
            case ("0"):
                break;
            default:
                System.out.println("invalid value");
        }
    }
}
