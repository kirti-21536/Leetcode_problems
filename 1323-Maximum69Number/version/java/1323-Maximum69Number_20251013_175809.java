// Last updated: 10/13/2025, 5:58:09 PM
class Solution {
    public int maximum69Number (int num) {
     char nums[]=String.valueOf(num).toCharArray();
     for(int i=0;i<nums.length;i++){
        if(nums[i]=='6'){
            nums[i]='9';
            break;
        }
     }
       return Integer.parseInt(new String(nums));
    }
}