package threads;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer1 = new Timer();
        Timer timer2 = new Timer();
        MultipleTimerDemo multi1 = new MultipleTimerDemo("UI");
        MultipleTimerDemo multi2 = new MultipleTimerDemo("API");
        timer1.scheduleAtFixedRate(multi1, 4000, 1000);
        timer2.scheduleAtFixedRate(multi2, 1000, 3000);

    }
}
class MultipleTimerDemo extends TimerTask {

    private String type;

    public MultipleTimerDemo(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        System.out.println("My type is : " + type);
    }
}