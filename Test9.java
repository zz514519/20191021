import java.time.LocalDate;

/**
 * Author : Zhang Zhe
 */
import java.time.*;
public class Test9 {
    public static void main(String[] args) {
        {
            LocalDate date = LocalDate.now();
            int today = date.getDayOfMonth();
            int month = date.getMonthValue();
            System.out.println("today="+today+" "+"month="+month);
        }
    }
}