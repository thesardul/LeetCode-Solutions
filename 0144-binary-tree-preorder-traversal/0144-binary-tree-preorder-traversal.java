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
    public List<Integer> preorderTraversal(TreeNode root) {
        final List<Integer> res = new ArrayList<>();
        preorderTraversal(root, res);
        return res;
    }
    private void preorderTraversal(final TreeNode root1, final List<Integer> res){
        if(root1 != null){
            res.add(root1.val);
            preorderTraversal(root1.left, res);
            preorderTraversal(root1.right, res);
        }
    }
}