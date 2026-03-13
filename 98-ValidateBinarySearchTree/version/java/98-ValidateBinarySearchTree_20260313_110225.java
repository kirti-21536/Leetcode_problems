// Last updated: 3/13/2026, 11:02:25 AM
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
17    int count = 0;
18    int result = 0;
19
20    public int kthSmallest(TreeNode root, int k) {
21        inorder(root, k);
22        return result;
23    }
24
25    void inorder(TreeNode root, int k) {
26        if (root == null) return;
27
28        inorder(root.left, k);
29
30        count++;
31        if (count == k) {
32            result = root.val;
33            return;
34        }
35
36         inorder(root.right, k);
37    }
38}
39