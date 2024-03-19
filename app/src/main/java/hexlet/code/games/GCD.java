package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void gameGCD() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.getMaxCount()][2];
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            final int minNum = 1;
            final int maxNum = 100;
            int num1 = Utils.generateNum(minNum, maxNum);
            int num2 = Utils.generateNum(minNum, maxNum);
            gameData[i][1] = Integer.toString(getGCD(num1, num2));
            gameData[i][0] = num1 + " " + num2;

        }
        Engine.newGame(gameDescription, gameData);
    }
    private static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }
}
