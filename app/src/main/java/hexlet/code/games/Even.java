package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void getAnswer() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine engine = new Engine(gameDescription);
        Cli.greetingName();
        int rightAns = 0;
        String normalAnswer;
        while (rightAns < Engine.getMaxCount()) {
            final int minNum = 1;
            final int maxNum = 100;
            int newValue = Utils.generateNum(minNum, maxNum);
            if (!isEven(newValue)) {
                normalAnswer = "no";
            } else {
                normalAnswer = "yes";
            }
            if (Engine.newGame(gameDescription, newValue, normalAnswer)) {
                rightAns++;
            } else {
                break;
            }
        }
        if (rightAns == Engine.getMaxCount()) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

