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
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return max;
    }
    public int pathsum(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=Math.max(0,pathsum(root.left));
        int right=Math.max(0,pathsum(root.right));
         
         int current=left+right+root.val;
         max=Math.max(max,current);
         return root.val+Math.max(left,right);
           
    }
}