// Last updated: 8/1/2025, 8:16:09 PM
class Solution {
    public int climbStairs(int n) {
        int first = 0, second = 1;
      
        
        for (int i = 0; i < n; i++) {
    
            int next = first + second;
           first = second;
            second = next;
        }
      
  
        return second;
        
    }
}