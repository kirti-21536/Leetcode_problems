// Last updated: 12/13/2025, 11:17:53 PM
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
18        return ValidBST(root).isbst;
19        
20    }
21    public BstPair ValidBST(TreeNode root){
22        if(root==null){
23            return new BstPair();
24        }
25        BstPair lbp=ValidBST(root.left);
26        BstPair rbp=ValidBST(root.right);
27        BstPair sbp=new BstPair();
28        sbp.min=Math.min(lbp.min,Math.min(rbp.min,root.val));
29        sbp.max=Math.max(lbp.max,Math.max(rbp.max,root.val));
30        sbp.isbst=lbp.isbst && rbp.isbst && lbp.max <root.val && rbp.min >root.val;
31        return sbp;
32
33        
34    }
35    class BstPair{
36        boolean isbst=true;
37        Long max=Long.MIN_VALUE;
38        Long min=Long.MAX_VALUE;
39    }
40}