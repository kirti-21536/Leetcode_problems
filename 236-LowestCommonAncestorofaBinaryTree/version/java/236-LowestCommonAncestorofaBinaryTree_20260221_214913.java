// Last updated: 2/21/2026, 9:49:13 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12         if (root==null){
13            return null;
14        }
15        if (root == p || root == q){
16            return root;
17        }
18        TreeNode left = lowestCommonAncestor(root.left,p,q);
19        TreeNode right = lowestCommonAncestor(root.right,p,q);
20        if (left != null && right != null){
21            return root;
22        }
23        else if (left == null){
24            return right;
25        }
26        else{
27            return left;
28        }
29        
30    }
31}