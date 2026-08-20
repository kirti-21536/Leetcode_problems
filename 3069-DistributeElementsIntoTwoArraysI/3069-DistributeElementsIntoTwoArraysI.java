// Last updated: 8/20/2026, 11:52:18 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        ArrayList<Integer> arr1=new ArrayList<>();
4        ArrayList<Integer> arr2=new ArrayList<>();
5        arr1.add(nums[0]);
6        arr2.add(nums[1]);
7        int j=0; //arr1 index
8        int k=0;//arr2 index
9        int n=nums.length;
10        for(int i=2;i<n;i++){
11            int ele=nums[i];
12            if(arr1.get(j)>arr2.get(k)){
13                arr1.add(nums[i]);
14                j++;
15            }
16            else{
17                arr2.add(nums[i]);
18                k++;
19            }
20        }
21        int result[]=new int[n];
22        int i=0;
23        while(i<arr1.size()){
24            result[i]=arr1.get(i);
25            i++;
26        }
27        int m=0;
28        while(m<arr2.size()){
29            result[i]=arr2.get(m);
30            i++;
31            m++;
32        }
33        return result;
34    }
35}