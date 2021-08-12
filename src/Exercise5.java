import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int numberOfEggs;
        Scanner stdin = new Scanner( System.in );
        System.out.print("How many eggs do you have?: ");
        numberOfEggs = stdin.nextInt();
        int grossEggs = numberOfEggs / 144;
        int remainingEggs = numberOfEggs % 144;
        int dozenEggs = remainingEggs / 12;
        remainingEggs %= 12;
        System.out.println("Your number of eggs is " + grossEggs + " gross, " + dozenEggs + " dozen, and " + remainingEggs + " remaining.");
    }
}
