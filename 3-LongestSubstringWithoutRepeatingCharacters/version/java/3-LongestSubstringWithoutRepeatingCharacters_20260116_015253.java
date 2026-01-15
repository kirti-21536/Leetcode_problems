// Last updated: 1/16/2026, 1:52:53 AM
1class Solution {
2    public int[] findOriginalArray(int[] changed) {
3        int n = changed.length;
4        if (n % 2 != 0) return new int[0];
5
6        Arrays.sort(changed);
7        HashMap<Integer, Integer> freq = new HashMap<>();
8
9        for (int x : changed) {
10            freq.put(x, freq.getOrDefault(x, 0) + 1);
11        }
12
13        int[] ans = new int[n / 2];
14        int idx = 0;
15
16        for (int x : changed) {
17            if (freq.get(x) == 0) continue;
18
19            // zero case
20            if (x == 0) {
21                if (freq.get(0) < 2) return new int[0];
22                ans[idx++] = 0;
23                freq.put(0, freq.get(0) - 2);
24            }
25            // normal case
26            else {
27                if (freq.getOrDefault(2 * x, 0) == 0) return new int[0];
28                ans[idx++] = x;
29                freq.put(x, freq.get(x) - 1);
30                freq.put(2 * x, freq.get(2 * x) - 1);
31            }
32        }
33
34        return ans;
35    }
36}
37