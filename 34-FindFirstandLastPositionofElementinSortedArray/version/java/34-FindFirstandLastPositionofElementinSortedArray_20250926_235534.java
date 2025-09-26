// Last updated: 9/26/2025, 11:55:34 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=find_First(nums,target);
        int l=find_Last(nums,target);
        int ans[]={f,l};
        return ans;
        //brute force approach with time complexity of O(n)
        // int n= nums.length;
        // int arr[]= {-1,-1};
        // int occ=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //     arr[0]=i;
        //     occ=i;
        //     break;
        //     }
        // }
        // for(int j=occ;j<n;j++){
        //     if(nums[j]==target){
        //         arr[1]=j;
        //     }
        // }
        // return arr;
    } 

         
    
    //optimized approach using binary search with time complexity O(log n)
    public static int find_First(int nums[],int target){ 
        int lo=0,hi=nums.length-1,ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans=mid;
                hi=mid-1; //leftmost occurence of element ke liye
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static int find_Last(int nums[],int target){
        int lo=0,hi=nums.length-1,ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans=mid;
                lo=mid+1; //rightmost occurence of element ke liye
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
        
    }
