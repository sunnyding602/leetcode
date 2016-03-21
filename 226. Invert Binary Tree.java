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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        final TreeNode left = root.left,
            right = root.right;
        
        root.left = invertTree(right);
        root.right = invertTree(left);
        
        return root;
    }
}
