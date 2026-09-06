// Last updated: 9/6/2026, 4:38:51 PM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int m = s.length();
4        int n = t.length();
5
6        long[] dp = new long[n + 1];
7        dp[0] = 1;
8
9        for (int i = 0; i < m; i++) {
10            for (int j = n - 1; j >= 0; j--) {
11                if (s.charAt(i) == t.charAt(j)) {
12                    dp[j + 1] += dp[j];
13                }
14            }
15        }
16        return (int) dp[n];
17    
18    //     return change(s,t,0,0);
19    // }
20    // // s-->coin  t-->amount  i-->s   j-->t
21    // public int change(String s,String t,int i,int j){
22    //     if(j==t.length())return 1;
23    //     if(i==s.length())return 0;
24        
25    //     int inc=0,exc=0;
26    //     if(s.charAt(i)==t.charAt(j)){
27    //         inc=change(s,t,i+1,j+1);
28    //     }
29    //     exc=change(s,t,i+1,j);
30    //     return inc+exc;
31    }
32}