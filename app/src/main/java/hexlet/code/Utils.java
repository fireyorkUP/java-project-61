package hexlet.code;
import java.util.Random;

public class Utils {
    public static int generateNum(int Num1, int Num2) {
        Random rn = new Random();
        return rn.nextInt(Num2 - Num1 + 1) + Num1;
    }
}
