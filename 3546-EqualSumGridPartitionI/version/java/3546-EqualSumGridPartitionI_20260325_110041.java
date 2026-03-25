// Last updated: 3/25/2026, 11:00:41 AM
1class Solution {
2    public boolean canPartitionGrid(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        long totalsum=0;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8               totalsum+=grid[i][j];
9            }
10        }
11        long sum=0;
12        //horizontal cuts
13        for(int i=0;i<m-1;i++){
14            for(int j=0;j<n;j++){
15                sum+=grid[i][j];
16            }
17            if(sum==totalsum-sum)return true;
18        }
19
20        // vertical cuts 
21        sum=0;
22        for(int j=0;j<n-1;j++){
23            for(int i=0;i<m;i++){
24                sum+=grid[i][j];
25            }
26            if(sum==totalsum-sum)return true;
27        }
28        
29        return false;
30        
31    }
32}