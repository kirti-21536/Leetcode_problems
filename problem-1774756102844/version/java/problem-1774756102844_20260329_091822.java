// Last updated: 3/29/2026, 9:18:22 AM
1
2class Solution {
3    public int sortableIntegers(int[] nums) {
4        int n = nums.length;
5        int[] q= nums.clone();
6
7        int[] sorted = nums.clone();
8        Arrays.sort(sorted);
9
10        int sum = 0;
11
12        for (int k = 1; k <= n; k++) {
13            if (n % k != 0) continue;
14
15            if (isValid(nums, sorted, k)) {
16                sum += k;
17            }
18        }
19
20        return sum;
21    }
22
23    private boolean isValid(int[] nums, int[] sorted, int k) {
24        int n = nums.length;
25
26        for (int i = 0; i < n; i += k) {
27            if (!checkBlock(nums, sorted, i, k)) {
28                return false;
29            }
30        }
31
32        return true;
33    }
34
35    private boolean checkBlock(int[] nums, int[] sorted, int start, int k) {
36
37        int breaks = 0;
38
39        for (int j = 0; j < k; j++) {
40            int curr = nums[start + j];
41            int next = nums[start + (j + 1) % k];
42
43            if (curr > next) breaks++;
44            if (breaks > 1) return false;
45        }
46        int[] a = Arrays.copyOfRange(nums, start, start + k);
47        int[] b = Arrays.copyOfRange(sorted, start, start + k);
48
49        Arrays.sort(a);
50        Arrays.sort(b);
51
52        return Arrays.equals(a, b);
53    }
54}