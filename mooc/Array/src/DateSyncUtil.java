import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//解决SimpleDateFormat线程不安全   加锁
public class DateSyncUtil {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date parse(String dateStr) throws ParseException {
        synchronized (sdf){
            return  sdf.parse(dateStr);
        }
    }

    public static String format(Date date){
        synchronized (sdf){
            return sdf.format(date);
        }
    }

}
