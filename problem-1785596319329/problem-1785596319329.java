// Last updated: 8/1/2026, 8:28:39 PM
1class Solution {
2    public long minInitialStrength(int[] monsters, int[][] boosts) {
3        int n=monsters.length;
4        long[] diff=new long[n+1];
5        for(int b[]:boosts){
6            diff[b[0]]+=b[2];
7            if(b[1]+1<n)diff[b[1]+1]-=b[2];
8        }
9        long[] bonus =new long[n];
10        long cur=0;
11        for(int i=0;i<n;i++){
12            cur+=diff[i];
13            bonus[i]=cur;
14        }
15        long lo=0,hi=0;
16        for(int x:monsters)hi+=x;
17        while(lo<hi){
18            long mid=lo+(hi-lo)/2;
19            if(can(mid,monsters,bonus))hi=mid;
20            else lo=mid+1;
21        }
22        return lo;
23        
24    }
25    private boolean can(long strength,int[] monsters,long bonus[]){
26        long curr=strength;
27        for(int i=0;i<monsters.length;i++){
28            if(curr+bonus[i]<monsters[i]){
29                return false;
30            }
31                curr-=monsters[i];
32                if(curr<0)curr=0;
33            
34            
35        }
36        return true;
37    }
38}