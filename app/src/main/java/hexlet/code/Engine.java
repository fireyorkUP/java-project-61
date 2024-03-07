package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static String userName;
    public static void getGreeting() {
        Scanner helloGame = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = helloGame.next();
        System.out.println("Hello, " + userName +  "!");
    }
    public static boolean newGame(Object question, Object answer) {
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
