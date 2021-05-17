package threads;

import java.util.concurrent.*;

public class ScheduledExecutorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        ScheduledFuture scheduledFuture = scheduledExecutorService.schedule(new Callable() {
            public Object call() throws Exception{
                System.out.println("johndoe");
                return "something";
            }
        },
        5,
        TimeUnit.SECONDS
        );

        do {
            System.out.println(scheduledFuture.get());
        }while (scheduledFuture.get().toString().equalsIgnoreCase("something"));

        scheduledExecutorService.shutdown();
    }


}
