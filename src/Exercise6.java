import textio.TextIO;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        String name = TextIO.getln();
        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex);
        String secondName = name.substring(spaceIndex + 1);
        System.out.println("Your first name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your last name is " + secondName + ", which has " + secondName.length() + " characters");
        System.out.println("Your initials are " + firstName.charAt(0) + secondName.charAt(0));
    }
}
