import java.util.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year)
    {
        // Calendar cal = Calendar.getInstance();
        // cal.set(year,month-1,day);
        // String[] days = {
        // "Sunday",
        // "Monday",
        // "Tuesday",
        // "Wednesday",
        // "Thursday",
        // "Friday",
        // "Saturday"
        // };
        // return days[cal.get(Calendar.DAY_OF_WEEK)-1]; 
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        int days = 0;
        
        for (int i = 1971; i < year; ++i) {
            days += (isLeapYear(i) ? 366 : 365);
        }
        
        for (int i = 0; i < month - 1; ++i) {
            if (i == 1 && isLeapYear(year)) {
                days += 29;
            } else {
                days += monthDays[i];
            }
        }
        
        days += day;
        
        return daysOfWeek[(days + 4) % 7];
    }
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}