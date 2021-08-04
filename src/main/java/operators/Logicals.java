package operators;

import jdk.swing.interop.SwingInterOpUtils;

public class Logicals {

    public static void main(String[] args) {

        final var number = 2;
        final var letter = "A";

        // sort circuit
        if (number < 5 && letter.equals("A")) {
            System.out.println("Comply with condition");
        }

        if (number < 5 || letter.equals("A")) {
            System.out.println("Complies with another condition");
        }

        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Crazy logic");
        }

        // non sort circuit
        if (verify(15) | verify("A")) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }
    }

    private static boolean verify(String letter) {
        System.out.println("Verifying the letter...");
        return letter.equals("A");
    }

    private static boolean verify(Integer number) {
        System.out.println("Verifying number...");
        return number > 10;
    }


}
