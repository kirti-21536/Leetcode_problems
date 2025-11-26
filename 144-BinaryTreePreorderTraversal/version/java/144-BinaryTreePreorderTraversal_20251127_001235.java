// Last updated: 11/27/2025, 12:12:35 AM
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
21        
22    }
23    public void postorder(TreeNode root,List<Integer> ll){
24        if(root==null)return;
25        postorder(root.left,ll);
26        postorder(root.right,ll);
27        ll.add(root.val);
28
29    }
30}