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
    int count = 0;

        public int pseudoPalindromicPaths(TreeNode root) {
            dfs(root, 0);
            return count;
        }

        private void dfs(TreeNode root, int path) {
            if (root == null)
                return;
            path = path ^ (1 << root.val);
            if (root.left == null && root.right == null) {
                // count += Integer.bitCount(path) <= 1 ? 1 : 0;
                count += (path & (path - 1)) == 0 ? 1 : 0; // check if number of set bit is <= 1
                return;
            }
            dfs(root.left, path);
            dfs(root.right, path);
        }
    }