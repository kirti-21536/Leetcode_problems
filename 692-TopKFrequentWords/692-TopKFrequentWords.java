// Last updated: 10/8/2025, 11:35:17 AM
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>((a,b)->
        a.getValue().equals(b.getValue())
        ?b.getKey().compareTo(a.getKey())
        :a.getValue()-b.getValue());
        for(Map.Entry<String,Integer> e:map.entrySet()){
            pq.offer(e);
            if(pq.size()>k)pq.poll();
        }
        List<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.poll().getKey());
        }
        Collections.reverse(ans);
        return ans;
    }
}