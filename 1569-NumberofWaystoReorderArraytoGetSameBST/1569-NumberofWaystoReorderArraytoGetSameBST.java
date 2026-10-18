// Last updated: 10/18/2026, 7:44:47 AM
1class Solution {
2    static final long MOD = 1000000007L;
3    long[][] comb = new long[1001][1001];
4
5    public int numOfWays(int[] nums) {
6        int n = nums.length;
7
8        for (int i = 0; i <= n; i++) {
9            comb[i][0] = comb[i][i] = 1;
10            for (int j = 1; j < i; j++) {
11                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
12            }
13        }
14
15        List<Integer> list = new ArrayList<>();
16        for (int num : nums) {
17            list.add(num);
18        }
19
20        return (int) ((solve(list) - 1 + MOD) % MOD);
21    }
22
23    private long solve(List<Integer> nums) {
24        int n = nums.size();
25
26        if (n <= 2) {
27            return 1;
28        }
29
30        int root = nums.get(0);
31        List<Integer> left = new ArrayList<>();
32        List<Integer> right = new ArrayList<>();
33
34        for (int i = 1; i < n; i++) {
35            if (nums.get(i) < root) {
36                left.add(nums.get(i));
37            } else {
38                right.add(nums.get(i));
39            }
40        }
41
42        long ways = comb[n - 1][left.size()];
43        ways = ways * solve(left) % MOD;
44        ways = ways * solve(right) % MOD;
45
46        return ways;
47    }
48}