/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int minDepth(TreeNode* root) {
        if(root == nullptr){
            return 0;
        }
        queue<TreeNode*> myqueue;
        myqueue.push(root);
        int rowNodeCnt = 1;
        int minDepth=1;
        int nextLevelNodeCnt = 0;
        while (myqueue.empty() == false) {
            
            nextLevelNodeCnt=0;
            for(auto i=0; i< rowNodeCnt; i++){
                auto node = myqueue.front();
                myqueue.pop();
                
                if(node->left == nullptr && node->right == nullptr){
                    return minDepth;
                }
                if (node->left != nullptr) {
                    myqueue.push(node->left);
                    nextLevelNodeCnt++;
                }
                
                if (node->right != nullptr) {
                    myqueue.push(node->right);
                    nextLevelNodeCnt++;
                }
            }
            minDepth++;
            rowNodeCnt = nextLevelNodeCnt;
            
        }
      
        return minDepth;
    }
};


//   public int minDepth(TreeNode root) {
//         if(root == null) return 0;
//         int left = minDepth(root.left);
//         int right = minDepth(root.right);
//         return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;

//     }
