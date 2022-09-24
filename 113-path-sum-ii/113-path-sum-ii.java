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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root == null){
            return ans;
        }
        
        helper(root, targetSum, ans, new ArrayList<>());
        return ans;
        
    }
    
    void helper(TreeNode node , int targetSum, List<List<Integer>> ans,  List<Integer> temp){
        if(node == null)
            return;
        
        
        //add myself to the list
        temp.add(node.val);
        
        if(node.left == null &&  node.right == null && node.val == targetSum){
            ans.add(temp);
        }
        //crate separate temp list for every node(new lis)
        
        helper(node.left, targetSum-node.val, ans, new ArrayList<>(temp));
        helper(node.right, targetSum-node.val, ans, new ArrayList<>(temp));
        return;
    }
}