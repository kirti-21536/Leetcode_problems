// Last updated: 4/7/2026, 3:01:20 PM
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
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> ll=new ArrayList<>();
19        postorder(root,ll);
20        return ll;
21    }
22    public void postorder(TreeNode root,List<Integer> ll){
23        if(root==null)return;
24        postorder(root.left,ll);
25        postorder(root.right,ll);
26        ll.add(root.val);
27    }
28}