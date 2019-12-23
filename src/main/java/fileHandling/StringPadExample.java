package fileHandling;

import org.apache.commons.lang3.StringUtils;

public class StringPadExample {
    public static void main(String[] args) {
        foo();
    }

    private static void foo() {
        String left = StringUtils.leftPad("1234", 20, " ");
        String right = StringUtils.rightPad("1234", 20, " ");

        System.out.println(left);
        System.out.println(right);
    }
}
