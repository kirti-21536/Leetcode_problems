// Last updated: 3/11/2026, 10:29:05 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int arr[]= new int[2];
4        int i=0;
5        int j=numbers.length-1;
6        while(i<j){
7            if(numbers[i]+numbers[j]==target){
8                arr[0]=i+1;
9                arr[1]=j+1;
10                return arr;
11            }
12            if(numbers[i]+numbers[j]<target){
13                i++;
14            }
15            else{
16                j--;
17            }
18        }
19        return arr;
20        
21    }
22}