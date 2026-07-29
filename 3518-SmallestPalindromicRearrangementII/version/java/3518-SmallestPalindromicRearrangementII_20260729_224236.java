// Last updated: 7/29/2026, 10:42:36 PM
1class Solution {
2    static final long LIM = 1_000_001;
3
4    public String smallestPalindrome(String s, int k) {
5        int[] cnt = new int[26];
6        for (char c : s.toCharArray()) cnt[c - 'a']++;
7
8        String mid = "";
9        int[] half = new int[26];
10        int m = 0;
11
12        for (int i = 0; i < 26; i++) {
13            half[i] = cnt[i] / 2;
14            m += half[i];
15            if ((cnt[i] & 1) == 1) mid = "" + (char) ('a' + i);
16        }
17
18        if (ways(half) < k) return "";
19
20        StringBuilder left = new StringBuilder();
21
22        while (m-- > 0) {
23            for (int i = 0; i < 26; i++) {
24                if (half[i] == 0) continue;
25                half[i]--;
26                long w = ways(half);
27                if (w >= k) {
28                    left.append((char) ('a' + i));
29                    break;
30                }
31                k -= w;
32                half[i]++;
33            }
34        }
35
36        return left + mid + left.reverse().toString();
37    }
38
39    public static long ways(int[] a) {
40        int n = 0;
41        for (int x : a) n += x;
42        long res = 1;
43        for (int x : a) {
44            if (x == 0) continue;
45            res = Math.min(LIM, res * Calculate(n, x));
46            n -= x;
47        }
48        return res;
49    }
50
51    public static long Calculate(int n, int r) {
52        r = Math.min(r, n - r);
53        long ans = 1;
54        for (int i = 1; i <= r; i++) {
55            ans = ans * (n - r + i) / i;
56            if (ans >= LIM) return LIM;
57        }
58        return ans;
59    }
60}