// Last updated: 12/13/2025, 11:18:20 PM
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
17    public boolean isSymmetric(TreeNode root) {
18        return symmetric(root.left, root.right);
19    }
20    public boolean symmetric(TreeNode root1, TreeNode root2){
21        if (root1 == null && root2 == null){
22            return true;
23        }
24        if (root1 == null || root2 == null){
25            return false;
26        }
27        if (root1.val != root2.val){
28            return false;
29        }
30        boolean left = symmetric(root1.left, root2.right);
31        boolean right = symmetric(root1.right, root2.left);
32        return left && right;
33    }
34        
35    }
36