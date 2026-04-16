// Last updated: 4/16/2026, 11:47:00 PM
1class Solution {
2    public List<Integer> solveQueries(int[] nums, int[] queries) {
3        int n = nums.length;
4        List<Integer> ll = new ArrayList<>();
5        HashMap<Integer, List<Integer>> map = new HashMap<>();
6        for (int i = 0; i < n; i++) {
7            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
8        }
9
10        // process queries
11        for (int i = 0; i < queries.length; i++) {
12            int j = queries[i];
13            int num = nums[j];
14
15            if (map.get(num).size() > 1) {
16                ll.add(minDist(map.get(num), j, n)); // pass j + original n
17            } else {
18                ll.add(-1);
19            }
20        }
21        return ll;
22    }
23
24    public int minDist(List<Integer> arr, int j, int n) {
25        int size = arr.size();
26
27        // binary search to find position of j
28        int idx = Collections.binarySearch(arr, j);
29
30        int ans = Integer.MAX_VALUE;
31
32        // check left neighbor
33        int left = (idx - 1 + size) % size;
34        int diff1 = Math.abs(arr.get(left) - j);
35        ans = Math.min(ans, Math.min(diff1, n - diff1));
36
37        // check right neighbor
38        int right = (idx + 1) % size;
39        int diff2 = Math.abs(arr.get(right) - j);
40        ans = Math.min(ans, Math.min(diff2, n - diff2));
41
42        return ans;
43    }
44}