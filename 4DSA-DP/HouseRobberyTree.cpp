/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int val) : val(val), left(nullptr), right(nullptr) {}
 *     TreeNode(int val, TreeNode *left, TreeNode *right) : val(val), left(left), right(right) {}
 * };
 */

class Solution {
public:
    // Helper function that returns a pair of values:
    // First value is the max amount if the current node is included (robbed)
    // Second value is the max amount if the current node is excluded (not robbed)
    pair<int, int> robHelper(TreeNode* root) {
        if (root == nullptr) {
            return {0, 0};  // If the node is null, you can't rob anything
        }

        // Recursively solve for the left and right subtrees
        pair<int, int> left = robHelper(root->left);
        pair<int, int> right = robHelper(root->right);

        // If we include the current node, we can't include its children
        int includeNode = root->val + left.second + right.second;

        // If we exclude the current node, we can take the max from both children
        int excludeNode = max(left.first, left.second) + max(right.first, right.second);

        // Return both scenarios
        return {includeNode, excludeNode};
    }

    int rob(TreeNode* root) {
        pair<int, int> result = robHelper(root);
        // The result will be the maximum between robbing the root or not robbing the root
        return max(result.first, result.second);
    }
};
