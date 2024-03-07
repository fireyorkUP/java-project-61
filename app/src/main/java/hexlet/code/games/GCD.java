package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Engine.getGreeting();
        int rightAns = 0;
        final int maxCount = 3;
        while (rightAns < maxCount) {
            Scanner answer = new Scanner(System.in);
            final int minNum = 1;
            final int maxNum = 100;
            int num1 = Utils.generateNum(minNum, maxNum);
            int num2 = Utils.generateNum(minNum, maxNum);
            int resultTask = getTask(num1, num2);
            System.out.println("Find the greatest common divisor of given numbers.");
            System.out.println("Question: " + num1 + " " + num2);
            int nextAns = answer.nextInt();
            if (Engine.isAnswer(nextAns == resultTask, resultTask, nextAns)) {
                rightAns++;
            } else {
                break;
            }
        }
        Engine.congratulations(rightAns == maxCount);
    }
    private static int getTask(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getTask(b, a % b);
        }
    }
}
