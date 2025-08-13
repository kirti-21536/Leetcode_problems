// Last updated: 8/13/2025, 11:24:28 PM
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
    int Camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            Camera++;

        }
        return Camera;
    }
    public int minCamera(TreeNode root) {
                if(root== null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left == -1 || right==-1){ //iss node pe camera ki need hai
            Camera++;
            return 1; // camera setup kara h iss node pe 
        }
        if(left==1 || right==1){
            //inme se koi ek ke pass ya dono ke pass camera h or ek ke pass camera hai 
        // and dusre wala covered h
        return 0;//iska matlan mein covered hu

        }
        else{
            return -1; //need a Camera
        }
    }



}