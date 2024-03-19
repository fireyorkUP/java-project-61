package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static final int MAX_COUNT = 3;

    public static int getMaxCount() {
        return MAX_COUNT;
    }

    public static void newGame(String gameSelection, String[][] arrayQaA) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName +  "!");
        System.out.println(gameSelection);
        int attempts = 0;
        for (int i = 0; i < MAX_COUNT; i++) {
            Scanner userChoice = new Scanner(System.in);
            System.out.println("Question: " + arrayQaA[i][0]);
            String usersAnswer = userChoice.nextLine();
            System.out.println("Your answer: " + usersAnswer);
            if (usersAnswer.equals(arrayQaA[i][1])) {
                System.out.println("Correct!");
                attempts++;
            } else {
                System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + arrayQaA[i][1]
                        + "'.\nLet's try again, " + userName + "!");
                break;
            }
        }
        if (attempts == MAX_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
