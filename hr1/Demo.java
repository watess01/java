import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;


public class Demo {



    public static void main(String[] args) {

        System.out.printf("DayFinder: %s\n", DayFinder.findDay(8,5,2015));

        AnagramFinder.Run();
        // multi-thread
        DemoThreads.Run("XYZ", 2);


    }

}