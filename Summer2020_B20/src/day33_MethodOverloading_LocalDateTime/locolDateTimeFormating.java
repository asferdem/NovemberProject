package day33_MethodOverloading_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class locolDateTimeFormating {
    public static void main(String[] args) {
      LocalDateTime t2  =LocalDateTime.of(1995,11,22,23,20);
        System.out.println(t2);

        LocalDateTime t3=LocalDateTime.now();
        System.out.println(t3);
        System.out.println("===================================");

        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("E, MM/dd/yyyy ,EEEE");

        LocalDate ld=LocalDate.of(2020,7,26);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime now= LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));
        System.out.println("================================");

        DateTimeFormatter DtFormat= DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");

        LocalDateTime time=LocalDateTime.of(2019,05,20,16,30);
        System.out.println(time);
        System.out.println(time.format(DtFormat));

        System.out.println(LocalDateTime.now().format(DtFormat));

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rightNow= LocalDateTime.now();
        System.out.println(rightNow.format(dtf));

    }
}
