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

    int postIndex;

    int search(int[] inorder, int left, int right, int val) {
         for (int i = left; i <= right; i++) {
            if (inorder[i] == val) {
                return i;
            }
        }
         return -1;
    }

    public TreeNode tree(int[] inorder,int[] postorder,int left,int right) {

        if (left > right) {
            return null;
        }
       int rootValue = postorder[postIndex];
       TreeNode root = new TreeNode(rootValue);
       postIndex--;
      
      int idx = search(inorder,left,right,rootValue);

        
        root.right = tree( inorder, postorder, idx + 1, right);

        root.left = tree( inorder, postorder, left, idx -1  );

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        return tree(inorder,postorder,0, inorder.length - 1 );
    }
}