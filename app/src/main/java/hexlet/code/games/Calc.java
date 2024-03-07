package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class Calc {
    private static String question;
    public static void game() {
        Engine.getGreeting();
        int rightAns = 0;
        final int maxCount = 3;
        while (rightAns < maxCount) {
            Scanner answer = new Scanner(System.in);
            int resultTask = getTask();
            System.out.println("What is the result of the expression?");
            System.out.println(question);
            int nextAns = answer.nextInt();
            if (Engine.isAnswer(nextAns == resultTask, resultTask, nextAns)) {
                rightAns++;
            } else {
                break;
            }
        }
        Engine.congratulations(maxCount == rightAns);
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
