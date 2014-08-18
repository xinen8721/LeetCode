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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        getInOrder(root, list);
        
        return list;
    }
    
    void getInOrder(TreeNode root, ArrayList<Integer> list)
    {
        if(root == null)
            return;
        
        getInOrder(root.left, list);
        list.add(root.val);
        getInOrder(root.right, list);
        
    }
}