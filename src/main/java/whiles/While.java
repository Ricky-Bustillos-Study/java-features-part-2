package whiles;

public class While {

    public static void main(String[] args) {

        var x = 0;

        // test the condition before
        while (x < 1) {
            System.out.println("Inside while");
            x++;
        }

        var y = 0;
        do {
            System.out.println("Inside do/while");
        } while (y++ < 1);

    }

}
