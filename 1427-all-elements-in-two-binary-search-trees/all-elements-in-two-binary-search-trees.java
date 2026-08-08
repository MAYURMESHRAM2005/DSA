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
    List<Integer> list=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        list1(root1);  
        list1(root2); 
        Collections.sort(list);
        return list;
    }
       public void list1(TreeNode root){
        if(root==null){
            return ;
        }
        list.add(root.val);
        list1(root.left);
        list1(root.right);

       }
}
