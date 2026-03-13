// Last updated: 3/13/2026, 10:56:37 AM
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
17    public boolean isValidBST(TreeNode root) {
18        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
19    }
20
21    public boolean check(TreeNode root, long min, long max){
22        if(root == null) return true;
23
24        if(root.val <= min || root.val >= max) return false;
25
26        return check(root.left, min, root.val) &&
27               check(root.right, root.val, max);
28    }
29}