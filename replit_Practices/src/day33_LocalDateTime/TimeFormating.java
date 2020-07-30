package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeFormating {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MMM/dd/yyyy");
        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh/mm/ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormatter));
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMM/dd/yy E hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,15,30);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));

    }
}
