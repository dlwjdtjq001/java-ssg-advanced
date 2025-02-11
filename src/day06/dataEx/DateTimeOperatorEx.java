package day06.dataEx;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperatorEx {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY.MM.dd aHH:mm:ss");
        System.out.println("현재시간 : " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년후 현재시간 : " + result1.format(dtf));

        LocalDateTime result2 = now.plusMonths(1);
        System.out.println("1달 후 현재시간 : " + result2.format(dtf));

        //
        LocalDateTime startDateTime = LocalDateTime.of(2025,2,19,0,0,0);

        System.out.println(startDateTime.format(dtf));

        LocalDateTime endDateTime = LocalDateTime.of(2025,2,11,0,0,0);
        System.out.println(endDateTime.format(dtf));

        if(startDateTime.isBefore(endDateTime)) System.out.println("진행중");
        else if (startDateTime.isEqual(endDateTime)) System.out.println("종료");
        else System.out.println("종료합니다.");


    }
}
