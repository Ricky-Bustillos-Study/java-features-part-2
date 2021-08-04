package operators;

public class If {

    public static void main(String[] args) {
        final var condition = false;

        if (condition) {
            System.out.println("The condition is true");
        } else {
            System.out.println("The condition is false");
        }

        if (condition)
            System.out.println("Unique line...");

        final var ternary = condition ? "it's true" : "it's false";
        System.out.println(ternary);
    }

}
