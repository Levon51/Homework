package specifires;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class TimeNow{
    public static final LocalDateTime time = LocalDateTime.now();
}
public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        LocalDateTime now = LocalDateTime.now();
        long currentDate = ChronoUnit.SECONDS.between(TimeNow.time, now);
        System.out.println("Անցել է " + currentDate + " վայրկյան");
    }
}
