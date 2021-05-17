package threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo2 {
    public static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        Runnable task1 = () -> {
            count++;
            System.out.println("Running count:\t" + count);
        };

        ScheduledFuture scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(task1, 10, 3, TimeUnit.SECONDS);
        while (true) {
            System.out.println("count :" + count);
            Thread.sleep(1000);
            if (count == 12) {
                System.out.println("Count is 5, cancel the scheduledFuture!");
                scheduledFuture.cancel(true);
                scheduledExecutorService.shutdown();
                break;
            }
        }
    }
}
