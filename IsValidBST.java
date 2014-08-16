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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return validate(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean validate(TreeNode root, int min, int max)
    {
        if(root == null) return true;
        if(root.val <= min || root.val >= max)
            return false;
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}