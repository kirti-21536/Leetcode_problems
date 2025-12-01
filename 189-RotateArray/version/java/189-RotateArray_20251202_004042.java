// Last updated: 12/2/2025, 12:40:42 AM
1class Solution {
2    public void rotate(int[] nums,int k){
3    
4        int n=nums.length;
5        k=k%n;
6       Reverse(nums,0,n-k-1);
7       Reverse(nums,n-k,n-1);
8       Reverse(nums,0,n-1);
9    }
10    public static void Reverse(int nums[],int i,int j){
11        while(i<j){
12            int temp=nums[i];
13            nums[i]=nums[j];
14            nums[j]=temp;
15            i++;
16            j--;
17        }
18    }
19    }
20