package nullCheck;

import java.util.ArrayList;
import java.util.List;

public class NullCheck {
    public static void main(String[] args) {
        foo();
    }

    private static void foo() {

        List<Integer> list = new ArrayList<>();
        System.out.println(list);

        if (list == null) {
            System.out.println("This is null");
        } else {
            System.out.println("This is not null");
        }

        List<Integer> list2 = null;

        if (list2 == null) {
            System.out.println("This is null");
        } else {
            System.out.println("This is not null");
        }
    }
}
