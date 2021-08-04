package operators;

public class Equality {

    public static void main(String[] args) {

        final var number = 11;

        if (number == 10) {
            System.out.println("The number is 10");
        } else {
            System.out.println("The number isn't 10");
        }

        if (number != 10) {
            System.out.println("The number isn't 10");
        } else {
            System.out.println("The number is 10");
        }

        final var letter = "B";

        if ("A".equals(letter)) {
            System.out.println("It's the A letter");
        }

        if (!letter.equals("B")) {
            System.out.println("It isn't the A letter");
        }

    }
}
