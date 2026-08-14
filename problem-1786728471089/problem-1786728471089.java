// Last updated: 8/14/2026, 10:57:51 PM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        HashMap<Character,Integer> map=new HashMap<>();
4        int left=0;
5        int maxlen=0;
6        int n=s.length();
7        for(int right=0;right<n;right++){
8            char ch=s.charAt(right);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10            while(map.get(ch)>2){
11                map.put(s.charAt(left),map.get(s.charAt(left))-1);
12                left++;
13            }
14            maxlen=Math.max(maxlen,right-left+1);   
15        }
16        return maxlen;
17        
18    }
19}