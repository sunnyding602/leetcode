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

    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1,0,inorder.length-1, postorder, inorder);
    }
    
    public TreeNode helper(int postEnd, int inStart, int inEnd, int[] postorder, int[] inorder){
        if(postEnd< 0 || inStart>inEnd){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inIndex = 0;
        for(int i = inStart; i<=inEnd; i++){
            if(inorder[i] == root.val){
                inIndex = i;
            }
        }
        
        root.left = helper( postEnd-(inEnd-inIndex)-1, inStart, inIndex-1, postorder, inorder);
        root.right = helper(postEnd-1, inIndex+1, inEnd, postorder, inorder);
        
        
        return root;
    }
}
