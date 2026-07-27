// Last updated: 7/27/2026, 11:47:32 AM
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        String s2=new StringBuilder(s).reverse().toString();
4        int dp[][]=new int[s.length()][s2.length()];
5        for(int a[]:dp){
6            Arrays.fill(a,-1);
7        }
8        return LCS(s,s2,0,0,dp);
9        
10    }
11    public static int LCS(String s,String s2,int i,int j,int dp[][]){
12        if(i==s.length() || j==s2.length()){
13            return 0;
14        }
15        if(dp[i][j]!=-1){
16            return dp[i][j];
17        }
18        if(s.charAt(i)==s2.charAt(j)){
19            return dp[i][j]=1+LCS(s,s2,i+1,j+1,dp);
20        }
21        else{
22            int f=LCS(s,s2,i+1,j,dp);
23            int r=LCS(s,s2,i,j+1,dp);
24            return dp[i][j]=Math.max(f,r);
25        }
26    } 
27}