package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {
    private static String question;
    public static void gcdGame() {
        int rightAns = 0;
        final int maxCount = 3;
        while (rightAns < maxCount) {
            Scanner answer = new Scanner(System.in);
            int num1 = (int) ((Math.random() * 100) + 1);
            int num2 = (int) ((Math.random() * 100) + 1);
            int resultTask = getTask(num1, num2);
            System.out.println("Find the greatest common divisor of given numbers.");
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

    private static int getTask(int a, int b) {
        question = "Question: " + a + " " + b;
        if (b == 0) {
            return a;
        }
        else {
            return getTask(b, a % b);
        }
    }
}
