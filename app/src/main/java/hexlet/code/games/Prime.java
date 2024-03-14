package hexlet.code.games;
import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void getPrime() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine engine = new Engine(gameDescription);
        Cli.greetingName();
        int rightAns = 0;
        while (rightAns < Engine.getMaxCount()) {
            final int minNum = 1;
            final int maxNum = 100;
            int randomNumber = Utils.generateNum(minNum, maxNum);
            String result = isPrime(randomNumber) ? "yes" : "no";
            if (Engine.newGame(gameDescription, randomNumber, result)) {
                rightAns++;
            } else {
                break;
            }
        }
        if (rightAns == Engine.getMaxCount()) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
