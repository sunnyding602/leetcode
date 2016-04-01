/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root != null){
            sum = sum-root.val;
            if(sum == 0 && root.left ==null && root.right==null) return true;
            boolean b1 =  hasPathSum(root.left , sum);
            boolean b2 =  hasPathSum(root.right, sum);
            return b1 || b2;
        }
        return false;
    }
}
