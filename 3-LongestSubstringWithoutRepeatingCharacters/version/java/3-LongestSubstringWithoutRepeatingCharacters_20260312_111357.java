// Last updated: 3/12/2026, 11:13:57 AM
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
17    public int maxDepth(TreeNode root) {
18        if(root==null)return 0;
19        int ans1=maxDepth(root.left);
20        int ans2= maxDepth(root.right);
21        return Math.max(ans1,ans2)+1;
22        
23    }
24}