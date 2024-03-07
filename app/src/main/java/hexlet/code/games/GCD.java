package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        Engine.getGreeting();
        int rightAns = 0;
        final int maxCount = 3;
        System.out.println("Find the greatest common divisor of given numbers.");
        while (rightAns < maxCount) {
            final int minNum = 1;
            final int maxNum = 100;
            int num1 = Utils.generateNum(minNum, maxNum);
            int num2 = Utils.generateNum(minNum, maxNum);
            String resultTask = Integer.toString(getTask(num1, num2));
            String question = num1 + " " + num2;
            if (Engine.newGame(question, resultTask)) {
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
