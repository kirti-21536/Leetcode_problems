// Last updated: 12/13/2025, 12:17:49 AM
1class Solution {
2    public String frequencySort(String s) {
3        Map<Character,Integer> map=new HashMap<>();
4        for(char ch:s.toCharArray()){
5            map.put(ch,map.getOrDefault(ch,0)+1);
6        }
7
8        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
9        pq.addAll(map.keySet());
10        StringBuilder sb=new StringBuilder();
11        while(!pq.isEmpty()){
12            char ch=pq.poll();
13            int freq=map.get(ch);
14            while(freq-->0){
15                sb.append(ch);
16            }
17        }
18        return sb.toString();
19
20    }
21}