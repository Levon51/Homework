package data;
import java.time.*;
import java.util.TimeZone;


public class Data {
    /**
     * Write a program to display the current date and time using the Date class
     */
    public static void main(String[] args) {
        printCurrentDataTime();
        printCurrentDataTime2();
        String	cat,	dog	=	"animal";


    }
    public static void printCurrentDataTime(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
    }
    /**
     * Write a program to display the current date and time in a specific time zone using the TimeZone class.
     */
    public static void  printCurrentDataTime2(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.atZone(ZoneId.of("Europe/London")));
        ZoneId zone = ZoneId.of("Europe/London");
        ZonedDateTime name = ZonedDateTime.of(now, zone);
        System.out.println(name);
    }

}

