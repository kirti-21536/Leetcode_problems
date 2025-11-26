// Last updated: 11/27/2025, 12:09:10 AM
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
16
17class Solution {
18    public List<Integer> preorderTraversal(TreeNode root) {
19        ArrayList<Integer> ll=new ArrayList<>();
20         preorder(root,ll);
21         return ll;
22        
23    }
24    public void preorder(TreeNode root,List<Integer> ll){
25        if(root==null)return;
26        ll.add(root.val);
27        preorder(root.left,ll);
28        preorder(root.right,ll);
29
30    }
31}