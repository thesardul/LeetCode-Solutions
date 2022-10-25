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
    private boolean result = true;
    public boolean isBalanced(TreeNode root) {
        checkHeight(root);
        return  result;
    }
    
    public int checkHeight(TreeNode root){
        if(root == null)
            return 0;
        int lh = checkHeight(root.left);
        int rh = checkHeight(root.right);
        
        if(lh == -1 && rh == -1)
            result = false;
        
        if(Math.abs(lh - rh) > 1)
            result = false;
        return Math.max(lh, rh) + 1;
    }
}