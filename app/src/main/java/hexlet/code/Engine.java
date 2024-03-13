package hexlet.code;
import java.util.Scanner;

public class Engine {
    public final int maxCount = 3;
    private static String userName;
    private static String gameSelection;
    public Engine(String gameSelection) {
        this.gameSelection = gameSelection;
    }

    public static void getGreeting() {
        Scanner helloGame = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = helloGame.next();
        System.out.println("Hello, " + userName +  "!");
    }
    public static boolean newGame(Object question, Object answer) {
        switch (gameSelection) {
            case ("Even"):
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case ("Calc"):
                System.out.println("What is the result of the expression?");
                break;
            case ("GCD"):
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case ("Progression"):
                System.out.println("What number is missing in the progression?");
                break;
            case ("Prime"):
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
        }
        Scanner gameScan = new Scanner(System.in);
        System.out.println("Question: " + question);
        String usersAnswer = gameScan.nextLine();
        System.out.println("Your answer: " + usersAnswer);
        if (usersAnswer.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + usersAnswer + "' is wrong answer ;(. Correct answer was '" + answer
                    + "'.\nLet's try again, " + userName + "!");
            return false;
        }
    }
    public static void congratulations(boolean state) {
        if (state) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
