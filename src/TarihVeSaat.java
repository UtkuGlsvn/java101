import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TarihVeSaat {
    public static void main(String[] args) {

        Date nowDate= new Date();//şuan ki tarih ve saat
        System.out.println(nowDate.toString());
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd"); // şuanki tarih
        System.out.println(df.format(nowDate));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");//// şuan ki saat 2
        String time = simpleDateFormat.format(new Date());
        System.out.println(time);

        LocalTime nowTime = LocalTime.now();// şuan ki saat 2
        System.out.println(nowTime);

        Calendar takvim = new GregorianCalendar(2013, 9, 27);//takvim
        Date tarih = takvim.getTime();
        System.out.println(tarih.toString());
    }
}
