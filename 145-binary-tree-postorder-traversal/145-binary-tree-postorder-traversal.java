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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        
        if(root==null)
        {
            List<Integer> baseList=new ArrayList<>();
            return baseList;
        }
        
        List<Integer> list=new ArrayList<>();
        
        List<Integer> ll=postorderTraversal(root.left);
        List<Integer> rl=postorderTraversal(root.right);
        
        for(int x:ll)
        {
            list.add(x);
        }
        
        for(int x:rl)
        {
            list.add(x);
        }
        list.add(root.val);
        
        return list;
        
    }
}