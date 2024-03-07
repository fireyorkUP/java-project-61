package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String question;
    public static void game() {
        Engine.getGreeting();
        int correctOne = 0;
        final int maxCount = 3;
        while (correctOne < maxCount) {
            String resultTask = Integer.toString(getTask());
            System.out.println("What is the result of the expression?");
            if (Engine.newGame(question, resultTask)) {
                correctOne++;
            } else {
                break;
            }
        }
        Engine.congratulations(correctOne == maxCount);
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
