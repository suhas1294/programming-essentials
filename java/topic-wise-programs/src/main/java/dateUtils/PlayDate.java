package dateUtils;

import java.time.LocalDate;

public class PlayDate {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate dayAfterTomorrow = today.plusDays(2);

        System.out.println(tomorrow.toString());
        System.out.println(dayAfterTomorrow.toString());
    }
}
