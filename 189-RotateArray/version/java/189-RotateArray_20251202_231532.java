// Last updated: 12/2/2025, 11:15:32 PM
1class Solution {
2    public void rotate(int[] nums,int k){
3        int n=nums.length;
4        k=k%n; //for converting larger value of k to smaller value with same ans 
5
6        Reverse(nums,0,n-k-1);
7        Reverse(nums,n-k,n-1);
8        Reverse(nums,0,n-1);
9    }
10    public void Reverse(int []nums,int i,int j){
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