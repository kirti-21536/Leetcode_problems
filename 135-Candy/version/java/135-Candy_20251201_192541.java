// Last updated: 12/1/2025, 7:25:41 PM
1class Solution {
2    public int candy(int[] ratings) {
3        int n=ratings.length;
4        int c[]=new int[n];
5        Arrays.fill(c,1);
6        for(int i=1;i<n;i++){
7            if(ratings[i]>ratings[i-1]){
8                c[i]=c[i-1]+1;
9            }
10        }
11        for(int i=n-2;i>=0;i--){
12            if(ratings[i]>ratings[i+1]){
13                c[i]=Math.max(c[i],c[i+1]+1);
14            }
15        }
16        int sum=0;
17        for(int i:c){
18            sum+=i;
19        }
20        return sum;
21        
22    }
23}