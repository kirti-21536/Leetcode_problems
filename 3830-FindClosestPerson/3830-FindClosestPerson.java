// Last updated: 10/8/2025, 11:34:27 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int diffzx=Math.abs(z-x);
        int diffzy=Math.abs(z-y);
        
        if(diffzx==diffzy)return 0;
        if(diffzx<diffzy)return 1;
        else return 2;

    }
}