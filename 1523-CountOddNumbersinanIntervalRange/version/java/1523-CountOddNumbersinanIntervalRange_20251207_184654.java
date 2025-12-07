// Last updated: 12/7/2025, 6:46:54 PM
1class Solution {
2    public int countOdds(int low, int high) {
3    //    int total_nums=high-low+1; //total numbers in range 
4    //    if((low%2==0 && high%2==0)|| (low % 2 == 1 && high % 2 == 1)){
5    //     return total_nums/2;
6    //    }
7    //     return total_nums/2+1;
8      return (high + 1) / 2 - low / 2;
9       
10    }
11}