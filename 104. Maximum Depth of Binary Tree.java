/**o(n)
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = maxDepth(root.left) + 1;
        int rightHeight = maxDepth(root.right) + 1;
        return Math.max(leftHeight, rightHeight);
    }
}
