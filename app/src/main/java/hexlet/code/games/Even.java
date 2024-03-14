package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void getAnswer() {
        Engine engine = new Engine("Even");
        Cli.greetingName();
        int rightAns = 0;
        String normalAnswer;
        while (rightAns < engine.maxCount) {
            final int minNum = 1;
            final int maxNum = 100;
            int newValue = Utils.generateNum(minNum, maxNum);
            if (!isEven(newValue)) {
                normalAnswer = "no";
            } else {
                normalAnswer = "yes";
            }
            if (Engine.newGame(newValue, normalAnswer)) {
                rightAns++;
            } else {
                break;
            }
        }
        if (rightAns == engine.maxCount) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

