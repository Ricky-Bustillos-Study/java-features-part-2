package operators;

public class Relationals {

    public static void main(String[] args) {

        final var number = 6;

        if (number > 20) {
            System.out.println("The number isn't greater than 20");
        } else if (number >= 10) {
            System.out.println("The number is greater than or equal to 10");
        } else if (number <= 5) {
            System.out.println("The number is less than or equal to 5");
        } else {
            System.out.println("None of the previous");
        }

    }

}
