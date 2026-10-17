// Last updated: 10/17/2026, 5:57:44 PM
1class Solution {
2    public int minSwaps(int[] nums) {
3        int n = nums.length;
4        int[][] arr = new int[n][2];
5
6        for (int i = 0; i < n; i++) {
7            arr[i][0] = digitSum(nums[i]);
8            arr[i][1] = nums[i];
9        }
10
11        Arrays.sort(arr, (a, b) -> {
12            if (a[0] != b[0]) {
13                return Integer.compare(a[0], b[0]);
14            }
15            return Integer.compare(a[1], b[1]);
16        });
17
18        Map<Integer, Integer> map = new HashMap<>();
19
20        for (int i = 0; i < n; i++) {
21            map.put(arr[i][1], i);
22        }
23
24        boolean[] visited = new boolean[n];
25        int swaps = 0;
26
27        for (int i = 0; i < n; i++) {
28            if (visited[i]) {
29                continue;
30            }
31
32            int j = i;
33            int cycleSize = 0;
34
35            while (!visited[j]) {
36                visited[j] = true;
37                cycleSize++;
38                j = map.get(nums[j]);
39            }
40
41            swaps += cycleSize - 1;
42        }
43
44        return swaps;
45    }
46
47    private int digitSum(int num) {
48        int sum = 0;
49
50        while (num > 0) {
51            sum += num % 10;
52            num /= 10;
53        }
54
55        return sum;
56    }
57}
58