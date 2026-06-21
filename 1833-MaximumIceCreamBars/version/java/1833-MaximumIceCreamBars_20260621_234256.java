// Last updated: 6/21/2026, 11:42:56 PM
1class Solution {
2    public int maxIceCream(int[] costs, int coins) {
3        Arrays.sort(costs);
4        int n=costs.length;
5        int count=0;
6        for(int i=0;i<n;i++){
7            if(costs[i]<=coins){
8                coins-=costs[i];
9                count++;
10            }
11        }
12        return count;
13        
14    }
15}