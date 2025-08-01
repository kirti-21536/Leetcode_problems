// Last updated: 8/1/2025, 8:15:33 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max_depth=0;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
        rightview(root,1,ll);
        return ll; 
    }
    public void rightview(TreeNode root,int curr_level,List<Integer> ll){
        if(root==null){
            return;
        }
        if(max_depth < curr_level){
            ll.add(root.val);
            //view add karna hai
            max_depth=curr_level;
        }
        rightview(root.right,curr_level+1,ll);
        rightview(root.left,curr_level+1,ll);
    }
}