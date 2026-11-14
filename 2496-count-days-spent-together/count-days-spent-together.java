
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        LocalDate alicestart=LocalDate.parse("2023-"+arriveAlice);
        LocalDate aliceend=LocalDate.parse("2023-"+leaveAlice);
        LocalDate bobstart=LocalDate.parse("2023-"+arriveBob);
        LocalDate bobend=LocalDate.parse("2023-"+leaveBob);

        LocalDate start=alicestart.isAfter(bobstart)? alicestart : bobstart ;

        LocalDate end=aliceend.isBefore(bobend) ? aliceend : bobend;


        if(start.isAfter(end)){
            return 0;
        }

        return (int) ChronoUnit.DAYS.between(start,end) + 1;
        
        
    }
}