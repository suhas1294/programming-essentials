package dateUtils;

import java.time.Instant;
import java.time.ZonedDateTime;

public class PrintEpoche {
    public static void main(String args[]){
        Long t = Instant.now().getEpochSecond();
        String time = t.toString();
        System.out.println(time);
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(Instant.now().toEpochMilli() + (24 * 60 * 60 * 1000));
    }
}
