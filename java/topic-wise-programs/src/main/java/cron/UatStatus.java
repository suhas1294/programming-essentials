package cron;

import java.util.Timer;
import java.util.TimerTask;

public class UatStatus {
    public static void main(String[] args) {
        Timer timer = new Timer();
        CheckStatus checkStatus = new CheckStatus();
        timer.scheduleAtFixedRate(checkStatus, 0, 5*60*1000);
    }
}

class CheckStatus extends TimerTask{

    @Override
    public void run() {
        System.out.println("qwertyuiop");
    }
}
