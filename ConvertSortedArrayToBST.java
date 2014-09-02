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
    public TreeNode sortedArrayToBST(int[] num) {
        if(num.length == 0)
            return null;
        
        return sortedArrayToBST(num, 0, num.length - 1);
    }
    
    public TreeNode sortedArrayToBST(int[] num, int start, int end)
    {
        if(start > end)
            return null;
        int mid = (start + end) >> 1;
        TreeNode parent = new TreeNode(num[mid]);
        parent.left = sortedArrayToBST(num, start, mid - 1);
        parent.right = sortedArrayToBST(num, mid + 1, end);
        
        return parent;
    }
}