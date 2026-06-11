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
    public boolean isBalanced(TreeNode root) {
        int height = getHeight(root);
        if(height == -1){
            return false;
        }
        return true;
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        //post order
        int leftSubTreeheight = getHeight(root.left);
        int rightSubTreeheight = getHeight(root.right);
        if(leftSubTreeheight == -1 || rightSubTreeheight == -1){
            return -1;
        }
        if(Math.abs(leftSubTreeheight - rightSubTreeheight)>1){
            return -1;
        }
        return 1 + Math.max(leftSubTreeheight,rightSubTreeheight);
    }
}
