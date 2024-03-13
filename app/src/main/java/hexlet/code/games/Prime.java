package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void getPrime() {
        Engine engine = new Engine("Prime");
        Engine.getGreeting();
        int rightAns = 0;
        while (rightAns < engine.maxCount) {
            final int minNum = 1;
            final int maxNum = 100;
            int randomNumber = Utils.generateNum(minNum, maxNum);
            String result = isPrime(randomNumber) ? "yes" : "no";
            if (Engine.newGame(randomNumber, result)) {
                rightAns++;
            } else {
                break;
            }
        }
        Engine.congratulations(rightAns == engine.maxCount);
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
