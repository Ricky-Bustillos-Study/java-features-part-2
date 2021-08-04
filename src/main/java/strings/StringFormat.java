package strings;

public class StringFormat {

    public static void main(String[] args) {

        var name = "Ricky";
        var lastName = "Bustillos";
        final var completeName = name + lastName;

        System.out.println(name);
        System.out.println("Customer name: " + name);
        System.out.println("Complete customer name: "+ completeName);

        final var message = String.format("The customer %s has last name %s", name, lastName);
        System.out.println(message);

        System.out.println(String.format("Number %.2f ", 1.2375d));

    }
}
