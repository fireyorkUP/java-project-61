package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void gameEven() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.getMaxCount()][2];
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            final int minNum = 1;
            final int maxNum = 100;
            int newValue = Utils.generateNum(minNum, maxNum);
            if (!isEven(newValue)) {
                gameData[i][1] = "no";
            } else {
                gameData[i][1] = "yes";
            }
            gameData[i][0] = Integer.toString(newValue);

        }
        Engine.dataProcessing(gameDescription, gameData);
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

