// Last updated: 8/1/2025, 8:16:26 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]= {-1,-1};
        int occ=0;
        int n= nums.length;
        
       
        for(int i=0;i<n;i++){
            if(nums[i]==target){
            arr[0]=i;
            occ=i;
            break;
            }
        }
        for(int j=occ;j<n;j++){
            if(nums[j]==target){
                arr[1]=j;
            }
        }
        return arr;
            
        } 
        
    }
