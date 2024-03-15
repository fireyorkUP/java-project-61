package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String question;
    public static void game() {
        String[][] gameData = new String[Engine.getMaxCount()][2];
        String gameDescription = "What is the result of the expression?";
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            gameData[i][1] = Integer.toString(getTask());
            gameData[i][0] = question;
        }
        Engine.newGame(gameDescription, gameData);
    }

    private static int getTask() {
        final int minNum = 1;
        final int maxNum = 100;
        final int variants = 3;
        int num1 = Utils.generateNum(minNum, maxNum);
        int num2 = Utils.generateNum(minNum, maxNum);
        int choice = (int) (Math.random() * variants);

        if (choice == 0) {
            String action = " - ";
            question = num1 + action + num2;
            return num1 - num2;
        } else if (choice == 1) {
            String action = " + ";
            question = num1 + action + num2;
            return num1 + num2;
        } else {
            String action = " * ";
            question = num1 + action + num2;
            return num1 * num2;
        }
    }
}
