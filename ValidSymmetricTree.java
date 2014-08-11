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
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root != null && root.left == null && root.right == null)) return true;
        boolean result = isSymmetric(root.left, root.right);
        return result;
    }
    public boolean isSymmetric(TreeNode subLeft, TreeNode subRight)
    {
        if((subLeft == null && subRight != null) || (subLeft != null && subRight == null))
            return false;
        else if(subLeft == null && subRight == null) 
            return true;
        else if(subLeft.val != subRight.val)            
            return false;
        else
            return isSymmetric(subLeft.left, subRight.right) && isSymmetric(subLeft.right, subRight.left);
    }
}