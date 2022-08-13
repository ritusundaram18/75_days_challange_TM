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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        helper(root);
        return sum;
    }
    void helper(TreeNode root)
    {
        if(root==null) return;
        
        if(isLeafNode(root.left)) sum+=root.left.val; 
            helper(root.left);
            helper(root.right);
    }
       private boolean isLeafNode(TreeNode root)
       {
           if(root==null)
               return false;
           if(root.left==null && root.right==null)
               return true;
           
           return false;
       }
}