package strings;

public class StringBuilderExample {

    public static void main(String[] args) {

        var name = "Ricky";

        final var builder = new StringBuilder(name);
        System.out.println(builder.append("Bustillos"));

        final var reverse = builder.reverse();
        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);

    }
}
