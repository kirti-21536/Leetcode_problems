// Last updated: 4/4/2026, 10:41:47 AM
1class Solution {
2    public String decodeCiphertext(String encodedText, int rows) {
3        if (rows == 0) return "";
4        
5        int n = encodedText.length();
6        int cols = n / rows;
7        StringBuilder result = new StringBuilder();
8
9        for (int col = 0; col < cols; col++) {
10            int i = 0, j = col;
11            while (i < rows && j < cols) {
12                result.append(encodedText.charAt(i * cols + j));
13                i++;
14                j++;
15            }
16        }
17        
18        // remove trailing spaces
19        int end = result.length() - 1;
20        while (end >= 0 && result.charAt(end) == ' ') {
21            end--;
22        }
23        
24        return result.substring(0, end + 1);
25    }
26}