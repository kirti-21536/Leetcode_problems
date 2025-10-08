// Last updated: 10/8/2025, 11:35:33 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=0;
        int j=0;
        int cookie=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                cookie++;
                i++;
                j++;
            }
            else{
                j++;
            }
            
        }
        return cookie;
        
    }
}