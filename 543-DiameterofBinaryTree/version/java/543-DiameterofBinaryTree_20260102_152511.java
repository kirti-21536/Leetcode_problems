// Last updated: 1/2/2026, 3:25:11 PM
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
17    public int diameterOfBinaryTree(TreeNode root) {
18        if(root==null){
19            return 0;
20        }
21        int ld=diameterOfBinaryTree(root.left);
22        int rd=diameterOfBinaryTree( root.right);
23        int sd=height(root.left)+height(root.right)+2;
24        return Math.max(sd,Math.max(rd,ld));
25    }
26    public int height(TreeNode root){
27        if(root==null){
28            return -1;
29        }
30        int lh=height(root.left);
31        int rh=height(root.right);
32        return Math.max(lh,rh)+1;
33
34    }
35}