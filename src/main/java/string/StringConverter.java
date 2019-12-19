package string;

public class StringConverter {
    public static void main(String[] args) {
        converter();
    }

    private static void converter() {

        String number = "01";

        Integer integer = Integer.valueOf(number);

        System.out.println(integer);

        if (integer == 1) {
            System.out.println("The interger is equal to 1");
        } else {
            System.out.println("The interger is NOT equal to 1");
        }

        int i = 1;
        if (integer.equals(i)) {
            System.out.println("The interger is equal to 1");
        } else {
            System.out.println("The interger is NOT equal to 1");
        }

    }
}
