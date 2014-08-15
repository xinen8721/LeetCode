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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        int rootVal = root.val;
        if(rootVal == sum && root.left == null && root.right == null)
            return true;
        sum -= rootVal;
        return hasPathSum(root.left,sum) || hasPathSum(root.right, sum);
    }
}