package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Calc {

    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;
    private static final int VARIANTS = 3;
    private static String question;
    public static void gameCalc() {
        String[][] gameData = new String[Engine.getMaxCount()][2];
        String gameDescription = "What is the result of the expression?";
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            int num1 = Utils.generateNum(MIN_NUM, MAX_NUM);
            int num2 = Utils.generateNum(MIN_NUM, MAX_NUM);
            char sing = generateSing();
            gameData[i][1] = Integer.toString(getTask(num1, num2, sing));
            gameData[i][0] = question;
        }
        Engine.newGame(gameDescription, gameData);
    }

    private static int getTask(int num1, int num2, char sing) {
        int resultNum = 0;
        switch (sing) {
            case ('-'):
                question = num1 + " - " + num2;
                resultNum = num1 - num2;
                break;
            case ('+'):
                question = num1 + " + " + num2;
                resultNum = num1 + num2;
                break;
            case ('*'):
                question = num1 + " * " + num2;
                resultNum = num1 * num2;
                break;
            default:
                break;
        }
        return resultNum;
    }

    private static char generateSing() {
        Random rand = new Random();
        char[] operators = {'+', '-', '*'};
        return operators[rand.nextInt(VARIANTS)];
    }
}
