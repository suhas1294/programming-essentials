package dateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static void main(String args[]){
        String time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        String etime  = time.replace(" ", "_").replace("-", "_").replace(":", "_");
        System.out.println(etime);
    }
}
