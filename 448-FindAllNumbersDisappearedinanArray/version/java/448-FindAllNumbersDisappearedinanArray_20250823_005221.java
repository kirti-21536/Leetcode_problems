// Last updated: 8/23/2025, 12:52:21 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(nums);

        // for(int i=1;i<=9;i++){
        //     map.put(i,0);
        // }
        for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            }
            for(int i=1;i<=nums.length;i++){     if(!map.containsKey(i)){
                ll.add(i);
            }

            }

        return ll;
        }
    }
