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
    TreeNode pre = null;
    TreeNode first = null;
    TreeNode second = null;
    
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        inorder(root);
        int tempVal = first.val;
        first.val = second.val;
        second.val = tempVal;
        return;
    }
    
    public void inorder(TreeNode root)
    {
        if(root == null) return;
        inorder(root.left);
        if(pre != null)
        {
            if(pre.val > root.val)
            {
                if(first == null)
                {
                    first = pre;
                }
                second = root;
            }
        }
        pre = root;
        inorder(root.right);
        return;
    }
}