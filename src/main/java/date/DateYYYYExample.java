package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateYYYYExample {
    public static void main(String[] args) {
        String pattern = "YYYYMMdd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date( 2020,12,30));
        System.out.println(date);
    }
}
