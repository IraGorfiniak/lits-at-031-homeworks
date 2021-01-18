package second;

import java.time.LocalDate;


public class SecondTask {
    public static void main(String args[]) {
        LocalDate currentdate = LocalDate.now();
        System.out.println("Current Date:" +currentdate);
        LocalDate newDate = LocalDate.now().plusYears(3).plusMonths(1).plusDays(2);
        System.out.println("Updated Date:" +newDate);
    }
}