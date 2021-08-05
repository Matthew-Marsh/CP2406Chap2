public class Exercise2 {
    public static void main(String[] args) {
        int firstDice = (int) (Math.random()*6) + 1;
        int secondDice = (int) (Math.random()*6) + 1;
        int total = firstDice + secondDice;
        System.out.println("The first die comes up " + firstDice);
        System.out.println("The second die comes up " + secondDice);
        System.out.println("Your total roll is " + total);
    }
}
