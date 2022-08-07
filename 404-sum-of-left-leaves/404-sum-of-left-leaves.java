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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null)
            return 0;
        return sumOfLeftLeaves(root, false);
    }
    private int sumOfLeftLeaves(TreeNode root1, boolean isLeft){
        if(root1 == null) return 0;
        if(root1.left == null && root1.right == null){
            if(isLeft)
                return root1.val;
            else
                return 0;
        }
        
        int sum1 = sumOfLeftLeaves(root1.left, true);
        int sum2 = sumOfLeftLeaves(root1.right, false);
        
        return sum1 + sum2;
    }
}