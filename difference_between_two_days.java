import java.text.SimpleDateFormat;
import java.util.*;
//import java.util.Date;

public class java_tips {
    public static void main(String[] args) {
        String date1 = "01.03.2016";
        String date2 = "01.02.2016";

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        Date dateOne = null;
        Date dateTwo = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Количество дней между датами в миллисекундах
        long difference = dateOne.getTime() - dateTwo.getTime();
        // Перевод количества дней между датами из миллисекунд в дни
        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println(days + " дн.");
    }
}
