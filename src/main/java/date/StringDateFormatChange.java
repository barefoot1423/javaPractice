package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringDateFormatChange {
    public static void main(String[] args) {
        String date = "06/14/2019";
        String time = "03:00:05";

        convertFormat(date, time);
    }

    private static String convertFormat(String date, String time) {

        String oldString = date + " " + time;
        LocalDateTime dateTime = LocalDateTime.parse(oldString, DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        String newString = dateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        System.out.println(newString);

        return newString;
    }

}
