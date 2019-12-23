package fileHandling;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {
    public static void main(String[] args) {
        String string = "BB2251031618A7XPF413                                   2209997                                           370107XPF413  X0  011MB5101805281160741341700000000171803131706020017060200000000 5UXWZ7C37H0X40119              UT           BMW          EAN HOLDING LLC                14002 E 21ST ST STE 1500       OK                            119                    A               B        G          TULSA                                                                         C  56                                                                                                                       DG                                                                                                                                                                                                     E d02180308              8CDB794                                                                        E Q4617060304  230528F                                                                                  J  1710131710101000 EDCO MOTORS INC                151 N TUSTIN AVENUE C 4        TUSTIN                 J  171031171010     TRA SOUTHERN                   10873 ELM AVE                  FONTANA          008000J  171129171120     MAYOLO LUNA CRUZ               AV ABASOLO 1103                NAVAJOA SN       019000M  A00JYV8917060200270039500000000";
        split(string);
    }

    private static void split(String string) {
//        String[] split = string.split("[J]\\s\\s");
//        Arrays.asList(split).stream().forEach(System.out::println);

        Pattern pattern = Pattern.compile("[J].{2}\\d{12}.{90}");
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
