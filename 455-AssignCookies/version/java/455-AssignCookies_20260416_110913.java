// Last updated: 4/16/2026, 11:09:13 AM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int l=0,r=0;
6        while(r<g.length && l<s.length){
7            if(g[r]<=s[l]){
8                l++;
9                r++;
10            }
11            else{
12                l++;
13            }
14        }
15        return r;
16        
17    }
18}