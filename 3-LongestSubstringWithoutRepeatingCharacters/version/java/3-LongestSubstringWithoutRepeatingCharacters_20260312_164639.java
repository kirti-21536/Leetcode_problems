// Last updated: 3/12/2026, 4:46:39 PM
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
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> path = new ArrayList<>();
20        dfs(root, targetSum, path, ans);
21        return ans;
22    }
23
24    public void dfs(TreeNode node, int target, List<Integer> path, List<List<Integer>> ans){
25        if(node == null) return;
26
27        path.add(node.val);
28
29        if(node.left == null && node.right == null && target == node.val){
30            ans.add(new ArrayList<>(path));
31        }
32
33        dfs(node.left, target - node.val, path, ans);
34        dfs(node.right, target - node.val, path, ans);
35
36        path.remove(path.size() - 1); // backtrack
37    }
38}