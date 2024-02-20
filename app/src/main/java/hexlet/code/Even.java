package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void getAnswer() {
        int rightAns = 0;
        while (rightAns < 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int newValue = generateNumber();
            System.out.println("Question: " + newValue);
            String userChoice = scanner.next();
            System.out.println("Your answer: " + userChoice);
            if (isEven(newValue) && userChoice.equals("yes")) {
                System.out.println("Correct!");
                rightAns++;
            } else if (!isEven(newValue) && userChoice.equals("no")) {
                System.out.println("Correct!");
                rightAns++;
            } else {
                System.out.println("Let's try again, " + Cli.getName());
                break;
            }
        }
        if (rightAns == 3) {
            System.out.println("Congratulations, " + Cli.getName());
        }
    }


    private static int generateNumber() {
        Random rand = new Random();
        return rand.nextInt();
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

