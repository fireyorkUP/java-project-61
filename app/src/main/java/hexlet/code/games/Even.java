package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void getAnswer() {
        Engine.getGreeting();
        int rightAns = 0;
        final int maxCount = 3;
        String normalAnswer = "yes";
        while (rightAns < maxCount) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int newValue = generateNumber();
            System.out.println("Question: " + newValue);
            String userChoice = scanner.next();
            if (!isEven(newValue)) {
                normalAnswer = "no";
            } else {
                normalAnswer = "yes";
            }
            String correctAns = normalAnswer;
            //System.out.println("Your answer: " + userChoice);
            if (Engine.isAnswer(userChoice.equals(normalAnswer), normalAnswer, userChoice)) {
                rightAns++;
            } else {
                break;
            }

        }
        Engine.congratulations(rightAns == maxCount);
    }


    private static int generateNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

