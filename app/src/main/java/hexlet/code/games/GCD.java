package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gcdGame() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        Engine engine = new Engine(gameDescription);
        Cli.greetingName();
        int rightAns = 0;
        while (rightAns < Engine.getMaxCount()) {
            final int minNum = 1;
            final int maxNum = 100;
            int num1 = Utils.generateNum(minNum, maxNum);
            int num2 = Utils.generateNum(minNum, maxNum);
            String resultTask = Integer.toString(getTask(num1, num2));
            String question = num1 + " " + num2;
            if (Engine.newGame(gameDescription, question, resultTask)) {
                rightAns++;
            } else {
                break;
            }
        }
        if (rightAns == Engine.getMaxCount()) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
    private static int getTask(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getTask(b, a % b);
        }
    }
}
