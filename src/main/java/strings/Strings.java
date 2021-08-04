package strings;

import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        var name = "Ricky";
        var lastName = "Bustillos";
        final var completeName = name + lastName;
        System.out.println(name);
        System.out.println("Customer name: " + name);
        System.out.println("Complete customer name: "+ completeName);

        var string = new String(" My string ");
        System.out.println("Char in position: " + string.charAt(5));
        System.out.println("Quantity: " + string.length());
        System.out.println("Without Trim: [" + string + "]");
        System.out.println("With Trim: [" + string.trim() + "]");
        System.out.println("Lowercase: " + string.toLowerCase());
        System.out.println("Uppercase: " + string.toUpperCase());
        System.out.println("Contains M? " + string.contains("M"));
        System.out.println("Contains m? " + string.contains("m"));
        System.out.println("Replace: " + string.replace("n", "$"));
        System.out.println("Equals? " + string.equals(" My string "));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" my sTrIng "));
        System.out.println("Substring(1,6): " + string.substring(1, 6));


    }

}
