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
        public TreeNode addOneRow(TreeNode root, int v, int d) {
            if (d == 1) {
                TreeNode newRoot = new TreeNode(v);
                newRoot.left = root;
                return newRoot;
            }

            Queue<TreeNode> q = new LinkedList();
            q.add(root);

            while (--d > 1) {
                int size = q.size();
                while (size-- > 0) {
                    TreeNode node = q.poll();
                    if (node.left != null)
                        q.add(node.left);
                    if (node.right != null)
                        q.add(node.right);
                }
            }

            while (q.size() > 0) {
                TreeNode node = q.poll();
                TreeNode lst = node.left, rst = node.right;
                node.left = new TreeNode(v);
                node.right = new TreeNode(v);
                node.left.left = lst;
                node.right.right = rst;
            }

            return root;
        }
    }