// Last updated: 9/3/2025, 2:43:06 AM
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) days[1] = 29;
        int result = day;
        for (int i = 0; i < month - 1; i++) result += days[i];
        return result;
    }

    private boolean isLeapYear(int year) {
        if(year % 400 == 0|| (year % 4 == 0 && year % 100 != 0))return true;
        return false;
    }

    }
