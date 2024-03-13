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
        int[] progression = genProgression(sequenceLength);
        int hiddenIndex = random.nextInt(sequenceLength);
        while (rightAns < engine.MAX_COUNT) {
            String displayedSequence = getDisplayed(progression, hiddenIndex);
            String result = Integer.toString(progression[hiddenIndex]);
            if (Engine.newGame(displayedSequence, result)) {
                rightAns++;
            } else {
                break;
            }
            progression = genProgression(sequenceLength);
            hiddenIndex = random.nextInt(sequenceLength);
        }
        if (rightAns == engine.MAX_COUNT) {
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

    private static int[] genProgression(int length) {
        final int minMin = 1;
        final int maxNum = 100;
        int start = Utils.generateNum(minMin, maxNum);
        int step = Utils.generateNum(minMin, maxNum);

        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
