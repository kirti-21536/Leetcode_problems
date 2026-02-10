// Last updated: 2/10/2026, 4:06:01 PM
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18        dfs(root.left,root.right,1); //level=1
19        return root;
20    }
21    public void dfs(TreeNode left,TreeNode right,int level){
22        if(left==null ||right==null){
23            return;
24        }
25        if(level%2==1){
26            int temp=left.val;
27            left.val=right.val;
28            right.val=temp;
29        }
30        dfs(left.left,right.right,level+1);
31        dfs(left.right,right.left,level+1); 
32    }
33}