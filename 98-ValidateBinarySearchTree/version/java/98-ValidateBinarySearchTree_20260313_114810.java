// Last updated: 3/13/2026, 11:48:10 AM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root==null){
19            return null;
20        }
21        if(root.val<key){
22            root.right=deleteNode(root.right,key);
23        }
24        else if(root.val>key){
25            root.left=deleteNode(root.left,key);
26        }
27        else{
28            //1 or 0 child 
29            if(root.left==null){
30                return root.right;
31            }
32            else if(root.right==null){
33                return root.left;
34            }
35            //both children
36            else{
37                int max=max(root.left);
38                root.left=deleteNode(root.left,max);
39                root.val=max;
40                
41            }
42
43        }
44        return root;
45        
46    }
47    public int max(TreeNode root){
48        if(root==null){
49            return Integer.MIN_VALUE;
50        }
51        int max=max(root.right);
52        return Math.max(max,root.val);
53    }
54}