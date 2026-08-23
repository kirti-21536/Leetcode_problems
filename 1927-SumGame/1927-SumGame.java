// Last updated: 8/23/2026, 6:28:13 PM
1class Solution {
2    public boolean sumGame(String num) {
3        int len = num.length();
4
5        String num1 = num.substring(0, len / 2);
6        String num2 = num.substring(len / 2);
7
8        int i = 0;
9        int sum1 = 0, sum2 = 0;
10        int qcount1 = 0, qcount2 = 0;
11
12        while (i < num1.length()) {
13            char ch1 = num1.charAt(i);
14            char ch2 = num2.charAt(i);
15
16            if (ch1 == '?')
17                qcount1++;
18            else
19                sum1 += ch1 - '0';
20
21            if (ch2 == '?')
22                qcount2++;
23            else
24                sum2 += ch2 - '0';
25
26            i++;
27        }
28
29        int qdiff = qcount1 - qcount2;
30        int sumdiff = sum1 - sum2;
31
32        if (qdiff == 0)
33            return sumdiff != 0;
34
35        if (Math.abs(qdiff) % 2 == 1)
36            return true;
37
38        int target = (qdiff / 2) * 9;
39
40        return sumdiff != -target;
41    }
42}