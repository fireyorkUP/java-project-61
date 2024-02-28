package hexlet.code.games;
import java.util.Scanner;
import hexlet.code.Engine;
public class Prime {
    public static void getPrime() {
        int rightAns = 0;
        final int maxCount = 3;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (rightAns < maxCount) {
            Scanner answer = new Scanner(System.in);
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            String nextAns = answer.next();
            String result = isPrime(randomNumber) ? "yes" : "no";
            if (Engine.isAnswer(result.equals(nextAns), result, nextAns)) {
                rightAns++;
            }
            else {
                break;
            }
        }
        Engine.congratulations(rightAns == maxCount);
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
