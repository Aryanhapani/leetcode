import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        LocalDate ld=LocalDate.of(year,month,day);

        DayOfWeek week=ld.getDayOfWeek();

        return week.getDisplayName(
    java.time.format.TextStyle.FULL,
    java.util.Locale.ENGLISH
);
        


    }
}