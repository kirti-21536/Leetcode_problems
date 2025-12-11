// Last updated: 12/11/2025, 5:59:38 PM
1class Solution {
2    public String largestNumber(int[] nums) {
3        String[] arr = new String[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            arr[i] = String.valueOf(nums[i]);
6        }
7
8        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
9
10        if (arr[0].equals("0")) return "0";
11        StringBuilder sb = new StringBuilder();
12        for (String s : arr) {
13            sb.append(s);
14        }
15        return sb.toString();
16    }
17}
18