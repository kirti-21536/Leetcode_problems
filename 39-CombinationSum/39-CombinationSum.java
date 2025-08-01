// Last updated: 8/1/2025, 8:16:23 PM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans =new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Combination(candidates,target,ll,0,ans);
        return ans;

    }
        public static void Combination(int coin[],int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
        if(amount==0){
            //System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<coin.length;i++){
            if(amount>=coin[i]){
                ll.add(coin[i]);
                Combination(coin,amount-coin[i],ll,i,ans);
                ll.remove(ll.size()-1);
            }
        }
        
    }
} 