// Last updated: 9/27/2025, 2:55:16 PM
	class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
		int right=getmax(piles);
        int ans=0;
		
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(canEatAll(piles,h,mid)) {
                ans=mid;
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return ans;
	}
	
	
	public static int getmax(int piles[]) {
		int max=0;
		for(int i=0;i<piles.length;i++) {
			if(piles[i]>max) {
				max=piles[i];
			}
		}
		return max;
	}
	
	public static boolean canEatAll(int piles[],int h,int k) {
		int hoursneeded=0;
		for(int i=0;i<piles.length;i++) {
			hoursneeded+=(piles[i]+k-1)/k;
			if(hoursneeded>h) {
				return false;
			}
		}
		return true;
    }
}