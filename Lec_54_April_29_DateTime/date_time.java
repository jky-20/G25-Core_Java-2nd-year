package Lec_54_April_29_DateTime;

import java.time.*;

import Lec_51_April_24_Random.random;

public class date_time {
    public static void main(String[] args) {
        
        // Current date / Time
        LocalDate currDate = LocalDate.now();
        LocalTime currTime = LocalTime.now();
        LocalDateTime currDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // custom date
        LocalDate customDate = LocalDate.of(2011, 04, 02);
        LocalTime customTime = LocalTime.of(23, 30, 45);
        LocalDateTime customDateTime = LocalDateTime.of(2011, 04, 02, 23, 30);

        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));

        System.out.println("India Time : " + zonedDateTime);
        System.out.println("London Time : " + londonTime);

        // Past/ furture date
        LocalDate randomDate = LocalDate.now().minusDays(125);
        LocalTime randomTime = LocalTime.now().plusHours(23);
        LocalDateTime randomDateTime = LocalDateTime.now().minusWeeks(28);
        randomDateTime = randomDateTime.minusHours(21);

        // Comparing two dates  -> isBefore() / isAfter()
        System.out.println(currDate.isBefore(randomDate));
        System.out.println(randomTime.isAfter(currTime));

        // period / duration
        Period period = Period.between(currDate, randomDate);
        Duration duration = Duration.between(randomTime, randomTime);
    }
}
