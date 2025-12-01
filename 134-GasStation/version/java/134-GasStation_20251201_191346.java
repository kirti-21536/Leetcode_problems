// Last updated: 12/1/2025, 7:13:46 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int total=0;
4        for(int i=0;i<cost.length;i++){
5            total+=gas[i]-cost[i];
6
7        }
8        if(total<0){
9            return -1;
10        }
11        int idx=0;
12        int curr=0;
13        for(int i=0;i<cost.length;i++){
14            curr+=gas[i]-cost[i];
15            if(curr<0){
16                curr=0;
17                idx=i+1;
18            }
19        }
20        return idx;
21    }
22}