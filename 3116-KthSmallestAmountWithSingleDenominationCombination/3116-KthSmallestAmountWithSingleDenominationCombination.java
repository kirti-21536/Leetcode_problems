// Last updated: 8/21/2026, 12:04:04 PM
1class Solution {
2    public long findKthSmallest(int[] coins, int k) {
3        int n = coins.length;
4        long lo = 1, hi = (long) coins[0] * k;
5
6        for (int c : coins) {
7            hi = Math.min(hi, (long) c * k);
8        }
9
10        while (lo < hi) {
11            long mid = lo + (hi - lo) / 2;
12
13            if (count(coins, mid) >= k)
14                hi = mid;
15            else
16                lo = mid + 1;
17        }
18
19        return lo;
20    }
21
22    private long count(int[] coins, long x) {
23        int n = coins.length;
24        long ans = 0;
25
26        for (int mask = 1; mask < (1 << n); mask++) {
27            long lcm = 1;
28            int bits = 0;
29            boolean valid = true;
30
31            for (int i = 0; i < n; i++) {
32                if ((mask & (1 << i)) != 0) {
33                    bits++;
34                    long g = gcd(lcm, coins[i]);
35
36                    if (lcm > x / (coins[i] / g)) {
37                        valid = false;
38                        break;
39                    }
40
41                    lcm = lcm / g * coins[i];
42                }
43            }
44
45            if (!valid || lcm > x) continue;
46
47            long ways = x / lcm;
48
49            if ((bits & 1) == 1)
50                ans += ways;
51            else
52                ans -= ways;
53        }
54
55        return ans;
56    }
57
58    private long gcd(long a, long b) {
59        while (b != 0) {
60            long t = a % b;
61            a = b;
62            b = t;
63        }
64        return a;
65    }
66}
67