package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String question;
    public static void game() {
        Engine engine = new Engine("Calc");
        Cli.greetingName();
        int rightAns = 0;
        while (rightAns < engine.MAX_COUNT) {
            String resultTask = Integer.toString(getTask());
            if (Engine.newGame(question, resultTask)) {
                rightAns++;
            } else {
                break;
            }
        }
        if (rightAns == engine.MAX_COUNT) {
        System.out.println("Congratulations, " + Cli.userName + "!");
    }
    }

    private static int getTask() {
        final int minNum = 1;
        final int maxNum = 100;
        final int variants = 3;
        int num1 = Utils.generateNum(minNum, maxNum);
        int num2 = Utils.generateNum(minNum, maxNum);
        int choice = (int) (Math.random() * variants);

        if (choice == 0) {
            String action = " - ";
            question = "Question: " + num1 + action + num2;
            return num1 - num2;
        } else if (choice == 1) {
            String action = " + ";
            question = "Question: " + num1 + action + num2;
            return num1 + num2;
        } else {
            String action = " * ";
            question = "Question: " + num1 + action + num2;
            return num1 * num2;
        }
    }
}
