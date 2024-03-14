package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static final int MAX_COUNT = 3;

    public static int getMaxCount() {
        return MAX_COUNT;
    }
    private String gameSelection;

    public void setGameSelection(String gameSelection) {
        this.gameSelection = gameSelection;
    }

    public static boolean newGame(String gameSelection, Object question, Object answer) {
        System.out.println(gameSelection);
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Question: " + question);
        String usersAnswer = userChoice.nextLine();
        System.out.println("Your answer: " + usersAnswer);
        if (usersAnswer.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + answer
                    + "'.\nLet's try again, " + Cli.getName() + "!");
            return false;
        }
    }
}
