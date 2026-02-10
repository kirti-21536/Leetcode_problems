// Last updated: 2/10/2026, 4:07:59 PM
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
17    long maxProd = 0;
18    long totalSum = 0;
19    final long MOD = 1_000_000_007;
20    public int maxProduct(TreeNode root) {
21        // compute the total sum
22        totalSum = getTotalSum(root);
23
24        // dfs for maxProd
25        dfs(root);
26
27        return (int) (maxProd % MOD);
28
29    }
30
31    public long getTotalSum(TreeNode root){
32        if(root==null) return 0;
33        return root.val + getTotalSum(root.left) + getTotalSum(root.right);
34    }
35
36    public long dfs(TreeNode root){
37        if(root==null) return 0;
38        long left = dfs(root.left);
39        long right = dfs(root.right);
40        long subtreeSum = root.val + left + right;
41
42        maxProd = Math.max(subtreeSum * (totalSum-subtreeSum), maxProd);
43        
44        return subtreeSum;
45    }
46}