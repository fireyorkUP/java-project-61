package hexlet.code;
import java.util.Random;

public class Utils {
    public static int generateNum(int num1, int num2) {
        Random rn = new Random();
        return rn.nextInt(num2 - num1 + 1) + num1;
    }
}
