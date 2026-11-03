class Solution {

    public int daysBetweenDates(String date1, String date2) {

        return Math.abs(convertToDays(date1) - convertToDays(date2));
    }

    public int convertToDays(String date) {

        String[] arr = date.split("-");

        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int totalDays = 0;

        // Calculate days in previous years
        for(int i = 1971; i < year; i++) {

            if(isLeapYear(i))
                totalDays += 366;
            else
                totalDays += 365;
        }

        // Calculate days in previous months
        for(int i = 0; i < month - 1; i++) {
            totalDays += days[i];
        }

        // Add leap day if applicable
        if(month > 2 && isLeapYear(year)) {
            totalDays++;
        }

        // Add current day
        totalDays += day;

        return totalDays;
    }

    public boolean isLeapYear(int year) {

        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }
}