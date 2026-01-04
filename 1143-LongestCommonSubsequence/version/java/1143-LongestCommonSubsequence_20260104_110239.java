// Last updated: 1/4/2026, 11:02:39 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int dp[][]=new int[text1.length()][text2.length()];
4        for(int[]a:dp)Arrays.fill(a,-1);
5        return LCS(text1,text2,0,0,dp);
6
7        
8    }
9    public static int LCS(String s1,String s2,int i,int j,int dp[][]){
10        if(i==s1.length() || j==s2.length()){
11            return 0;
12        }
13        if(dp[i][j]!=-1){
14            return dp[i][j];
15        }
16        int ans=0;
17        if(s1.charAt(i)==s2.charAt(j)){
18            ans=1+LCS(s1,s2,i+1,j+1,dp);
19        }
20        else{
21            int f=LCS(s1,s2,i+1,j,dp);
22            int s=LCS(s1,s2,i,j+1,dp);
23            ans=Math.max(f,s);
24        }
25        return dp[i][j]=ans;
26    }
27}