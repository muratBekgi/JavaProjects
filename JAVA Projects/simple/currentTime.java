import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class currentTime {
    public static void main(String[] args) {
        //1
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        //2
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        //3
        System.out.println(java.time.LocalDate.now());
        //4
        System.out.println(java.time.LocalTime.now());
        //5
        System.out.println(java.time.LocalDateTime.now());
        //6
        System.out.println(java.time.Clock.systemUTC().instant());
        //7
        java.util.Date date1=new java.util.Date();
        System.out.println(date1);
        //8
        long millis=System.currentTimeMillis();
        java.util.Date date2=new java.util.Date(millis);
        System.out.println(date2);
        //9
        Date date3=java.util.Calendar.getInstance().getTime();
        System.out.println(date3);

    }
}
