import java.time.LocalDate;
import java.time.temporal.WeekFields;

public class WeekNumberExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 12, 31);

        int weekNumber = date.get(WeekFields.ISO.weekOfWeekBasedYear());

        System.out.println("Week number: " + weekNumber);
    }
}


