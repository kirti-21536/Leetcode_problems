// Last updated: 10/24/2026, 8:39:23 PM
1class Solution {
2    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
3        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
4        int a1 = convert(arriveAlice, days);
5        int a2 = convert(leaveAlice, days);
6        int b1 = convert(arriveBob, days);
7        int b2 = convert(leaveBob, days);
8        int start = Math.max(a1, b1);
9        int end = Math.min(a2, b2);
10        return Math.max(0, end - start + 1);
11    }
12    private int convert(String date, int[] days) {
13        int month = Integer.parseInt(date.substring(0, 2));
14        int day = Integer.parseInt(date.substring(3, 5));
15        int total = day;
16        for (int i = 0; i < month - 1; i++) {
17            total += days[i];
18        }
19        return total;
20    }
21}