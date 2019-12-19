package switchStatement;

public class SwitchExample {
    public static void main(String[] args) {
        foo();

        foo1();
    }

    private static void foo1() {
        int month = 5;

        switch (month) {
            case 1: case 2: case 3: case 11: case 12:
                System.out.println("Winter");
                break;
            case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10:
                System.out.println("Fall");
                break;
        }
    }

    private static void foo() {
        int month = 7;

        switch (month) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");
            case 7:
                System.out.println("7");
            case 8:
                System.out.println("8");
            case 9:
                System.out.println("9");
            case 10:
                System.out.println("10");
            case 11:
                System.out.println("11");
            case 12:
                System.out.println("12");
                break;
        }
    }
}
