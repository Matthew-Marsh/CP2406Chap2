import textio.TextIO;

public class Exercise3 {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter Name:");
        name = TextIO.getln().toUpperCase();
        System.out.println("Hello " + name + ", nice to meet you!");
    }
}
