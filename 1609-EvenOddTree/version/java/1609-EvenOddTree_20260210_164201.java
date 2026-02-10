// Last updated: 2/10/2026, 4:42:01 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    List<Integer> prev = new ArrayList<>();  // store last value for each level
19
20    public boolean isEvenOddTree(TreeNode root) {
21        return dfs(root, 0);
22    }
23
24    boolean dfs(TreeNode node, int level) {
25        if (node == null) return true;
26
27        int val = node.val;
28
29        if (prev.size() == level) {
30            // first node of this level
31            prev.add(val);
32            if (level % 2 == 0 && val % 2 == 0) return false; // even level needs odd
33            if (level % 2 == 1 && val % 2 == 1) return false; // odd level needs even
34        } 
35        else {
36            int last = prev.get(level);
37
38            if (level % 2 == 0) {
39                if (val % 2 == 0 || val <= last) return false;
40            } else {
41                if (val % 2 == 1 || val >= last) return false;
42            }
43
44            prev.set(level, val);
45        }
46
47        return dfs(node.left, level + 1) && dfs(node.right, level + 1);
48    }
49}
50