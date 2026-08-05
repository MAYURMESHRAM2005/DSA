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
    public TreeNode invertTree(TreeNode root) {
        return tree(root);
    }
    public TreeNode tree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode r=new TreeNode(root.val);
        r.right=tree(root.left);
        r.left=tree(root.right);
        return r;
    }
}