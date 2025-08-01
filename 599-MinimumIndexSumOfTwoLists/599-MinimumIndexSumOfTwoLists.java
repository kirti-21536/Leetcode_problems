// Last updated: 8/1/2025, 8:14:41 PM
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int minsum=Integer.MAX_VALUE;
        List<String> res=new ArrayList();
        for(int i=0;i<list2.length && i<=minsum ;i++){
            String w=list2[i];
            if(!map.containsKey(w)){
                continue;
            }
            int sum=i+map.get(w);
            if(sum<minsum){
                minsum=sum;
                res.clear();
                res.add(w);
            }
            else if(sum==minsum){
                res.add(w);
            }
        }
        return res.toArray(new String[0]);
        
    }
}