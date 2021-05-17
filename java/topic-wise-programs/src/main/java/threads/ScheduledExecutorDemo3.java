package threads;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo3 {
    private static String getKbStatus(){
        String[] arr = {"completed", "pending"};
        Random random = new Random();
        return arr[random.nextInt(2)];
    }
    private void subMethod(){
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                String status = getKbStatus();
                if (status.equalsIgnoreCase("completed")){
                    System.out.println("hello");
                }else {
                    System.out.println("world");
                }
            }
        },0,3, TimeUnit.SECONDS);
    }
    public static void main(String[] args) {
        new ScheduledExecutorDemo3().subMethod();
    }
}
