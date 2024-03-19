package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void generateRoundData() {
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameData = new String[Engine.getMaxCount()][2];
        for (int i = 0; i < Engine.getMaxCount(); i++) {
            final int minNum = 1;
            final int maxNum = 100;
            int randomNumber = Utils.generateNum(minNum, maxNum);
            gameData[i][1] = isPrime(randomNumber) ? "yes" : "no";
            gameData[i][0] = Integer.toString(randomNumber);
        }
        Engine.newGame(gameDescription, gameData);
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
