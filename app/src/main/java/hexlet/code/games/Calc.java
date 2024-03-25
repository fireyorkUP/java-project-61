package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;
    private static final int VARIANTS = 3;
    private static char[] operators = {'+', '-', '*'};
    public static void gameCalc() {
        String[][] gameData = new String[Engine.getMaxCount()][2];
        String gameDescription = "What is the result of the expression?";
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            int num1 = Utils.generateNum(MIN_NUM, MAX_NUM);
            int num2 = Utils.generateNum(MIN_NUM, MAX_NUM);
            char sing = generateSing();
            gameData[i][1] = Integer.toString(calculate(num1, num2, sing));
            gameData[i][0] = num1 + " " + sing + " " + num2;
        }
        Engine.newGame(gameDescription, gameData);
    }

    private static int calculate(int num1, int num2, char sing) {
        return switch (sing) {
            case ('-') -> num1 - num2;
            case ('+') -> num1 + num2;
            case ('*') -> num1 * num2;
            default -> throw new Error("Unknown order state: " + sing + " !");
        };
    }

    private static char generateSing() {
        return operators[Utils.generateNum(MIN_NUM, VARIANTS) - 1];
    }
}

