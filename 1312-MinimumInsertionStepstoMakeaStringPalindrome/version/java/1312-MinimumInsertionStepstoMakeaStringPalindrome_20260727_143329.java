// Last updated: 7/27/2026, 2:33:29 PM
1class Solution {
2    public int minInsertions(String s) {
3        int n=s.length();
4        String s2=new StringBuilder(s).reverse().toString();
5        int dp[][]=new int[s.length()][s2.length()];
6        for(int a[]:dp){
7            Arrays.fill(a,-1);
8        }
9        return n-LCS(s,s2,0,0,dp);
10        
11    }
12    public static int LCS(String s,String s2,int i,int j,int dp[][]){
13        if(i>=s.length() || j>=s2.length()){
14            return 0;
15        }
16        if(dp[i][j]!=-1){
17            return dp[i][j];  
18        }
19        if(s.charAt(i)==s2.charAt(j)){
20            return dp[i][j]=1+LCS(s,s2,i+1,j+1,dp);
21        }
22        else{
23            int f=LCS(s,s2,i,j+1,dp);
24            int r=LCS(s,s2,i+1,j,dp);
25            return dp[i][j]=Math.max(f,r);
26        }
27    }
28}