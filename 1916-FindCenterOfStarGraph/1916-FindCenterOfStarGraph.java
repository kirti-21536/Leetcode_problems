// Last updated: 1/13/2026, 11:11:39 AM
class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        
        if (a == edges[1][0] || a == edges[1][1]) {
            return a;
        }
        return b;
        
    }
}