// Last updated: 2/11/2026, 12:44:04 PM
1class Solution {
2
3    static class Trie {
4
5        static class Node {
6            Node zero;
7            Node one;
8        }
9
10        public Node root = new Node();
11
12        public void add(int val) {
13            Node curr = root;
14            for (int i = 31; i >= 0; i--) {
15                int bit = (val >> i) & 1;
16
17                if (bit == 0) {
18                    if (curr.zero == null) curr.zero = new Node();
19                    curr = curr.zero;
20                } else {
21                    if (curr.one == null) curr.one = new Node();
22                    curr = curr.one;
23                }
24            }
25        }
26
27        public int getMaxXor(int x) {
28            int ans = 0;
29            Node curr = root;
30            for (int i = 31; i >= 0; i--) {
31                int bit = (x >> i) & 1;
32
33                if (bit == 0) {
34                    if (curr.one != null) {
35                        ans |= (1 << i);
36                        curr = curr.one;
37                    } else curr = curr.zero;
38                } else {
39                    if (curr.zero != null) {
40                        ans |= (1 << i);
41                        curr = curr.zero;
42                    } else curr = curr.one;
43                }
44            }
45            return ans;
46        }
47    }
48
49    public int findMaximumXOR(int[] nums) {
50        Trie t = new Trie();
51
52        for (int x : nums) t.add(x);
53
54        int ans = 0;
55        for (int x : nums)
56            ans = Math.max(ans, t.getMaxXor(x));
57
58        return ans;
59    }
60}
61