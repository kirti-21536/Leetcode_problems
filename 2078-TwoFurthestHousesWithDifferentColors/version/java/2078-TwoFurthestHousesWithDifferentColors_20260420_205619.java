// Last updated: 4/20/2026, 8:56:19 PM
1class Solution {
2    public int maxDistance(int[] colors) {
3        int n=colors.length;
4        if(n<=2)return n-1;
5        int maxdist=0;
6        for(int j=n-1;j>0;j--){
7            if(colors[0]!=colors[j]){
8                maxdist=Math.max(j,maxdist);
9                break;
10            }
11        }
12        for(int i=0;i<n-1;i++){
13            if(colors[n-1]!=colors[i]){
14                maxdist=Math.max(n-i-1,maxdist);
15                break;
16            }
17        }
18
19        
20        return maxdist;
21
22        
23    }
24}