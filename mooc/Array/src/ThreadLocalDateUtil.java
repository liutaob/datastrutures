import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//解决SimpleDateFormat线程不安全   ThreadLocal
public class ThreadLocalDateUtil {
    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<>();
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static DateFormat getDateFormat() {
        DateFormat format = threadLocal.get();
        if (format == null) {
            format = new SimpleDateFormat(DATE_FORMAT);
            threadLocal.set(format);
        }
        return format;
    }

    public static Date parse(String dateStr) throws ParseException {
        return getDateFormat().parse(dateStr);
    }

    public static String format(Date date) throws ParseException {
        return getDateFormat().format(date);
    }

    //第三种解决方式
    public static void main(String[] args) throws ParseException {
        //方式3       方式4不共享资源 采用局部变量
        //解析日期
        String dateStr = "2017年10月24日";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date = LocalDate.parse(dateStr, formatter);

        String datestr = date.format(formatter);

        //日期转换为字符串
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm a");
        String nowStr = now.format(format);
        System.out.println(nowStr);

//        ThreadLocal来限制SimpleDateFormat
        System.out.println(format(new Date()));
    }
}
