// Last updated: 1/13/2026, 11:11:04 AM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int diff=Math.min(s1.length(),Math.min(s2.length(),s3.length()));
        int l=0;
        while(l<diff && s1.charAt(l)==s2.charAt(l) && s2.charAt(l)==s3.charAt(l)){
            l++;
        }
        if(l==0)return -1;

        return (s1.length()-l)+(s2.length()-l)+(s3.length()-l);
        
    }
}