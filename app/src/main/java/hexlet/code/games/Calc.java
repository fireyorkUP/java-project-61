package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;

public class Calc {
    static String question;
    public static void game() {
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
            }
            else {
                break;
            }

        }
        Engine.congratulations(rightAns == maxCount);
    }


    public static int getTask() {
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int Choice = (int) (Math.random() * 3);

        if (Choice == 0) {
            String action = " - ";
            question = "Question: " + num1 + action + num2;
            return num1 - num2;
        } else if (Choice == 1) {
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
