package hexlet.code;

public class Engine {
    public static boolean isAnswer(boolean state, Object correctAns, Object choice) {
        System.out.println("Your answer: " + choice);
        System.out.println("Correct answer: " + correctAns);
        if (state) {
            System.out.println("Correct!");
            return true;
        }
        else {
            System.out.println("'" + choice + "' is wrong answer ;(. Correct answer was '" + correctAns
                    + "'.\nLet's try again, " + Cli.getName() + "!");

            return false;
        }
    }

    public static void congratulations(boolean state) {
        if (state) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
