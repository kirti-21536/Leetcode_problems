// Last updated: 9/4/2025, 11:12:07 AM
class Solution {
    public int findClosest(int x, int y, int z) {
        int diffzx=Math.abs(z-x);
        int diffzy=Math.abs(z-y);
        if(diffzx<diffzy)return 1;
        if(diffzx==diffzy)return 0;
        return 2;

    }
}