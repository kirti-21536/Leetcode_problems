// Last updated: 4/7/2026, 11:43:20 AM
1class Solution {
2    public int mirrorFrequency(String s) {
3        Map<Character,Integer> map=new HashMap<>();
4        Set<Character> set=new HashSet<>();
5        int n=s.length();
6        int sum=0;
7        for(int i=0;i<n;i++){
8            char ch=s.charAt(i);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10        }
11        for(char ch:map.keySet()){
12            int freq1=map.getOrDefault(ch,0);
13            char m=mirror(ch);
14            int freq2=map.getOrDefault(m,0);
15            if(!set.contains(ch) && !set.contains(m))sum+=Math.abs(freq1-freq2);
16            set.add(ch);
17        }
18        return sum;
19    }
20    public char mirror(char ch) {
21        if(ch>='0'&& ch<='9')return (char) ('0' + (9 - (ch - '0')));
22    return (char) ('z' - (ch - 'a'));
23}
24}