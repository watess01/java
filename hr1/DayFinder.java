import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DayFinder {
    public static String findDay(int month, int day, int year) {
        System.out.println("Demo - DayFinder...");

        Calendar c = Calendar.getInstance(Locale.UK);

        c.set(year, month, day);

        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        return formatter.format(c.getTime());
    }
}
