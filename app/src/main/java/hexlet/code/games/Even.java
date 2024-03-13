package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void getAnswer() {
        Engine engine = new Engine("Even");
        Engine.getGreeting();
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
        Engine.congratulations(rightAns == engine.maxCount);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

