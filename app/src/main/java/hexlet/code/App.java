package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n" +
                "2 - Even\n" +
                "1 - Greet\n" +
                "0 - Exit");
        String userChoice = scanner.nextLine();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case ("1"):
                Cli.greeting();
                break;
            case ("2"):
                Cli.greeting();
                Even.getAnswer();
                break;
            case ("0"):
                break;
            default:
                System.out.println("invalid value");
        }

    }
}
