package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void getAnswer() {
        Engine.getGreeting();
        int rightAns = 0;
        final int maxCount = 3;
        String normalAnswer;
        while (rightAns < maxCount) {
            final int minNum = 1;
            final int maxNum = 100;
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
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
        Engine.congratulations(rightAns == maxCount);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

