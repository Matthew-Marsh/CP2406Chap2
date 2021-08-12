import textio.TextIO;

public class Exercise4 {
    public static void main(String[] args) {
        double coinTotal;
        System.out.println("How many 5c pieces do you have?");
        int fiveCents = TextIO.getlnInt();
        System.out.println("How many 10c pieces do you have?");
        int tenCents = TextIO.getlnInt();
        System.out.println("How many 20c pieces do you have?");
        int twentyCents = TextIO.getlnInt();
        System.out.println("How many 50c pieces do you have?");
        int fiftyCents = TextIO.getlnInt();
        System.out.println("How many $1 coins do you have?");
        int oneDollar = TextIO.getlnInt();
        System.out.println("How many $2 coins do you have?");
        int twoDollar = TextIO.getlnInt();

        coinTotal = (fiveCents * 0.05) + (tenCents * 0.1) + (twentyCents * 0.2) + (fiftyCents * 0.5) + (oneDollar) + (twoDollar * 2);
        System.out.print("You have a total of: $");
        System.out.printf("%1.2f", coinTotal);
        System.out.println();
    }
}
