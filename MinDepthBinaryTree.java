/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)    return 0;
        int minDepth = getMinDepth(root);
        return minDepth;
    }
    
    public int getMinDepth(TreeNode root)
    {
        if(root == null) return Integer.MAX_VALUE;
        if(root.left == null && root.right == null)
        {
            return 1;
        }
        int leftDepth = getMinDepth(root.left);
        int rightDepth = getMinDepth(root.right);
        
        return Math.min(leftDepth, rightDepth) + 1;
    }
}