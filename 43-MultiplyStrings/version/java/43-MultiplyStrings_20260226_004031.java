// Last updated: 2/26/2026, 12:40:31 AM
1class Solution {
2    public String multiply(String num1, String num2) {
3       if (num1.equals("0") || num2.equals("0")) return "0";
4        
5        int m = num1.length();
6        int n = num2.length();
7        int[] res = new int[m + n];
8
9        for (int i = m - 1; i >= 0; i--) {
10            for (int j = n - 1; j >= 0; j--) {
11                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
12                int sum = mul + res[i + j + 1];
13                res[i + j + 1] = sum % 10;
14                res[i + j] += sum / 10;
15            }
16        }
17
18        StringBuilder sb = new StringBuilder();
19        for (int num : res) {
20            if (!(sb.length() == 0 && num == 0)) {
21                sb.append(num);
22            }
23        }
24
25        return sb.length() == 0 ? "0" : sb.toString();      
26    }
27}