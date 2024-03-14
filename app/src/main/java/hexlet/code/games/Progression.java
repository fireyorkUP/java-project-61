package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;

public class Progression {
    public static void getStart() {
        Engine engine = new Engine("Progression");
        Random random = new Random();
        Cli.greetingName();
        int rightAns = 0;
        final int maxLength = 10;
        final int minLength = 5;
        int sequenceLength = Utils.generateNum(minLength, maxLength);
        int[] progression;
        int hiddenIndex;
        while (rightAns < engine.maxCount) {
            int firstNumber = Utils.generateNum(1, 100);
            int step = Utils.generateNum(1, 100);
            progression = genProgression(sequenceLength, firstNumber, step);
            hiddenIndex = random.nextInt(sequenceLength);
            String displayedSequence = getDisplayed(progression, hiddenIndex);
            String result = Integer.toString(progression[hiddenIndex]);
            if (Engine.newGame(displayedSequence, result)) {
                rightAns++;
            } else {
                break;
            }
        }
        if (rightAns == engine.maxCount) {
            System.out.println("Congratulations, " + Cli.userName + "!");
        }
    }

    private static String getDisplayed(int[] progression, int hiddenIndex) {
        StringBuilder displayed = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                displayed.append("..");
            } else {
                displayed.append(progression[i]);
            }
            if (i < progression.length - 1) {
                displayed.append(" ");
            }
        }
        return displayed.toString();
    }

    private static int[] genProgression(int length, int firstNumber, int step) {
        int[] progression = new int[length];
        progression[0] = firstNumber;
        for (int i = 1; i < length; i++) {
            progression[i] = progression[i - 1] + step;
        }
        return progression;
    }
}
