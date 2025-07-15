import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plus(20, ChronoUnit.DAYS));

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime); // localDate.atTime(localTime)
        System.out.println(localDateTime);

        Date date = Date.from(localDateTime.toInstant(ZoneOffset.ofHours(-3)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(date);

        ZoneId zoneId = calendar.getTimeZone().toZoneId();
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(calendar.toInstant(), zoneId);
        System.out.println(localDateTime1);

        System.out.println(Duration.between(localDateTime, localDateTime1));

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        offsetDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.UTC);
        System.out.println(offsetDateTime);
    }
}