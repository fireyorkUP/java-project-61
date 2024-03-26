package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Arrays;
import java.util.Random;

public class Progression {
    public static void gameProgression() {
        String gameDescription = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.getMaxCount()][2];
        Random random = new Random();
        final int maxLength = 10;
        final int minLength = 5;
        final int minNum = 1;
        final int maxNum = 100;
        int sequenceLength = Utils.generateNum(minLength, maxLength);
        String[] progression;
        int hiddenIndex;
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            int firstNumber = Utils.generateNum(minNum, maxNum);
            int step = Utils.generateNum(minNum, maxNum);
            progression = genProgression(sequenceLength, firstNumber, step);
            hiddenIndex = random.nextInt(sequenceLength);
            gameData[i][0] = getDisplayed(progression, hiddenIndex);
            gameData[i][1] = progression[hiddenIndex];
        }
        Engine.dataProcessing(gameDescription, gameData);
    }

    private static String getDisplayed(String[] progression, int hiddenIndex) {
        String[] progression2 = Arrays.copyOf(progression, progression.length);
        progression2[hiddenIndex] = "..";
        return String.join(" ", progression2);
    }

    private static String[] genProgression(int length, int firstNumber, int step) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            int num = firstNumber + i * step;
            progression[i] = String.valueOf(num);
        }
        return progression;
    }
}
