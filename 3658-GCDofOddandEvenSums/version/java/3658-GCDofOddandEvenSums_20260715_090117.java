// Last updated: 7/15/2026, 9:01:17 AM
1class Solution {
2    public int gcdOfOddEvenSums(int n) {
3        int oddsum=0,evensum=0;
4        int odd=1,even=2;
5        for(int i=0;i<n;i++){
6            oddsum+=odd;
7            evensum+=even;
8            odd+=2;
9            even+=2;
10        }
11        while(oddsum!=0){
12            int temp=oddsum;
13            oddsum=evensum%oddsum;
14            evensum=temp;
15        }
16        return evensum;
17    }
18}