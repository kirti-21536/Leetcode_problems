// Last updated: 8/12/2026, 1:48:55 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] arr1=s.toCharArray();
4        char[] arr2=t.toCharArray();
5        Arrays.sort(arr1);
6        Arrays.sort(arr2);
7        return Arrays.equals(arr1,arr2);
8        
9    }
10}