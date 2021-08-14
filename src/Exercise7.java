import textio.TextIO;

public class Exercise7 {
    public static void main(String[] args) {
        TextIO.readFile("testdata.txt");
        String name = TextIO.getln();
        int resultOne = TextIO.getlnInt();
        int resultTwo = TextIO.getlnInt();
        int resultThree = TextIO.getlnInt();
        double averageResult;
        averageResult = (resultOne + resultTwo + resultThree) / 3.0;
        System.out.printf("%s scored %d, %d, %d for an average of: %1.1f", name, resultOne, resultTwo, resultThree, averageResult);
        System.out.println();
    }
}
