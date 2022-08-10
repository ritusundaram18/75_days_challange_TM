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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        return helper(nums , 0, nums.length-1);        
    }
    TreeNode helper(int nums[], int start, int end)
    {
        if(start > end)
            return null;
        
        int mid = (start+end)/2;
        
        int data = nums[mid];
        
        TreeNode root = new TreeNode(data);
        root.left = helper(nums,start,mid-1);
        root.right = helper(nums,mid+1,end);
        
        return root;
    }
}