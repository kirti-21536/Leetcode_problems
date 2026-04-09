// Last updated: 4/10/2026, 1:40:04 AM
1class Solution {
2    public String intToRoman(int num) {
3        int[] values = {
4            1000, 900, 500, 400,
5            100, 90, 50, 40,
6            10, 9, 5, 4, 1
7        };
8        
9        String[] symbols = {
10            "M", "CM", "D", "CD",
11            "C", "XC", "L", "XL",
12            "X", "IX", "V", "IV", "I"
13        };
14        
15        StringBuilder result = new StringBuilder();
16        
17        for (int i = 0; i < values.length; i++) {
18            while (num >= values[i]) {
19                result.append(symbols[i]);
20                num -= values[i];
21            }
22        }
23        
24        return result.toString();
25    }
26}
27