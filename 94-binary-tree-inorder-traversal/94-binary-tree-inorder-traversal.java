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
    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> res = new ArrayList<>();
        inorderTraversal(root, res);
        return res;
    }
    private void inorderTraversal(final TreeNode root1, final List<Integer> res){
        if(root1 != null){
        inorderTraversal(root1.left, res);
        res.add(root1.val);
        inorderTraversal(root1.right, res);
        }
    }
}