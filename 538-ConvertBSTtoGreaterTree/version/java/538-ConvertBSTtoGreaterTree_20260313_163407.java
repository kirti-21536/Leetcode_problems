// Last updated: 3/13/2026, 4:34:07 PM
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
17    int sum=0;
18    public TreeNode convertBST(TreeNode root) {
19        calculateSum(root);
20        return root;
21    }
22    public void calculateSum(TreeNode root){
23        if(root==null)return ;
24        calculateSum(root.right);
25        sum+=root.val;
26        root.val=sum;
27        calculateSum(root.left);
28    }
29}